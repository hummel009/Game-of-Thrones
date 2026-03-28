package io.github.hummel009.minecraft.got.client.render.animal;

import io.github.hummel009.minecraft.got.client.model.GOTModelGiraffeRug;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class GOTRenderGiraffeRug extends GOTRenderRugBase {
	public GOTRenderGiraffeRug() {
		super(new GOTModelGiraffeRug());
	}

	@Override
	public ResourceLocation getEntityTexture(Entity entity) {
		return GOTRenderGiraffe.TEXTURE;
	}

	@Override
	public void preRenderCallback() {
	}
}