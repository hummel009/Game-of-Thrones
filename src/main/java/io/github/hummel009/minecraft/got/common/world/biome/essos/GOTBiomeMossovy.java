package io.github.hummel009.minecraft.got.common.world.biome.essos;

import io.github.hummel009.minecraft.got.common.data.GOTAchievement;
import io.github.hummel009.minecraft.got.common.data.GOTSpawnList;
import io.github.hummel009.minecraft.got.common.entity.other.GOTEntityWerewolf;
import io.github.hummel009.minecraft.got.common.world.map.GOTWaypoint;
import io.github.hummel009.minecraft.got.common.world.spawning.GOTBiomeSpawnList;
import io.github.hummel009.minecraft.got.common.world.spawning.GOTSpawnListContainer;
import io.github.hummel009.minecraft.got.common.world.structure.essos.mossovy.GOTStructureMossovySettlement;

import java.util.ArrayList;
import java.util.Collection;

public class GOTBiomeMossovy extends GOTBiomeEssosBase {
	public GOTBiomeMossovy(int i, boolean major) {
		super(i, major);
		preseter.setupNorthernPlainsView();
		preseter.setupNorthernPlainsFlora();
		preseter.setupNorthernPlainsFauna();
		preseter.setupNorthernTrees(false);

		addSpawnableMonster(GOTEntityWerewolf.class, 5, 1, 1);

		setupRuinedStructures(false);

		decorator.addSettlement(new GOTStructureMossovySettlement(this, 1.0f));

		Collection<GOTSpawnListContainer> c0 = new ArrayList<>();
		c0.add(GOTBiomeSpawnList.entry(GOTSpawnList.MOSSOVY_MILITARY, 10).setSpawnChance(SPAWN));
		npcSpawnList.newFactionList(10).add(c0);
	}

	@Override
	public GOTWaypoint.Region getBiomeWaypoints() {
		return GOTWaypoint.Region.MOSSOVY;
	}

	@Override
	public GOTAchievement getBiomeAchievement() {
		return GOTAchievement.enterMossovy;
	}
}