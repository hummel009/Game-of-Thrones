package io.github.hummel009.minecraft.got.common.world.biome.essos;

import io.github.hummel009.minecraft.got.common.data.GOTAchievement;
import io.github.hummel009.minecraft.got.common.world.map.GOTBezierType;
import io.github.hummel009.minecraft.got.common.world.map.GOTWaypoint;
import io.github.hummel009.minecraft.got.common.world.spawning.GOTEventSpawner;
import io.github.hummel009.minecraft.got.common.world.structure.essos.jogos.GOTStructureJogosNhaiSettlement;

public class GOTBiomeJogosNhai extends GOTBiomeEssosBase {
	public GOTBiomeJogosNhai(int i, boolean major) {
		super(i, major);
		preseter.setupSavannahView();
		preseter.setupSavannahFlora();
		preseter.setupSavannahFauna();
		preseter.setupSavannahTrees();

		decorator.addSettlement(new GOTStructureJogosNhaiSettlement(this, 1.0f));
	}

	@Override
	public GOTWaypoint.Region getBiomeWaypoints() {
		return GOTWaypoint.Region.JOGOS_NHAI;
	}

	@Override
	public GOTAchievement getBiomeAchievement() {
		return GOTAchievement.enterJogosNhai;
	}

	@Override
	public GOTEventSpawner.EventChance getBanditChance() {
		return GOTEventSpawner.EventChance.NEVER;
	}

	@Override
	public GOTBezierType getWallBlock() {
		return GOTBezierType.WALL_YI_TI;
	}
}