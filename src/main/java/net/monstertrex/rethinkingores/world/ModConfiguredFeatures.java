package net.monstertrex.rethinkingores.world;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.monstertrex.rethinkingores.RethinkingOresMod;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.monstertrex.rethinkingores.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_STEEL_ORE_KEY = registerKey("nether_steel_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_STEEL_ORE_LARGE_KEY = registerKey("nether_steel_ore_large");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PLATINUM_ORE_KEY = registerKey("platinum_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TITANIUM_ORE_KEY = registerKey("titanium_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);

        List<OreFeatureConfig.Target> netherSteelOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.NETHER_STEEL_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldPlatinumOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.PLATINUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_PLATINUM_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldTitaniumOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.TITANIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_TITANIUM_ORE.getDefaultState()));

                //Count here defines average size of veins
        register(context, NETHER_STEEL_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherSteelOres, 5));
        register(context, NETHER_STEEL_ORE_LARGE_KEY, Feature.ORE, new OreFeatureConfig(netherSteelOres, 10));
        register(context, PLATINUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldPlatinumOres, 9));
        register(context, TITANIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTitaniumOres, 6, 0.5f));
    }



    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(RethinkingOresMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}