package net.monstertrex.rethinkingores.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.client.gl.Uniform;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.monstertrex.rethinkingores.RethinkingOresMod;

public class ModBlocks {

    //<editor-fold desc="MISC">
    public static final Block CHARCOAL_BLOCK = registerBlock("charcoal_block", new Block(FabricBlockSettings
            .copyOf(Blocks.COAL_BLOCK)));
    //</editor-fold>

    //<editor-fold desc="Copper Plated">
    public static final Block COPPER_PLATED_BLOCK = registerBlock("copper_plated_block", new Block(FabricBlockSettings
            .copyOf(Blocks.IRON_BLOCK)));
    //</editor-fold>

    //<editor-fold desc="Steel">
    public static final Block STEEL_ORE = registerBlock("steel_ore", new ExperienceDroppingBlock(FabricBlockSettings
            .copyOf(Blocks.IRON_ORE)));
    public static final Block DEEPSLATE_STEEL_ORE = registerBlock("deepslate_steel_ore", new ExperienceDroppingBlock(FabricBlockSettings
            .copyOf(Blocks.DEEPSLATE_IRON_ORE)));
    public static final Block NETHER_STEEL_ORE = registerBlock("nether_steel_ore", new ExperienceDroppingBlock(FabricBlockSettings
            .copyOf(Blocks.NETHER_GOLD_ORE)));
    public static final Block PIG_IRON_BLOCK = registerBlock("pig_iron_block", new Block(FabricBlockSettings
            .copyOf(Blocks.IRON_BLOCK)));
    public static final Block STEEL_BLOCK = registerBlock("steel_block", new Block(FabricBlockSettings
            .copyOf(Blocks.IRON_BLOCK)));
    public static final Block STEEL_DOOR = registerBlock("steel_door", new DoorBlock(FabricBlockSettings
            .copyOf(Blocks.IRON_DOOR), BlockSetType.IRON));
    public static final Block STEEL_TRAPDOOR = registerBlock("steel_trapdoor", new TrapdoorBlock(FabricBlockSettings
            .copyOf(Blocks.IRON_TRAPDOOR), BlockSetType.IRON));
    //</editor-fold>

    //<editor-fold desc="Platinum">
    public static final Block PLATINUM_ORE = registerBlock("platinum_ore", new ExperienceDroppingBlock(FabricBlockSettings
            .copyOf(Blocks.IRON_ORE)));
    public static final Block DEEPSLATE_PLATINUM_ORE = registerBlock("deepslate_platinum_ore", new ExperienceDroppingBlock(FabricBlockSettings
            .copyOf(Blocks.DEEPSLATE_IRON_ORE)));
    public static final Block NETHER_PLATINUM_ORE = registerBlock("nether_platinum_ore", new ExperienceDroppingBlock(FabricBlockSettings
            .copyOf(Blocks.NETHER_GOLD_ORE)));
    public static final Block RAW_PLATINUM_BLOCK = registerBlock("raw_platinum_block", new Block(FabricBlockSettings
            .copyOf(Blocks.RAW_IRON_BLOCK)));
    public static final Block PLATINUM_BLOCK = registerBlock("platinum_block", new Block(FabricBlockSettings
            .copyOf(Blocks.IRON_BLOCK)));
    //</editor-fold>

    //<editor-fold desc="Titanium">
    public static final Block TITANIUM_ORE = registerBlock("titanium_ore", new ExperienceDroppingBlock(FabricBlockSettings
            .copyOf(Blocks.IRON_ORE)));
    public static final Block DEEPSLATE_TITANIUM_ORE = registerBlock("deepslate_titanium_ore", new ExperienceDroppingBlock(FabricBlockSettings
            .copyOf(Blocks.DEEPSLATE_IRON_ORE)));
    public static final Block NETHER_TITANIUM_ORE = registerBlock("nether_titanium_ore", new ExperienceDroppingBlock(FabricBlockSettings
            .copyOf(Blocks.NETHER_GOLD_ORE)));
    public static final Block RAW_TITANIUM_BLOCK = registerBlock("raw_titanium_block", new Block(FabricBlockSettings
            .copyOf(Blocks.RAW_IRON_BLOCK)));
    public static final Block TITANIUM_BLOCK = registerBlock("titanium_block", new Block(FabricBlockSettings
            .copyOf(Blocks.DIAMOND_BLOCK)));
    //</editor-fold>



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(RethinkingOresMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(RethinkingOresMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        RethinkingOresMod.LOGGER.info("Registering ModBlocks for " + RethinkingOresMod.MOD_ID);
    }
}
