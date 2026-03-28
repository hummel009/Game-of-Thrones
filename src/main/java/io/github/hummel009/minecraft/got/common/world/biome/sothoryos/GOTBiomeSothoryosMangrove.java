package io.github.hummel009.minecraft.got.common.world.biome.sothoryos;

import io.github.hummel009.minecraft.got.common.data.GOTAchievement;
import io.github.hummel009.minecraft.got.common.data.GOTBlocks;
import io.github.hummel009.minecraft.got.common.entity.animal.GOTEntityCrocodile;
import io.github.hummel009.minecraft.got.common.world.biome.GOTBiome;
import io.github.hummel009.minecraft.got.common.world.biome.variant.GOTBiomeVariant;
import io.github.hummel009.minecraft.got.common.world.feature.GOTTreeType;

public class GOTBiomeSothoryosMangrove extends GOTBiomeSothoryosBase implements GOTBiome.Marshes {
	public GOTBiomeSothoryosMangrove(int i, boolean major) {
		super(i, major);
		topBlock = GOTBlocks.mudGrass;
		fillerBlock = GOTBlocks.mud;

		preseter.setupJungleView();
		preseter.setupJungleFlora();
		preseter.setupJungleFauna();
		preseter.removeAllEntities();

		variantChance = 1.0f;
		biomeVariants.clear();
		biomeVariants.add(GOTBiomeVariant.SWAMP_LOWLAND, 1.0f);

		addSpawnableMonster(GOTEntityCrocodile.class, 5, 1, 1);

		decorator.addTree(GOTTreeType.MANGROVE, 500);
	}

	@Override
	public GOTAchievement getBiomeAchievement() {
		return GOTAchievement.enterSothoryosMangrove;
	}

	@Override
	public boolean getEnableRiver() {
		return false;
	}
}