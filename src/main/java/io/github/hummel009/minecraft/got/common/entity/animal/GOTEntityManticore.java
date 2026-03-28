package io.github.hummel009.minecraft.got.common.entity.animal;

import io.github.hummel009.minecraft.got.common.GOTLevelData;
import io.github.hummel009.minecraft.got.common.data.GOTAchievement;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class GOTEntityManticore extends GOTEntityScorpionSmall {
	@SuppressWarnings({"WeakerAccess", "unused"})
	public GOTEntityManticore(World world) {
		super(world);
	}

	@Override
	public void onDeath(DamageSource damagesource) {
		super.onDeath(damagesource);
		if (!worldObj.isRemote && damagesource.getEntity() instanceof EntityPlayer) {
			EntityPlayer entityplayer = (EntityPlayer) damagesource.getEntity();
			GOTLevelData.getData(entityplayer).addAchievement(GOTAchievement.killManticore);
		}
	}
}