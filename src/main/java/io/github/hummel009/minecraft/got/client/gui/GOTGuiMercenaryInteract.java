package io.github.hummel009.minecraft.got.client.gui;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import io.github.hummel009.minecraft.got.common.entity.other.GOTEntityNPC;
import io.github.hummel009.minecraft.got.common.network.GOTPacketHandler;
import io.github.hummel009.minecraft.got.common.network.GOTPacketMercenaryInteract;
import net.minecraft.client.gui.GuiButton;

public class GOTGuiMercenaryInteract extends GOTGuiUnitTradeInteract {
	public GOTGuiMercenaryInteract(GOTEntityNPC entity) {
		super(entity);
	}

	@Override
	public void actionPerformed(GuiButton button) {
		if (button.enabled) {
			IMessage packet = new GOTPacketMercenaryInteract(theEntity.getEntityId(), button.id);
			GOTPacketHandler.NETWORK_WRAPPER.sendToServer(packet);
		}
	}
}