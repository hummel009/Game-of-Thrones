package io.github.hummel009.minecraft.got.common.entity.essos.ghiscar;

import io.github.hummel009.minecraft.got.common.data.GOTCapes;
import io.github.hummel009.minecraft.got.common.data.GOTItems;
import io.github.hummel009.minecraft.got.common.data.GOTShields;
import io.github.hummel009.minecraft.got.common.entity.other.utils.GOTWeaponSetFactory;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GOTEntityGhiscarSoldier extends GOTEntityGhiscarMan {
	@SuppressWarnings({"WeakerAccess", "unused"})
	public GOTEntityGhiscarSoldier(World world) {
		super(world);
		addTargetTasks(true);
		spawnRidingHorse = rand.nextInt(10) == 0;
	}

	@Override
	public GOTCapes getCape() {
		return GOTCapes.GHISCAR;
	}

	@Override
	public GOTShields getShield() {
		return GOTShields.GHISCAR;
	}

	@Override
	public float getReputationBonus() {
		return 2.0f;
	}

	@Override
	public IEntityLivingData onSpawnWithEgg(IEntityLivingData data) {
		IEntityLivingData entityData = super.onSpawnWithEgg(data);

		GOTWeaponSetFactory.setupIronWeaponSet(this, rand, true);

		setCurrentItemOrArmor(1, new ItemStack(GOTItems.ghiscarBoots));
		setCurrentItemOrArmor(2, new ItemStack(GOTItems.ghiscarLeggings));
		setCurrentItemOrArmor(3, new ItemStack(GOTItems.ghiscarChestplate));
		setCurrentItemOrArmor(4, new ItemStack(GOTItems.ghiscarHelmet));

		return entityData;
	}

	@Override
	public void setupNPCGender() {
		familyInfo.setMale(true);
	}
}
