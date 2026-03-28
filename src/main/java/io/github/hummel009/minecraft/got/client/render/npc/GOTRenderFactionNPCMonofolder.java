package io.github.hummel009.minecraft.got.client.render.npc;

import io.github.hummel009.minecraft.got.client.model.GOTModelHuman;
import io.github.hummel009.minecraft.got.client.render.other.GOTRandomSkins;
import io.github.hummel009.minecraft.got.client.render.other.GOTRenderBiped;
import io.github.hummel009.minecraft.got.common.entity.other.iface.GOTRandomSkinEntity;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class GOTRenderFactionNPCMonofolder extends GOTRenderBiped {
	private final String path;

	public GOTRenderFactionNPCMonofolder(String texture) {
		super(new GOTModelHuman(), 0.5f);
		path = texture;
	}

	@Override
	public ResourceLocation getEntityTexture(Entity entity) {
		GOTRandomSkinEntity mob = (GOTRandomSkinEntity) entity;
		return GOTRandomSkins.loadSkinsList("got:textures/entity/" + path).getRandomSkin(mob);
	}
}