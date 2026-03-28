package io.github.hummel009.minecraft.got.common.item.tool;

import io.github.hummel009.minecraft.got.common.data.GOTCreativeTabs;
import io.github.hummel009.minecraft.got.common.item.GOTMaterialFinder;
import net.minecraft.item.ItemPickaxe;

public class GOTItemPickaxe extends ItemPickaxe implements GOTMaterialFinder {
	private final ToolMaterial gotMaterial;

	public GOTItemPickaxe(ToolMaterial material) {
		super(material);
		setCreativeTab(GOTCreativeTabs.TAB_TOOLS);
		gotMaterial = material;
	}

	@Override
	public ToolMaterial getMaterial() {
		return gotMaterial;
	}
}