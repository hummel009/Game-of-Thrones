package io.github.hummel009.minecraft.got.common.world.biome.sothoryos;

import io.github.hummel009.minecraft.got.common.data.GOTAchievement;
import io.github.hummel009.minecraft.got.common.data.GOTInvasions;
import io.github.hummel009.minecraft.got.common.data.GOTSpawnList;
import io.github.hummel009.minecraft.got.common.entity.other.GOTEntityDarkSkinBandit;
import io.github.hummel009.minecraft.got.common.entity.other.GOTEntityNPC;
import io.github.hummel009.minecraft.got.common.world.map.GOTWaypoint;
import io.github.hummel009.minecraft.got.common.world.spawning.GOTBiomeSpawnList;
import io.github.hummel009.minecraft.got.common.world.spawning.GOTEventSpawner;
import io.github.hummel009.minecraft.got.common.world.spawning.GOTSpawnListContainer;
import io.github.hummel009.minecraft.got.common.world.structure.other.GOTStructureBurntHouse;
import io.github.hummel009.minecraft.got.common.world.structure.other.GOTStructureRottenHouse;
import io.github.hummel009.minecraft.got.common.world.structure.other.GOTStructureRuinedHouse;
import io.github.hummel009.minecraft.got.common.world.structure.sothoryos.summer.GOTStructureSummerSettlement;

import java.util.ArrayList;
import java.util.Collection;

public class GOTBiomeSummerColony extends GOTBiomeSothoryosSavannah {
	public GOTBiomeSummerColony(int i, boolean major) {
		super(i, major);
		decorator.addSettlement(new GOTStructureSummerSettlement(this, 1.0f));

		decorator.addStructure(new GOTStructureRuinedHouse(false), 2000);
		decorator.addStructure(new GOTStructureBurntHouse(false), 2000);
		decorator.addStructure(new GOTStructureRottenHouse(false), 4000);

		invasionSpawns.addInvasion(GOTInvasions.SOTHORYOS, GOTEventSpawner.EventChance.COMMON);

		Collection<GOTSpawnListContainer> c0 = new ArrayList<>();
		c0.add(GOTBiomeSpawnList.entry(GOTSpawnList.SUMMER_MILITARY, 10).setSpawnChance(SPAWN));
		npcSpawnList.newFactionList(10).add(c0);
		Collection<GOTSpawnListContainer> c1 = new ArrayList<>();
		c1.add(GOTBiomeSpawnList.entry(GOTSpawnList.SOTHORYOS_MILITARY, 4).setSpawnChance(SPAWN));
		npcSpawnList.newFactionList(0).add(c1);
	}

	@Override
	public GOTWaypoint.Region getBiomeWaypoints() {
		return GOTWaypoint.Region.SUMMER_COLONY;
	}

	@Override
	public GOTAchievement getBiomeAchievement() {
		return GOTAchievement.enterSummerColony;
	}

	@Override
	public GOTEventSpawner.EventChance getBanditChance() {
		return GOTEventSpawner.EventChance.COMMON;
	}

	@Override
	public Class<? extends GOTEntityNPC> getBanditEntityClass() {
		return GOTEntityDarkSkinBandit.class;
	}
}