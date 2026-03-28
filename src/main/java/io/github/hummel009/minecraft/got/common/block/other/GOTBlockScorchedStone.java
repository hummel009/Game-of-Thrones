package io.github.hummel009.minecraft.got.common.block.other;

import io.github.hummel009.minecraft.got.common.data.GOTCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GOTBlockScorchedStone extends Block {
	public GOTBlockScorchedStone() {
		super(Material.rock);
		setHardness(2.0f);
		setResistance(10.0f);
		setStepSound(soundTypeStone);
		setCreativeTab(GOTCreativeTabs.TAB_BLOCK);
	}
}