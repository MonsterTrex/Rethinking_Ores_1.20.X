package net.monstertrex.rethinkingores.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;
import net.minecraft.item.ArmorItem;
import net.minecraft.sound.BlockSoundGroup;
import net.monstertrex.rethinkingores.block.ModBlocks;
import net.monstertrex.rethinkingores.item.ModItems;


public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHARCOAL_BLOCK);

        BlockStateModelGenerator.BlockTexturePool CopperPlatedBlockTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COPPER_PLATED_BLOCK);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STEEL_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_STEEL_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.NETHER_STEEL_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PIG_IRON_BLOCK);
        BlockStateModelGenerator.BlockTexturePool SteelBlockTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STEEL_BLOCK);
        blockStateModelGenerator.registerDoor(ModBlocks.STEEL_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.STEEL_TRAPDOOR);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PLATINUM_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_PLATINUM_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.NETHER_PLATINUM_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_PLATINUM_BLOCK);
        BlockStateModelGenerator.BlockTexturePool PlatinumBlockTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PLATINUM_BLOCK);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TITANIUM_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_TITANIUM_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.NETHER_TITANIUM_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_TITANIUM_BLOCK);
        BlockStateModelGenerator.BlockTexturePool TitaniumBlockTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TITANIUM_BLOCK);

    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.COPPER_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_PLATING, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_SWORD, Models.HANDHELD);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.COPPER_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.COPPER_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.COPPER_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.COPPER_BOOTS);
        itemModelGenerator.register(ModItems.COPPER_HORSE_ARMOR, Models.GENERATED);

        itemModelGenerator.register(ModItems.MIXED_RAW_COPPER_GOLD, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_PLATED_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_PLATED_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_PLATED_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_PLATED_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_PLATED_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_PLATED_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_PLATED_SWORD, Models.HANDHELD);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.COPPER_PLATED_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.COPPER_PLATED_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.COPPER_PLATED_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.COPPER_PLATED_BOOTS);
        itemModelGenerator.register(ModItems.COPPER_PLATED_HORSE_ARMOR, Models.GENERATED);

        itemModelGenerator.register(ModItems.STEEL_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PIG_IRON, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_SWORD, Models.HANDHELD);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.STEEL_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.STEEL_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.STEEL_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.STEEL_BOOTS);
        itemModelGenerator.register(ModItems.STEEL_HORSE_ARMOR, Models.GENERATED);

        itemModelGenerator.register(ModItems.RAW_PLATINUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.PLATINUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.PLATINUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PLATINUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PLATINUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PLATINUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PLATINUM_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PLATINUM_SWORD, Models.HANDHELD);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.PLATINUM_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.PLATINUM_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.PLATINUM_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.PLATINUM_BOOTS);
        itemModelGenerator.register(ModItems.PLATINUM_HORSE_ARMOR, Models.GENERATED);

        itemModelGenerator.register(ModItems.RAW_TITANIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITANIUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITANIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITANIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.TITANIUM_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.TITANIUM_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.TITANIUM_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.TITANIUM_BOOTS);
        itemModelGenerator.register(ModItems.TITANIUM_HORSE_ARMOR, Models.GENERATED);

    }
}
