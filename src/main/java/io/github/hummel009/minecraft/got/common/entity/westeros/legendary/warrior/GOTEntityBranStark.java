package io.github.hummel009.minecraft.got.common.entity.westeros.legendary.warrior;

import io.github.hummel009.minecraft.got.common.data.GOTAchievement;
import io.github.hummel009.minecraft.got.common.data.GOTItems;
import io.github.hummel009.minecraft.got.common.entity.ai.GOTEntityAIAttackOnCollide;
import io.github.hummel009.minecraft.got.common.entity.ai.GOTEntityAIRangedAttack;
import io.github.hummel009.minecraft.got.common.entity.other.GOTEntityHumanBase;
import io.github.hummel009.minecraft.got.common.entity.other.GOTEntityNPC;
import io.github.hummel009.minecraft.got.common.entity.other.utils.GOTEntityUtils;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GOTEntityBranStark extends GOTEntityHumanBase {
	private final EntityAIBase rangedAttackAI = new GOTEntityAIRangedAttack(this, 1.25, 30, 50, 20.0f);
	private EntityAIBase meleeAttackAI;

	@SuppressWarnings({"WeakerAccess", "unused"})
	public GOTEntityBranStark(World world) {
		super(world);
		addTargetTasks(true);
		setupLegendaryNPC(true);
		setSize(0.6f * 0.75f, 1.8f * 0.75f);
	}

	@Override
	public GOTFaction getFaction() {
		return GOTFaction.NORTH;
	}

	@Override
	public float getReputationBonus() {
		return 500.0f;
	}

	@Override
	public GOTAchievement getKillAchievement() {
		return GOTAchievement.killBranStark;
	}

	@Override
	public EntityAIBase getAttackAI() {
		meleeAttackAI = new GOTEntityAIAttackOnCollide(this, 1.4, true);
		return meleeAttackAI;
	}

	@Override
	public void onAttackModeChange(AttackMode mode, boolean mounted) {
		GOTEntityUtils.setupComboAttackModeChange(this, mode, meleeAttackAI, rangedAttackAI);
	}

	@Override
	public String getSpeechBank(GOTEntityNPC npc, EntityPlayer entityPlayer) {
		if (npc.isFriendly(entityPlayer)) {
			return "legendary/bran_friendly";
		}
		return "legendary/bran_hostile";
	}

	@Override
	public IEntityLivingData onSpawnWithEgg(IEntityLivingData data) {
		IEntityLivingData entityData = super.onSpawnWithEgg(data);

		npcItemsInv.setMeleeWeapon(new ItemStack(GOTItems.alloySteelDagger));
		npcItemsInv.setRangedWeapon(new ItemStack(GOTItems.longbow));
		npcItemsInv.setIdleItem(npcItemsInv.getRangedWeapon());

		return entityData;
	}

	@Override
	public void setupNPCGender() {
		familyInfo.setMale(true);
	}
}