package io.github.hummel009.minecraft.got.common.entity.westeros.dragonstone;

import io.github.hummel009.minecraft.got.common.data.GOTCapes;
import io.github.hummel009.minecraft.got.common.data.GOTInvasions;
import io.github.hummel009.minecraft.got.common.data.GOTItems;
import io.github.hummel009.minecraft.got.common.data.GOTUnitTradeEntries;
import io.github.hummel009.minecraft.got.common.entity.other.iface.GOTUnitTradeable;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GOTEntityDragonstoneCaptain extends GOTEntityDragonstoneMan implements GOTUnitTradeable {
	@SuppressWarnings({"WeakerAccess", "unused"})
	public GOTEntityDragonstoneCaptain(World world) {
		super(world);
	}

	@Override
	public GOTCapes getCape() {
		return GOTCapes.DRAGONSTONE;
	}

	@Override
	public float getReputationBonus() {
		return 5.0f;
	}

	@Override
	public GOTUnitTradeEntries getUnits() {
		return GOTUnitTradeEntries.DRAGONSTONE;
	}

	@Override
	public GOTInvasions getWarhorn() {
		return GOTInvasions.DRAGONSTONE;
	}

	@Override
	public IEntityLivingData onSpawnWithEgg(IEntityLivingData data) {
		IEntityLivingData entityData = super.onSpawnWithEgg(data);

		npcItemsInv.setMeleeWeapon(new ItemStack(Items.iron_sword));
		npcItemsInv.setIdleItem(npcItemsInv.getMeleeWeapon());

		setCurrentItemOrArmor(1, new ItemStack(GOTItems.dragonstoneBoots));
		setCurrentItemOrArmor(2, new ItemStack(GOTItems.dragonstoneLeggings));
		setCurrentItemOrArmor(3, new ItemStack(GOTItems.dragonstoneChestplate));

		return entityData;
	}

	@Override
	public void setupNPCGender() {
		familyInfo.setMale(true);
	}
}
