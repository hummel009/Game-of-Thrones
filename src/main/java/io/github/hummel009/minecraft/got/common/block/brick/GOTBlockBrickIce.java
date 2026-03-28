package io.github.hummel009.minecraft.got.common.block.brick;

import io.github.hummel009.minecraft.got.common.data.GOTCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GOTBlockBrickIce extends Block {
	public GOTBlockBrickIce() {
		super(Material.packedIce);
		slipperiness = 0.98F;
		setCreativeTab(GOTCreativeTabs.TAB_BLOCK);
		setHardness(15.0f);
		setResistance(60.0f);
		setStepSound(soundTypeGlass);
	}
}