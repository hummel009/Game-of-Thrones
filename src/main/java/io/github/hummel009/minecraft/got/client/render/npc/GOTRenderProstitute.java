package io.github.hummel009.minecraft.got.client.render.npc;

import io.github.hummel009.minecraft.got.client.model.GOTModelHuman;
import io.github.hummel009.minecraft.got.client.render.other.GOTRenderBiped;
import io.github.hummel009.minecraft.got.common.entity.other.GOTEntityProstitute;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import java.util.HashMap;
import java.util.Map;

public class GOTRenderProstitute extends GOTRenderBiped {
	private static final Map<String, ResourceLocation> PROSTITUTE_TEXTURES = new HashMap<>();

	public GOTRenderProstitute() {
		super(new GOTModelHuman(), 0.5f);
	}

	private static ResourceLocation getProstituteSkin(GOTEntityProstitute.ProstituteType type) {
		String s = type.textureName();
		ResourceLocation skin = PROSTITUTE_TEXTURES.get(s);
		if (skin == null) {
			skin = new ResourceLocation("got:textures/entity/prostitute/" + s + ".png");
			PROSTITUTE_TEXTURES.put(s, skin);
		}
		return skin;
	}

	@Override
	public ResourceLocation getEntityTexture(Entity entity) {
		GOTEntityProstitute prostitute = (GOTEntityProstitute) entity;
		return getProstituteSkin(prostitute.getProstituteType());
	}
}