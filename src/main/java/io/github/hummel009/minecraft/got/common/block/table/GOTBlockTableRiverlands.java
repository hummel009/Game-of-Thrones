package io.github.hummel009.minecraft.got.common.block.table;

import io.github.hummel009.minecraft.got.common.data.GOTGuiId;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import net.minecraft.block.material.Material;

public class GOTBlockTableRiverlands extends GOTBlockCraftingTable {
	public GOTBlockTableRiverlands() {
		super(Material.wood, GOTFaction.RIVERLANDS, GOTGuiId.TABLE_RIVERLANDS);
		setStepSound(soundTypeWood);
	}
}