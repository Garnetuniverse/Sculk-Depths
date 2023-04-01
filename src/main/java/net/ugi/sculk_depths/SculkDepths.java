package net.ugi.sculk_depths;

import net.fabricmc.api.ModInitializer;
import net.ugi.sculk_depths.block.ModBlocks;
import net.ugi.sculk_depths.item.ModItemGroup;
import net.ugi.sculk_depths.item.ModItems;
import net.ugi.sculk_depths.portal.Portals;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SculkDepths implements ModInitializer {
    public static final String MOD_ID = "sculk_depths";
    public static final Logger LOGGER = LoggerFactory.getLogger("sculk_depths");

    @Override
    public void onInitialize() {
        ModItemGroup.registerItemgroups();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        Portals.registerModPortals();
        LOGGER.info("sculk_depths has loaded");
    }
}
