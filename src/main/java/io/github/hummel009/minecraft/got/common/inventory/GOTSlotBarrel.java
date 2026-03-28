package io.github.hummel009.minecraft.got.common.inventory;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.github.hummel009.minecraft.got.common.item.other.GOTItemMug;
import io.github.hummel009.minecraft.got.common.recipe.GOTRecipeBrewing;
import io.github.hummel009.minecraft.got.common.tileentity.GOTTileEntityBarrel;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class GOTSlotBarrel extends Slot {
	private final GOTTileEntityBarrel theBarrel;
	private boolean isWater;

	public GOTSlotBarrel(GOTTileEntityBarrel inv, int i, int j, int k) {
		super(inv, i, j, k);
		theBarrel = inv;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getBackgroundIconIndex() {
		if (getSlotIndex() > 5) {
			return GOTItemMug.getBarrelGuiEmptyBucketSlotIcon();
		}
		return null;
	}

	@Override
	public boolean isItemValid(ItemStack itemstack) {
		return theBarrel.getBarrelMode() == 0 && (!isWater || GOTRecipeBrewing.isWaterSource(itemstack));
	}

	public void setWaterSource() {
		isWater = true;
	}
}