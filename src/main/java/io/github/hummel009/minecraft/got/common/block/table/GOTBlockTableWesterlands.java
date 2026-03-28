package io.github.hummel009.minecraft.got.common.block.table;

import io.github.hummel009.minecraft.got.common.data.GOTGuiId;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import net.minecraft.block.material.Material;

public class GOTBlockTableWesterlands extends GOTBlockCraftingTable {
	public GOTBlockTableWesterlands() {
		super(Material.wood, GOTFaction.WESTERLANDS, GOTGuiId.TABLE_WESTERLANDS);
		setStepSound(soundTypeWood);
	}
}