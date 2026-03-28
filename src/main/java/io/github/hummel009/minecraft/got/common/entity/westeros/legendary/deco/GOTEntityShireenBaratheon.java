package io.github.hummel009.minecraft.got.common.entity.westeros.legendary.deco;

import io.github.hummel009.minecraft.got.common.data.GOTAchievement;
import io.github.hummel009.minecraft.got.common.entity.other.GOTEntityHumanBase;
import io.github.hummel009.minecraft.got.common.entity.other.GOTEntityNPC;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GOTEntityShireenBaratheon extends GOTEntityHumanBase {
	@SuppressWarnings({"WeakerAccess", "unused"})
	public GOTEntityShireenBaratheon(World world) {
		super(world);
		setupLegendaryNPC(true);
		setSize(0.6f * 0.75f, 1.8f * 0.75f);
	}

	@Override
	public GOTFaction getFaction() {
		return GOTFaction.DRAGONSTONE;
	}

	@Override
	public float getReputationBonus() {
		return 500.0f;
	}

	@Override
	public GOTAchievement getKillAchievement() {
		return GOTAchievement.killShireenBaratheon;
	}

	@Override
	public EntityAIBase getAttackAI() {
		return new EntityAIPanic(this, 1.4);
	}

	@Override
	public String getSpeechBank(GOTEntityNPC npc, EntityPlayer entityPlayer) {
		if (npc.isFriendly(entityPlayer)) {
			return "legendary/shireen_friendly";
		}
		return "legendary/shireen_hostile";
	}

	@Override
	public void setupNPCGender() {
		familyInfo.setMale(false);
	}
}