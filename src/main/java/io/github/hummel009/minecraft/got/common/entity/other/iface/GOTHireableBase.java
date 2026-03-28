package io.github.hummel009.minecraft.got.common.entity.other.iface;

import io.github.hummel009.minecraft.got.common.GOTLevelData;
import io.github.hummel009.minecraft.got.common.data.GOTAchievement;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import net.minecraft.entity.player.EntityPlayer;

public interface GOTHireableBase extends GOTTradeCondition {
	static void onUnitTrade(EntityPlayer entityPlayer) {
		GOTLevelData.getData(entityPlayer).addAchievement(GOTAchievement.trade);
	}

	GOTFaction getFaction();

	String getNPCName();
}