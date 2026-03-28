package io.github.hummel009.minecraft.got.common.block.table;

import io.github.hummel009.minecraft.got.common.data.GOTGuiId;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import net.minecraft.block.material.Material;

public class GOTBlockTableYiTi extends GOTBlockCraftingTable {
	public GOTBlockTableYiTi() {
		super(Material.wood, GOTFaction.YI_TI, GOTGuiId.TABLE_YI_TI);
		setStepSound(soundTypeWood);
	}
}