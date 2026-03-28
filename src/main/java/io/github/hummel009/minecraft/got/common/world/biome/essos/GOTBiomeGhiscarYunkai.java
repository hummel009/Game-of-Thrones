package io.github.hummel009.minecraft.got.common.world.biome.essos;

import io.github.hummel009.minecraft.got.common.data.GOTAchievement;
import io.github.hummel009.minecraft.got.common.data.GOTSpawnList;
import io.github.hummel009.minecraft.got.common.world.spawning.GOTBiomeSpawnList;
import io.github.hummel009.minecraft.got.common.world.spawning.GOTSpawnListContainer;
import io.github.hummel009.minecraft.got.common.world.structure.essos.ghiscar.GOTStructureGhiscarFightingPit;

import java.util.ArrayList;
import java.util.Collection;

public class GOTBiomeGhiscarYunkai extends GOTBiomeGhiscar {
	public GOTBiomeGhiscarYunkai(int i, boolean major) {
		super(i, major);
		decorator.addStructure(new GOTStructureGhiscarFightingPit(false), 150);

		Collection<GOTSpawnListContainer> c0 = new ArrayList<>();
		c0.add(GOTBiomeSpawnList.entry(GOTSpawnList.GHISCAR_CONQUEST, 10).setSpawnChance(SPAWN));
		c0.add(GOTBiomeSpawnList.entry(GOTSpawnList.GHISCAR_MILITARY, 4).setSpawnChance(SPAWN));
		npcSpawnList.newFactionList(10).add(c0);
	}

	@Override
	public GOTAchievement getBiomeAchievement() {
		return GOTAchievement.enterGhiscarYunkai;
	}

	@Override
	public boolean getEnableRiver() {
		return false;
	}
}