package io.github.hummel009.minecraft.got.common.block.other;

import io.github.hummel009.minecraft.got.common.data.GOTCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GOTBlockBone extends Block {
	public GOTBlockBone() {
		super(Material.rock);
		setCreativeTab(GOTCreativeTabs.TAB_BLOCK);
		setHardness(1.0f);
		setResistance(5.0f);
		setStepSound(soundTypeStone);
	}
}