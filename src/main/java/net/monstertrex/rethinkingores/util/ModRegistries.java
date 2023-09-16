package net.monstertrex.rethinkingores.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.monstertrex.rethinkingores.RethinkingOresMod;
import net.monstertrex.rethinkingores.block.ModBlocks;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();

    }

    private static void registerFuels() {
        System.out.println("Registering Fuels for + " + RethinkingOresMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        // 200 = 10 seconds, 1 item
        // 1600 = 10 seconds, 8 item = coal

        registry.add(ModBlocks.CHARCOAL_BLOCK,16000);

    }
}