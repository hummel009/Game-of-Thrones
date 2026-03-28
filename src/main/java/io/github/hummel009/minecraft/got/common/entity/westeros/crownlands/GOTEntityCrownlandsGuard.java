package io.github.hummel009.minecraft.got.common.entity.westeros.crownlands;

import io.github.hummel009.minecraft.got.common.data.GOTCapes;
import io.github.hummel009.minecraft.got.common.data.GOTItems;
import io.github.hummel009.minecraft.got.common.data.GOTShields;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GOTEntityCrownlandsGuard extends GOTEntityCrownlandsMan {
	@SuppressWarnings({"WeakerAccess", "unused"})
	public GOTEntityCrownlandsGuard(World world) {
		super(world);
	}

	@Override
	public GOTShields getShield() {
		return GOTShields.CROWNLANDS;
	}

	@Override
	public GOTCapes getCape() {
		return GOTCapes.CROWNLANDS;
	}

	@Override
	public float getReputationBonus() {
		return 2.0f;
	}

	@Override
	public IEntityLivingData onSpawnWithEgg(IEntityLivingData data) {
		IEntityLivingData entityData = super.onSpawnWithEgg(data);

		npcItemsInv.setMeleeWeapon(new ItemStack(GOTItems.ironPike));
		npcItemsInv.setIdleItem(npcItemsInv.getMeleeWeapon());

		setCurrentItemOrArmor(1, new ItemStack(GOTItems.crownlandsBoots));
		setCurrentItemOrArmor(2, new ItemStack(GOTItems.crownlandsLeggings));
		setCurrentItemOrArmor(3, new ItemStack(GOTItems.crownlandsChestplate));
		setCurrentItemOrArmor(4, new ItemStack(GOTItems.crownlandsHelmet));

		return entityData;
	}

	@Override
	public void setupNPCGender() {
		familyInfo.setMale(true);
	}
}
