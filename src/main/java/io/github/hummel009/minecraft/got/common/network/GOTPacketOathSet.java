package io.github.hummel009.minecraft.got.common.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.github.hummel009.minecraft.got.common.GOTLevelData;
import io.github.hummel009.minecraft.got.common.GOTPlayerData;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;

public class GOTPacketOathSet implements IMessage {
	private GOTFaction oathFac;

	@SuppressWarnings("unused")
	public GOTPacketOathSet() {
	}

	public GOTPacketOathSet(GOTFaction f) {
		oathFac = f;
	}

	@Override
	public void fromBytes(ByteBuf data) {
		byte facID = data.readByte();
		oathFac = facID == -1 ? null : GOTFaction.forID(facID);
	}

	@Override
	public void toBytes(ByteBuf data) {
		int facID = oathFac == null ? -1 : oathFac.ordinal();
		data.writeByte(facID);
	}

	public static class Handler implements IMessageHandler<GOTPacketOathSet, IMessage> {
		@Override
		public IMessage onMessage(GOTPacketOathSet packet, MessageContext context) {
			EntityPlayerMP entityplayer = context.getServerHandler().playerEntity;
			GOTPlayerData pd = GOTLevelData.getData(entityplayer);
			GOTFaction fac = packet.oathFac;
			if (fac == null) {
				pd.revokeOathFaction(entityplayer, true);
			} else if (pd.canOathTo(fac) && pd.canMakeNewOath()) {
				pd.setOathFaction(fac);
			}
			return null;
		}
	}
}