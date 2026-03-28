package io.github.hummel009.minecraft.got.common.entity.other.utils;

import io.github.hummel009.minecraft.got.common.data.GOTBlocks;
import io.github.hummel009.minecraft.got.common.item.other.GOTItemBarrel;
import io.github.hummel009.minecraft.got.common.recipe.GOTRecipeBrewing;
import io.github.hummel009.minecraft.got.common.tileentity.GOTTileEntityBarrel;
import net.minecraft.item.ItemStack;

public class GOTTradeEntryBarrel extends GOTTradeEntry {
	public GOTTradeEntryBarrel(ItemStack itemstack, int cost) {
		super(itemstack, cost);
	}

	@Override
	public ItemStack createTradeItem() {
		ItemStack drinkItem = super.createTradeItem();
		ItemStack barrelItem = new ItemStack(GOTBlocks.barrel);
		GOTTileEntityBarrel barrel = new GOTTileEntityBarrel();
		barrel.setInventorySlotContents(9, new ItemStack(drinkItem.getItem(), GOTRecipeBrewing.BARREL_CAPACITY, drinkItem.getItemDamage()));
		barrel.setBarrelMode(2);
		GOTItemBarrel.setBarrelDataFromTE(barrelItem, barrel);
		return barrelItem;
	}
}