package io.github.hummel009.minecraft.got.common.entity.essos.dothraki;

import io.github.hummel009.minecraft.got.common.data.GOTInvasions;
import io.github.hummel009.minecraft.got.common.data.GOTItems;
import io.github.hummel009.minecraft.got.common.data.GOTUnitTradeEntries;
import io.github.hummel009.minecraft.got.common.entity.other.iface.GOTUnitTradeable;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GOTEntityDothrakiChieftain extends GOTEntityDothraki implements GOTUnitTradeable {
	@SuppressWarnings({"WeakerAccess", "unused"})
	public GOTEntityDothrakiChieftain(World world) {
		super(world);
		addTargetTasks(false);
		spawnRidingHorse = false;
	}

	@Override
	public float getReputationBonus() {
		return 5.0f;
	}

	@Override
	public boolean canDothrakiSkirmish() {
		return false;
	}

	@Override
	public GOTUnitTradeEntries getUnits() {
		return GOTUnitTradeEntries.DOTHRAKI;
	}

	@Override
	public GOTInvasions getWarhorn() {
		return GOTInvasions.DOTHRAKI;
	}

	@Override
	public IEntityLivingData onSpawnWithEgg(IEntityLivingData data) {
		IEntityLivingData entityData = super.onSpawnWithEgg(data);

		npcItemsInv.setMeleeWeapon(new ItemStack(GOTItems.ironScimitar));
		npcItemsInv.setIdleItem(npcItemsInv.getMeleeWeapon());

		return entityData;
	}

	@Override
	public void setupNPCGender() {
		familyInfo.setMale(true);
	}
}