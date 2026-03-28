package io.github.hummel009.minecraft.got.common.block.other;

import io.github.hummel009.minecraft.got.common.data.GOTItems;
import net.minecraft.item.Item;

public class GOTBlockGrapevineRed extends GOTBlockGrapevine {
	public GOTBlockGrapevineRed() {
		super(true);
	}

	@Override
	public Item getGrapeItem() {
		return GOTItems.grapeRed;
	}

	@Override
	public Item getGrapeSeedsItem() {
		return GOTItems.seedsGrapeRed;
	}
}