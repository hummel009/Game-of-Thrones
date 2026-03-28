package io.github.hummel009.minecraft.got.common.world.biome.ulthos;

import io.github.hummel009.minecraft.got.client.sound.GOTMusicRegion;
import io.github.hummel009.minecraft.got.common.data.GOTBlocks;
import io.github.hummel009.minecraft.got.common.world.biome.GOTBiome;
import io.github.hummel009.minecraft.got.common.world.feature.GOTTreeType;
import io.github.hummel009.minecraft.got.common.world.map.GOTWaypoint;
import io.github.hummel009.minecraft.got.common.world.spawning.GOTEventSpawner;
import net.minecraft.world.gen.feature.WorldGenMinable;

public abstract class GOTBiomeUlthosBase extends GOTBiome {
	protected GOTBiomeUlthosBase(int i, boolean major) {
		super(i, major);
		decorator.setBiomeGemFactor(3.0f);
		decorator.setBiomeOreFactor(3.0f);
		decorator.addSoil(new WorldGenMinable(GOTBlocks.obsidianGravel, 32), 20.0f, 0, 64);
	}

	@Override
	public GOTWaypoint.Region getBiomeWaypoints() {
		return GOTWaypoint.Region.ULTHOS;
	}

	@Override
	public GOTMusicRegion.Sub getBiomeMusic() {
		return GOTMusicRegion.ULTHOS.getSubregion(biomeName);
	}

	@Override
	public GOTEventSpawner.EventChance getBanditChance() {
		return GOTEventSpawner.EventChance.NEVER;
	}

	protected void setupDefaultTrees() {
		decorator.clearTrees();
		decorator.addTree(GOTTreeType.PINE, 400);
		decorator.addTree(GOTTreeType.SPRUCE, 300);
		decorator.addTree(GOTTreeType.FIR, 300);
		decorator.addTree(GOTTreeType.DARK_OAK, 100);
		decorator.addTree(GOTTreeType.DARK_OAK_PARTY, 1);
	}
}