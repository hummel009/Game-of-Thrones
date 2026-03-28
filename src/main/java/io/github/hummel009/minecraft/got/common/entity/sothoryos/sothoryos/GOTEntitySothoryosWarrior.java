package io.github.hummel009.minecraft.got.common.entity.sothoryos.sothoryos;

import io.github.hummel009.minecraft.got.common.data.GOTItems;
import io.github.hummel009.minecraft.got.common.data.GOTShields;
import io.github.hummel009.minecraft.got.common.entity.other.utils.GOTWeaponSetFactory;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GOTEntitySothoryosWarrior extends GOTEntitySothoryosMan {
	@SuppressWarnings({"WeakerAccess", "unused"})
	public GOTEntitySothoryosWarrior(World world) {
		super(world);
		addTargetTasks(true);
	}

	@Override
	public GOTShields getShield() {
		return GOTShields.SOTHORYOS;
	}

	@Override
	public float getReputationBonus() {
		return 2.0f;
	}

	@Override
	public IEntityLivingData onSpawnWithEgg(IEntityLivingData data) {
		IEntityLivingData entityData = super.onSpawnWithEgg(data);

		GOTWeaponSetFactory.setupPrimitiveBronzeWeaponSet(this, rand);

		setCurrentItemOrArmor(1, new ItemStack(GOTItems.sothoryosBoots));
		setCurrentItemOrArmor(2, new ItemStack(GOTItems.sothoryosLeggings));
		setCurrentItemOrArmor(3, new ItemStack(GOTItems.sothoryosChestplate));
		setCurrentItemOrArmor(4, new ItemStack(GOTItems.sothoryosHelmet));

		return entityData;
	}

	@Override
	public void setupNPCGender() {
		familyInfo.setMale(true);
	}
}