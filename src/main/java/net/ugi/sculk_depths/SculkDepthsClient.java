package net.ugi.sculk_depths;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.util.Identifier;
import net.ugi.sculk_depths.fluid.ModFluids;

public class SculkDepthsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {


        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.KRYSLUM_STILL,
                ModFluids.KRYSLUM_FLOWING,
                new SimpleFluidRenderHandler(
                        new Identifier("sculk_depths:block/kryslum_still"),
                        new Identifier("sculk_depths:block/kryslum_flow")
                )
        );
    }
}