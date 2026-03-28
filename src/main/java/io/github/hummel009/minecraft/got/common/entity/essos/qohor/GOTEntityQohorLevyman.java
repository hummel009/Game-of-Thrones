package io.github.hummel009.minecraft.got.common.entity.essos.qohor;

import io.github.hummel009.minecraft.got.common.entity.other.utils.GOTEntityUtils;
import io.github.hummel009.minecraft.got.common.entity.other.utils.GOTWeaponSetFactory;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.world.World;

public class GOTEntityQohorLevyman extends GOTEntityQohorMan {
	@SuppressWarnings({"WeakerAccess", "unused"})
	public GOTEntityQohorLevyman(World world) {
		super(world);
		addTargetTasks(true);
	}

	@Override
	public float getReputationBonus() {
		return 2.0f;
	}

	@Override
	public IEntityLivingData onSpawnWithEgg(IEntityLivingData data) {
		IEntityLivingData entityData = super.onSpawnWithEgg(data);

		GOTWeaponSetFactory.setupIronWeaponSet(this, rand, false);
		GOTEntityUtils.setupLeathermanArmorTurban(this, rand);

		return entityData;
	}

	@Override
	public void setupNPCGender() {
		familyInfo.setMale(true);
	}
}
