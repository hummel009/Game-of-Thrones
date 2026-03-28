package io.github.hummel009.minecraft.got.common.entity.ai;

import io.github.hummel009.minecraft.got.common.entity.dragon.GOTEntityDragon;

public class GOTEntityAIDragonCatchOwnerGround extends GOTEntityAIDragonCatchOwner {
	public GOTEntityAIDragonCatchOwnerGround(GOTEntityDragon dragon) {
		super(dragon);
		setMutexBits(0xffffffff);
	}

	@Override
	public void updateTask() {
		dragon.liftOff();
	}
}