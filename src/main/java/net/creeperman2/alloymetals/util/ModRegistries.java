package net.creeperman2.alloymetals.util;

import net.creeperman2.alloymetals.AlloyMetals;
import net.creeperman2.alloymetals.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegistries {
    public static void registerModThings() {
        registerFuels();
    }

    private static void registerFuels() {
        AlloyMetals.LOGGER.info("fuel registering blah blah");
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.PURE_CARBON, 400);
    }
}
