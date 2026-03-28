package io.github.hummel009.minecraft.got.common.world.structure.westeros.crownlands;

import io.github.hummel009.minecraft.got.common.world.structure.other.GOTStructureBase;
import io.github.hummel009.minecraft.got.common.world.structure.westeros.common.GOTStructureWesterosTavern;

public class GOTStructureCrownlandsTavern extends GOTStructureWesterosTavern {
	public GOTStructureCrownlandsTavern(boolean flag) {
		super(flag);
		kingdom = Kingdom.CROWNLANDS;
	}

	public GOTStructureBase setIsKingsLanding() {
		isKingsLanding = true;
		return this;
	}
}