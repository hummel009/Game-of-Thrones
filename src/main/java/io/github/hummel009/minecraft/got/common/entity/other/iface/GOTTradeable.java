package io.github.hummel009.minecraft.got.common.entity.other.iface;

import io.github.hummel009.minecraft.got.common.GOTLevelData;
import io.github.hummel009.minecraft.got.common.data.GOTAchievement;
import io.github.hummel009.minecraft.got.common.data.GOTTradeEntries;
import net.minecraft.entity.player.EntityPlayer;

public interface GOTTradeable extends GOTTradeCondition {
	GOTTradeEntries getSellsPool();

	GOTTradeEntries getBuysPool();

	default void onPlayerTrade(EntityPlayer entityPlayer) {
		GOTLevelData.getData(entityPlayer).addAchievement(GOTAchievement.trade);
	}
}