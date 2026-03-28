package io.github.hummel009.minecraft.got.common.block.table;

import io.github.hummel009.minecraft.got.common.data.GOTGuiId;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import net.minecraft.block.material.Material;

public class GOTBlockTableIronborn extends GOTBlockCraftingTable {
	public GOTBlockTableIronborn() {
		super(Material.wood, GOTFaction.IRONBORN, GOTGuiId.TABLE_IRONBORN);
		setStepSound(soundTypeWood);
	}
}