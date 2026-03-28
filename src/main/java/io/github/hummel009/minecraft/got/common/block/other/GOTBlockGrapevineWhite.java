package io.github.hummel009.minecraft.got.common.block.other;

import io.github.hummel009.minecraft.got.common.data.GOTItems;
import net.minecraft.item.Item;

public class GOTBlockGrapevineWhite extends GOTBlockGrapevine {
	public GOTBlockGrapevineWhite() {
		super(true);
	}

	@Override
	public Item getGrapeItem() {
		return GOTItems.grapeWhite;
	}

	@Override
	public Item getGrapeSeedsItem() {
		return GOTItems.seedsGrapeWhite;
	}
}