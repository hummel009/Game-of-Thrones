package io.github.hummel009.minecraft.got.common.entity.westeros.legendary.quest;

import io.github.hummel009.minecraft.got.common.data.GOTAchievement;
import io.github.hummel009.minecraft.got.common.data.GOTSpeech;
import io.github.hummel009.minecraft.got.common.entity.other.GOTEntityHumanBase;
import io.github.hummel009.minecraft.got.common.entity.other.GOTEntityNPC;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import io.github.hummel009.minecraft.got.common.quest.GOTMiniQuestFactory;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GOTEntitySamwellTarly extends GOTEntityHumanBase {
	@SuppressWarnings({"WeakerAccess", "unused"})
	public GOTEntitySamwellTarly(World world) {
		super(world);
		setupLegendaryNPC(true);
	}

	@Override
	public GOTFaction getFaction() {
		return GOTFaction.NIGHT_WATCH;
	}

	@Override
	public GOTMiniQuestFactory getMiniQuestFactory() {
		return GOTMiniQuestFactory.SAMWELL;
	}

	@Override
	public float getReputationBonus() {
		return 10.0f;
	}

	@Override
	public GOTAchievement getKillAchievement() {
		return GOTAchievement.killSamwellTarly;
	}

	@Override
	public EntityAIBase getAttackAI() {
		return new EntityAIPanic(this, 1.4);
	}

	@Override
	public String getSpeechBank(GOTEntityNPC npc, EntityPlayer entityPlayer) {
		if (npc.isFriendly(entityPlayer)) {
			return "legendary/sam_friendly";
		}
		return GOTSpeech.HOSTILE;
	}

	@Override
	public void setupNPCGender() {
		familyInfo.setMale(true);
	}
}