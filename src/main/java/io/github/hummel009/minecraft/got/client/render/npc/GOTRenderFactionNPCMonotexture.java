package io.github.hummel009.minecraft.got.client.render.npc;

import io.github.hummel009.minecraft.got.client.model.GOTModelHuman;
import io.github.hummel009.minecraft.got.client.render.other.GOTRenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class GOTRenderFactionNPCMonotexture extends GOTRenderBiped {
	private final String name;

	public GOTRenderFactionNPCMonotexture(String texture) {
		super(new GOTModelHuman(), 0.5f);
		name = texture;
	}

	@Override
	public ResourceLocation getEntityTexture(Entity entity) {
		return new ResourceLocation("got:textures/entity/" + name + ".png");
	}
}