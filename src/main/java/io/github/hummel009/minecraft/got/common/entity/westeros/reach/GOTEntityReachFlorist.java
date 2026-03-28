package io.github.hummel009.minecraft.got.common.entity.westeros.reach;

import io.github.hummel009.minecraft.got.common.data.GOTItems;
import io.github.hummel009.minecraft.got.common.data.GOTTradeEntries;
import io.github.hummel009.minecraft.got.common.entity.other.iface.GOTTradeable;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GOTEntityReachFlorist extends GOTEntityReachMan implements GOTTradeable {
	@SuppressWarnings({"WeakerAccess", "unused"})
	public GOTEntityReachFlorist(World world) {
		super(world);
	}

	@Override
	public float getReputationBonus() {
		return 2.0f;
	}

	@Override
	public GOTTradeEntries getSellsPool() {
		return GOTTradeEntries.FLORIST_SELLS;
	}

	@Override
	public GOTTradeEntries getBuysPool() {
		return GOTTradeEntries.FLORIST_BUYS;
	}

	@Override
	public IEntityLivingData onSpawnWithEgg(IEntityLivingData data) {
		IEntityLivingData entityData = super.onSpawnWithEgg(data);

		npcItemsInv.setIdleItem(new ItemStack(Blocks.red_flower));

		setCurrentItemOrArmor(4, new ItemStack(GOTItems.leatherHat));

		return entityData;
	}
}
