package io.github.hummel009.minecraft.got.common.block.table;

import io.github.hummel009.minecraft.got.common.data.GOTGuiId;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import net.minecraft.block.material.Material;

public class GOTBlockTablePentos extends GOTBlockCraftingTable {
	public GOTBlockTablePentos() {
		super(Material.wood, GOTFaction.PENTOS, GOTGuiId.TABLE_PENTOS);
		setStepSound(soundTypeWood);
	}
}