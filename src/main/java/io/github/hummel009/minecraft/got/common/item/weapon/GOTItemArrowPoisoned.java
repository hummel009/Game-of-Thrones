package io.github.hummel009.minecraft.got.common.item.weapon;

import io.github.hummel009.minecraft.got.common.data.GOTCreativeTabs;
import io.github.hummel009.minecraft.got.common.dispense.GOTDispenseArrowPoisoned;
import net.minecraft.block.BlockDispenser;
import net.minecraft.item.Item;

public class GOTItemArrowPoisoned extends Item {
	public GOTItemArrowPoisoned() {
		setCreativeTab(GOTCreativeTabs.TAB_COMBAT);
		BlockDispenser.dispenseBehaviorRegistry.putObject(this, new GOTDispenseArrowPoisoned());
	}
}