package io.github.hummel009.minecraft.got.common.entity.essos.ibben;

import io.github.hummel009.minecraft.got.common.data.GOTInvasions;
import io.github.hummel009.minecraft.got.common.data.GOTItems;
import io.github.hummel009.minecraft.got.common.data.GOTUnitTradeEntries;
import io.github.hummel009.minecraft.got.common.entity.other.iface.GOTUnitTradeable;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GOTEntityIbbenCaptain extends GOTEntityIbbenMan implements GOTUnitTradeable {
	@SuppressWarnings({"WeakerAccess", "unused"})
	public GOTEntityIbbenCaptain(World world) {
		super(world);
	}

	@Override
	public float getReputationBonus() {
		return 5.0f;
	}

	@Override
	public GOTUnitTradeEntries getUnits() {
		return GOTUnitTradeEntries.IBBEN;
	}

	@Override
	public GOTInvasions getWarhorn() {
		return GOTInvasions.IBBEN;
	}

	@Override
	public IEntityLivingData onSpawnWithEgg(IEntityLivingData data) {
		IEntityLivingData entityData = super.onSpawnWithEgg(data);

		npcItemsInv.setMeleeWeapon(new ItemStack(GOTItems.trident));
		npcItemsInv.setIdleItem(npcItemsInv.getMeleeWeapon());

		setCurrentItemOrArmor(1, new ItemStack(GOTItems.ibbenBoots));
		setCurrentItemOrArmor(2, new ItemStack(GOTItems.ibbenLeggings));
		setCurrentItemOrArmor(3, new ItemStack(GOTItems.ibbenChestplate));

		return entityData;
	}

	@Override
	public void setupNPCGender() {
		familyInfo.setMale(true);
	}
}