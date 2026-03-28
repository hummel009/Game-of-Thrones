package io.github.hummel009.minecraft.got.common.block.other;

import io.github.hummel009.minecraft.got.common.data.GOTCreativeTabs;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;

public class GOTBlockSand extends BlockFalling {
	public GOTBlockSand() {
		super(Material.sand);
		setCreativeTab(GOTCreativeTabs.TAB_BLOCK);
		setHardness(0.5f);
		setStepSound(soundTypeSand);
	}
}