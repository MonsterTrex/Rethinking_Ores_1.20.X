package net.monstertrex.rethinkingores.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.monstertrex.rethinkingores.RethinkingOresMod;
import net.monstertrex.rethinkingores.block.ModBlocks;

public class ModItems {

    //<editor-fold desc="Copper">
    public static final Item COPPER_NUGGET = registerItem("copper_nugget",
            new Item(new FabricItemSettings()));
    public static final Item COPPER_PLATING = registerItem("copper_plating",
            new Item(new FabricItemSettings()));

    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe",
            new PickaxeItem(ModToolMaterial.COPPER, 1, -2.8f, new FabricItemSettings()));
    public static final Item COPPER_AXE = registerItem("copper_axe",
            new AxeItem(ModToolMaterial.COPPER, 7f, -3.2f, new FabricItemSettings()));
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel",
            new ShovelItem(ModToolMaterial.COPPER, 1.5f, -3f, new FabricItemSettings()));
    public static final Item COPPER_HOE = registerItem("copper_hoe",
            new HoeItem(ModToolMaterial.COPPER, -1, -2f, new FabricItemSettings()));
    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new SwordItem(ModToolMaterial.COPPER, 3, -2.4f, new FabricItemSettings()));
    public static final Item COPPER_HELMET = registerItem("copper_helmet",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item COPPER_CHESTPLATE = registerItem("copper_chestplate",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item COPPER_LEGGINGS = registerItem("copper_leggings",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item COPPER_BOOTS = registerItem("copper_boots",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item COPPER_HORSE_ARMOR = registerItem("copper_horse_armor",
            new HorseArmorItem(5, "copper", new FabricItemSettings()));
    //</editor-fold>

    //<editor-fold desc="Copper Plated">
    public static final Item MIXED_RAW_COPPER_GOLD = registerItem("mixed_raw_copper_gold",
            new Item(new FabricItemSettings()));
    public static final Item COPPER_PLATED_NUGGET = registerItem("copper_plated_nugget",
            new Item(new FabricItemSettings()));
    public static final Item COPPER_PLATED_INGOT = registerItem("copper_plated_ingot",
            new Item(new FabricItemSettings()));

    public static final Item COPPER_PLATED_PICKAXE = registerItem("copper_plated_pickaxe",
            new PickaxeItem(ModToolMaterial.COPPER_PLATED, 1, -2.8f, new FabricItemSettings()));
    public static final Item COPPER_PLATED_AXE = registerItem("copper_plated_axe",
            new AxeItem(ModToolMaterial.COPPER_PLATED, 7f, -3, new FabricItemSettings()));
    public static final Item COPPER_PLATED_SHOVEL = registerItem("copper_plated_shovel",
            new ShovelItem(ModToolMaterial.COPPER_PLATED, 1.5f, -3f, new FabricItemSettings()));
    public static final Item COPPER_PLATED_HOE = registerItem("copper_plated_hoe",
            new HoeItem(ModToolMaterial.COPPER_PLATED,  -1, -2f, new FabricItemSettings()));
    public static final Item COPPER_PLATED_SWORD = registerItem("copper_plated_sword",
            new SwordItem(ModToolMaterial.COPPER_PLATED, 3, -2.4f, new FabricItemSettings()));
    public static final Item COPPER_PLATED_HELMET = registerItem("copper_plated_helmet",
            new ArmorItem(ModArmorMaterials.COPPER_PLATED, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item COPPER_PLATED_CHESTPLATE = registerItem("copper_plated_chestplate",
            new ArmorItem(ModArmorMaterials.COPPER_PLATED, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item COPPER_PLATED_LEGGINGS = registerItem("copper_plated_leggings",
            new ArmorItem(ModArmorMaterials.COPPER_PLATED, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item COPPER_PLATED_BOOTS = registerItem("copper_plated_boots",
            new ArmorItem(ModArmorMaterials.COPPER_PLATED, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item COPPER_PLATED_HORSE_ARMOR = registerItem("copper_plated_horse_armor",
            new HorseArmorItem(8, "copper_plated", new FabricItemSettings()));
    //</editor-fold>

    //<editor-fold desc="Steel">
    public static final Item PIG_IRON = registerItem("pig_iron",
            new Item(new FabricItemSettings()));
    public static final Item STEEL_NUGGET = registerItem("steel_nugget",
            new Item(new FabricItemSettings()));
    public static final Item STEEL_INGOT = registerItem("steel_ingot",
            new Item(new FabricItemSettings()));

    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe",
            new PickaxeItem(ModToolMaterial.STEEL, 1, -2.8f, new FabricItemSettings()));
    public static final Item STEEL_AXE = registerItem("steel_axe",
            new AxeItem(ModToolMaterial.STEEL, 5.5f, -3.1f, new FabricItemSettings()));
    public static final Item STEEL_SHOVEL = registerItem("steel_shovel",
            new ShovelItem(ModToolMaterial.STEEL, 1.5f, -3f, new FabricItemSettings()));
    public static final Item STEEL_HOE = registerItem("steel_hoe",
            new HoeItem(ModToolMaterial.STEEL, -2, -1f, new FabricItemSettings()));
    public static final Item STEEL_SWORD = registerItem("steel_sword",
            new SwordItem(ModToolMaterial.STEEL, 3, -2.4f, new FabricItemSettings()));
    public static final Item STEEL_HELMET = registerItem("steel_helmet",
            new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item STEEL_CHESTPLATE = registerItem("steel_chestplate",
            new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item STEEL_LEGGINGS = registerItem("steel_leggings",
            new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item STEEL_BOOTS = registerItem("steel_boots",
            new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item STEEL_HORSE_ARMOR = registerItem("steel_horse_armor",
            new HorseArmorItem(7, "steel", new FabricItemSettings()));
    //</editor-fold>

    //<editor-fold desc="Platinum">
    public static final Item RAW_PLATINUM = registerItem("raw_platinum",
            new Item(new FabricItemSettings()));
    public static final Item PLATINUM_NUGGET = registerItem("platinum_nugget",
            new Item(new FabricItemSettings()));
    public static final Item PLATINUM_INGOT = registerItem("platinum_ingot",
            new Item(new FabricItemSettings()));

    public static final Item PLATINUM_PICKAXE = registerItem("platinum_pickaxe",
            new PickaxeItem(ModToolMaterial.PLATINUM, 1, -2.8f, new FabricItemSettings()));
    public static final Item PLATINUM_AXE = registerItem("platinum_axe",
            new AxeItem(ModToolMaterial.PLATINUM, 5f, -3.0f, new FabricItemSettings()));
    public static final Item PLATINUM_SHOVEL = registerItem("platinum_shovel",
            new ShovelItem(ModToolMaterial.PLATINUM, 1.5f, -3f, new FabricItemSettings()));
    public static final Item PLATINUM_HOE = registerItem("platinum_hoe",
            new HoeItem(ModToolMaterial.PLATINUM, -3, -0f, new FabricItemSettings()));
    public static final Item PLATINUM_SWORD = registerItem("platinum_sword",
            new SwordItem(ModToolMaterial.PLATINUM, 3, -2.4f, new FabricItemSettings()));
    public static final Item PLATINUM_HELMET = registerItem("platinum_helmet",
            new ArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item PLATINUM_CHESTPLATE = registerItem("platinum_chestplate",
            new ArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item PLATINUM_LEGGINGS = registerItem("platinum_leggings",
            new ArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item PLATINUM_BOOTS = registerItem("platinum_boots",
            new ArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item PLATINUM_HORSE_ARMOR = registerItem("platinum_horse_armor",
            new HorseArmorItem(8, "platinum", new FabricItemSettings()));
    //</editor-fold>

    //<editor-fold desc="Titanium">
    public static final Item RAW_TITANIUM = registerItem("raw_titanium",
            new Item(new FabricItemSettings()));
    public static final Item TITANIUM_NUGGET = registerItem("titanium_nugget",
            new Item(new FabricItemSettings()));
    public static final Item TITANIUM_INGOT = registerItem("titanium_ingot",
            new Item(new FabricItemSettings()));

    public static final Item TITANIUM_PICKAXE = registerItem("titanium_pickaxe",
            new PickaxeItem(ModToolMaterial.TITANIUM, 1, -2.8f, new FabricItemSettings()));
    public static final Item TITANIUM_AXE = registerItem("titanium_axe",
            new AxeItem(ModToolMaterial.TITANIUM, 5f, -3.0f, new FabricItemSettings()));
    public static final Item TITANIUM_SHOVEL = registerItem("titanium_shovel",
            new ShovelItem(ModToolMaterial.TITANIUM, 1.5f, -3f, new FabricItemSettings()));
    public static final Item TITANIUM_HOE = registerItem("titanium_hoe",
            new HoeItem(ModToolMaterial.TITANIUM, -2, -0f, new FabricItemSettings()));
    public static final Item TITANIUM_SWORD = registerItem("titanium_sword",
            new SwordItem(ModToolMaterial.TITANIUM, 3, -2.4f, new FabricItemSettings()));
    public static final Item TITANIUM_HELMET = registerItem("titanium_helmet",
            new ArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item TITANIUM_CHESTPLATE = registerItem("titanium_chestplate",
            new ArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item TITANIUM_LEGGINGS = registerItem("titanium_leggings",
            new ArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item TITANIUM_BOOTS = registerItem("titanium_boots",
            new ArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item TITANIUM_HORSE_ARMOR = registerItem("titanium_horse_armor",
            new HorseArmorItem(9, "titanium", new FabricItemSettings()));
    //</editor-fold>



    public static void itemGroupBuildingBlocks(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.CHARCOAL_BLOCK);
        entries.add(ModBlocks.COPPER_PLATED_BLOCK);
        entries.add(ModBlocks.PIG_IRON_BLOCK);
        entries.add(ModBlocks.STEEL_BLOCK);
        entries.add(ModBlocks.STEEL_DOOR);
        entries.add(ModBlocks.STEEL_TRAPDOOR);
        entries.add(ModBlocks.PLATINUM_BLOCK);
        entries.add(ModBlocks.TITANIUM_BLOCK);
    }
    public static void itemGroupNatural(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.STEEL_ORE);
        entries.add(ModBlocks.DEEPSLATE_STEEL_ORE);
        entries.add(ModBlocks.NETHER_STEEL_ORE);
        entries.add(ModBlocks.RAW_PLATINUM_BLOCK);
        entries.add(ModBlocks.PLATINUM_ORE);
        entries.add(ModBlocks.DEEPSLATE_PLATINUM_ORE);
        entries.add(ModBlocks.NETHER_PLATINUM_ORE);
        entries.add(ModBlocks.RAW_TITANIUM_BLOCK);
        entries.add(ModBlocks.TITANIUM_ORE);
        entries.add(ModBlocks.DEEPSLATE_TITANIUM_ORE);
        entries.add(ModBlocks.NETHER_TITANIUM_ORE);
    }
    public static void itemGroupRedstone(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.STEEL_DOOR);
        entries.add(ModBlocks.STEEL_TRAPDOOR);
    }
    public static void itemGroupTools(FabricItemGroupEntries entries) {
        entries.add(ModItems.COPPER_PICKAXE);
        entries.add(ModItems.COPPER_AXE);
        entries.add(ModItems.COPPER_SHOVEL);
        entries.add(ModItems.COPPER_HOE);
        entries.add(ModItems.COPPER_PLATED_PICKAXE);
        entries.add(ModItems.COPPER_PLATED_AXE);
        entries.add(ModItems.COPPER_PLATED_SHOVEL);
        entries.add(ModItems.COPPER_PLATED_HOE);
        entries.add(ModItems.STEEL_PICKAXE);
        entries.add(ModItems.STEEL_AXE);
        entries.add(ModItems.STEEL_SHOVEL);
        entries.add(ModItems.STEEL_HOE);
        entries.add(ModItems.PLATINUM_PICKAXE);
        entries.add(ModItems.PLATINUM_AXE);
        entries.add(ModItems.PLATINUM_SHOVEL);
        entries.add(ModItems.PLATINUM_HOE);
        entries.add(ModItems.TITANIUM_PICKAXE);
        entries.add(ModItems.TITANIUM_AXE);
        entries.add(ModItems.TITANIUM_SHOVEL);
        entries.add(ModItems.TITANIUM_HOE);
    }
    public static void itemGroupCombat(FabricItemGroupEntries entries) {
        entries.add(ModItems.COPPER_SWORD);
        entries.add(ModItems.COPPER_HELMET);
        entries.add(ModItems.COPPER_CHESTPLATE);
        entries.add(ModItems.COPPER_LEGGINGS);
        entries.add(ModItems.COPPER_BOOTS);
        entries.add(ModItems.COPPER_HORSE_ARMOR);
        entries.add(ModItems.COPPER_PLATED_SWORD);
        entries.add(ModItems.COPPER_PLATED_HELMET);
        entries.add(ModItems.COPPER_PLATED_CHESTPLATE);
        entries.add(ModItems.COPPER_PLATED_LEGGINGS);
        entries.add(ModItems.COPPER_PLATED_BOOTS);
        entries.add(ModItems.COPPER_PLATED_HORSE_ARMOR);
        entries.add(ModItems.STEEL_SWORD);
        entries.add(ModItems.STEEL_HELMET);
        entries.add(ModItems.STEEL_CHESTPLATE);
        entries.add(ModItems.STEEL_LEGGINGS);
        entries.add(ModItems.STEEL_BOOTS);
        entries.add(ModItems.STEEL_HORSE_ARMOR);
        entries.add(ModItems.PLATINUM_SWORD);
        entries.add(ModItems.PLATINUM_HELMET);
        entries.add(ModItems.PLATINUM_CHESTPLATE);
        entries.add(ModItems.PLATINUM_LEGGINGS);
        entries.add(ModItems.PLATINUM_BOOTS);
        entries.add(ModItems.PLATINUM_HORSE_ARMOR);
        entries.add(ModItems.TITANIUM_SWORD);
        entries.add(ModItems.TITANIUM_HELMET);
        entries.add(ModItems.TITANIUM_CHESTPLATE);
        entries.add(ModItems.TITANIUM_LEGGINGS);
        entries.add(ModItems.TITANIUM_BOOTS);
        entries.add(ModItems.TITANIUM_HORSE_ARMOR);
    }
    public static void itemGroupIngredients(FabricItemGroupEntries entries) {
        entries.add(ModItems.COPPER_NUGGET);
        entries.add(ModItems.COPPER_PLATING);
        entries.add(ModItems.MIXED_RAW_COPPER_GOLD);
        entries.add(ModItems.COPPER_PLATED_NUGGET);
        entries.add(ModItems.COPPER_PLATED_INGOT);
        entries.add(ModBlocks.PIG_IRON_BLOCK);
        entries.add(ModBlocks.STEEL_BLOCK);
        entries.add(ModBlocks.STEEL_DOOR);
        entries.add(ModBlocks.STEEL_TRAPDOOR);
        entries.add(ModItems.PIG_IRON);
        entries.add(ModItems.STEEL_NUGGET);
        entries.add(ModItems.STEEL_INGOT);
        entries.add(ModItems.RAW_PLATINUM);
        entries.add(ModItems.PLATINUM_NUGGET);
        entries.add(ModItems.PLATINUM_INGOT);
        entries.add(ModItems.RAW_TITANIUM);
        entries.add(ModItems.TITANIUM_NUGGET);
        entries.add(ModItems.TITANIUM_INGOT);
    }

    public static void registerModItems() {
        RethinkingOresMod.LOGGER.info("Registering Mod Items for " + RethinkingOresMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::itemGroupBuildingBlocks);
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(ModItems::itemGroupColoredBlocks);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::itemGroupNatural);
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(ModItems::itemGroupFunctional);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(ModItems::itemGroupRedstone);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::itemGroupTools);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::itemGroupCombat);
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::itemGroupFoodAndDrink);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(ModItems::itemGroupSpawnEggs);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RethinkingOresMod.MOD_ID, name), item);
    }
}
