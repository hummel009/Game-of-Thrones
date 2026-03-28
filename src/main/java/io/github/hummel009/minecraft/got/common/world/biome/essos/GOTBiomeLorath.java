package io.github.hummel009.minecraft.got.common.world.biome.essos;

import io.github.hummel009.minecraft.got.common.data.GOTAchievement;
import io.github.hummel009.minecraft.got.common.data.GOTInvasions;
import io.github.hummel009.minecraft.got.common.data.GOTSpawnList;
import io.github.hummel009.minecraft.got.common.world.biome.variant.GOTBiomeVariant;
import io.github.hummel009.minecraft.got.common.world.feature.GOTWorldGenBoulder;
import io.github.hummel009.minecraft.got.common.world.map.GOTWaypoint;
import io.github.hummel009.minecraft.got.common.world.spawning.GOTBiomeSpawnList;
import io.github.hummel009.minecraft.got.common.world.spawning.GOTEventSpawner;
import io.github.hummel009.minecraft.got.common.world.spawning.GOTSpawnListContainer;
import io.github.hummel009.minecraft.got.common.world.structure.essos.lorath.GOTStructureLorathFortress;
import io.github.hummel009.minecraft.got.common.world.structure.essos.lorath.GOTStructureLorathSettlement;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class GOTBiomeLorath extends GOTBiomeEssosBase {
	private static final WorldGenerator BOULDER_GEN = new GOTWorldGenBoulder(Blocks.stone, 0, 2, 4);

	public GOTBiomeLorath(int i, boolean major) {
		super(i, major);
		preseter.setupMideratePlainsView();
		preseter.setupMideratePlainsFlora();
		preseter.setupMideratePlainsFauna();
		preseter.setupMiderateTrees();

		setupRuinedStructures(false);

		decorator.addSettlement(new GOTStructureLorathSettlement(this, 1.0f));
		decorator.addStructure(new GOTStructureLorathFortress(false), 800);

		invasionSpawns.addInvasion(GOTInvasions.IBBEN, GOTEventSpawner.EventChance.UNCOMMON);

		Collection<GOTSpawnListContainer> c0 = new ArrayList<>();
		c0.add(GOTBiomeSpawnList.entry(GOTSpawnList.LORATH_CONQUEST, 4).setSpawnChance(SPAWN));
		c0.add(GOTBiomeSpawnList.entry(GOTSpawnList.LORATH_MILITARY, 10).setSpawnChance(SPAWN));
		npcSpawnList.newFactionList(10).add(c0);
		Collection<GOTSpawnListContainer> c1 = new ArrayList<>();
		c1.add(GOTBiomeSpawnList.entry(GOTSpawnList.IBBEN_CONQUEST, 10).setSpawnChance(CONQUEST_SPAWN));
		npcSpawnList.newFactionList(0).add(c1);
	}

	@Override
	public GOTWaypoint.Region getBiomeWaypoints() {
		return GOTWaypoint.Region.LORATH;
	}

	@Override
	public GOTAchievement getBiomeAchievement() {
		return GOTAchievement.enterLorath;
	}

	@Override
	public void generateBiomeTerrain(World world, Random random, Block[] blocks, byte[] meta, int i, int k, double stoneNoise, int height, GOTBiomeVariant variant) {
		generator.generateStoneNoise(world, random, blocks, meta, i, k, stoneNoise, height, variant);
	}

	@Override
	public void decorate(World world, Random random, int i, int k) {
		super.decorate(world, random, i, k);
		if (random.nextInt(32) == 0) {
			for (int l = 0; l < 3; ++l) {
				int i1 = i + random.nextInt(16) + 8;
				int k1 = k + random.nextInt(16) + 8;
				BOULDER_GEN.generate(world, random, i1, world.getHeightValue(i1, k1), k1);
			}
		}
	}
}