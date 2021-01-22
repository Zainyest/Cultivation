package com.zainyest.cultivation;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.zainyest.cultivation.registry.ModBlocks;
import com.zainyest.cultivation.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Cultivation implements ModInitializer {

    public static final String MOD_ID = "cultivation";

    public static final ItemGroup CULTIVATION_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, MOD_ID), () -> new ItemStack(ModItems.PURE_SCALE));

    @Override
    public void onInitialize() {
        ModBlocks.registerBlocks();
        ModItems.registerItems();
    }
}
