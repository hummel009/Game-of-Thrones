package io.github.hummel009.minecraft.got.common.block.table;

import io.github.hummel009.minecraft.got.common.data.GOTGuiId;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import net.minecraft.block.material.Material;

public class GOTBlockTableBraavos extends GOTBlockCraftingTable {
	public GOTBlockTableBraavos() {
		super(Material.wood, GOTFaction.BRAAVOS, GOTGuiId.TABLE_BRAAVOS);
		setStepSound(soundTypeWood);
	}
}