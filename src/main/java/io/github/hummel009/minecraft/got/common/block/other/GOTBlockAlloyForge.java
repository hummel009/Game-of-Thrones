package io.github.hummel009.minecraft.got.common.block.other;

import io.github.hummel009.minecraft.got.GOT;
import io.github.hummel009.minecraft.got.common.data.GOTGuiId;
import io.github.hummel009.minecraft.got.common.tileentity.GOTTileEntityAlloyForge;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GOTBlockAlloyForge extends GOTBlockForgeBase {
	@Override
	public TileEntity createNewTileEntity(World world, int i) {
		return new GOTTileEntityAlloyForge();
	}

	@Override
	public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entityplayer, int side, float f, float f1, float f2) {
		if (!world.isRemote) {
			entityplayer.openGui(GOT.instance, GOTGuiId.ALLOY_FORGE.ordinal(), world, i, j, k);
		}
		return true;
	}

	@Override
	public boolean useLargeSmoke() {
		return true;
	}
}