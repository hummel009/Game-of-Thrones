package io.github.hummel009.minecraft.got.common.world.biome.essos;

import io.github.hummel009.minecraft.got.common.data.GOTAchievement;
import io.github.hummel009.minecraft.got.common.world.biome.variant.GOTBiomeVariant;
import io.github.hummel009.minecraft.got.common.world.feature.GOTWorldGenDoubleFlower;
import io.github.hummel009.minecraft.got.common.world.map.GOTBezierType;
import io.github.hummel009.minecraft.got.common.world.map.GOTWaypoint;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class GOTBiomeMyrForest extends GOTBiomeEssosBase {
	public GOTBiomeMyrForest(int i, boolean major) {
		super(i, major);
		preseter.setupForestView();
		preseter.setupForestFlora();
		preseter.setupForestFauna();
		preseter.setupSouthernTrees(true);

		setupRuinedStructures(false);
	}

	@Override
	public GOTWaypoint.Region getBiomeWaypoints() {
		return GOTWaypoint.Region.SOUTHERN_FREE_CITIES;
	}

	@Override
	public GOTAchievement getBiomeAchievement() {
		return GOTAchievement.enterMyr;
	}

	@Override
	public GOTBezierType getRoadBlock() {
		return GOTBezierType.PATH_SANDY;
	}

	@Override
	public void generateBiomeTerrain(World world, Random random, Block[] blocks, byte[] meta, int i, int k, double stoneNoise, int height, GOTBiomeVariant variant) {
		generator.generateDirtSandRedSandNoise(world, random, blocks, meta, i, k, stoneNoise, height, variant);
	}

	@Override
	public WorldGenerator getRandomWorldGenForDoubleFlower(Random random) {
		GOTWorldGenDoubleFlower doubleFlowerGen = new GOTWorldGenDoubleFlower();
		doubleFlowerGen.setFlowerType(random.nextInt(4));
		return doubleFlowerGen;
	}
}