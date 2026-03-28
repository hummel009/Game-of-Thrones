package io.github.hummel009.minecraft.got.common.item.weapon;

import io.github.hummel009.minecraft.got.common.data.GOTCreativeTabs;
import io.github.hummel009.minecraft.got.common.dispense.GOTDispenseArrowFire;
import net.minecraft.block.BlockDispenser;
import net.minecraft.item.Item;

public class GOTItemArrowFire extends Item {
	public GOTItemArrowFire() {
		setCreativeTab(GOTCreativeTabs.TAB_COMBAT);
		BlockDispenser.dispenseBehaviorRegistry.putObject(this, new GOTDispenseArrowFire());
	}
}