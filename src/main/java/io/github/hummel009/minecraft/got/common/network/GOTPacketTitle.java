package io.github.hummel009.minecraft.got.common.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.github.hummel009.minecraft.got.GOT;
import io.github.hummel009.minecraft.got.common.GOTLevelData;
import io.github.hummel009.minecraft.got.common.GOTPlayerData;
import io.github.hummel009.minecraft.got.common.data.GOTTitle;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumChatFormatting;

public class GOTPacketTitle implements IMessage {
	private GOTTitle.PlayerTitle playerTitle;

	@SuppressWarnings("unused")
	public GOTPacketTitle() {
	}

	public GOTPacketTitle(GOTTitle.PlayerTitle t) {
		playerTitle = t;
	}

	@Override
	public void fromBytes(ByteBuf data) {
		short titleID = data.readShort();
		GOTTitle title = GOTTitle.forID(titleID);
		byte colorID = data.readByte();
		EnumChatFormatting color = GOTTitle.PlayerTitle.colorForID(colorID);
		if (title != null && color != null) {
			playerTitle = new GOTTitle.PlayerTitle(title, color);
		}
	}

	@Override
	public void toBytes(ByteBuf data) {
		if (playerTitle == null) {
			data.writeShort(-1);
			data.writeByte(-1);
		} else {
			data.writeShort(playerTitle.getTitle().getTitleID());
			data.writeByte(playerTitle.getColor().getFormattingCode());
		}
	}

	public static class Handler implements IMessageHandler<GOTPacketTitle, IMessage> {
		@Override
		public IMessage onMessage(GOTPacketTitle packet, MessageContext context) {
			EntityPlayer entityplayer = GOT.proxy.getClientPlayer();
			GOTPlayerData pd = GOTLevelData.getData(entityplayer);
			GOTTitle.PlayerTitle title = packet.playerTitle;
			pd.setPlayerTitle(title);
			return null;
		}
	}
}