package io.github.hummel009.minecraft.got.common.entity.essos.ghiscar;

import io.github.hummel009.minecraft.got.common.data.GOTAchievement;
import io.github.hummel009.minecraft.got.common.data.GOTItems;
import io.github.hummel009.minecraft.got.common.entity.ai.GOTEntityAINearestAttackableTargetPatriot;
import io.github.hummel009.minecraft.got.common.entity.other.utils.GOTEntityUtils;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GOTEntityGhiscarHarpy extends GOTEntityGhiscarMan {
	@SuppressWarnings({"WeakerAccess", "unused"})
	public GOTEntityGhiscarHarpy(World world) {
		super(world);
		addTargetTasks(true, GOTEntityAINearestAttackableTargetPatriot.class);
	}

	@Override
	public boolean isSpawnsInDarkness() {
		return true;
	}

	@Override
	public GOTAchievement getKillAchievement() {
		return GOTAchievement.killGhiscarHarpy;
	}

	@Override
	public IEntityLivingData onSpawnWithEgg(IEntityLivingData data) {
		IEntityLivingData entityData = super.onSpawnWithEgg(data);

		npcItemsInv.setMeleeWeapon(new ItemStack(GOTItems.ironDaggerPoisoned));
		npcItemsInv.setIdleItem(npcItemsInv.getMeleeWeapon());

		GOTEntityUtils.setupLeathermanArmorNoHelmet(this, rand);

		setCurrentItemOrArmor(4, new ItemStack(GOTItems.harpy));

		return entityData;
	}

	@Override
	public void setupNPCGender() {
		familyInfo.setMale(true);
	}
}