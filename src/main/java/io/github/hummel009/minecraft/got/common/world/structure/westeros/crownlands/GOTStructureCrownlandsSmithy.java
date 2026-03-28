package io.github.hummel009.minecraft.got.common.world.structure.westeros.crownlands;

import io.github.hummel009.minecraft.got.common.world.structure.other.GOTStructureBase;
import io.github.hummel009.minecraft.got.common.world.structure.westeros.common.GOTStructureWesterosSmithy;

public class GOTStructureCrownlandsSmithy extends GOTStructureWesterosSmithy {
	public GOTStructureCrownlandsSmithy(boolean flag) {
		super(flag);
		kingdom = Kingdom.CROWNLANDS;
	}

	public GOTStructureBase setIsKingsLanding() {
		isKingsLanding = true;
		return this;
	}
}