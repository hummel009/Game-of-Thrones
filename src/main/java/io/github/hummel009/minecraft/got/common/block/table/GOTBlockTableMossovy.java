package io.github.hummel009.minecraft.got.common.block.table;

import io.github.hummel009.minecraft.got.common.data.GOTGuiId;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import net.minecraft.block.material.Material;

public class GOTBlockTableMossovy extends GOTBlockCraftingTable {
	public GOTBlockTableMossovy() {
		super(Material.wood, GOTFaction.MOSSOVY, GOTGuiId.TABLE_MOSSOVY);
		setStepSound(soundTypeWood);
	}
}