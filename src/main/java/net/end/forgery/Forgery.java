package net.end.forgery;

import net.end.forgery.block.ModBlocks;
import net.end.forgery.item.ModItemGroups;
import net.end.forgery.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.end.forgery.item.ModItems.registerModItems;

public class Forgery implements ModInitializer {
	public static final String MOD_ID = "forgery";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {


		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}