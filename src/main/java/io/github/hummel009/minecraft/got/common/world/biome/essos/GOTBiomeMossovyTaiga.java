package io.github.hummel009.minecraft.got.common.world.biome.essos;

import io.github.hummel009.minecraft.got.common.data.GOTAchievement;
import io.github.hummel009.minecraft.got.common.entity.other.GOTEntityWerewolf;
import io.github.hummel009.minecraft.got.common.world.map.GOTWaypoint;
import io.github.hummel009.minecraft.got.common.world.spawning.GOTEventSpawner;

public class GOTBiomeMossovyTaiga extends GOTBiomeEssosBase {
	public GOTBiomeMossovyTaiga(int i, boolean major) {
		super(i, major);
		preseter.setupTaigaView();
		preseter.setupTaigaFlora();
		preseter.setupTaigaFauna();
		preseter.setupNorthernTrees(true);

		addSpawnableMonster(GOTEntityWerewolf.class, 5, 1, 1);

		setupRuinedStructures(false);
	}

	@Override
	public GOTWaypoint.Region getBiomeWaypoints() {
		return GOTWaypoint.Region.MOSSOVY;
	}

	@Override
	public GOTAchievement getBiomeAchievement() {
		return GOTAchievement.enterMossovyTaiga;
	}

	@Override
	public GOTEventSpawner.EventChance getBanditChance() {
		return GOTEventSpawner.EventChance.NEVER;
	}
}