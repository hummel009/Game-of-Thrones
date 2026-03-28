package io.github.hummel009.minecraft.got.common.entity.other;

import io.github.hummel009.minecraft.got.common.GOTLevelData;
import io.github.hummel009.minecraft.got.common.data.GOTAchievement;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import io.github.hummel009.minecraft.got.common.world.biome.GOTBiome;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GOTEntityUlthosSpider extends GOTEntitySpiderBase implements GOTBiome.ImmuneToHeat, GOTBiome.ImmuneToFrost {
	@SuppressWarnings({"WeakerAccess", "unused"})
	public GOTEntityUlthosSpider(World world) {
		super(world);
	}

	@Override
	public boolean isSpawnsInDarkness() {
		return true;
	}

	@Override
	public GOTFaction getFaction() {
		return GOTFaction.ULTHOS;
	}

	@Override
	public float getReputationBonus() {
		return 2.0f;
	}

	@Override
	public GOTAchievement getKillAchievement() {
		return GOTAchievement.killUlthosSpider;
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		if (!worldObj.isRemote && riddenByEntity instanceof EntityPlayer && isMountSaddled()) {
			GOTLevelData.getData((EntityPlayer) riddenByEntity).addAchievement(GOTAchievement.rideUlthosSpider);
		}
	}

	@Override
	public int getRandomSpiderScale() {
		return rand.nextInt(3);
	}

	@Override
	public int getRandomSpiderType() {
		return rand.nextBoolean() ? 0 : 1 + rand.nextInt(2);
	}
}