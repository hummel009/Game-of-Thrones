package io.github.hummel009.minecraft.got.common.block.table;

import io.github.hummel009.minecraft.got.common.data.GOTGuiId;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import net.minecraft.block.material.Material;

public class GOTBlockTableNorth extends GOTBlockCraftingTable {
	public GOTBlockTableNorth() {
		super(Material.wood, GOTFaction.NORTH, GOTGuiId.TABLE_NORTH);
		setStepSound(soundTypeWood);
	}
}