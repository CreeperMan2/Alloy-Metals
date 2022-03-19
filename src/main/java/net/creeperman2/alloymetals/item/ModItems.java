package net.creeperman2.alloymetals.item;

import com.mojang.datafixers.TypeRewriteRule;
import net.creeperman2.alloymetals.AlloyMetals;
import net.creeperman2.alloymetals.item.custom.ModAxeItem;
import net.creeperman2.alloymetals.item.custom.ModHoeItem;
import net.creeperman2.alloymetals.item.custom.ModPickaxeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {
    //items
    public static final Item ZINC_INGOT = registerItem("zinc_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ZINC)));

    public static final Item ZINC_SWORD = registerItem("zinc_sword",
            new SwordItem(ModToolMaterials.ZINC, 2, 2f,
                    new FabricItemSettings().group(ModItemGroup.ZINC)));
    public static final Item ZINC_AXE = registerItem("zinc_axe",
            new ModAxeItem(ModToolMaterials.ZINC, 4, 1f,
                    new FabricItemSettings().group(ModItemGroup.ZINC)));
    public static final Item ZINC_HOE = registerItem("zinc_hoe",
            new ModHoeItem(ModToolMaterials.ZINC, 0, 1.5f,
                    new FabricItemSettings().group(ModItemGroup.ZINC)));
    public static final Item ZINC_PICKAXE = registerItem("zinc_pickaxe",
            new ModPickaxeItem(ModToolMaterials.ZINC, 1, 1.5f,
                    new FabricItemSettings().group(ModItemGroup.ZINC)));
    public static final Item ZINC_SHOVEL = registerItem("zinc_shovel",
            new ShovelItem(ModToolMaterials.ZINC, 1, 1.5f,
                    new FabricItemSettings().group(ModItemGroup.ZINC)));

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
