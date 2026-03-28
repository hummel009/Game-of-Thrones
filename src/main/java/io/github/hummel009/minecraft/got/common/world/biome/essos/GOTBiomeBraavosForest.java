package io.github.hummel009.minecraft.got.common.world.biome.essos;

import io.github.hummel009.minecraft.got.common.data.GOTAchievement;
import io.github.hummel009.minecraft.got.common.world.map.GOTWaypoint;

public class GOTBiomeBraavosForest extends GOTBiomeEssosBase {
	public GOTBiomeBraavosForest(int i, boolean major) {
		super(i, major);
		preseter.setupForestView();
		preseter.setupForestFlora();
		preseter.setupForestFauna();
		preseter.setupMiderateTrees();

		setupRuinedStructures(false);
	}

	@Override
	public GOTWaypoint.Region getBiomeWaypoints() {
		return GOTWaypoint.Region.BRAAVOS;
	}

	@Override
	public GOTAchievement getBiomeAchievement() {
		return GOTAchievement.enterBraavos;
	}
}