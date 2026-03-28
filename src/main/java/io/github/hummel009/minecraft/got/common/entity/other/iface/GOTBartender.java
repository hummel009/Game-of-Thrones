package io.github.hummel009.minecraft.got.common.entity.other.iface;

import io.github.hummel009.minecraft.got.common.data.GOTInvasions;

public interface GOTBartender extends GOTUnitTradeable, GOTTradeable {
	@Override
	default GOTInvasions getWarhorn() {
		return null;
	}
}