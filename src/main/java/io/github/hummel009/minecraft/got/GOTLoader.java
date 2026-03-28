package io.github.hummel009.minecraft.got;

import io.github.hummel009.minecraft.got.common.*;
import io.github.hummel009.minecraft.got.common.block.other.GOTBlockIronBank;
import io.github.hummel009.minecraft.got.common.data.*;
import io.github.hummel009.minecraft.got.common.enchant.GOTEnchantmentCombining;
import io.github.hummel009.minecraft.got.common.entity.GOTEntity;
import io.github.hummel009.minecraft.got.common.faction.GOTFaction;
import io.github.hummel009.minecraft.got.common.item.GOTPoisonedDrinks;
import io.github.hummel009.minecraft.got.common.network.GOTPacketHandler;
import io.github.hummel009.minecraft.got.common.quest.GOTMiniQuestFactory;
import io.github.hummel009.minecraft.got.common.recipe.GOTRecipe;
import io.github.hummel009.minecraft.got.common.recipe.GOTRecipeBrewing;
import io.github.hummel009.minecraft.got.common.recipe.GOTRecipeMillstone;
import io.github.hummel009.minecraft.got.common.tileentity.GOTTileEntityRegistry;
import io.github.hummel009.minecraft.got.common.util.GOTModChecker;
import io.github.hummel009.minecraft.got.common.util.GOTPatcher;
import io.github.hummel009.minecraft.got.common.world.biome.GOTBiome;
import io.github.hummel009.minecraft.got.common.world.map.GOTBeziers;
import io.github.hummel009.minecraft.got.common.world.map.GOTFixer;
import io.github.hummel009.minecraft.got.common.world.structure.GOTStructure;
import io.github.hummel009.minecraft.got.common.world.structure.other.GOTStructureScan;
import io.github.hummel009.minecraft.got.nei.NEIGOTIntegrator;

public class GOTLoader {
	private GOTLoader() {
	}

	public static void preInit() {
		GOTConfig.preInit();
		GOTPacketHandler.preInit();
		GOTBlocks.preInit();
		GOTItems.preInit();
		GOTEntity.preInit();
		GOTInvasions.preInit();
		GOTBiome.preInit();
		GOTShields.preInit();
		GOTCapes.preInit();
		GOTPoisonedDrinks.preInit();
		GOTPotionChanges.preInit();
		if (GOTModChecker.hasNEI() && GOT.proxy.isClient()) {
			NEIGOTIntegrator.registerRecipes();
		}
		GOTBlockIronBank.preInit();
	}

	public static void onInit() {
		GOTBlocks.onInit();
		GOTTileEntityRegistry.onInit();
		GOTCreativeTabs.onInit();
		GOTRecipe.onInit();
		GOTMaterial.onInit();
		GOTDimension.onInit();
		GOTSpeech.onInit();
		GOTNames.onInit();
		GOTStructureScan.onInit();
		GOTRecipeBrewing.onInit();
		GOTRecipeMillstone.onInit();
		GOTEnchantmentCombining.onInit();
		GOTAchievement.onInit();
		GOTChatEvents.onInit();
		GOTFaction.onInit();
		GOTStructure.onInit();
		GOTBeziers.onInit();
		GOTMiniQuestFactory.onInit();
		GOTLore.onInit();
		GOTTitle.onInit();
		GOTFixer.onInit();
		GOTPatcher.onInit();
	}

	public static void postInit() {
		GOTBiome.postInit();
	}
}