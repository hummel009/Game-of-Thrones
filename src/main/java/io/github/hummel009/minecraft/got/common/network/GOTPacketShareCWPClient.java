package io.github.hummel009.minecraft.got.common.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.github.hummel009.minecraft.got.GOT;
import io.github.hummel009.minecraft.got.common.GOTLevelData;
import io.github.hummel009.minecraft.got.common.GOTPlayerData;
import io.github.hummel009.minecraft.got.common.fellowship.GOTFellowshipClient;
import io.github.hummel009.minecraft.got.common.world.map.GOTCustomWaypoint;
import io.netty.buffer.ByteBuf;

import java.util.UUID;

public class GOTPacketShareCWPClient implements IMessage {
	private int cwpID;
	private UUID fellowshipID;
	private boolean adding;

	@SuppressWarnings("unused")
	public GOTPacketShareCWPClient() {
	}

	public GOTPacketShareCWPClient(int id, UUID fsID, boolean add) {
		cwpID = id;
		fellowshipID = fsID;
		adding = add;
	}

	@Override
	public void fromBytes(ByteBuf data) {
		cwpID = data.readInt();
		fellowshipID = new UUID(data.readLong(), data.readLong());
		adding = data.readBoolean();
	}

	@Override
	public void toBytes(ByteBuf data) {
		data.writeInt(cwpID);
		data.writeLong(fellowshipID.getMostSignificantBits());
		data.writeLong(fellowshipID.getLeastSignificantBits());
		data.writeBoolean(adding);
	}

	public static class Handler implements IMessageHandler<GOTPacketShareCWPClient, IMessage> {
		@Override
		public IMessage onMessage(GOTPacketShareCWPClient packet, MessageContext context) {
			GOTCustomWaypoint cwp;
			GOTPlayerData pd;
			if (!GOT.proxy.isSingleplayer() && (cwp = (pd = GOTLevelData.getData(GOT.proxy.getClientPlayer())).getCustomWaypointByID(packet.cwpID)) != null) {
				if (packet.adding) {
					GOTFellowshipClient fsClient = pd.getClientFellowshipByID(packet.fellowshipID);
					if (fsClient != null) {
						GOTPlayerData.customWaypointAddSharedFellowshipClient(cwp, fsClient);
					}
				} else {
					GOTPlayerData.customWaypointRemoveSharedFellowshipClient(cwp, packet.fellowshipID);
				}
			}
			return null;
		}
	}
}