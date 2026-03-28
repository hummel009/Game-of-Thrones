package io.github.hummel009.minecraft.got.common.block.other;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.github.hummel009.minecraft.got.common.block.slab.GOTBlockSlabBase;
import io.github.hummel009.minecraft.got.common.data.GOTBlocks;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class GOTBlockScorchedSlab extends GOTBlockSlabBase {
	public GOTBlockScorchedSlab(boolean hidden) {
		super(hidden, Material.rock, 1);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int i, int j) {
		return GOTBlocks.scorchedStone.getIcon(i, j);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister iconregister) {
	}
}