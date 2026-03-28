package io.github.hummel009.minecraft.got.common.block.table;

import io.github.hummel009.minecraft.got.common.data.GOTGuiId;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import net.minecraft.block.material.Material;

public class GOTBlockTableVolantis extends GOTBlockCraftingTable {
	public GOTBlockTableVolantis() {
		super(Material.wood, GOTFaction.VOLANTIS, GOTGuiId.TABLE_VOLANTIS);
		setStepSound(soundTypeWood);
	}
}