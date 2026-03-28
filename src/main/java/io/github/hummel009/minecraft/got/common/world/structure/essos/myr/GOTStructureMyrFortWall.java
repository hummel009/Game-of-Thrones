package io.github.hummel009.minecraft.got.common.world.structure.essos.myr;

import io.github.hummel009.minecraft.got.common.world.structure.essos.common.GOTStructureEssosFortWall;

public class GOTStructureMyrFortWall extends GOTStructureEssosFortWall {
	@SuppressWarnings("unused")
	public GOTStructureMyrFortWall(boolean flag) {
		super(flag);
		city = City.MYR;
	}

	public static class Long extends GOTStructureEssosFortWall.Long {
		public Long(boolean flag) {
			super(flag);
			isLong = true;
			city = City.MYR;
		}
	}
}