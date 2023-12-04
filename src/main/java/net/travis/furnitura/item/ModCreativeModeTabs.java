package net.travis.furnitura.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.travis.furnitura.FurnituraMod;
import net.travis.furnitura.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FurnituraMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FURNITURA_TAB = CREATIVE_MODE_TABS.register("furnitura_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TILE.get()))
                    .title(Component.translatable("creativetab.furnitura_tab")).displayItems((displayParameters, output) -> {
                        output.accept(ModItems.TILE.get());

                        output.accept(ModBlocks.TILE_BLOCK.get());

                    }).build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
