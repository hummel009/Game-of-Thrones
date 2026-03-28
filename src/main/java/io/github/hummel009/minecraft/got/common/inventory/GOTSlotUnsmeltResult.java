package io.github.hummel009.minecraft.got.common.inventory;

import io.github.hummel009.minecraft.got.common.GOTLevelData;
import io.github.hummel009.minecraft.got.common.data.GOTAchievement;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public class GOTSlotUnsmeltResult extends GOTSlotProtected {
	public GOTSlotUnsmeltResult(IInventory inv, int i, int j, int k) {
		super(inv, i, j, k);
	}

	@Override
	public void onPickupFromSlot(EntityPlayer entityplayer, ItemStack itemstack) {
		super.onPickupFromSlot(entityplayer, itemstack);
		if (!entityplayer.worldObj.isRemote) {
			GOTLevelData.getData(entityplayer).addAchievement(GOTAchievement.useUnsmeltery);
		}
	}
}