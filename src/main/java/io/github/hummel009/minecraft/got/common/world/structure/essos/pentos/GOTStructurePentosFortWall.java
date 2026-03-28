package io.github.hummel009.minecraft.got.common.world.structure.essos.pentos;

import io.github.hummel009.minecraft.got.common.world.structure.essos.common.GOTStructureEssosFortWall;

public class GOTStructurePentosFortWall extends GOTStructureEssosFortWall {
	@SuppressWarnings("unused")
	public GOTStructurePentosFortWall(boolean flag) {
		super(flag);
		city = City.PENTOS;
	}

	public static class Long extends GOTStructureEssosFortWall.Long {
		public Long(boolean flag) {
			super(flag);
			isLong = true;
			city = City.PENTOS;
		}
	}
}