package io.github.hummel009.minecraft.got.common.block.table;

import io.github.hummel009.minecraft.got.common.data.GOTGuiId;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import net.minecraft.block.material.Material;

public class GOTBlockTableJogosNhai extends GOTBlockCraftingTable {
	public GOTBlockTableJogosNhai() {
		super(Material.wood, GOTFaction.JOGOS_NHAI, GOTGuiId.TABLE_JOGOS_NHAI);
		setStepSound(soundTypeWood);
	}
}