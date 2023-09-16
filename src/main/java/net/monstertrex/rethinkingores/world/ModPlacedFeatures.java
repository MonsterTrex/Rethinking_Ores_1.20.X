package net.monstertrex.rethinkingores.world;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.monstertrex.rethinkingores.RethinkingOresMod;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> NETHER_STEEL_ORE_PLACED_KEY = registerKey("nether_steel_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHER_STEEL_ORE_PLACED_LARGE_KEY = registerKey("nether_steel_ore_large_bottom");
    public static final RegistryKey<PlacedFeature> PLATINUM_ORE_PLACED_KEY = registerKey("platinum_ore_placed");
    public static final RegistryKey<PlacedFeature> TITANIUM_ORE_PLACED_KEY = registerKey("titanium_ore_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

                //Count here defines amount of veins per chunk
        register(context, NETHER_STEEL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.NETHER_STEEL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(10,
                        HeightRangePlacementModifier.uniform(YOffset.aboveBottom(32), YOffset.belowTop(32))));
        register(context, NETHER_STEEL_ORE_PLACED_LARGE_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.NETHER_STEEL_ORE_LARGE_KEY),
                ModOrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-48), YOffset.aboveBottom(48))));
        register(context, PLATINUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PLATINUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(22,
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-64), YOffset.aboveBottom(192))));
        register(context, TITANIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TITANIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(15,
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-128), YOffset.aboveBottom(128))));

    }
    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(RethinkingOresMod.MOD_ID, name));
    }
    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
