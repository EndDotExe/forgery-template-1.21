package net.end.forgery;

import net.end.forgery.entity.ModEntities;
import net.end.forgery.util.BlazeShieldUsageEvent;
import net.end.forgery.util.ModLootTableModifiers;
import net.end.forgery.util.VeinMinerUsageEvent;
import net.fabricmc.api.ModInitializer;
import net.end.forgery.item.ModItems;
import net.end.forgery.block.ModBlocks;
import net.end.forgery.item.ModItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Forgery implements ModInitializer {
	public static final String MOD_ID = "forgery";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Forgery Mod");

		// Register mod items
		LOGGER.info("Registering Mod Items");
		ModItems.registerModItems();

		// Register mod blocks
		LOGGER.info("Registering Mod Blocks");
		ModBlocks.registerModBlocks();

		// Register item groups
		LOGGER.info("Registering Item Groups");
		ModItemGroups.registerItemGroups();

		// Register loot table modifiers
		LOGGER.info("Registering Loot Table Modifiers");
		ModLootTableModifiers.registerModLootTableModifiers();

		// Register mod projectiles
		LOGGER.info("Registering Entities");
		ModEntities.registerModEntities();



		// Registering UsageEvents
				VeinMinerUsageEvent.register();
				BlazeShieldUsageEvent.register();

		LOGGER.info("Forgery Mod Initialization Complete");
			}
	}
