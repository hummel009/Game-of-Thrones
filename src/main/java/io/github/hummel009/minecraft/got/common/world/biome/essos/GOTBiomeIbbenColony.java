package io.github.hummel009.minecraft.got.common.world.biome.essos;

import io.github.hummel009.minecraft.got.common.data.GOTAchievement;
import io.github.hummel009.minecraft.got.common.data.GOTInvasions;
import io.github.hummel009.minecraft.got.common.data.GOTSpawnList;
import io.github.hummel009.minecraft.got.common.world.map.GOTBezierType;
import io.github.hummel009.minecraft.got.common.world.map.GOTWaypoint;
import io.github.hummel009.minecraft.got.common.world.spawning.GOTBiomeSpawnList;
import io.github.hummel009.minecraft.got.common.world.spawning.GOTEventSpawner;
import io.github.hummel009.minecraft.got.common.world.spawning.GOTSpawnListContainer;
import io.github.hummel009.minecraft.got.common.world.structure.essos.ibben.GOTStructureIbbenSettlement;
import io.github.hummel009.minecraft.got.common.world.structure.other.GOTStructureSmallStoneRuin;
import io.github.hummel009.minecraft.got.common.world.structure.other.GOTStructureStoneRuin;

import java.util.ArrayList;
import java.util.Collection;

public class GOTBiomeIbbenColony extends GOTBiomeEssosBase {
	public GOTBiomeIbbenColony(int i, boolean major) {
		super(i, major);
		preseter.setupMideratePlainsView();
		preseter.setupMideratePlainsFlora();
		preseter.setupMideratePlainsFauna();
		preseter.setupMiderateTrees();

		setupRuinedStructures(false);

		decorator.addSettlement(new GOTStructureIbbenSettlement(this, 1.0f));

		invasionSpawns.addInvasion(GOTInvasions.LORATH, GOTEventSpawner.EventChance.UNCOMMON);

		Collection<GOTSpawnListContainer> c0 = new ArrayList<>();
		c0.add(GOTBiomeSpawnList.entry(GOTSpawnList.IBBEN_CONQUEST, 4).setSpawnChance(SPAWN));
		c0.add(GOTBiomeSpawnList.entry(GOTSpawnList.IBBEN_MILITARY, 10).setSpawnChance(SPAWN));
		npcSpawnList.newFactionList(10).add(c0);
		Collection<GOTSpawnListContainer> c1 = new ArrayList<>();
		c1.add(GOTBiomeSpawnList.entry(GOTSpawnList.IRONBORN_CONQUEST, 10).setSpawnChance(CONQUEST_SPAWN));
		npcSpawnList.newFactionList(0).add(c1);
		Collection<GOTSpawnListContainer> c2 = new ArrayList<>();
		c2.add(GOTBiomeSpawnList.entry(GOTSpawnList.LORATH_CONQUEST, 10).setSpawnChance(CONQUEST_SPAWN));
		npcSpawnList.newFactionList(0).add(c2);
		decorator.addStructure(new GOTStructureStoneRuin.RuinStone(1, 4), 400);
		decorator.addStructure(new GOTStructureSmallStoneRuin(false), 500);
	}

	@Override
	public GOTWaypoint.Region getBiomeWaypoints() {
		return GOTWaypoint.Region.IBBEN_COLONY;
	}

	@Override
	public GOTAchievement getBiomeAchievement() {
		return GOTAchievement.enterIbbenColony;
	}

	@Override
	public GOTBezierType getWallBlock() {
		return GOTBezierType.WALL_IBBEN;
	}
}