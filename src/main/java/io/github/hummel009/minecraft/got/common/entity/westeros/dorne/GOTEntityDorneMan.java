package io.github.hummel009.minecraft.got.common.entity.westeros.dorne;

import io.github.hummel009.minecraft.got.common.data.GOTChestContents;
import io.github.hummel009.minecraft.got.common.data.GOTItems;
import io.github.hummel009.minecraft.got.common.data.GOTNames;
import io.github.hummel009.minecraft.got.common.entity.animal.GOTEntityHorse;
import io.github.hummel009.minecraft.got.common.entity.other.GOTEntityHumanBase;
import io.github.hummel009.minecraft.got.common.entity.other.iface.GOTNPCMount;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import io.github.hummel009.minecraft.got.common.quest.GOTMiniQuestFactory;
import io.github.hummel009.minecraft.got.common.world.biome.GOTBiome;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GOTEntityDorneMan extends GOTEntityHumanBase implements GOTBiome.ImmuneToHeat {
	@SuppressWarnings({"WeakerAccess", "unused"})
	public GOTEntityDorneMan(World world) {
		super(world);
	}

	@Override
	public GOTFaction getFaction() {
		return GOTFaction.DORNE;
	}

	@Override
	public GOTMiniQuestFactory getMiniQuestFactory() {
		return GOTMiniQuestFactory.DORNE;
	}

	@Override
	public float getReputationBonus() {
		return 1.0f;
	}

	@Override
	public GOTNPCMount createMountToRide() {
		GOTEntityHorse horse = new GOTEntityHorse(worldObj);
		horse.setMountArmor(new ItemStack(GOTItems.ironHorseArmor));
		return horse;
	}

	@Override
	public void dropFewItems(boolean flag, int i) {
		super.dropFewItems(flag, i);
		int bones = rand.nextInt(2) + rand.nextInt(i + 1);
		for (int l = 0; l < bones; ++l) {
			dropItem(Items.bone, 1);
		}
		if (rand.nextInt(6) == 0) {
			dropChestContents(GOTChestContents.DORNE, 1, 2 + i);
		}
	}

	@Override
	public IEntityLivingData onSpawnWithEgg(IEntityLivingData data) {
		IEntityLivingData entityData = super.onSpawnWithEgg(data);

		npcItemsInv.setMeleeWeapon(new ItemStack(GOTItems.ironDagger));
		npcItemsInv.setIdleItem(null);

		return entityData;
	}

	@Override
	public void setupNPCName() {
		familyInfo.setName(GOTNames.getWesterosName(rand, familyInfo.isMale()));
	}
}
