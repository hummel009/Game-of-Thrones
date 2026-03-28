package io.github.hummel009.minecraft.got.common.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.github.hummel009.minecraft.got.common.GOTLevelData;
import io.github.hummel009.minecraft.got.common.GOTPlayerData;
import io.github.hummel009.minecraft.got.common.quest.GOTMiniQuest;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;

import java.util.UUID;

public class GOTPacketMiniquestTrack implements IMessage {
	private UUID questID;

	@SuppressWarnings("unused")
	public GOTPacketMiniquestTrack() {
	}

	public GOTPacketMiniquestTrack(GOTMiniQuest quest) {
		questID = quest == null ? null : quest.getQuestUUID();
	}

	@Override
	public void fromBytes(ByteBuf data) {
		boolean hasQuest = data.readBoolean();
		questID = hasQuest ? new UUID(data.readLong(), data.readLong()) : null;
	}

	@Override
	public void toBytes(ByteBuf data) {
		boolean hasQuest = questID != null;
		data.writeBoolean(hasQuest);
		if (hasQuest) {
			data.writeLong(questID.getMostSignificantBits());
			data.writeLong(questID.getLeastSignificantBits());
		}
	}

	public static class Handler implements IMessageHandler<GOTPacketMiniquestTrack, IMessage> {
		@Override
		public IMessage onMessage(GOTPacketMiniquestTrack packet, MessageContext context) {
			EntityPlayerMP entityplayer = context.getServerHandler().playerEntity;
			GOTPlayerData pd = GOTLevelData.getData(entityplayer);
			if (packet.questID == null) {
				pd.setTrackingMiniQuestID(null);
			} else {
				pd.setTrackingMiniQuestID(packet.questID);
			}
			return null;
		}
	}
}