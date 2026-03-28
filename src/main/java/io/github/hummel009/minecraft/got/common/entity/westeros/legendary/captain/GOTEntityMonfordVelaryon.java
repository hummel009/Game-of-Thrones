package io.github.hummel009.minecraft.got.common.entity.westeros.legendary.captain;

import io.github.hummel009.minecraft.got.common.data.GOTInvasions;
import io.github.hummel009.minecraft.got.common.data.GOTItems;
import io.github.hummel009.minecraft.got.common.data.GOTUnitTradeEntries;
import io.github.hummel009.minecraft.got.common.entity.other.GOTEntityHumanBase;
import io.github.hummel009.minecraft.got.common.entity.other.iface.GOTUnitTradeable;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GOTEntityMonfordVelaryon extends GOTEntityHumanBase implements GOTUnitTradeable {
	@SuppressWarnings({"WeakerAccess", "unused"})
	public GOTEntityMonfordVelaryon(World world) {
		super(world);
		setupLegendaryNPC(true);
	}

	@Override
	public GOTFaction getFaction() {
		return GOTFaction.DRAGONSTONE;
	}

	@Override
	public float getReputationBonus() {
		return 100.0f;
	}

	@Override
	public void dropFewItems(boolean flag, int i) {
		dropItem(GOTItems.monfordVelaryonBrooch, 1);
		dropItem(GOTItems.cutwave, 1);
	}

	@Override
	public GOTUnitTradeEntries getUnits() {
		return GOTUnitTradeEntries.DRAGONSTONE;
	}

	@Override
	public GOTInvasions getWarhorn() {
		return GOTInvasions.DRAGONSTONE;
	}

	@Override
	public IEntityLivingData onSpawnWithEgg(IEntityLivingData data) {
		IEntityLivingData entityData = super.onSpawnWithEgg(data);

		npcItemsInv.setMeleeWeapon(new ItemStack(GOTItems.cutwave));
		npcItemsInv.setIdleItem(npcItemsInv.getMeleeWeapon());

		setCurrentItemOrArmor(3, new ItemStack(GOTItems.monfordVelaryonBrooch));

		return entityData;
	}

	@Override
	public void setupNPCGender() {
		familyInfo.setMale(true);
	}
}