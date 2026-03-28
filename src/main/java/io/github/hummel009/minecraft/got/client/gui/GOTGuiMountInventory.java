package io.github.hummel009.minecraft.got.client.gui;

import io.github.hummel009.minecraft.got.common.entity.animal.GOTEntityHorse;
import io.github.hummel009.minecraft.got.common.inventory.GOTContainerMountInventory;
import net.minecraft.client.gui.inventory.GuiScreenHorseInventory;
import net.minecraft.inventory.IInventory;

public class GOTGuiMountInventory extends GuiScreenHorseInventory {
	public GOTGuiMountInventory(IInventory playerInv, IInventory horseInv, GOTEntityHorse horse) {
		super(playerInv, horseInv, horse);
		inventorySlots = new GOTContainerMountInventory(playerInv, horseInv, horse);
	}
}