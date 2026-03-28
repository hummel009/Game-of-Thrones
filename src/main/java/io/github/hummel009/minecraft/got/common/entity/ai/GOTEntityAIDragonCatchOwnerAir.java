package io.github.hummel009.minecraft.got.common.entity.ai;

import io.github.hummel009.minecraft.got.client.model.GOTModelDragonAnimaton;
import io.github.hummel009.minecraft.got.common.entity.dragon.GOTDragonFlightWaypoint;
import io.github.hummel009.minecraft.got.common.entity.dragon.GOTEntityDragon;

public class GOTEntityAIDragonCatchOwnerAir extends GOTEntityAIDragonCatchOwner {
	public GOTEntityAIDragonCatchOwnerAir(GOTEntityDragon dragon) {
		super(dragon);
	}

	@Override
	public void updateTask() {
		GOTDragonFlightWaypoint wp = dragon.getWaypoint();
		wp.setEntity(owner);

		double dist = wp.getDistance();
		double yOfs = GOTModelDragonAnimaton.clamp(dist, 0, 64);

		wp.setPosY(wp.getPosY() - (int) yOfs);

		if (wp.isNear()) {
			owner.mountEntity(dragon);
		}
		dragon.setMoveSpeedAirHoriz(1);
	}
}