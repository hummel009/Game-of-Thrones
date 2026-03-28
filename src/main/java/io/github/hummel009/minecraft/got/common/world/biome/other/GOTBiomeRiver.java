package io.github.hummel009.minecraft.got.common.world.biome.other;

import io.github.hummel009.minecraft.got.client.sound.GOTMusicRegion;
import io.github.hummel009.minecraft.got.common.data.GOTAchievement;
import io.github.hummel009.minecraft.got.common.world.biome.GOTBiome;
import io.github.hummel009.minecraft.got.common.world.map.GOTWaypoint;

public class GOTBiomeRiver extends GOTBiome {
	public GOTBiomeRiver(int i, boolean major) {
		super(i, major);
		spawnableCreatureList.clear();
	}

	@Override
	public boolean getEnableRiver() {
		return false;
	}

	@Override
	public GOTMusicRegion.Sub getBiomeMusic() {
		return GOTMusicRegion.OCEAN.getSubregion(biomeName);
	}

	@Override
	public GOTWaypoint.Region getBiomeWaypoints() {
		return null;
	}

	@Override
	public GOTAchievement getBiomeAchievement() {
		return null;
	}
}