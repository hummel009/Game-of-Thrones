package io.github.hummel009.minecraft.got.common.item.other;

import io.github.hummel009.minecraft.got.common.block.other.GOTBlockPlaceableFood;
import io.github.hummel009.minecraft.got.common.data.GOTCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.item.ItemReed;

public class GOTItemPlaceableFood extends ItemReed {
	public GOTItemPlaceableFood(Block block) {
		super(block);
		setMaxStackSize(1);
		setCreativeTab(GOTCreativeTabs.TAB_FOOD);
		((GOTBlockPlaceableFood) block).setFoodItem(this);
	}
}