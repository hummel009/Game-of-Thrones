package io.github.hummel009.minecraft.got.common.world.biome.sothoryos;

import io.github.hummel009.minecraft.got.common.data.GOTAchievement;
import io.github.hummel009.minecraft.got.common.entity.animal.GOTEntityJungleScorpion;
import io.github.hummel009.minecraft.got.common.world.biome.essos.GOTBiomeEssosBase;
import io.github.hummel009.minecraft.got.common.world.map.GOTWaypoint;
import io.github.hummel009.minecraft.got.common.world.structure.other.GOTStructureBurntHouse;
import io.github.hummel009.minecraft.got.common.world.structure.other.GOTStructureRottenHouse;
import io.github.hummel009.minecraft.got.common.world.structure.other.GOTStructureRuinedHouse;

public class GOTBiomeSummerIslandsTropicalForest extends GOTBiomeEssosBase {
	public GOTBiomeSummerIslandsTropicalForest(int i, boolean major) {
		super(i, major);
		preseter.setupJungleView();
		preseter.setupJungleFlora();
		preseter.setupJungleFauna();
		preseter.setupJungleTrees();

		addSpawnableMonster(GOTEntityJungleScorpion.class, 5, 1, 1);

		decorator.addStructure(new GOTStructureRuinedHouse(false), 2000);
		decorator.addStructure(new GOTStructureBurntHouse(false), 2000);
		decorator.addStructure(new GOTStructureRottenHouse(false), 4000);
	}

	@Override
	public GOTWaypoint.Region getBiomeWaypoints() {
		return GOTWaypoint.Region.SUMMER;
	}

	@Override
	public GOTAchievement getBiomeAchievement() {
		return GOTAchievement.enterSummerIslands;
	}
}