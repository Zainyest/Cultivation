package com.zainyest.cultivation.registry;

import com.zainyest.cultivation.Cultivation;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //Items
    //TODO make this into a custom item class for madra absorption
    public static final Item PURE_SCALE = new Item(new Item.Settings().group(Cultivation.CULTIVATION_GROUP).rarity(Rarity.RARE));

    //Block Items
    //public static final BlockItem SCALE_BARREL = new BlockItem(ModBlocks.SCALE_BARREL, new Item.Settings().group(Cultivation.CULTIVATION_GROUP));
    public static final BlockItem CUBEIX = new BlockItem(ModBlocks.CUBEIX, new Item.Settings().group(Cultivation.CULTIVATION_GROUP));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Cultivation.MOD_ID, "pure_scale"), PURE_SCALE);
        //Registry.register(Registry.ITEM, new Identifier(Cultivation.MOD_ID, "scale_barrel"), SCALE_BARREL);
        Registry.register(Registry.ITEM, new Identifier(Cultivation.MOD_ID, "cubeix"), CUBEIX);
    }
}
