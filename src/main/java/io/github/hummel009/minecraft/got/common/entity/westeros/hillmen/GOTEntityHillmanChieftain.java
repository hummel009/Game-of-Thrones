package io.github.hummel009.minecraft.got.common.entity.westeros.hillmen;

import io.github.hummel009.minecraft.got.common.data.GOTInvasions;
import io.github.hummel009.minecraft.got.common.data.GOTItems;
import io.github.hummel009.minecraft.got.common.data.GOTUnitTradeEntries;
import io.github.hummel009.minecraft.got.common.entity.other.iface.GOTUnitTradeable;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GOTEntityHillmanChieftain extends GOTEntityHillman implements GOTUnitTradeable {
	@SuppressWarnings({"WeakerAccess", "unused"})
	public GOTEntityHillmanChieftain(World world) {
		super(world);
	}

	@Override
	public float getReputationBonus() {
		return 5.0f;
	}

	@Override
	public GOTUnitTradeEntries getUnits() {
		return GOTUnitTradeEntries.HILLMEN;
	}

	@Override
	public GOTInvasions getWarhorn() {
		return GOTInvasions.HILL_TRIBES;
	}

	@Override
	public IEntityLivingData onSpawnWithEgg(IEntityLivingData data) {
		IEntityLivingData entityData = super.onSpawnWithEgg(data);

		npcItemsInv.setMeleeWeapon(new ItemStack(GOTItems.trident));
		npcItemsInv.setIdleItem(npcItemsInv.getMeleeWeapon());

		setCurrentItemOrArmor(1, new ItemStack(GOTItems.hillmenBoots));
		setCurrentItemOrArmor(2, new ItemStack(GOTItems.hillmenLeggings));
		setCurrentItemOrArmor(3, new ItemStack(GOTItems.hillmenChestplate));

		return entityData;
	}

	@Override
	public void setupNPCGender() {
		familyInfo.setMale(true);
	}
}