package io.github.hummel009.minecraft.got.common.item.other;

import io.github.hummel009.minecraft.got.common.GOTLevelData;
import io.github.hummel009.minecraft.got.common.data.GOTAchievement;
import io.github.hummel009.minecraft.got.common.data.GOTCreativeTabs;
import io.github.hummel009.minecraft.got.common.dispense.GOTDispenseConker;
import io.github.hummel009.minecraft.got.common.entity.other.inanimate.GOTEntityConker;
import net.minecraft.block.BlockDispenser;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GOTItemConker extends Item {
	public GOTItemConker() {
		setMaxStackSize(16);
		setCreativeTab(GOTCreativeTabs.TAB_MISC);
		BlockDispenser.dispenseBehaviorRegistry.putObject(this, new GOTDispenseConker());
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		if (!world.isRemote) {
			world.spawnEntityInWorld(new GOTEntityConker(world, entityplayer));
			world.playSoundAtEntity(entityplayer, "random.bow", 0.5f, 0.4f / (itemRand.nextFloat() * 0.4f + 0.8f));
			if (!entityplayer.capabilities.isCreativeMode) {
				--itemstack.stackSize;
			}

			GOTLevelData.getData(entityplayer).addAchievement(GOTAchievement.throwConker);
		}
		return itemstack;
	}
}