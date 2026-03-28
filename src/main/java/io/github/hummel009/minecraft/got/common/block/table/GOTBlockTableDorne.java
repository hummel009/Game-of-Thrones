package io.github.hummel009.minecraft.got.common.block.table;

import io.github.hummel009.minecraft.got.common.data.GOTGuiId;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import net.minecraft.block.material.Material;

public class GOTBlockTableDorne extends GOTBlockCraftingTable {
	public GOTBlockTableDorne() {
		super(Material.wood, GOTFaction.DORNE, GOTGuiId.TABLE_DORNE);
		setStepSound(soundTypeWood);
	}
}