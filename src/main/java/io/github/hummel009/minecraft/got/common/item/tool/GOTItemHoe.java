package io.github.hummel009.minecraft.got.common.item.tool;

import io.github.hummel009.minecraft.got.common.data.GOTCreativeTabs;
import io.github.hummel009.minecraft.got.common.item.GOTMaterialFinder;
import net.minecraft.item.ItemHoe;

public class GOTItemHoe extends ItemHoe implements GOTMaterialFinder {
	private final ToolMaterial gotMaterial;

	public GOTItemHoe(ToolMaterial material) {
		super(material);
		setCreativeTab(GOTCreativeTabs.TAB_TOOLS);
		gotMaterial = material;
	}

	@Override
	public ToolMaterial getMaterial() {
		return gotMaterial;
	}
}