package io.github.hummel009.minecraft.got.common.block.table;

import io.github.hummel009.minecraft.got.common.data.GOTGuiId;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import net.minecraft.block.material.Material;

public class GOTBlockTableCrownlands extends GOTBlockCraftingTable {
	public GOTBlockTableCrownlands() {
		super(Material.wood, GOTFaction.CROWNLANDS, GOTGuiId.TABLE_CROWNLANDS);
		setStepSound(soundTypeWood);
	}
}