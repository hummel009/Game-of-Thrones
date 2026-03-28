package io.github.hummel009.minecraft.got.common.entity.westeros.legendary.quest;

import io.github.hummel009.minecraft.got.common.data.GOTAchievement;
import io.github.hummel009.minecraft.got.common.entity.other.GOTEntityHumanBase;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import io.github.hummel009.minecraft.got.common.quest.GOTMiniQuestFactory;
import net.minecraft.world.World;

public class GOTEntityLysaArryn extends GOTEntityHumanBase {
	@SuppressWarnings({"WeakerAccess", "unused"})
	public GOTEntityLysaArryn(World world) {
		super(world);
		setupLegendaryNPC(true);
	}

	@Override
	public GOTFaction getFaction() {
		return GOTFaction.ARRYN;
	}

	@Override
	public GOTMiniQuestFactory getMiniQuestFactory() {
		return GOTMiniQuestFactory.LYSA;
	}

	@Override
	public float getReputationBonus() {
		return 100.0f;
	}

	@Override
	public GOTAchievement getKillAchievement() {
		return GOTAchievement.killLysaArryn;
	}

	@Override
	public void setupNPCGender() {
		familyInfo.setMale(false);
	}
}