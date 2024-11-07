package net.end.forgery;

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

		LOGGER.info("Forgery Mod Initialization Complete");
	}
}