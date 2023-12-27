package net.travis.furnitura.client;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.ModelEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.travis.furnitura.ModEntities;
import net.travis.furnitura.client.renderer.SeatRenderer;

/**
 * Author: MrCrayfish
 */
public class ClientHandler
{
    public static void setup()
    {

    }

    public static void showDoorMatScreen(Level level, BlockPos pos)
    {

    }


    public static void onRegisterBlockColors(RegisterColorHandlersEvent.Block event) {


    }



    public static void onRegisterRenderers(EntityRenderersEvent.RegisterRenderers event)
    {
        event.registerEntityRenderer(ModEntities.SEAT.get(), SeatRenderer::new);

    }

    public static void onRegisterGeometryLoaders(ModelEvent.ModifyBakingResult event)
    {
        // Patches hedge models to have a predicate render type.
    }
}
