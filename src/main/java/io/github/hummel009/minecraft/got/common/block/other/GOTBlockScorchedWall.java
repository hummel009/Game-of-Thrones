package io.github.hummel009.minecraft.got.common.block.other;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.github.hummel009.minecraft.got.common.block.wall.GOTBlockWallBase;
import io.github.hummel009.minecraft.got.common.data.GOTBlocks;
import net.minecraft.util.IIcon;

public class GOTBlockScorchedWall extends GOTBlockWallBase {
	public GOTBlockScorchedWall() {
		super(GOTBlocks.scorchedStone, 1);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int i, int j) {
		return GOTBlocks.scorchedStone.getIcon(i, j);
	}
}