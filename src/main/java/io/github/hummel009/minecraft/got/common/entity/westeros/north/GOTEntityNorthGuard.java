package io.github.hummel009.minecraft.got.common.entity.westeros.north;

import io.github.hummel009.minecraft.got.common.data.GOTCapes;
import io.github.hummel009.minecraft.got.common.data.GOTItems;
import io.github.hummel009.minecraft.got.common.data.GOTShields;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GOTEntityNorthGuard extends GOTEntityNorthMan {
	@SuppressWarnings({"WeakerAccess", "unused"})
	public GOTEntityNorthGuard(World world) {
		super(world);
	}

	@Override
	public GOTShields getShield() {
		return GOTShields.NORTHGUARD;
	}

	@Override
	public GOTCapes getCape() {
		return GOTCapes.NORTHGUARD;
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

		setCurrentItemOrArmor(1, new ItemStack(GOTItems.northguardBoots));
		setCurrentItemOrArmor(2, new ItemStack(GOTItems.northguardLeggings));
		setCurrentItemOrArmor(3, new ItemStack(GOTItems.northguardChestplate));
		setCurrentItemOrArmor(4, new ItemStack(GOTItems.northguardHelmet));

		return entityData;
	}

	@Override
	public void setupNPCGender() {
		familyInfo.setMale(true);
	}
}
