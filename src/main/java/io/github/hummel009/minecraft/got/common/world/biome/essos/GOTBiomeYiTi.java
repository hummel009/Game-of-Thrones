package io.github.hummel009.minecraft.got.common.world.biome.essos;

import io.github.hummel009.minecraft.got.common.data.GOTAchievement;
import io.github.hummel009.minecraft.got.common.data.GOTInvasions;
import io.github.hummel009.minecraft.got.common.data.GOTSpawnList;
import io.github.hummel009.minecraft.got.common.entity.animal.GOTEntityManticore;
import io.github.hummel009.minecraft.got.common.world.biome.variant.GOTBiomeVariant;
import io.github.hummel009.minecraft.got.common.world.map.GOTBezierType;
import io.github.hummel009.minecraft.got.common.world.map.GOTWaypoint;
import io.github.hummel009.minecraft.got.common.world.spawning.GOTBiomeSpawnList;
import io.github.hummel009.minecraft.got.common.world.spawning.GOTEventSpawner;
import io.github.hummel009.minecraft.got.common.world.spawning.GOTSpawnListContainer;
import io.github.hummel009.minecraft.got.common.world.structure.essos.yi_ti.GOTStructureYiTiSettlement;

import java.util.ArrayList;
import java.util.Collection;

public class GOTBiomeYiTi extends GOTBiomeEssosBase {
	public GOTBiomeYiTi(int i, boolean major) {
		super(i, major);
		preseter.setupSouthernPlainsView(false);
		preseter.setupSouthernPlainsFlora();
		preseter.setupSouthernPlainsFauna(false);
		preseter.setupSouthernTrees(false);

		biomeVariants.add(GOTBiomeVariant.FOREST_CHERRY, 0.2f);
		biomeVariants.add(GOTBiomeVariant.FOREST_LEMON, 0.2f);
		biomeVariants.add(GOTBiomeVariant.FOREST_LIME, 0.2f);

		addSpawnableMonster(GOTEntityManticore.class, 5, 1, 1);

		setupRuinedStructures(false);

		decorator.addSettlement(new GOTStructureYiTiSettlement(this, 1.0f));

		invasionSpawns.addInvasion(GOTInvasions.JOGOS_NHAI, GOTEventSpawner.EventChance.UNCOMMON);

		Collection<GOTSpawnListContainer> c0 = new ArrayList<>();
		c0.add(GOTBiomeSpawnList.entry(GOTSpawnList.YI_TI_CONQUEST, 1).setSpawnChance(SPAWN));
		c0.add(GOTBiomeSpawnList.entry(GOTSpawnList.YI_TI_MILITARY, 9).setSpawnChance(SPAWN));
		npcSpawnList.newFactionList(10).add(c0);
		Collection<GOTSpawnListContainer> c1 = new ArrayList<>();
		c1.add(GOTBiomeSpawnList.entry(GOTSpawnList.JOGOS_NHAI_MILITARY, 10).setSpawnChance(CONQUEST_SPAWN));
		npcSpawnList.newFactionList(0).add(c1);
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
	public GOTBezierType getWallBlock() {
		return GOTBezierType.WALL_YI_TI;
	}

	@Override
	public GOTBezierType getRoadBlock() {
		return GOTBezierType.PATH_PAVING;
	}
}