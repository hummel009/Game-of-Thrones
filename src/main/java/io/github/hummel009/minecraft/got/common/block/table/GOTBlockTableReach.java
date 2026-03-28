package io.github.hummel009.minecraft.got.common.block.table;

import io.github.hummel009.minecraft.got.common.data.GOTGuiId;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import net.minecraft.block.material.Material;

public class GOTBlockTableReach extends GOTBlockCraftingTable {
	public GOTBlockTableReach() {
		super(Material.wood, GOTFaction.REACH, GOTGuiId.TABLE_REACH);
		setStepSound(soundTypeWood);
	}
}