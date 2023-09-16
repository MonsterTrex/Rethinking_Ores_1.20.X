package net.monstertrex.rethinkingores.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.monstertrex.rethinkingores.RethinkingOresMod;
import net.monstertrex.rethinkingores.block.ModBlocks;

public class ModItemGroup {

    public static final ItemGroup STITCHED_LEATHER_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(RethinkingOresMod.MOD_ID, "rethinking_ores_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.rethinking_ores_group"))
                    .icon(() -> new ItemStack(ModItems.COPPER_PICKAXE)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.CHARCOAL_BLOCK);

                        entries.add(ModItems.COPPER_NUGGET);
                        entries.add(ModItems.COPPER_PLATING);
                        entries.add(ModItems.COPPER_PICKAXE);
                        entries.add(ModItems.COPPER_AXE);
                        entries.add(ModItems.COPPER_SHOVEL);
                        entries.add(ModItems.COPPER_HOE);
                        entries.add(ModItems.COPPER_SWORD);
                        entries.add(ModItems.COPPER_HELMET);
                        entries.add(ModItems.COPPER_CHESTPLATE);
                        entries.add(ModItems.COPPER_LEGGINGS);
                        entries.add(ModItems.COPPER_BOOTS);
                        entries.add(ModItems.COPPER_HORSE_ARMOR);

                        entries.add(ModBlocks.COPPER_PLATED_BLOCK);
                        entries.add(ModItems.MIXED_RAW_COPPER_GOLD);
                        entries.add(ModItems.COPPER_PLATED_NUGGET);
                        entries.add(ModItems.COPPER_PLATED_INGOT);
                        entries.add(ModItems.COPPER_PLATED_PICKAXE);
                        entries.add(ModItems.COPPER_PLATED_AXE);
                        entries.add(ModItems.COPPER_PLATED_SHOVEL);
                        entries.add(ModItems.COPPER_PLATED_HOE);
                        entries.add(ModItems.COPPER_PLATED_SWORD);
                        entries.add(ModItems.COPPER_PLATED_HELMET);
                        entries.add(ModItems.COPPER_PLATED_CHESTPLATE);
                        entries.add(ModItems.COPPER_PLATED_LEGGINGS);
                        entries.add(ModItems.COPPER_PLATED_BOOTS);
                        entries.add(ModItems.COPPER_PLATED_HORSE_ARMOR);

                        entries.add(ModBlocks.STEEL_ORE);
                        entries.add(ModBlocks.DEEPSLATE_STEEL_ORE);
                        entries.add(ModBlocks.NETHER_STEEL_ORE);
                        entries.add(ModBlocks.PIG_IRON_BLOCK);
                        entries.add(ModBlocks.STEEL_BLOCK);
                        entries.add(ModBlocks.STEEL_DOOR);
                        entries.add(ModBlocks.STEEL_TRAPDOOR);
                        entries.add(ModItems.PIG_IRON);
                        entries.add(ModItems.STEEL_NUGGET);
                        entries.add(ModItems.STEEL_INGOT);
                        entries.add(ModItems.STEEL_PICKAXE);
                        entries.add(ModItems.STEEL_AXE);
                        entries.add(ModItems.STEEL_SHOVEL);
                        entries.add(ModItems.STEEL_HOE);
                        entries.add(ModItems.STEEL_SWORD);
                        entries.add(ModItems.STEEL_HELMET);
                        entries.add(ModItems.STEEL_CHESTPLATE);
                        entries.add(ModItems.STEEL_LEGGINGS);
                        entries.add(ModItems.STEEL_BOOTS);
                        entries.add(ModItems.STEEL_HORSE_ARMOR);

                        entries.add(ModBlocks.PLATINUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_PLATINUM_ORE);
                        entries.add(ModBlocks.NETHER_PLATINUM_ORE);
                        entries.add(ModBlocks.RAW_PLATINUM_BLOCK);
                        entries.add(ModBlocks.PLATINUM_BLOCK);
                        entries.add(ModItems.RAW_PLATINUM);
                        entries.add(ModItems.PLATINUM_NUGGET);
                        entries.add(ModItems.PLATINUM_INGOT);
                        entries.add(ModItems.PLATINUM_PICKAXE);
                        entries.add(ModItems.PLATINUM_AXE);
                        entries.add(ModItems.PLATINUM_SHOVEL);
                        entries.add(ModItems.PLATINUM_HOE);
                        entries.add(ModItems.PLATINUM_SWORD);
                        entries.add(ModItems.PLATINUM_HELMET);
                        entries.add(ModItems.PLATINUM_CHESTPLATE);
                        entries.add(ModItems.PLATINUM_LEGGINGS);
                        entries.add(ModItems.PLATINUM_BOOTS);
                        entries.add(ModItems.PLATINUM_HORSE_ARMOR);

                        entries.add(ModBlocks.TITANIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TITANIUM_ORE);
                        entries.add(ModBlocks.NETHER_TITANIUM_ORE);
                        entries.add(ModBlocks.RAW_TITANIUM_BLOCK);
                        entries.add(ModBlocks.TITANIUM_BLOCK);
                        entries.add(ModItems.RAW_TITANIUM);
                        entries.add(ModItems.TITANIUM_NUGGET);
                        entries.add(ModItems.TITANIUM_INGOT);
                        entries.add(ModItems.TITANIUM_PICKAXE);
                        entries.add(ModItems.TITANIUM_AXE);
                        entries.add(ModItems.TITANIUM_SHOVEL);
                        entries.add(ModItems.TITANIUM_HOE);
                        entries.add(ModItems.TITANIUM_SWORD);
                        entries.add(ModItems.TITANIUM_HELMET);
                        entries.add(ModItems.TITANIUM_CHESTPLATE);
                        entries.add(ModItems.TITANIUM_LEGGINGS);
                        entries.add(ModItems.TITANIUM_BOOTS);
                        entries.add(ModItems.TITANIUM_HORSE_ARMOR);

                    }).build());

    public static void registerItemGroups(){}
}
