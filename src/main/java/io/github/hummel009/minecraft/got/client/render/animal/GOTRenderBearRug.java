package io.github.hummel009.minecraft.got.client.render.animal;

import io.github.hummel009.minecraft.got.client.model.GOTModelBearRug;
import io.github.hummel009.minecraft.got.common.entity.other.inanimate.GOTEntityBearRug;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class GOTRenderBearRug extends GOTRenderRugBase {
	public GOTRenderBearRug() {
		super(new GOTModelBearRug());
	}

	@Override
	public ResourceLocation getEntityTexture(Entity entity) {
		GOTEntityBearRug rug = (GOTEntityBearRug) entity;
		return GOTRenderBear.getBearSkin(rug.getRugType());
	}

	@Override
	public void preRenderCallback() {
		GL11.glScalef(1.2f, 1.2f, 1.2f);
	}
}