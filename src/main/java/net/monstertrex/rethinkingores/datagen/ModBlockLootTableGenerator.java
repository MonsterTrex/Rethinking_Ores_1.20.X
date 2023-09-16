package net.monstertrex.rethinkingores.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.loottable.vanilla.VanillaBlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.monstertrex.rethinkingores.block.ModBlocks;
import net.monstertrex.rethinkingores.item.ModItemGroup;
import net.monstertrex.rethinkingores.item.ModItems;

public class ModBlockLootTableGenerator extends FabricBlockLootTableProvider {
    public ModBlockLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        addDrop(ModBlocks.CHARCOAL_BLOCK);

        addDrop(ModBlocks.COPPER_PLATED_BLOCK);

        addDrop(ModBlocks.STEEL_ORE, (Block block) -> VanillaBlockLootTableGenerator.dropsWithSilkTouch(block,
                (LootPoolEntry.Builder)this.applyExplosionDecay((ItemConvertible)block,
                        ((LeafEntry.Builder) ItemEntry.builder(ModItems.STEEL_NUGGET).apply(SetCountLootFunction.builder(UniformLootNumberProvider
                                .create(2.0f, 6.0f)))).apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE)))));
        addDrop(ModBlocks.DEEPSLATE_STEEL_ORE, (Block block) -> VanillaBlockLootTableGenerator.dropsWithSilkTouch(block,
                (LootPoolEntry.Builder)this.applyExplosionDecay((ItemConvertible)block,
                        ((LeafEntry.Builder) ItemEntry.builder(ModItems.STEEL_NUGGET).apply(SetCountLootFunction.builder(UniformLootNumberProvider
                                .create(2.0f, 6.0f)))).apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE)))));
        addDrop(ModBlocks.NETHER_STEEL_ORE, (Block block) -> VanillaBlockLootTableGenerator.dropsWithSilkTouch(block,
                (LootPoolEntry.Builder)this.applyExplosionDecay((ItemConvertible)block,
                        ((LeafEntry.Builder) ItemEntry.builder(ModItems.STEEL_NUGGET).apply(SetCountLootFunction.builder(UniformLootNumberProvider
                                .create(2.0f, 6.0f)))).apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE)))));
        addDrop(ModBlocks.PIG_IRON_BLOCK);
        addDrop(ModBlocks.STEEL_BLOCK);
        addDrop(ModBlocks.STEEL_DOOR);
        addDrop(ModBlocks.STEEL_TRAPDOOR);

        addDrop(ModBlocks.PLATINUM_ORE, oreDrops(ModBlocks.PLATINUM_ORE, ModItems.RAW_PLATINUM));
        addDrop(ModBlocks.DEEPSLATE_PLATINUM_ORE, oreDrops(ModBlocks.DEEPSLATE_PLATINUM_ORE, ModItems.RAW_PLATINUM));
        addDrop(ModBlocks.NETHER_PLATINUM_ORE, oreDrops(ModBlocks.NETHER_PLATINUM_ORE, ModItems.RAW_PLATINUM));
        addDrop(ModBlocks.RAW_PLATINUM_BLOCK);
        addDrop(ModBlocks.PLATINUM_BLOCK);

        addDrop(ModBlocks.TITANIUM_ORE, oreDrops(ModBlocks.TITANIUM_ORE, ModItems.RAW_TITANIUM));
        addDrop(ModBlocks.DEEPSLATE_TITANIUM_ORE, oreDrops(ModBlocks.DEEPSLATE_TITANIUM_ORE, ModItems.RAW_TITANIUM));
        addDrop(ModBlocks.NETHER_TITANIUM_ORE, oreDrops(ModBlocks.NETHER_TITANIUM_ORE, ModItems.RAW_TITANIUM));
        addDrop(ModBlocks.RAW_TITANIUM_BLOCK);
        addDrop(ModBlocks.TITANIUM_BLOCK);
    }
}
