package io.github.hummel009.minecraft.got.common.block.table;

import io.github.hummel009.minecraft.got.common.data.GOTGuiId;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import net.minecraft.block.material.Material;

public class GOTBlockTableMyr extends GOTBlockCraftingTable {
	public GOTBlockTableMyr() {
		super(Material.wood, GOTFaction.MYR, GOTGuiId.TABLE_MYR);
		setStepSound(soundTypeWood);
	}
}