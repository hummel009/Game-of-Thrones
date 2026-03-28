package io.github.hummel009.minecraft.got.common.block.table;

import io.github.hummel009.minecraft.got.common.data.GOTGuiId;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import net.minecraft.block.material.Material;

public class GOTBlockTableWildling extends GOTBlockCraftingTable {
	public GOTBlockTableWildling() {
		super(Material.wood, GOTFaction.WILDLING, GOTGuiId.TABLE_WILDLING);
		setStepSound(soundTypeWood);
	}
}