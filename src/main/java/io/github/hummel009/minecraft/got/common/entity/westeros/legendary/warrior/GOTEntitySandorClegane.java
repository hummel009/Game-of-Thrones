package io.github.hummel009.minecraft.got.common.entity.westeros.legendary.warrior;

import io.github.hummel009.minecraft.got.common.data.GOTAchievement;
import io.github.hummel009.minecraft.got.common.data.GOTItems;
import io.github.hummel009.minecraft.got.common.entity.ai.GOTEntityAINearestAttackableTargetBasic;
import io.github.hummel009.minecraft.got.common.entity.other.GOTEntityHumanBase;
import io.github.hummel009.minecraft.got.common.entity.other.GOTEntityNPC;
import io.github.hummel009.minecraft.got.common.entity.westeros.legendary.reborn.GOTEntityGregorClegane;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import io.github.hummel009.minecraft.got.common.quest.GOTMiniQuestFactory;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GOTEntitySandorClegane extends GOTEntityHumanBase {
	@SuppressWarnings({"WeakerAccess", "unused"})
	public GOTEntitySandorClegane(World world) {
		super(world);
		addTargetTasks();
		setupLegendaryNPC(true);
	}

	@Override
	public GOTFaction getFaction() {
		return GOTFaction.CROWNLANDS;
	}

	@Override
	public GOTMiniQuestFactory getMiniQuestFactory() {
		return GOTMiniQuestFactory.SANDOR;
	}

	@Override
	public float getReputationBonus() {
		return 200.0f;
	}

	@Override
	public GOTAchievement getKillAchievement() {
		return GOTAchievement.killSandorClegane;
	}

	private void addTargetTasks() {
		int target = addTargetTasks(true);
		targetTasks.addTask(target + 1, new GOTEntityAINearestAttackableTargetBasic(this, GOTEntityGregorClegane.class, 0, true));
	}

	@Override
	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(40.0);
	}

	@Override
	public void dropFewItems(boolean flag, int i) {
		dropItem(GOTItems.sandorCleganeHelmet, 1);
		dropItem(GOTItems.sandorCleganeSword, 1);
	}

	@Override
	public String getSpeechBank(GOTEntityNPC npc, EntityPlayer entityPlayer) {
		if (npc.isFriendly(entityPlayer)) {
			return "legendary/sandor_friendly";
		}
		return "legendary/sandor_hostile";
	}

	@Override
	public IEntityLivingData onSpawnWithEgg(IEntityLivingData data) {
		IEntityLivingData entityData = super.onSpawnWithEgg(data);

		npcItemsInv.setMeleeWeapon(new ItemStack(GOTItems.sandorCleganeSword));
		npcItemsInv.setIdleItem(npcItemsInv.getMeleeWeapon());

		return entityData;
	}

	@Override
	public void setupNPCGender() {
		familyInfo.setMale(true);
	}
}