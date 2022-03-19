package net.creeperman2.alloymetals;

import net.creeperman2.alloymetals.block.ModBlocks;
import net.creeperman2.alloymetals.item.ModItems;
import net.creeperman2.alloymetals.util.ModRegistries;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AlloyMetals implements ModInitializer {
	public static final String MOD_ID = "alloymetals";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModThings();
	}
}
