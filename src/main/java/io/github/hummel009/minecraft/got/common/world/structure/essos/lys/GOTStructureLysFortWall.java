package io.github.hummel009.minecraft.got.common.world.structure.essos.lys;

import io.github.hummel009.minecraft.got.common.world.structure.essos.common.GOTStructureEssosFortWall;

public class GOTStructureLysFortWall extends GOTStructureEssosFortWall {
	@SuppressWarnings("unused")
	public GOTStructureLysFortWall(boolean flag) {
		super(flag);
		city = City.LYS;
	}

	public static class Long extends GOTStructureEssosFortWall.Long {
		public Long(boolean flag) {
			super(flag);
			isLong = true;
			city = City.LYS;
		}
	}
}