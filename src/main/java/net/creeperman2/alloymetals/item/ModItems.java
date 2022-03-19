package net.creeperman2.alloymetals.item;

import com.mojang.datafixers.TypeRewriteRule;
import net.creeperman2.alloymetals.AlloyMetals;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {
    //items
    public static final Item ZINC_INGOT = registerItem("zinc_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ZINC)));
    public static final Item RAW_ZINC = registerItem("raw_zinc",
            new Item(new FabricItemSettings().group(ModItemGroup.ZINC)));
    public static final Item PURE_CARBON = registerItem("pure_carbon",
            new Item(new FabricItemSettings().group(ModItemGroup.ZINC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(AlloyMetals.MOD_ID, name), item);
    }
    public static void registerModItems() {
        AlloyMetals.LOGGER.info("Register Mod Items");
    }

}
