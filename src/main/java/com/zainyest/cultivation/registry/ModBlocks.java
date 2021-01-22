package com.zainyest.cultivation.registry;

import com.zainyest.cultivation.Cultivation;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    //public static final Block SCALE_BARREL = new Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(5.0f, 30.0f).sounds(BlockSoundGroup.METAL));
    public static final Block CUBEIX = new Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(5.0f, 30.0f).sounds(BlockSoundGroup.METAL));

    public static void registerBlocks() {
        //Registry.register(Registry.BLOCK, new Identifier(Cultivation.MOD_ID, "scale_barrel"), SCALE_BARREL);
        Registry.register(Registry.BLOCK, new Identifier(Cultivation.MOD_ID, "cubeix"), CUBEIX);
    }
}
