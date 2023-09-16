package net.monstertrex.rethinkingores.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.monstertrex.rethinkingores.block.ModBlocks;
import net.monstertrex.rethinkingores.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR).add(
                ModItems.COPPER_HELMET,
                ModItems.COPPER_CHESTPLATE,
                ModItems.COPPER_LEGGINGS,
                ModItems.COPPER_BOOTS,

                ModItems.COPPER_PLATED_HELMET,
                ModItems.COPPER_PLATED_CHESTPLATE,
                ModItems.COPPER_PLATED_LEGGINGS,
                ModItems.COPPER_PLATED_BOOTS,

                ModItems.STEEL_HELMET,
                ModItems.STEEL_CHESTPLATE,
                ModItems.STEEL_LEGGINGS,
                ModItems.STEEL_BOOTS,

                ModItems.PLATINUM_HELMET,
                ModItems.PLATINUM_CHESTPLATE,
                ModItems.PLATINUM_LEGGINGS,
                ModItems.PLATINUM_BOOTS,

                ModItems.TITANIUM_HELMET,
                ModItems.TITANIUM_CHESTPLATE,
                ModItems.TITANIUM_LEGGINGS,
                ModItems.TITANIUM_BOOTS
        );
    }
}
