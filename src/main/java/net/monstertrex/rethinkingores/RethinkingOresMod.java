package net.monstertrex.rethinkingores;

import net.fabricmc.api.ModInitializer;

import net.monstertrex.rethinkingores.block.ModBlocks;
import net.monstertrex.rethinkingores.item.ModItemGroup;
import net.monstertrex.rethinkingores.item.ModItems;
import net.monstertrex.rethinkingores.util.ModRegistries;
import net.monstertrex.rethinkingores.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RethinkingOresMod implements ModInitializer {
	public static final String MOD_ID = "rethinkingores";
    public static final Logger LOGGER = LoggerFactory.getLogger("stitchedleather");

	@Override
	public void onInitialize() {

		ModItemGroup.registerItemGroups();

		ModBlocks.registerModBlocks();
		ModItems.registerModItems();

		ModRegistries.registerModStuffs();

		ModWorldGeneration.generateModWorldGeneration();
	}
}