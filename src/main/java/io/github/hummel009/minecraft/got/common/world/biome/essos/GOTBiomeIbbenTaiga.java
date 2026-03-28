package io.github.hummel009.minecraft.got.common.world.biome.essos;

import io.github.hummel009.minecraft.got.common.data.GOTAchievement;
import io.github.hummel009.minecraft.got.common.world.map.GOTWaypoint;
import io.github.hummel009.minecraft.got.common.world.spawning.GOTEventSpawner;

public class GOTBiomeIbbenTaiga extends GOTBiomeEssosBase {
	public GOTBiomeIbbenTaiga(int i, boolean major) {
		super(i, major);
		preseter.setupTaigaView();
		preseter.setupTaigaFlora();
		preseter.setupTaigaFauna();
		preseter.setupNorthernTrees(true);
	}

	@Override
	public GOTWaypoint.Region getBiomeWaypoints() {
		return GOTWaypoint.Region.IBBEN;
	}

	@Override
	public GOTAchievement getBiomeAchievement() {
		return GOTAchievement.enterIbbenTaiga;
	}

	@Override
	public GOTEventSpawner.EventChance getBanditChance() {
		return GOTEventSpawner.EventChance.NEVER;
	}
}