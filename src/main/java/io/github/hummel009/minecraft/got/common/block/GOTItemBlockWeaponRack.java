package io.github.hummel009.minecraft.got.common.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class GOTItemBlockWeaponRack extends ItemBlock {
	public GOTItemBlockWeaponRack(Block block) {
		super(block);
		setMaxStackSize(1);
	}
}