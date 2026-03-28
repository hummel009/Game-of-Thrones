package io.github.hummel009.minecraft.got.common.block.table;

import io.github.hummel009.minecraft.got.common.data.GOTGuiId;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import net.minecraft.block.material.Material;

public class GOTBlockTableLys extends GOTBlockCraftingTable {
	public GOTBlockTableLys() {
		super(Material.wood, GOTFaction.LYS, GOTGuiId.TABLE_LYS);
		setStepSound(soundTypeWood);
	}
}