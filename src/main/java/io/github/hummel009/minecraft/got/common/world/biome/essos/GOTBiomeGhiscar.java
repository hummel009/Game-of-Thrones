package io.github.hummel009.minecraft.got.common.world.biome.essos;

import io.github.hummel009.minecraft.got.common.data.GOTAchievement;
import io.github.hummel009.minecraft.got.common.data.GOTBlocks;
import io.github.hummel009.minecraft.got.common.entity.other.GOTEntityDarkSkinBandit;
import io.github.hummel009.minecraft.got.common.entity.other.GOTEntityNPC;
import io.github.hummel009.minecraft.got.common.world.biome.GOTBiome;
import io.github.hummel009.minecraft.got.common.world.biome.variant.GOTBiomeVariant;
import io.github.hummel009.minecraft.got.common.world.feature.GOTWorldGenBoulder;
import io.github.hummel009.minecraft.got.common.world.map.GOTBezierType;
import io.github.hummel009.minecraft.got.common.world.map.GOTWaypoint;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class GOTBiomeGhiscar extends GOTBiomeEssosBase {
	private static final WorldGenerator BOULDER_GEN = new GOTWorldGenBoulder(Blocks.stone, 0, 1, 2);

	public GOTBiomeGhiscar(int i, boolean major) {
		super(i, major);
		preseter.setupSouthernPlainsView(false);
		preseter.setupSouthernPlainsFlora();
		preseter.setupSouthernPlainsFauna(true);
		preseter.setupSouthernTrees(true);

		setupRuinedStructures(true);
	}

	@Override
	public GOTWaypoint.Region getBiomeWaypoints() {
		return GOTWaypoint.Region.GHISCAR;
	}

	@Override
	public GOTAchievement getBiomeAchievement() {
		return GOTAchievement.enterGhiscar;
	}

	@Override
	public GOTBezierType getRoadBlock() {
		return GOTBezierType.PATH_SANDY;
	}

	@Override
	public Class<? extends GOTEntityNPC> getBanditEntityClass() {
		return GOTEntityDarkSkinBandit.class;
	}

	@Override
	public void generateBiomeTerrain(World world, Random random, Block[] blocks, byte[] meta, int i, int k, double stoneNoise, int height, GOTBiomeVariant variant) {
		generator.generateDirtSandNoise(world, random, blocks, meta, i, k, stoneNoise, height, variant);
	}

	@Override
	public void decorate(World world, Random random, int i, int k) {
		super.decorate(world, random, i, k);
		if (random.nextInt(12) == 0) {
			int boulders = 1 + random.nextInt(4);
			for (int l = 0; l < boulders; ++l) {
				int i1 = i + random.nextInt(16) + 8;
				int k1 = k + random.nextInt(16) + 8;
				BOULDER_GEN.generate(world, random, i1, world.getHeightValue(i1, k1), k1);
			}
		}
	}

	@Override
	public GOTBiome.GrassBlockAndMeta getRandomGrass(Random random) {
		return new GOTBiome.GrassBlockAndMeta(GOTBlocks.aridGrass, 0);
	}
}