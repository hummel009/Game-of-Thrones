package io.github.hummel009.minecraft.got.common.block.table;

import io.github.hummel009.minecraft.got.common.data.GOTGuiId;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import net.minecraft.block.material.Material;

public class GOTBlockTableStormlands extends GOTBlockCraftingTable {
	public GOTBlockTableStormlands() {
		super(Material.wood, GOTFaction.STORMLANDS, GOTGuiId.TABLE_STORMLANDS);
		setStepSound(soundTypeWood);
	}
}