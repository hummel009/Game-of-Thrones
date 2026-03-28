package io.github.hummel009.minecraft.got.common.entity.other.iface;

import io.github.hummel009.minecraft.got.common.entity.other.GOTEntityNPC;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import net.minecraft.entity.player.EntityPlayer;

public interface GOTTradeCondition {
	default boolean getTradeCondition(GOTEntityNPC npc, EntityPlayer entityPlayer) {
		if (npc.getFaction() == GOTFaction.NEUTRAL) {
			return npc.isFriendly(entityPlayer);
		}
		if (npc instanceof GOTHireableBase && !(npc instanceof GOTFarmer)) {
			return npc.isFriendlyAndStronglyAligned(entityPlayer);
		}
		return npc.isFriendlyAndAligned(entityPlayer);
	}
}