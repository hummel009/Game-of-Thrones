package io.github.hummel009.minecraft.got.common.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.github.hummel009.minecraft.got.common.GOTLevelData;
import io.github.hummel009.minecraft.got.common.GOTPlayerData;
import io.github.hummel009.minecraft.got.common.fellowship.GOTFellowship;
import io.github.hummel009.minecraft.got.common.fellowship.GOTFellowshipClient;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;

public class GOTPacketFellowshipToggle extends GOTPacketFellowshipDo {
	private ToggleFunction function;

	@SuppressWarnings("unused")
	public GOTPacketFellowshipToggle() {
	}

	public GOTPacketFellowshipToggle(GOTFellowshipClient fs, ToggleFunction f) {
		super(fs);
		function = f;
	}

	@Override
	public void fromBytes(ByteBuf data) {
		super.fromBytes(data);
		function = ToggleFunction.values()[data.readByte()];
	}

	@Override
	public void toBytes(ByteBuf data) {
		super.toBytes(data);
		data.writeByte(function.ordinal());
	}

	public enum ToggleFunction {
		PVP, HIRED_FF, MAP_SHOW

	}

	public static class Handler implements IMessageHandler<GOTPacketFellowshipToggle, IMessage> {
		@Override
		public IMessage onMessage(GOTPacketFellowshipToggle packet, MessageContext context) {
			EntityPlayerMP entityplayer = context.getServerHandler().playerEntity;
			GOTFellowship fellowship = packet.getActiveFellowship();
			if (fellowship != null) {
				GOTPlayerData playerData = GOTLevelData.getData(entityplayer);
				if (packet.function == ToggleFunction.PVP) {
					boolean current = fellowship.getPreventPVP();
					playerData.setFellowshipPreventPVP(fellowship, !current);
				} else if (packet.function == ToggleFunction.HIRED_FF) {
					boolean current = fellowship.getPreventHiredFriendlyFire();
					playerData.setFellowshipPreventHiredFF(fellowship, !current);
				} else if (packet.function == ToggleFunction.MAP_SHOW) {
					boolean current = fellowship.getShowMapLocations();
					playerData.setFellowshipShowMapLocations(fellowship, !current);
				}
			}
			return null;
		}
	}
}