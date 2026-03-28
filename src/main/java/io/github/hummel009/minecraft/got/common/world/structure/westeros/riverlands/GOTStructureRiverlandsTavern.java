package io.github.hummel009.minecraft.got.common.world.structure.westeros.riverlands;

import io.github.hummel009.minecraft.got.common.world.structure.other.GOTStructureBase;
import io.github.hummel009.minecraft.got.common.world.structure.westeros.common.GOTStructureWesterosTavern;

public class GOTStructureRiverlandsTavern extends GOTStructureWesterosTavern {
	public GOTStructureRiverlandsTavern(boolean flag) {
		super(flag);
		kingdom = Kingdom.RIVERLANDS;
	}

	public GOTStructureBase setIsCrossroads() {
		isCrossroads = true;
		return this;
	}
}