package io.github.hummel009.minecraft.got.common.entity.other.iface;

import io.github.hummel009.minecraft.got.common.data.GOTInvasions;
import io.github.hummel009.minecraft.got.common.data.GOTUnitTradeEntries;

public interface GOTUnitTradeable extends GOTHireableBase {
	GOTUnitTradeEntries getUnits();

	GOTInvasions getWarhorn();
}