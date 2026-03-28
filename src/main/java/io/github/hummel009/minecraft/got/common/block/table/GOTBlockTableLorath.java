package io.github.hummel009.minecraft.got.common.block.table;

import io.github.hummel009.minecraft.got.common.data.GOTGuiId;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import net.minecraft.block.material.Material;

public class GOTBlockTableLorath extends GOTBlockCraftingTable {
	public GOTBlockTableLorath() {
		super(Material.wood, GOTFaction.LORATH, GOTGuiId.TABLE_LORATH);
		setStepSound(soundTypeWood);
	}
}