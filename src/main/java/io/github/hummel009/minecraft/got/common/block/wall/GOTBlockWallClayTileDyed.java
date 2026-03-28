package io.github.hummel009.minecraft.got.common.block.wall;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.github.hummel009.minecraft.got.common.data.GOTBlocks;
import net.minecraft.util.IIcon;

public class GOTBlockWallClayTileDyed extends GOTBlockWallBase {
	public GOTBlockWallClayTileDyed() {
		super(GOTBlocks.clayTileDyed, 16);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int i, int j) {
		return GOTBlocks.clayTileDyed.getIcon(i, j);
	}
}