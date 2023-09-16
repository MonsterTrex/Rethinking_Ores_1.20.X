package net.monstertrex.rethinkingores.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.monstertrex.rethinkingores.block.ModBlocks;
import net.monstertrex.rethinkingores.item.ModItems;


import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        //<editor-fold desc="MISC">
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.CHARCOAL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHARCOAL_BLOCK);
        //</editor-fold>

        //<editor-fold desc="Copper">
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.COPPER_NUGGET, RecipeCategory.MISC, Items.COPPER_INGOT);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, ModItems.COPPER_PLATING, Items.COPPER_INGOT);
        
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.COPPER_INGOT, 4)
                .input(ModItems.COPPER_PLATING, 1)
                .criterion(hasItem(ModItems.COPPER_PLATING), conditionsFromItem(ModItems.COPPER_PLATING))
                .offerTo(exporter, new Identifier(getRecipeName(Items.COPPER_INGOT) + "_from_copper_plating"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_PICKAXE)
                .pattern("CCC")
                .pattern(" S ")
                .pattern(" S ")
                .input('C', ModItems.COPPER_PLATING)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.COPPER_PLATING), conditionsFromItem(ModItems.COPPER_PLATING))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_AXE)
                .pattern("CC")
                .pattern("SC")
                .pattern("S ")
                .input('C', ModItems.COPPER_PLATING)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.COPPER_PLATING), conditionsFromItem(ModItems.COPPER_PLATING))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_SHOVEL)
                .pattern("C")
                .pattern("S")
                .pattern("S")
                .input('C', ModItems.COPPER_PLATING)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.COPPER_PLATING), conditionsFromItem(ModItems.COPPER_PLATING))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_HOE)
                .pattern("CC")
                .pattern("S ")
                .pattern("S ")
                .input('C', ModItems.COPPER_PLATING)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.COPPER_PLATING), conditionsFromItem(ModItems.COPPER_PLATING))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_SWORD)
                .pattern("C")
                .pattern("C")
                .pattern("S")
                .input('C', ModItems.COPPER_PLATING)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.COPPER_PLATING), conditionsFromItem(ModItems.COPPER_PLATING))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_HELMET)
                .pattern("CCC")
                .pattern("C C")
                .input('C', ModItems.COPPER_PLATING)
                .criterion(hasItem(ModItems.COPPER_PLATING), conditionsFromItem(ModItems.COPPER_PLATING))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_CHESTPLATE)
                .pattern("C C")
                .pattern("CCC")
                .pattern("CCC")
                .input('C', ModItems.COPPER_PLATING)
                .criterion(hasItem(ModItems.COPPER_PLATING), conditionsFromItem(ModItems.COPPER_PLATING))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_LEGGINGS)
                .pattern("CCC")
                .pattern("C C")
                .pattern("C C")
                .input('C', ModItems.COPPER_PLATING)
                .criterion(hasItem(ModItems.COPPER_PLATING), conditionsFromItem(ModItems.COPPER_PLATING))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_BOOTS)
                .pattern("C C")
                .pattern("C C")
                .input('C', ModItems.COPPER_PLATING)
                .criterion(hasItem(ModItems.COPPER_PLATING), conditionsFromItem(ModItems.COPPER_PLATING))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_BOOTS)));
        //</editor-fold>

        //<editor-fold desc="Copper Plated">
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COPPER_PLATED_BLOCK, 1)
                .input(ModItems.COPPER_PLATED_INGOT, 9)
                .criterion(hasItem(ModItems.COPPER_PLATED_INGOT), conditionsFromItem(ModItems.COPPER_PLATED_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.COPPER_PLATED_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_PLATED_INGOT, 9)
                .input(ModBlocks.COPPER_PLATED_BLOCK, 1)
                .criterion(hasItem(ModBlocks.COPPER_PLATED_BLOCK), conditionsFromItem(ModBlocks.COPPER_PLATED_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_PLATED_INGOT)) + "_from_block");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_PLATED_INGOT, 1)
                .input(ModItems.COPPER_PLATED_NUGGET, 9)
                .criterion(hasItem(ModItems.COPPER_PLATED_NUGGET), conditionsFromItem(ModItems.COPPER_PLATED_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_PLATED_INGOT)) + "_from_nuggets");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_PLATED_NUGGET, 9)
                .input(ModItems.COPPER_PLATED_INGOT, 1)
                .criterion(hasItem(ModItems.COPPER_PLATED_INGOT), conditionsFromItem(ModItems.COPPER_PLATED_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_PLATED_NUGGET)) + "_from_ingot");


        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModItems.MIXED_RAW_COPPER_GOLD, 4)
                .input(Items.RAW_COPPER, 1)
                .input(Items.RAW_GOLD, 3)
                .criterion(hasItem(Items.RAW_COPPER), conditionsFromItem(Items.RAW_COPPER))
                .criterion(hasItem(Items.RAW_GOLD), conditionsFromItem(Items.RAW_GOLD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MIXED_RAW_COPPER_GOLD)));
        offerSmelting(exporter, List.of(ModItems.MIXED_RAW_COPPER_GOLD), RecipeCategory.MISC, ModItems.COPPER_PLATED_INGOT, 0.25f, 200, "copper_plated");
        offerBlasting(exporter, List.of(ModItems.MIXED_RAW_COPPER_GOLD), RecipeCategory.MISC, ModItems.COPPER_PLATED_INGOT, 0.25f, 100, "copper_plated");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_PLATED_PICKAXE)
                .pattern("CCC")
                .pattern(" S ")
                .pattern(" S ")
                .input('C', ModItems.COPPER_PLATED_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.COPPER_PLATED_INGOT), conditionsFromItem(ModItems.COPPER_PLATED_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_PLATED_PICKAXE)));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.empty(), Ingredient.ofItems(Items.GOLDEN_PICKAXE), Ingredient.ofItems(ModItems.COPPER_PLATING),
                        RecipeCategory.TOOLS, ModItems.COPPER_PLATED_PICKAXE).criterion("has_copper_plating", RecipeProvider.conditionsFromItem(ModItems.COPPER_PLATING))
                .offerTo(exporter, RecipeProvider.getItemPath(ModItems.COPPER_PLATED_PICKAXE) + "_smithing");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_PLATED_AXE)
                .pattern("CC")
                .pattern("SC")
                .pattern("S ")
                .input('C', ModItems.COPPER_PLATED_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.COPPER_PLATED_INGOT), conditionsFromItem(ModItems.COPPER_PLATED_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_PLATED_AXE)));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.empty(), Ingredient.ofItems(Items.GOLDEN_AXE), Ingredient.ofItems(ModItems.COPPER_PLATING),
                        RecipeCategory.TOOLS, ModItems.COPPER_PLATED_AXE).criterion("has_copper_plating", RecipeProvider.conditionsFromItem(ModItems.COPPER_PLATING))
                .offerTo(exporter, RecipeProvider.getItemPath(ModItems.COPPER_PLATED_AXE) + "_smithing");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_PLATED_SHOVEL)
                .pattern("C")
                .pattern("S")
                .pattern("S")
                .input('C', ModItems.COPPER_PLATED_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.COPPER_PLATED_INGOT), conditionsFromItem(ModItems.COPPER_PLATED_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_PLATED_SHOVEL)));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.empty(), Ingredient.ofItems(Items.GOLDEN_SHOVEL), Ingredient.ofItems(ModItems.COPPER_PLATING),
                        RecipeCategory.TOOLS, ModItems.COPPER_PLATED_SHOVEL).criterion("has_copper_plating", RecipeProvider.conditionsFromItem(ModItems.COPPER_PLATING))
                .offerTo(exporter, RecipeProvider.getItemPath(ModItems.COPPER_PLATED_SHOVEL) + "_smithing");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_PLATED_HOE)
                .pattern("CC")
                .pattern("S ")
                .pattern("S ")
                .input('C', ModItems.COPPER_PLATED_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.COPPER_PLATED_INGOT), conditionsFromItem(ModItems.COPPER_PLATED_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_PLATED_HOE)));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.empty(), Ingredient.ofItems(Items.GOLDEN_HOE), Ingredient.ofItems(ModItems.COPPER_PLATING),
                        RecipeCategory.TOOLS, ModItems.COPPER_PLATED_HOE).criterion("has_copper_plating", RecipeProvider.conditionsFromItem(ModItems.COPPER_PLATING))
                .offerTo(exporter, RecipeProvider.getItemPath(ModItems.COPPER_PLATED_HOE) + "_smithing");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_PLATED_SWORD)
                .pattern("C")
                .pattern("C")
                .pattern("S")
                .input('C', ModItems.COPPER_PLATED_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.COPPER_PLATED_INGOT), conditionsFromItem(ModItems.COPPER_PLATED_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_PLATED_SWORD)));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.empty(), Ingredient.ofItems(Items.GOLDEN_SWORD), Ingredient.ofItems(ModItems.COPPER_PLATING),
                        RecipeCategory.TOOLS, ModItems.COPPER_PLATED_SWORD).criterion("has_copper_plating", RecipeProvider.conditionsFromItem(ModItems.COPPER_PLATING))
                .offerTo(exporter, RecipeProvider.getItemPath(ModItems.COPPER_PLATED_SWORD) + "_smithing");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_PLATED_HELMET)
                .pattern("CCC")
                .pattern("C C")
                .input('C', ModItems.COPPER_PLATED_INGOT)
                .criterion(hasItem(ModItems.COPPER_PLATED_INGOT), conditionsFromItem(ModItems.COPPER_PLATED_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_PLATED_HELMET)));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.empty(), Ingredient.ofItems(Items.GOLDEN_HELMET), Ingredient.ofItems(ModItems.COPPER_PLATING),
                        RecipeCategory.TOOLS, ModItems.COPPER_PLATED_HELMET).criterion("has_copper_plating", RecipeProvider.conditionsFromItem(ModItems.COPPER_PLATING))
                .offerTo(exporter, RecipeProvider.getItemPath(ModItems.COPPER_PLATED_HELMET) + "_smithing");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_PLATED_CHESTPLATE)
                .pattern("C C")
                .pattern("CCC")
                .pattern("CCC")
                .input('C', ModItems.COPPER_PLATED_INGOT)
                .criterion(hasItem(ModItems.COPPER_PLATED_INGOT), conditionsFromItem(ModItems.COPPER_PLATED_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_PLATED_CHESTPLATE)));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.empty(), Ingredient.ofItems(Items.GOLDEN_CHESTPLATE), Ingredient.ofItems(ModItems.COPPER_PLATING),
                        RecipeCategory.TOOLS, ModItems.COPPER_PLATED_CHESTPLATE).criterion("has_copper_plating", RecipeProvider.conditionsFromItem(ModItems.COPPER_PLATING))
                .offerTo(exporter, RecipeProvider.getItemPath(ModItems.COPPER_PLATED_CHESTPLATE) + "_smithing");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_PLATED_LEGGINGS)
                .pattern("CCC")
                .pattern("C C")
                .pattern("C C")
                .input('C', ModItems.COPPER_PLATED_INGOT)
                .criterion(hasItem(ModItems.COPPER_PLATED_INGOT), conditionsFromItem(ModItems.COPPER_PLATED_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_PLATED_LEGGINGS)));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.empty(), Ingredient.ofItems(Items.GOLDEN_LEGGINGS), Ingredient.ofItems(ModItems.COPPER_PLATING),
                        RecipeCategory.TOOLS, ModItems.COPPER_PLATED_LEGGINGS).criterion("has_copper_plating", RecipeProvider.conditionsFromItem(ModItems.COPPER_PLATING))
                .offerTo(exporter, RecipeProvider.getItemPath(ModItems.COPPER_PLATED_LEGGINGS) + "_smithing");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_PLATED_BOOTS)
                .pattern("C C")
                .pattern("C C")
                .input('C', ModItems.COPPER_PLATED_INGOT)
                .criterion(hasItem(ModItems.COPPER_PLATED_INGOT), conditionsFromItem(ModItems.COPPER_PLATED_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_PLATED_BOOTS)));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.empty(), Ingredient.ofItems(Items.GOLDEN_BOOTS), Ingredient.ofItems(ModItems.COPPER_PLATING),
                        RecipeCategory.TOOLS, ModItems.COPPER_PLATED_BOOTS).criterion("has_copper_plating", RecipeProvider.conditionsFromItem(ModItems.COPPER_PLATING))
                .offerTo(exporter, RecipeProvider.getItemPath(ModItems.COPPER_PLATED_BOOTS) + "_smithing");
        //</editor-fold>

        //<editor-fold desc="Steel">
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.PIG_IRON, RecipeCategory.MISC, ModBlocks.PIG_IRON_BLOCK);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STEEL_BLOCK, 1)
                .input(ModItems.STEEL_INGOT, 9)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STEEL_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_INGOT, 9)
                .input(ModBlocks.STEEL_BLOCK, 1)
                .criterion(hasItem(ModBlocks.STEEL_BLOCK), conditionsFromItem(ModBlocks.STEEL_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_INGOT)) + "_from_block");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_INGOT, 1)
                .input(ModItems.STEEL_NUGGET, 9)
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_INGOT)) + "_from_nuggets");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_NUGGET, 9)
                .input(ModItems.STEEL_INGOT, 1)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_NUGGET)) + "_from_ingot");

        offerSmelting(exporter, List.of(Items.IRON_INGOT), RecipeCategory.MISC, ModItems.PIG_IRON, 0.25f, 200, "pig_iron");
        offerBlasting(exporter, List.of(Items.IRON_INGOT), RecipeCategory.MISC, ModItems.PIG_IRON, 0.25f, 100, "pig_iron");
        offerSmelting(exporter, List.of(ModItems.PIG_IRON, ModBlocks.STEEL_ORE, ModBlocks.DEEPSLATE_STEEL_ORE, ModBlocks.NETHER_STEEL_ORE
        ), RecipeCategory.MISC, ModItems.STEEL_INGOT, 0.25f, 200, "steel");
        offerBlasting(exporter, List.of(ModItems.PIG_IRON, ModBlocks.STEEL_ORE, ModBlocks.DEEPSLATE_STEEL_ORE, ModBlocks.NETHER_STEEL_ORE
        ), RecipeCategory.MISC, ModItems.STEEL_INGOT, 0.25f, 100, "steel");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModBlocks.STEEL_DOOR)
                .pattern("CC")
                .pattern("CC")
                .pattern("CC")
                .input('C', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STEEL_DOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModBlocks.STEEL_TRAPDOOR)
                .pattern("CC")
                .pattern("CC")
                .input('C', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STEEL_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_PICKAXE)
                .pattern("CCC")
                .pattern(" S ")
                .pattern(" S ")
                .input('C', ModItems.STEEL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_AXE)
                .pattern("CC")
                .pattern("SC")
                .pattern("S ")
                .input('C', ModItems.STEEL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_SHOVEL)
                .pattern("C")
                .pattern("S")
                .pattern("S")
                .input('C', ModItems.STEEL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_HOE)
                .pattern("CC")
                .pattern("S ")
                .pattern("S ")
                .input('C', ModItems.STEEL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_SWORD)
                .pattern("C")
                .pattern("C")
                .pattern("S")
                .input('C', ModItems.STEEL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_HELMET)
                .pattern("CCC")
                .pattern("C C")
                .input('C', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_CHESTPLATE)
                .pattern("C C")
                .pattern("CCC")
                .pattern("CCC")
                .input('C', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_LEGGINGS)
                .pattern("CCC")
                .pattern("C C")
                .pattern("C C")
                .input('C', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_BOOTS)
                .pattern("C C")
                .pattern("C C")
                .input('C', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_BOOTS)));
        //</editor-fold>

        //<editor-fold desc="Platinum">
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_PLATINUM, RecipeCategory.MISC, ModBlocks.RAW_PLATINUM_BLOCK);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PLATINUM_BLOCK, 1)
                .input(ModItems.PLATINUM_INGOT, 9)
                .criterion(hasItem(ModItems.PLATINUM_INGOT), conditionsFromItem(ModItems.PLATINUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PLATINUM_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PLATINUM_INGOT, 9)
                .input(ModBlocks.PLATINUM_BLOCK, 1)
                .criterion(hasItem(ModBlocks.PLATINUM_BLOCK), conditionsFromItem(ModBlocks.PLATINUM_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PLATINUM_INGOT)) + "_from_block");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PLATINUM_INGOT, 1)
                .input(ModItems.PLATINUM_NUGGET, 9)
                .criterion(hasItem(ModItems.PLATINUM_NUGGET), conditionsFromItem(ModItems.PLATINUM_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PLATINUM_INGOT)) + "_from_nuggets");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PLATINUM_NUGGET, 9)
                .input(ModItems.PLATINUM_INGOT, 1)
                .criterion(hasItem(ModItems.PLATINUM_INGOT), conditionsFromItem(ModItems.PLATINUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PLATINUM_NUGGET)) + "_from_ingot");

        offerSmelting(exporter, List.of(ModBlocks.PLATINUM_ORE, ModBlocks.DEEPSLATE_PLATINUM_ORE, ModBlocks.NETHER_PLATINUM_ORE
        ), RecipeCategory.MISC, ModItems.PLATINUM_INGOT, 0.25f, 200, "platinum");
        offerBlasting(exporter, List.of(ModBlocks.PLATINUM_ORE, ModBlocks.DEEPSLATE_PLATINUM_ORE, ModBlocks.NETHER_PLATINUM_ORE
        ), RecipeCategory.MISC, ModItems.PLATINUM_INGOT, 0.25f, 100, "platinum");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PLATINUM_PICKAXE)
                .pattern("CCC")
                .pattern(" S ")
                .pattern(" S ")
                .input('C', ModItems.PLATINUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.PLATINUM_INGOT), conditionsFromItem(ModItems.PLATINUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PLATINUM_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PLATINUM_AXE)
                .pattern("CC")
                .pattern("SC")
                .pattern("S ")
                .input('C', ModItems.PLATINUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.PLATINUM_INGOT), conditionsFromItem(ModItems.PLATINUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PLATINUM_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PLATINUM_SHOVEL)
                .pattern("C")
                .pattern("S")
                .pattern("S")
                .input('C', ModItems.PLATINUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.PLATINUM_INGOT), conditionsFromItem(ModItems.PLATINUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PLATINUM_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PLATINUM_HOE)
                .pattern("CC")
                .pattern("S ")
                .pattern("S ")
                .input('C', ModItems.PLATINUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.PLATINUM_INGOT), conditionsFromItem(ModItems.PLATINUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PLATINUM_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PLATINUM_SWORD)
                .pattern("C")
                .pattern("C")
                .pattern("S")
                .input('C', ModItems.PLATINUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.PLATINUM_INGOT), conditionsFromItem(ModItems.PLATINUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PLATINUM_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PLATINUM_HELMET)
                .pattern("CCC")
                .pattern("C C")
                .input('C', ModItems.PLATINUM_INGOT)
                .criterion(hasItem(ModItems.PLATINUM_INGOT), conditionsFromItem(ModItems.PLATINUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PLATINUM_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PLATINUM_CHESTPLATE)
                .pattern("C C")
                .pattern("CCC")
                .pattern("CCC")
                .input('C', ModItems.PLATINUM_INGOT)
                .criterion(hasItem(ModItems.PLATINUM_INGOT), conditionsFromItem(ModItems.PLATINUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PLATINUM_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PLATINUM_LEGGINGS)
                .pattern("CCC")
                .pattern("C C")
                .pattern("C C")
                .input('C', ModItems.PLATINUM_INGOT)
                .criterion(hasItem(ModItems.PLATINUM_INGOT), conditionsFromItem(ModItems.PLATINUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PLATINUM_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PLATINUM_BOOTS)
                .pattern("C C")
                .pattern("C C")
                .input('C', ModItems.PLATINUM_INGOT)
                .criterion(hasItem(ModItems.PLATINUM_INGOT), conditionsFromItem(ModItems.PLATINUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PLATINUM_BOOTS)));
        //</editor-fold>

        //<editor-fold desc="Titanium">
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_TITANIUM, RecipeCategory.MISC, ModBlocks.RAW_TITANIUM_BLOCK);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TITANIUM_BLOCK, 1)
                .input(ModItems.TITANIUM_INGOT, 9)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.TITANIUM_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANIUM_INGOT, 9)
                .input(ModBlocks.TITANIUM_BLOCK, 1)
                .criterion(hasItem(ModBlocks.TITANIUM_BLOCK), conditionsFromItem(ModBlocks.TITANIUM_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TITANIUM_INGOT)) + "_from_block");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANIUM_INGOT, 1)
                .input(ModItems.TITANIUM_NUGGET, 9)
                .criterion(hasItem(ModItems.TITANIUM_NUGGET), conditionsFromItem(ModItems.TITANIUM_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TITANIUM_INGOT)) + "_from_nuggets");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANIUM_NUGGET, 9)
                .input(ModItems.TITANIUM_INGOT, 1)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TITANIUM_NUGGET)) + "_from_ingot");

        offerSmelting(exporter, List.of(ModBlocks.TITANIUM_ORE, ModBlocks.DEEPSLATE_TITANIUM_ORE, ModBlocks.NETHER_TITANIUM_ORE
        ), RecipeCategory.MISC, ModItems.TITANIUM_INGOT, 0.25f, 200, "titanium");
        offerBlasting(exporter, List.of(ModBlocks.TITANIUM_ORE, ModBlocks.DEEPSLATE_TITANIUM_ORE, ModBlocks.NETHER_TITANIUM_ORE
        ), RecipeCategory.MISC, ModItems.TITANIUM_INGOT, 0.25f, 100, "titanium");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_PICKAXE)
                .pattern("CCC")
                .pattern(" S ")
                .pattern(" S ")
                .input('C', ModItems.TITANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TITANIUM_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_AXE)
                .pattern("CC")
                .pattern("SC")
                .pattern("S ")
                .input('C', ModItems.TITANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TITANIUM_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_SHOVEL)
                .pattern("C")
                .pattern("S")
                .pattern("S")
                .input('C', ModItems.TITANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TITANIUM_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_HOE)
                .pattern("CC")
                .pattern("S ")
                .pattern("S ")
                .input('C', ModItems.TITANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TITANIUM_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_SWORD)
                .pattern("C")
                .pattern("C")
                .pattern("S")
                .input('C', ModItems.TITANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TITANIUM_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_HELMET)
                .pattern("CCC")
                .pattern("C C")
                .input('C', ModItems.TITANIUM_INGOT)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TITANIUM_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_CHESTPLATE)
                .pattern("C C")
                .pattern("CCC")
                .pattern("CCC")
                .input('C', ModItems.TITANIUM_INGOT)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TITANIUM_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_LEGGINGS)
                .pattern("CCC")
                .pattern("C C")
                .pattern("C C")
                .input('C', ModItems.TITANIUM_INGOT)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TITANIUM_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_BOOTS)
                .pattern("C C")
                .pattern("C C")
                .input('C', ModItems.TITANIUM_INGOT)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TITANIUM_BOOTS)));
        //</editor-fold>

    }
}