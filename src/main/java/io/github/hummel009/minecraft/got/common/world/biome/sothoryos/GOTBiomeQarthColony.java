package io.github.hummel009.minecraft.got.common.world.biome.sothoryos;

import io.github.hummel009.minecraft.got.common.data.GOTAchievement;
import io.github.hummel009.minecraft.got.common.data.GOTInvasions;
import io.github.hummel009.minecraft.got.common.data.GOTSpawnList;
import io.github.hummel009.minecraft.got.common.world.map.GOTWaypoint;
import io.github.hummel009.minecraft.got.common.world.spawning.GOTBiomeSpawnList;
import io.github.hummel009.minecraft.got.common.world.spawning.GOTEventSpawner;
import io.github.hummel009.minecraft.got.common.world.spawning.GOTSpawnListContainer;
import io.github.hummel009.minecraft.got.common.world.structure.essos.qarth.GOTStructureQarthSettlement;
import io.github.hummel009.minecraft.got.common.world.structure.other.GOTStructureBurntHouse;
import io.github.hummel009.minecraft.got.common.world.structure.other.GOTStructureRottenHouse;
import io.github.hummel009.minecraft.got.common.world.structure.other.GOTStructureRuinedHouse;

import java.util.ArrayList;
import java.util.Collection;

public class GOTBiomeQarthColony extends GOTBiomeSothoryosSavannah {
	public GOTBiomeQarthColony(int i, boolean major) {
		super(i, major);
		decorator.addSettlement(new GOTStructureQarthSettlement(this, 1.0f).type(GOTStructureQarthSettlement.Type.FORT, 5));

		decorator.addStructure(new GOTStructureRuinedHouse(false), 2000);
		decorator.addStructure(new GOTStructureBurntHouse(false), 2000);
		decorator.addStructure(new GOTStructureRottenHouse(false), 4000);

		invasionSpawns.addInvasion(GOTInvasions.SOTHORYOS, GOTEventSpawner.EventChance.COMMON);

		Collection<GOTSpawnListContainer> c0 = new ArrayList<>();
		c0.add(GOTBiomeSpawnList.entry(GOTSpawnList.QARTH_MILITARY, 10).setSpawnChance(SPAWN));
		npcSpawnList.newFactionList(10).add(c0);
		Collection<GOTSpawnListContainer> c1 = new ArrayList<>();
		c1.add(GOTBiomeSpawnList.entry(GOTSpawnList.SOTHORYOS_MILITARY, 4).setSpawnChance(SPAWN));
		npcSpawnList.newFactionList(0).add(c1);
	}

	@Override
	public GOTWaypoint.Region getBiomeWaypoints() {
		return GOTWaypoint.Region.QARTH_COLONY;
	}

	@Override
	public GOTAchievement getBiomeAchievement() {
		return GOTAchievement.enterQarthColony;
	}

	@Override
	public GOTEventSpawner.EventChance getBanditChance() {
		return GOTEventSpawner.EventChance.COMMON;
	}
}