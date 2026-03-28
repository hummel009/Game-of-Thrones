package io.github.hummel009.minecraft.got.common.entity.westeros.ice;

import io.github.hummel009.minecraft.got.common.data.GOTAchievement;
import io.github.hummel009.minecraft.got.common.entity.ai.GOTEntityAINearestAttackableTargetPatriot;
import io.github.hummel009.minecraft.got.common.entity.other.GOTEntityGiantBase;
import io.github.hummel009.minecraft.got.common.entity.other.utils.IceUtils;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class GOTEntityWightGiant extends GOTEntityGiantBase {
	@SuppressWarnings({"WeakerAccess", "unused"})
	public GOTEntityWightGiant(World world) {
		super(world);
		addTargetTasks(true, GOTEntityAINearestAttackableTargetPatriot.class);
	}

	@Override
	public boolean isSpawnsInDarkness() {
		return true;
	}

	@Override
	public GOTFaction getFaction() {
		return GOTFaction.WHITE_WALKER;
	}

	@Override
	public float getReputationBonus() {
		return 3.0f;
	}

	@Override
	public GOTAchievement getKillAchievement() {
		return GOTAchievement.killWightGiant;
	}

	@Override
	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(1.0);
	}

	@Override
	public boolean attackEntityAsMob(Entity entity) {
		return IceUtils.attackWithFrost(entity, super.attackEntityAsMob(entity));
	}

	@Override
	public boolean attackEntityFrom(DamageSource damagesource, float f) {
		boolean causeDamage = IceUtils.calculateDamage(this, damagesource, true);
		return super.attackEntityFrom(damagesource, causeDamage ? f : 0.0f);
	}

	@Override
	public void dropFewItems(boolean flag, int i) {
	}

	@Override
	public void onKillEntity(EntityLivingBase entity) {
		super.onKillEntity(entity);
		IceUtils.createNewWight(this, entity, worldObj);
	}
}