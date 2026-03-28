package io.github.hummel009.minecraft.got.common.entity.westeros.legendary.quest;

import io.github.hummel009.minecraft.got.common.data.GOTAchievement;
import io.github.hummel009.minecraft.got.common.data.GOTItems;
import io.github.hummel009.minecraft.got.common.data.GOTSpeech;
import io.github.hummel009.minecraft.got.common.entity.other.GOTEntityHumanBase;
import io.github.hummel009.minecraft.got.common.entity.other.GOTEntityNPC;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import io.github.hummel009.minecraft.got.common.quest.GOTMiniQuestFactory;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GOTEntityTyrionLannister extends GOTEntityHumanBase {
	@SuppressWarnings({"WeakerAccess", "unused"})
	public GOTEntityTyrionLannister(World world) {
		super(world);
		setupLegendaryNPC(true);
		setSize(0.45f, 1.2f);
	}

	@Override
	public GOTFaction getFaction() {
		return GOTFaction.WESTERLANDS;
	}

	@Override
	public GOTMiniQuestFactory getMiniQuestFactory() {
		return GOTMiniQuestFactory.TYRION;
	}

	@Override
	public float getReputationBonus() {
		return 300.0f;
	}

	@Override
	public GOTAchievement getKillAchievement() {
		return GOTAchievement.killTyrionLannister;
	}

	@Override
	public void dropFewItems(boolean flag, int i) {
		dropItem(GOTItems.handGold, 1);
		dropItem(GOTItems.handSilver, 1);
	}

	@Override
	public String getSpeechBank(GOTEntityNPC npc, EntityPlayer entityPlayer) {
		if (npc.isFriendly(entityPlayer)) {
			return "legendary/tyrion_friendly";
		}
		return GOTSpeech.HOSTILE;
	}

	@Override
	public IEntityLivingData onSpawnWithEgg(IEntityLivingData data) {
		IEntityLivingData entityData = super.onSpawnWithEgg(data);

		npcItemsInv.setMeleeWeapon(new ItemStack(GOTItems.alloySteelBattleaxe));
		npcItemsInv.setIdleItem(null);

		setCurrentItemOrArmor(3, new ItemStack(GOTItems.handGold));

		return entityData;
	}

	@Override
	public void setupNPCGender() {
		familyInfo.setMale(true);
	}
}