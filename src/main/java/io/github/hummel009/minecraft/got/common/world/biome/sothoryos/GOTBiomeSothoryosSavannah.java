package io.github.hummel009.minecraft.got.common.world.biome.sothoryos;

import io.github.hummel009.minecraft.got.common.data.GOTAchievement;
import io.github.hummel009.minecraft.got.common.world.structure.sothoryos.sothoryos.GOTStructureSothoryosSettlement;

public class GOTBiomeSothoryosSavannah extends GOTBiomeSothoryosBase {
	public GOTBiomeSothoryosSavannah(int i, boolean major) {
		super(i, major);
		preseter.setupSavannahView();
		preseter.setupSavannahFlora();
		preseter.setupSavannahFauna();
		preseter.setupSavannahTrees();

		decorator.addSettlement(new GOTStructureSothoryosSettlement(this, 1.0f));
	}

	@Override
	public GOTAchievement getBiomeAchievement() {
		return GOTAchievement.enterSothoryosSavannah;
	}
}