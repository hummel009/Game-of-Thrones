package io.github.hummel009.minecraft.got.common.world.structure.westeros.dorne;

import io.github.hummel009.minecraft.got.common.world.structure.westeros.common.GOTStructureWesterosVillageFarm;

public class GOTStructureDorneVillageFarm extends GOTStructureWesterosVillageFarm {
	@SuppressWarnings("unused")
	public GOTStructureDorneVillageFarm(boolean flag) {
		super(flag);
		kingdom = Kingdom.DORNE;
	}

	public static class Animals extends GOTStructureWesterosVillageFarm.Animals {
		public Animals(boolean flag) {
			super(flag);
			kingdom = Kingdom.DORNE;
		}
	}

	public static class Crops extends GOTStructureWesterosVillageFarm.Crops {
		public Crops(boolean flag) {
			super(flag);
			kingdom = Kingdom.DORNE;
		}
	}

	public static class Tree extends GOTStructureWesterosVillageFarm.Tree {
		public Tree(boolean flag) {
			super(flag);
			kingdom = Kingdom.DORNE;
		}
	}
}