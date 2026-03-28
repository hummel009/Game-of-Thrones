package io.github.hummel009.minecraft.got.common.block.table;

import io.github.hummel009.minecraft.got.common.data.GOTGuiId;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import net.minecraft.block.material.Material;

public class GOTBlockTableDothraki extends GOTBlockCraftingTable {
	public GOTBlockTableDothraki() {
		super(Material.wood, GOTFaction.DOTHRAKI, GOTGuiId.TABLE_DOTHRAKI);
		setStepSound(soundTypeWood);
	}
}