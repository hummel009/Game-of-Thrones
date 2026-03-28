package io.github.hummel009.minecraft.got.common.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.github.hummel009.minecraft.got.GOT;
import io.github.hummel009.minecraft.got.common.entity.other.inanimate.GOTEntityInvasionSpawner;
import io.netty.buffer.ByteBuf;

public class GOTPacketInvasionWatch implements IMessage {
	private int invasionEntityID;
	private boolean overrideAlreadyWatched;

	@SuppressWarnings("unused")
	public GOTPacketInvasionWatch() {
	}

	public GOTPacketInvasionWatch(GOTEntityInvasionSpawner invasion, boolean override) {
		invasionEntityID = invasion.getEntityId();
		overrideAlreadyWatched = override;
	}

	@Override
	public void fromBytes(ByteBuf data) {
		invasionEntityID = data.readInt();
		overrideAlreadyWatched = data.readBoolean();
	}

	@Override
	public void toBytes(ByteBuf data) {
		data.writeInt(invasionEntityID);
		data.writeBoolean(overrideAlreadyWatched);
	}

	public static class Handler implements IMessageHandler<GOTPacketInvasionWatch, IMessage> {
		@Override
		public IMessage onMessage(GOTPacketInvasionWatch packet, MessageContext context) {
			GOT.proxy.handleInvasionWatch(packet.invasionEntityID, packet.overrideAlreadyWatched);
			return null;
		}
	}
}