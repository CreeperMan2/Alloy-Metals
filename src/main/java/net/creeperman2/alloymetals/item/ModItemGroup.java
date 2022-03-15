package net.creeperman2.alloymetals.item;

import net.creeperman2.alloymetals.AlloyMetals;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ZINC = FabricItemGroupBuilder.build(new Identifier(AlloyMetals.MOD_ID, "zinc"),
            () -> new ItemStack(ModItems.ZINC_INGOT));
}
