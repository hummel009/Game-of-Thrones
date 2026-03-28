package io.github.hummel009.minecraft.got.common.item.weapon;

import io.github.hummel009.minecraft.got.common.data.GOTCreativeTabs;

public class GOTItemLegendaryCrossbow extends GOTItemCrossbow {
	public GOTItemLegendaryCrossbow() {
		super(ToolMaterial.WOOD);
		setMaxDamage((int) Math.ceil(getMaxDamage() * 1.1f));
		setCreativeTab(GOTCreativeTabs.TAB_STORY);
	}
}