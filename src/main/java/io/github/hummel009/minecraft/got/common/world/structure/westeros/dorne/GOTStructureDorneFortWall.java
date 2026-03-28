package io.github.hummel009.minecraft.got.common.world.structure.westeros.dorne;

import io.github.hummel009.minecraft.got.common.world.structure.westeros.common.GOTStructureWesterosFortWall;

public class GOTStructureDorneFortWall extends GOTStructureWesterosFortWall {
	@SuppressWarnings("unused")
	public GOTStructureDorneFortWall(boolean flag) {
		super(flag);
		kingdom = Kingdom.DORNE;
	}

	public static class Left extends GOTStructureWesterosFortWall.Left {
		public Left(boolean flag) {
			super(flag);
			kingdom = Kingdom.DORNE;
		}
	}

	public static class Right extends GOTStructureWesterosFortWall.Right {
		public Right(boolean flag) {
			super(flag);
			kingdom = Kingdom.DORNE;
		}
	}
}