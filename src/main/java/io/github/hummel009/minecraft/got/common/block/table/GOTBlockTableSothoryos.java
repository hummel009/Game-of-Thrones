package io.github.hummel009.minecraft.got.common.block.table;

import io.github.hummel009.minecraft.got.common.data.GOTGuiId;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import net.minecraft.block.material.Material;

public class GOTBlockTableSothoryos extends GOTBlockCraftingTable {
	public GOTBlockTableSothoryos() {
		super(Material.wood, GOTFaction.SOTHORYOS, GOTGuiId.TABLE_SOTHORYOS);
		setStepSound(soundTypeWood);
	}
}