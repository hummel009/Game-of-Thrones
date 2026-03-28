package io.github.hummel009.minecraft.got.common.block.table;

import io.github.hummel009.minecraft.got.common.data.GOTGuiId;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import net.minecraft.block.material.Material;

public class GOTBlockTableGift extends GOTBlockCraftingTable {
	public GOTBlockTableGift() {
		super(Material.wood, GOTFaction.NIGHT_WATCH, GOTGuiId.TABLE_GIFT);
		setStepSound(soundTypeWood);
	}
}