package io.github.hummel009.minecraft.got.common.world.structure.essos.lorath;

import io.github.hummel009.minecraft.got.common.world.structure.essos.common.GOTStructureEssosFortWall;

public class GOTStructureLorathFortWall extends GOTStructureEssosFortWall {
	@SuppressWarnings("unused")
	public GOTStructureLorathFortWall(boolean flag) {
		super(flag);
		city = City.LORATH;
	}

	public static class Long extends GOTStructureEssosFortWall.Long {
		public Long(boolean flag) {
			super(flag);
			isLong = true;
			city = City.LORATH;
		}
	}
}