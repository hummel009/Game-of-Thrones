package io.github.hummel009.minecraft.got.common.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.github.hummel009.minecraft.got.GOT;
import io.github.hummel009.minecraft.got.common.data.GOTGuiId;
import io.github.hummel009.minecraft.got.common.entity.other.GOTEntityNPC;
import net.minecraft.entity.player.EntityPlayer;

public class GOTPacketMercenaryInteract extends GOTPacketUnitTraderInteract {
	@SuppressWarnings("unused")
	public GOTPacketMercenaryInteract() {
	}

	public GOTPacketMercenaryInteract(int idt, int a) {
		super(idt, a);
	}

	@Override
	public void openTradeGUI(EntityPlayer entityplayer, GOTEntityNPC trader) {
		entityplayer.openGui(GOT.instance, GOTGuiId.MERCENARY_HIRE.ordinal(), entityplayer.worldObj, trader.getEntityId(), 0, 0);
	}

	public static class Handler implements IMessageHandler<GOTPacketMercenaryInteract, IMessage> {
		@Override
		public IMessage onMessage(GOTPacketMercenaryInteract message, MessageContext ctx) {
			return new GOTPacketUnitTraderInteract.Handler().onMessage(message, ctx);
		}
	}
}