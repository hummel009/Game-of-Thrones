package io.github.hummel009.minecraft.got.common.block.table;

import io.github.hummel009.minecraft.got.common.data.GOTGuiId;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import net.minecraft.block.material.Material;

public class GOTBlockTableQarth extends GOTBlockCraftingTable {
	public GOTBlockTableQarth() {
		super(Material.wood, GOTFaction.QARTH, GOTGuiId.TABLE_QARTH);
		setStepSound(soundTypeWood);
	}
}