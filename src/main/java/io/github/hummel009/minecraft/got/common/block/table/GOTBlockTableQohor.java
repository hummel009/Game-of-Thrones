package io.github.hummel009.minecraft.got.common.block.table;

import io.github.hummel009.minecraft.got.common.data.GOTGuiId;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import net.minecraft.block.material.Material;

public class GOTBlockTableQohor extends GOTBlockCraftingTable {
	public GOTBlockTableQohor() {
		super(Material.wood, GOTFaction.QOHOR, GOTGuiId.TABLE_QOHOR);
		setStepSound(soundTypeWood);
	}
}