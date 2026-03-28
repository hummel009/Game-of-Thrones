package io.github.hummel009.minecraft.got.common.entity.westeros.legendary.captain;

import io.github.hummel009.minecraft.got.common.data.GOTInvasions;
import io.github.hummel009.minecraft.got.common.data.GOTItems;
import io.github.hummel009.minecraft.got.common.data.GOTUnitTradeEntries;
import io.github.hummel009.minecraft.got.common.entity.ai.GOTEntityAINearestAttackableTargetBasic;
import io.github.hummel009.minecraft.got.common.entity.other.GOTEntityHumanBase;
import io.github.hummel009.minecraft.got.common.entity.other.iface.GOTUnitTradeable;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GOTEntityJonosBracken extends GOTEntityHumanBase implements GOTUnitTradeable {
	@SuppressWarnings({"WeakerAccess", "unused"})
	public GOTEntityJonosBracken(World world) {
		super(world);
		addTargetTasks();
		setupLegendaryNPC(true);
	}

	@Override
	public GOTFaction getFaction() {
		return GOTFaction.RIVERLANDS;
	}

	@Override
	public float getReputationBonus() {
		return 100.0f;
	}

	private void addTargetTasks() {
		int target = addTargetTasks(false);
		targetTasks.addTask(target + 1, new GOTEntityAINearestAttackableTargetBasic(this, GOTEntityTytosBlackwood.class, 0, true));
	}

	@Override
	public void dropFewItems(boolean flag, int i) {
		dropItem(GOTItems.indomitable, 1);
	}

	@Override
	public GOTUnitTradeEntries getUnits() {
		return GOTUnitTradeEntries.RIVERLANDS;
	}

	@Override
	public GOTInvasions getWarhorn() {
		return GOTInvasions.RIVERLANDS;
	}

	@Override
	public IEntityLivingData onSpawnWithEgg(IEntityLivingData data) {
		IEntityLivingData entityData = super.onSpawnWithEgg(data);

		npcItemsInv.setMeleeWeapon(new ItemStack(GOTItems.indomitable));
		npcItemsInv.setIdleItem(npcItemsInv.getMeleeWeapon());

		return entityData;
	}

	@Override
	public void setupNPCGender() {
		familyInfo.setMale(true);
	}
}