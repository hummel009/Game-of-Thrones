package io.github.hummel009.minecraft.got.common.world.biome.westeros;

import io.github.hummel009.minecraft.got.common.data.GOTAchievement;
import io.github.hummel009.minecraft.got.common.world.map.GOTWaypoint;

public class GOTBiomeKingswoodNorth extends GOTBiomeWesterosBase {
	public GOTBiomeKingswoodNorth(int i, boolean major) {
		super(i, major);
		preseter.setupForestView();
		preseter.setupForestFlora();
		preseter.setupForestFauna();
		preseter.setupMiderateTrees();

		setupRuinedStructures(false);
	}

	@Override
	public GOTWaypoint.Region getBiomeWaypoints() {
		return GOTWaypoint.Region.CROWNLANDS;
	}

	@Override
	public GOTAchievement getBiomeAchievement() {
		return GOTAchievement.enterKingswood;
	}
}