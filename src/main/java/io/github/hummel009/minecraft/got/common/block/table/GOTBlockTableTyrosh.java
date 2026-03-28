package io.github.hummel009.minecraft.got.common.block.table;

import io.github.hummel009.minecraft.got.common.data.GOTGuiId;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import net.minecraft.block.material.Material;

public class GOTBlockTableTyrosh extends GOTBlockCraftingTable {
	public GOTBlockTableTyrosh() {
		super(Material.wood, GOTFaction.TYROSH, GOTGuiId.TABLE_TYROSH);
		setStepSound(soundTypeWood);
	}
}