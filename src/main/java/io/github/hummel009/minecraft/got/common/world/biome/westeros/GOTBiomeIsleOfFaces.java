package io.github.hummel009.minecraft.got.common.world.biome.westeros;

import io.github.hummel009.minecraft.got.common.data.GOTAchievement;
import io.github.hummel009.minecraft.got.common.world.feature.GOTTreeType;
import io.github.hummel009.minecraft.got.common.world.map.GOTWaypoint;
import io.github.hummel009.minecraft.got.common.world.spawning.GOTEventSpawner;
import net.minecraft.init.Blocks;
import net.minecraft.world.gen.feature.WorldGenDoublePlant;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class GOTBiomeIsleOfFaces extends GOTBiomeWesterosBase {
	public GOTBiomeIsleOfFaces(int i, boolean major) {
		super(i, major);
		preseter.setupForestView();
		preseter.setupForestFlora();
		preseter.setupForestFauna();

		decorator.clearTrees();
		decorator.addTree(GOTTreeType.WEIRWOOD, 10);

		decorator.setTreesPerChunk(1);
		decorator.setFlowersPerChunk(20);
		decorator.setDoubleFlowersPerChunk(12);
		addFlower(Blocks.red_flower, 0, 80);

		flowers.clear();
		flowers.add(new FlowerEntry(Blocks.red_flower, 0, 80));
	}

	@Override
	public GOTWaypoint.Region getBiomeWaypoints() {
		return GOTWaypoint.Region.RIVERLANDS;
	}

	@Override
	public GOTAchievement getBiomeAchievement() {
		return GOTAchievement.enterIsleOfFaces;
	}

	@Override
	public boolean getEnableRiver() {
		return false;
	}

	@Override
	public GOTEventSpawner.EventChance getBanditChance() {
		return GOTEventSpawner.EventChance.NEVER;
	}

	@Override
	public WorldGenerator getRandomWorldGenForDoubleFlower(Random random) {
		if (random.nextInt(5) > 0) {
			WorldGenDoublePlant doubleFlowerGen = new WorldGenDoublePlant();
			doubleFlowerGen.func_150548_a(4);
			return doubleFlowerGen;
		}
		return super.getRandomWorldGenForDoubleFlower(random);
	}
}