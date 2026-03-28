package io.github.hummel009.minecraft.got.client.render.npc;

import io.github.hummel009.minecraft.got.client.GOTTextures;
import io.github.hummel009.minecraft.got.client.model.GOTModelHuman;
import io.github.hummel009.minecraft.got.client.render.other.GOTGlowingEyes;
import io.github.hummel009.minecraft.got.client.render.other.GOTRandomSkins;
import io.github.hummel009.minecraft.got.client.render.other.GOTRenderBiped;
import io.github.hummel009.minecraft.got.common.entity.essos.asshai.GOTEntityAsshaiAlchemist;
import io.github.hummel009.minecraft.got.common.entity.essos.legendary.boss.GOTEntityAsshaiArchmag;
import io.github.hummel009.minecraft.got.common.entity.other.GOTEntityIfekevron;
import io.github.hummel009.minecraft.got.common.entity.other.GOTEntityNPC;
import io.github.hummel009.minecraft.got.common.entity.other.GOTEntityShryke;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class GOTRenderFactionNPC extends GOTRenderBiped {
	private final String path;
	private final GOTGlowingEyes.Model eyesModel = new GOTModelHuman();

	public GOTRenderFactionNPC(String texture) {
		super(new GOTModelHuman(), 0.5f);
		path = texture;
	}

	@Override
	public ResourceLocation getEntityTexture(Entity entity) {
		GOTEntityNPC mob = (GOTEntityNPC) entity;
		boolean child = mob.isChild();
		if (mob.getFamilyInfo().isMale()) {
			if (child) {
				return GOTRandomSkins.loadSkinsList("got:textures/entity/" + path + "/malechild").getRandomSkin(mob);
			}
			return GOTRandomSkins.loadSkinsList("got:textures/entity/" + path + "/male").getRandomSkin(mob);
		}
		if (child) {
			return GOTRandomSkins.loadSkinsList("got:textures/entity/" + path + "/femalechild").getRandomSkin(mob);
		}
		return GOTRandomSkins.loadSkinsList("got:textures/entity/" + path + "/female").getRandomSkin(mob);
	}

	@Override
	public void renderModel(EntityLivingBase entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.renderModel(entity, f, f1, f2, f3, f4, f5);
		if (entity instanceof GOTEntityShryke || entity instanceof GOTEntityAsshaiAlchemist || entity instanceof GOTEntityAsshaiArchmag || entity instanceof GOTEntityIfekevron) {
			ResourceLocation eyes = GOTTextures.getEyesTexture(getEntityTexture(entity), new int[][]{new int[]{9, 12}, new int[]{13, 12}}, 2, 1);
			GOTGlowingEyes.renderGlowingEyes(entity, eyes, eyesModel, f, f1, f2, f3, f4, f5);
		}
	}
}