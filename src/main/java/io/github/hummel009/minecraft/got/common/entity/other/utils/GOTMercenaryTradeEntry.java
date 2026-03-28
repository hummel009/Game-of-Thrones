package io.github.hummel009.minecraft.got.common.entity.other.utils;

import io.github.hummel009.minecraft.got.common.entity.other.GOTEntityNPC;
import io.github.hummel009.minecraft.got.common.entity.other.iface.GOTHireableBase;
import io.github.hummel009.minecraft.got.common.entity.other.iface.GOTMercenary;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GOTMercenaryTradeEntry extends GOTUnitTradeEntry {
	private final GOTMercenary theMerc;

	private GOTMercenaryTradeEntry(GOTMercenary merc) {
		super((Class<? extends Entity>) merc.getClass(), merc.getMercBaseCost(), merc.getMercReputationRequired());
		theMerc = merc;
	}

	public static GOTMercenaryTradeEntry createFor(GOTMercenary merc) {
		return new GOTMercenaryTradeEntry(merc);
	}

	@Override
	public GOTEntityNPC getOrCreateHiredNPC(World world) {
		return (GOTEntityNPC) theMerc;
	}

	@Override
	public boolean hasRequiredCostAndReputation(EntityPlayer entityplayer, GOTHireableBase trader) {
		return !((GOTEntityNPC) theMerc).getHireableInfo().isActive() && super.hasRequiredCostAndReputation(entityplayer, trader);
	}
}