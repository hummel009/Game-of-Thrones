package io.github.hummel009.minecraft.got.common.block.table;

import io.github.hummel009.minecraft.got.common.data.GOTGuiId;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import net.minecraft.block.material.Material;

public class GOTBlockTableHillTribes extends GOTBlockCraftingTable {
	public GOTBlockTableHillTribes() {
		super(Material.wood, GOTFaction.HILL_TRIBES, GOTGuiId.TABLE_HILLMEN);
		setStepSound(soundTypeWood);
	}
}