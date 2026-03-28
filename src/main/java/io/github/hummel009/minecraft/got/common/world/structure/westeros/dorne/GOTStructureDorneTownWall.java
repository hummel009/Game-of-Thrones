package io.github.hummel009.minecraft.got.common.world.structure.westeros.dorne;

import io.github.hummel009.minecraft.got.common.world.structure.westeros.common.GOTStructureWesterosTownWall;

public class GOTStructureDorneTownWall extends GOTStructureWesterosTownWall {
	public GOTStructureDorneTownWall(boolean flag, int x0, int x1) {
		super(flag, x0, x1);
		kingdom = Kingdom.DORNE;
	}

	public GOTStructureDorneTownWall(boolean flag, int x0, int x1, int xi0, int xi1) {
		super(flag, x0, x1, xi0, xi1);
		kingdom = Kingdom.DORNE;
	}
}