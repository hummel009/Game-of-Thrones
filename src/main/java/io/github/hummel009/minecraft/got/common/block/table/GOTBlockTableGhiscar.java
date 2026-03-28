package io.github.hummel009.minecraft.got.common.block.table;

import io.github.hummel009.minecraft.got.common.data.GOTGuiId;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import net.minecraft.block.material.Material;

public class GOTBlockTableGhiscar extends GOTBlockCraftingTable {
	public GOTBlockTableGhiscar() {
		super(Material.wood, GOTFaction.GHISCAR, GOTGuiId.TABLE_GHISCAR);
		setStepSound(soundTypeWood);
	}
}