package io.github.hummel009.minecraft.got.common.dispense;

import io.github.hummel009.minecraft.got.common.entity.other.inanimate.GOTEntityMysteryWeb;
import net.minecraft.dispenser.BehaviorProjectileDispense;
import net.minecraft.dispenser.IPosition;
import net.minecraft.entity.IProjectile;
import net.minecraft.world.World;

public class GOTDispenseMysteryWeb extends BehaviorProjectileDispense {
	@Override
	public IProjectile getProjectileEntity(World world, IPosition position) {
		return new GOTEntityMysteryWeb(world, position.getX(), position.getY(), position.getZ());
	}
}