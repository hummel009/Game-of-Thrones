package io.github.hummel009.minecraft.got.common.world.structure.other;

import io.github.hummel009.minecraft.got.common.data.GOTBlocks;

public class GOTStructureRottenHouse extends GOTStructureRuinedHouse {
	public GOTStructureRottenHouse(boolean flag) {
		super(flag);
		woodBlock = GOTBlocks.rottenLog;
		woodMeta = 0;
		plankBlock = GOTBlocks.planksRotten;
		plankMeta = 0;
		fenceBlock = GOTBlocks.fenceRotten;
		fenceMeta = 0;
		stairBlock = GOTBlocks.stairsRotten;
	}
}