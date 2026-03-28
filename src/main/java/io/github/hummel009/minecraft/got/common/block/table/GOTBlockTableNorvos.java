package io.github.hummel009.minecraft.got.common.block.table;

import io.github.hummel009.minecraft.got.common.data.GOTGuiId;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import net.minecraft.block.material.Material;

public class GOTBlockTableNorvos extends GOTBlockCraftingTable {
	public GOTBlockTableNorvos() {
		super(Material.wood, GOTFaction.NORVOS, GOTGuiId.TABLE_NORVOS);
		setStepSound(soundTypeWood);
	}
}