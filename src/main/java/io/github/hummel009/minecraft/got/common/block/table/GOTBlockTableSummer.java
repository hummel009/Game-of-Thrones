package io.github.hummel009.minecraft.got.common.block.table;

import io.github.hummel009.minecraft.got.common.data.GOTGuiId;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import net.minecraft.block.material.Material;

public class GOTBlockTableSummer extends GOTBlockCraftingTable {
	public GOTBlockTableSummer() {
		super(Material.wood, GOTFaction.SUMMER_ISLANDS, GOTGuiId.TABLE_SUMMER);
		setStepSound(soundTypeWood);
	}
}