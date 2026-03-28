package io.github.hummel009.minecraft.got.common.world.biome.ulthos;

import io.github.hummel009.minecraft.got.common.data.GOTAchievement;
import io.github.hummel009.minecraft.got.common.world.biome.GOTBiome;
import io.github.hummel009.minecraft.got.common.world.feature.GOTTreeType;

public class GOTBiomeUlthosMarshes extends GOTBiomeUlthosBase implements GOTBiome.Marshes {
	public GOTBiomeUlthosMarshes(int i, boolean major) {
		super(i, major);
		preseter.setupMarshesView();
		preseter.setupMarshesFlora();
		preseter.setupMarshesFauna();

		setupDefaultTrees();
		decorator.addTree(GOTTreeType.ULTHOS_GREEN_OAK, 1000);
		decorator.addTree(GOTTreeType.ULTHOS_GREEN_OAK_LARGE, 250);
	}

	@Override
	public GOTAchievement getBiomeAchievement() {
		return GOTAchievement.enterUlthosMarshes;
	}

	@Override
	public boolean getEnableRiver() {
		return false;
	}
}