package io.github.hummel009.minecraft.got.common.item.other;

import io.github.hummel009.minecraft.got.common.data.GOTCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;

public class GOTItemSeeds extends ItemSeeds {
	public GOTItemSeeds(Block crop, Block soil) {
		super(crop, soil);
		setCreativeTab(GOTCreativeTabs.TAB_MATERIALS);
	}
}