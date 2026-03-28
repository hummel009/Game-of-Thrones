package io.github.hummel009.minecraft.got.common.world.biome.westeros;

import io.github.hummel009.minecraft.got.common.data.GOTAchievement;
import io.github.hummel009.minecraft.got.common.data.GOTSpawnList;
import io.github.hummel009.minecraft.got.common.world.map.GOTWaypoint;
import io.github.hummel009.minecraft.got.common.world.spawning.GOTBiomeSpawnList;
import io.github.hummel009.minecraft.got.common.world.spawning.GOTSpawnListContainer;
import io.github.hummel009.minecraft.got.common.world.structure.westeros.ironborn.GOTStructureIronbornSettlement;
import io.github.hummel009.minecraft.got.common.world.structure.westeros.ironborn.GOTStructureIronbornWatchfort;

import java.util.ArrayList;
import java.util.Collection;

public class GOTBiomeIronIslands extends GOTBiomeWesterosBase {
	public GOTBiomeIronIslands(int i, boolean major) {
		super(i, major);
		preseter.setupMideratePlainsView();
		preseter.setupMideratePlainsFlora();
		preseter.setupMideratePlainsFauna();
		preseter.setupNorthernTrees(false);

		setupRuinedStructures(false);

		decorator.addSettlement(new GOTStructureIronbornSettlement(this, 1.0f));
		decorator.addStructure(new GOTStructureIronbornWatchfort(false), 800);

		Collection<GOTSpawnListContainer> c0 = new ArrayList<>();
		c0.add(GOTBiomeSpawnList.entry(GOTSpawnList.IRONBORN_CONQUEST, 4).setSpawnChance(SPAWN));
		c0.add(GOTBiomeSpawnList.entry(GOTSpawnList.IRONBORN_MILITARY, 10).setSpawnChance(SPAWN));
		npcSpawnList.newFactionList(10).add(c0);
		Collection<GOTSpawnListContainer> c1 = new ArrayList<>();
		c1.add(GOTBiomeSpawnList.entry(GOTSpawnList.NORTH_CONQUEST, 10).setSpawnChance(CONQUEST_SPAWN));
		npcSpawnList.newFactionList(0).add(c1);
	}

	@Override
	public GOTWaypoint.Region getBiomeWaypoints() {
		return GOTWaypoint.Region.IRONBORN;
	}

	@Override
	public GOTAchievement getBiomeAchievement() {
		return GOTAchievement.enterIronIslands;
	}
}