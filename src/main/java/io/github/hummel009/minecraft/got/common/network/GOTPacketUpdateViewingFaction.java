package io.github.hummel009.minecraft.got.common.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.github.hummel009.minecraft.got.GOT;
import io.github.hummel009.minecraft.got.common.GOTLevelData;
import io.github.hummel009.minecraft.got.common.GOTPlayerData;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;

public class GOTPacketUpdateViewingFaction implements IMessage {
	private GOTFaction viewingFaction;

	@SuppressWarnings("unused")
	public GOTPacketUpdateViewingFaction() {
	}

	public GOTPacketUpdateViewingFaction(GOTFaction f) {
		viewingFaction = f;
	}

	@Override
	public void fromBytes(ByteBuf data) {
		byte facID = data.readByte();
		viewingFaction = GOTFaction.forID(facID);
	}

	@Override
	public void toBytes(ByteBuf data) {
		int facID = viewingFaction.ordinal();
		data.writeByte(facID);
	}

	public static class Handler implements IMessageHandler<GOTPacketUpdateViewingFaction, IMessage> {
		@Override
		public IMessage onMessage(GOTPacketUpdateViewingFaction packet, MessageContext context) {
			EntityPlayer entityplayer = GOT.proxy.getClientPlayer();
			GOTPlayerData pd = GOTLevelData.getData(entityplayer);
			pd.setViewingFaction(packet.viewingFaction);
			return null;
		}
	}
}