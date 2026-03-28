package io.github.hummel009.minecraft.got.common.block.table;

import io.github.hummel009.minecraft.got.common.data.GOTGuiId;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import net.minecraft.block.material.Material;

public class GOTBlockTableIbben extends GOTBlockCraftingTable {
	public GOTBlockTableIbben() {
		super(Material.wood, GOTFaction.ARRYN, GOTGuiId.TABLE_IBBEN);
		setStepSound(soundTypeWood);
	}
}