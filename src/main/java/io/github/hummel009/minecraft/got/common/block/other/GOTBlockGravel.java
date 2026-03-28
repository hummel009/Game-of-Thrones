package io.github.hummel009.minecraft.got.common.block.other;

import io.github.hummel009.minecraft.got.common.data.GOTCreativeTabs;
import net.minecraft.block.BlockGravel;

public class GOTBlockGravel extends BlockGravel {
	public GOTBlockGravel() {
		setCreativeTab(GOTCreativeTabs.TAB_BLOCK);
		setHardness(0.6f);
		setStepSound(soundTypeGravel);
	}
}