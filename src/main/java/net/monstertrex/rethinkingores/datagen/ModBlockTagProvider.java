package net.monstertrex.rethinkingores.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.monstertrex.rethinkingores.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL).add(
                ModBlocks.NETHER_STEEL_ORE,
                ModBlocks.NETHER_PLATINUM_ORE,
                ModBlocks.NETHER_TITANIUM_ORE
        );

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL).add(
                ModBlocks.COPPER_PLATED_BLOCK,
                ModBlocks.STEEL_ORE,
                ModBlocks.DEEPSLATE_STEEL_ORE,
                ModBlocks.PIG_IRON_BLOCK,
                ModBlocks.STEEL_BLOCK,
                ModBlocks.STEEL_DOOR,
                ModBlocks.STEEL_TRAPDOOR,
                ModBlocks.PLATINUM_ORE,
                ModBlocks.DEEPSLATE_PLATINUM_ORE,
                ModBlocks.RAW_PLATINUM_BLOCK,
                ModBlocks.PLATINUM_BLOCK,
                ModBlocks.TITANIUM_ORE,
                ModBlocks.DEEPSLATE_TITANIUM_ORE,
                ModBlocks.RAW_TITANIUM_BLOCK,
                ModBlocks.TITANIUM_BLOCK
        );

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(
                ModBlocks.CHARCOAL_BLOCK,
                ModBlocks.COPPER_PLATED_BLOCK,
                ModBlocks.STEEL_ORE,
                ModBlocks.DEEPSLATE_STEEL_ORE,
                ModBlocks.NETHER_STEEL_ORE,
                ModBlocks.STEEL_BLOCK,
                ModBlocks.STEEL_DOOR,
                ModBlocks.STEEL_TRAPDOOR,
                ModBlocks.PLATINUM_ORE,
                ModBlocks.DEEPSLATE_PLATINUM_ORE,
                ModBlocks.NETHER_PLATINUM_ORE,
                ModBlocks.RAW_PLATINUM_BLOCK,
                ModBlocks.PLATINUM_BLOCK,
                ModBlocks.TITANIUM_ORE,
                ModBlocks.DEEPSLATE_TITANIUM_ORE,
                ModBlocks.NETHER_TITANIUM_ORE,
                ModBlocks.RAW_TITANIUM_BLOCK,
                ModBlocks.TITANIUM_BLOCK
        );
    }
}
