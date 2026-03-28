package io.github.hummel009.minecraft.got.common.item.weapon;

import io.github.hummel009.minecraft.got.common.data.GOTCreativeTabs;
import net.minecraft.item.Item;

public class GOTItemLegendaryCrowbar extends GOTItemSword {
	public GOTItemLegendaryCrowbar(Item.ToolMaterial material) {
		super(material);
		setMaxDamage(9999);
		gotWeaponDamage = 999.0f;
		setCreativeTab(GOTCreativeTabs.TAB_STORY);
	}
}