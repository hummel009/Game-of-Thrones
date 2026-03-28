package io.github.hummel009.minecraft.got.common.world.biome.westeros;

import io.github.hummel009.minecraft.got.common.data.GOTAchievement;
import io.github.hummel009.minecraft.got.common.world.map.GOTWaypoint;

public class GOTBiomeKingswoodSouth extends GOTBiomeWesterosBase {
	public GOTBiomeKingswoodSouth(int i, boolean major) {
		super(i, major);
		preseter.setupForestView();
		preseter.setupForestFlora();
		preseter.setupForestFauna();
		preseter.setupSouthernTrees(false);

		setupRuinedStructures(false);
	}

	@Override
	public GOTWaypoint.Region getBiomeWaypoints() {
		return GOTWaypoint.Region.STORMLANDS;
	}

	@Override
	public GOTAchievement getBiomeAchievement() {
		return GOTAchievement.enterKingswood;
	}
}