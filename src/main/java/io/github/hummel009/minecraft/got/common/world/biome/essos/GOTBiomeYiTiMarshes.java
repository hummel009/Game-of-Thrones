package io.github.hummel009.minecraft.got.common.world.biome.essos;

import io.github.hummel009.minecraft.got.common.data.GOTAchievement;
import io.github.hummel009.minecraft.got.common.world.biome.GOTBiome;
import io.github.hummel009.minecraft.got.common.world.map.GOTBezierType;
import io.github.hummel009.minecraft.got.common.world.map.GOTWaypoint;

public class GOTBiomeYiTiMarshes extends GOTBiomeEssosBase implements GOTBiome.Marshes {
	public GOTBiomeYiTiMarshes(int i, boolean major) {
		super(i, major);
		preseter.setupMarshesView();
		preseter.setupMarshesFlora();
		preseter.setupMarshesFauna();
		preseter.setupSouthernTrees(false);
	}

	@Override
	public GOTWaypoint.Region getBiomeWaypoints() {
		return GOTWaypoint.Region.YI_TI;
	}

	@Override
	public GOTAchievement getBiomeAchievement() {
		return GOTAchievement.enterYiTi;
	}

	@Override
	public boolean getEnableRiver() {
		return false;
	}

	@Override
	public GOTBezierType getRoadBlock() {
		return GOTBezierType.PATH_PAVING;
	}
}