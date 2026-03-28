package io.github.hummel009.minecraft.got.common.entity.westeros.legendary.mercenary;

import io.github.hummel009.minecraft.got.common.data.GOTItems;
import io.github.hummel009.minecraft.got.common.data.GOTUnitTradeEntries;
import io.github.hummel009.minecraft.got.common.entity.other.GOTEntityHumanBase;
import io.github.hummel009.minecraft.got.common.entity.other.iface.GOTMercenary;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GOTEntityDagmer extends GOTEntityHumanBase implements GOTMercenary {
	@SuppressWarnings({"WeakerAccess", "unused"})
	public GOTEntityDagmer(World world) {
		super(world);
		addTargetTasks(true);
		setupLegendaryNPC(true);
	}

	@Override
	public GOTFaction getFaction() {
		return GOTFaction.IRONBORN;
	}

	@Override
	public float getReputationBonus() {
		return 10.0f;
	}

	@Override
	public float getMercReputationRequired() {
		return GOTUnitTradeEntries.SOLDIER_F;
	}

	@Override
	public int getMercBaseCost() {
		return GOTUnitTradeEntries.SOLDIER * 5;
	}

	@Override
	public IEntityLivingData onSpawnWithEgg(IEntityLivingData data) {
		IEntityLivingData entityData = super.onSpawnWithEgg(data);

		npcItemsInv.setMeleeWeapon(new ItemStack(GOTItems.alloySteelSword));
		npcItemsInv.setIdleItem(npcItemsInv.getMeleeWeapon());

		return entityData;
	}

	@Override
	public void setupNPCGender() {
		familyInfo.setMale(true);
	}
}