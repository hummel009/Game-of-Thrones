package io.github.hummel009.minecraft.got.common.block.table;

import io.github.hummel009.minecraft.got.common.data.GOTGuiId;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import net.minecraft.block.material.Material;

public class GOTBlockTableLhazar extends GOTBlockCraftingTable {
	public GOTBlockTableLhazar() {
		super(Material.wood, GOTFaction.LHAZAR, GOTGuiId.TABLE_LHAZAR);
		setStepSound(soundTypeWood);
	}
}