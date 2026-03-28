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

public class GOTPacketBrokenOath implements IMessage {
	private int cooldown;
	private int cooldownStart;
	private GOTFaction brokenFac;

	@SuppressWarnings("unused")
	public GOTPacketBrokenOath() {
	}

	public GOTPacketBrokenOath(int cd, int start, GOTFaction f) {
		cooldown = cd;
		cooldownStart = start;
		brokenFac = f;
	}

	@Override
	public void fromBytes(ByteBuf data) {
		cooldown = data.readInt();
		cooldownStart = data.readInt();
		byte facID = data.readByte();
		if (facID >= 0) {
			brokenFac = GOTFaction.forID(facID);
		}
	}

	@Override
	public void toBytes(ByteBuf data) {
		data.writeInt(cooldown);
		data.writeInt(cooldownStart);
		if (brokenFac == null) {
			data.writeByte(-1);
		} else {
			data.writeByte(brokenFac.ordinal());
		}
	}

	public static class Handler implements IMessageHandler<GOTPacketBrokenOath, IMessage> {
		@Override
		public IMessage onMessage(GOTPacketBrokenOath packet, MessageContext context) {
			EntityPlayer entityplayer = GOT.proxy.getClientPlayer();
			GOTPlayerData pd = GOTLevelData.getData(entityplayer);
			pd.setOathBreakCooldown(packet.cooldown);
			pd.setOathBreakCooldownStart(packet.cooldownStart);
			pd.setBrokenOathFaction(packet.brokenFac);
			return null;
		}
	}
}