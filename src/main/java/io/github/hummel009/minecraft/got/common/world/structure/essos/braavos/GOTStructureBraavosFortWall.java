package io.github.hummel009.minecraft.got.common.world.structure.essos.braavos;

import io.github.hummel009.minecraft.got.common.world.structure.essos.common.GOTStructureEssosFortWall;

public class GOTStructureBraavosFortWall extends GOTStructureEssosFortWall {
	@SuppressWarnings("unused")
	public GOTStructureBraavosFortWall(boolean flag) {
		super(flag);
		city = City.BRAAVOS;
	}

	public static class Long extends GOTStructureEssosFortWall.Long {
		public Long(boolean flag) {
			super(flag);
			isLong = true;
			city = City.BRAAVOS;
		}
	}
}