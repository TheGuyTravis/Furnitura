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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.CHERRY_CHAIR.get()))
                    .title(Component.translatable("creativetab.furnitura_tab")).displayItems((displayParameters, output) -> {

                        output.accept(ModBlocks.OAK_CHAIR.get());
                        output.accept(ModBlocks.JUNGLE_CHAIR.get());
                        output.accept(ModBlocks.MANGROVE_CHAIR.get());
                        output.accept(ModBlocks.CHERRY_CHAIR.get());
                        output.accept(ModBlocks.CRIMSON_CHAIR.get());
                        output.accept(ModBlocks.WARPED_CHAIR.get());
                        output.accept(ModBlocks.DARK_OAK_CHAIR.get());
                        output.accept(ModBlocks.ACACIA_CHAIR.get());
                        output.accept(ModBlocks.SPRUCE_CHAIR.get());
                        output.accept(ModBlocks.OAK_SHELF.get());
                        output.accept(ModBlocks.OAK_SHELF_EXTENDERS.get());
                        output.accept(ModBlocks.JUNGLE_SHELF.get());
                        output.accept(ModBlocks.JUNGLE_SHELF_EXTENDERS.get());
                        output.accept(ModBlocks.MANGROVE_SHELF.get());
                        output.accept(ModBlocks.MANGROVE_SHELF_EXTENDERS.get());
                        output.accept(ModBlocks.CHERRY_SHELF.get());
                        output.accept(ModBlocks.CHERRY_SHELF_EXTENDERS.get());
                        output.accept(ModBlocks.CRIMSON_SHELF.get());
                        output.accept(ModBlocks.CRIMSON_SHELF_EXTENDERS.get());
                        output.accept(ModBlocks.WARPED_SHELF.get());
                        output.accept(ModBlocks.WARPED_SHELF_EXTENDERS.get());
                        output.accept(ModBlocks.DARK_OAK_SHELF.get());
                        output.accept(ModBlocks.DARK_OAK_SHELF_EXTENDERS.get());
                        output.accept(ModBlocks.ACACIA_SHELF.get());
                        output.accept(ModBlocks.ACACIA_SHELF_EXTENDERS.get());
                        output.accept(ModBlocks.SPRUCE_SHELF.get());
                        output.accept(ModBlocks.SPRUCE_SHELF_EXTENDERS.get());
                        output.accept(ModBlocks.OAK_CABINET.get());
                        output.accept(ModBlocks.JUNGLE_CABINET.get());
                        output.accept(ModBlocks.MANGROVE_CABINET.get());
                        output.accept(ModBlocks.CHERRY_CABINET.get());
                        output.accept(ModBlocks.CRIMSON_CABINET.get());
                        output.accept(ModBlocks.WARPED_CABINET.get());
                        output.accept(ModBlocks.DARK_OAK_CABINET.get());
                        output.accept(ModBlocks.ACACIA_CABINET.get());
                        output.accept(ModBlocks.SPRUCE_CABINET.get());
                        output.accept(ModBlocks.WOODEN_COUCH_EDGE_BLUE.get());
                        output.accept(ModBlocks.WOODEN_COUCH_EDGE_BROWN.get());
                        output.accept(ModBlocks.WOODEN_COUCH_EDGE_CYAN.get());
                        output.accept(ModBlocks.WOODEN_COUCH_EDGE_GRAY.get());
                        output.accept(ModBlocks.WOODEN_COUCH_EDGE_GREEN.get());
                        output.accept(ModBlocks.WOODEN_COUCH_EDGE_LIGHT_BLUE.get());
                        output.accept(ModBlocks.WOODEN_COUCH_EDGE_LIGHT_GRAY.get());
                        output.accept(ModBlocks.WOODEN_COUCH_EDGE_LIME.get());
                        output.accept(ModBlocks.WOODEN_COUCH_EDGE_ORANGE.get());
                        output.accept(ModBlocks.WOODEN_COUCH_EDGE_PINK.get());
                        output.accept(ModBlocks.WOODEN_COUCH_EDGE_PURPLE.get());
                        output.accept(ModBlocks.WOODEN_COUCH_EDGE_RED.get());
                        output.accept(ModBlocks.WOODEN_COUCH_EDGE_WHITE.get());
                        output.accept(ModBlocks.WOODEN_COUCH_EDGE_YELLOW.get());
                        output.accept(ModBlocks.WOODEN_COUCH_END_BLUE.get());
                        output.accept(ModBlocks.WOODEN_COUCH_END_BROWN.get());
                        output.accept(ModBlocks.WOODEN_COUCH_END_CYAN.get());
                        output.accept(ModBlocks.WOODEN_COUCH_END_GRAY.get());
                        output.accept(ModBlocks.WOODEN_COUCH_END_GREEN.get());
                        output.accept(ModBlocks.WOODEN_COUCH_END_LIGHT_BLUE.get());
                        output.accept(ModBlocks.WOODEN_COUCH_END_LIGHT_GRAY.get());
                        output.accept(ModBlocks.WOODEN_COUCH_END_LIME.get());
                        output.accept(ModBlocks.WOODEN_COUCH_END_ORANGE.get());
                        output.accept(ModBlocks.WOODEN_COUCH_END_PINK.get());
                        output.accept(ModBlocks.WOODEN_COUCH_END_PURPLE.get());
                        output.accept(ModBlocks.WOODEN_COUCH_END_RED.get());
                        output.accept(ModBlocks.WOODEN_COUCH_END_WHITE.get());
                        output.accept(ModBlocks.WOODEN_COUCH_END_YELLOW.get());
                        output.accept(ModBlocks.WOODEN_COUCH_SINGLE_BLUE.get());
                        output.accept(ModBlocks.WOODEN_COUCH_SINGLE_BROWN.get());
                        output.accept(ModBlocks.WOODEN_COUCH_SINGLE_CYAN.get());
                        output.accept(ModBlocks.WOODEN_COUCH_SINGLE_GRAY.get());
                        output.accept(ModBlocks.WOODEN_COUCH_SINGLE_GREEN.get());
                        output.accept(ModBlocks.WOODEN_COUCH_SINGLE_LIGHT_BLUE.get());
                        output.accept(ModBlocks.WOODEN_COUCH_SINGLE_LIGHT_GRAY.get());
                        output.accept(ModBlocks.WOODEN_COUCH_SINGLE_LIME.get());
                        output.accept(ModBlocks.WOODEN_COUCH_SINGLE_ORANGE.get());
                        output.accept(ModBlocks.WOODEN_COUCH_SINGLE_PINK.get());
                        output.accept(ModBlocks.WOODEN_COUCH_SINGLE_PURPLE.get());
                        output.accept(ModBlocks.WOODEN_COUCH_SINGLE_RED.get());
                        output.accept(ModBlocks.WOODEN_COUCH_SINGLE_WHITE.get());
                        output.accept(ModBlocks.WOODEN_COUCH_SINGLE_YELLOW.get());
                        output.accept(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_BLUE.get());
                        output.accept(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_BROWN.get());
                        output.accept(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_CYAN.get());
                        output.accept(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_GRAY.get());
                        output.accept(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_GREEN.get());
                        output.accept(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_LIGHT_BLUE.get());
                        output.accept(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_LIGHT_GRAY.get());
                        output.accept(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_LIME.get());
                        output.accept(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_ORANGE.get());
                        output.accept(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_PINK.get());
                        output.accept(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_PURPLE.get());
                        output.accept(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_RED.get());
                        output.accept(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_WHITE.get());
                        output.accept(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_YELLOW.get());
                        output.accept(ModBlocks.COUCH_EXTENDERS_BLUE.get());
                        output.accept(ModBlocks.COUCH_EXTENDERS_BROWN.get());
                        output.accept(ModBlocks.COUCH_EXTENDERS_CYAN.get());
                        output.accept(ModBlocks.COUCH_EXTENDERS_GRAY.get());
                        output.accept(ModBlocks.COUCH_EXTENDERS_GREEN.get());
                        output.accept(ModBlocks.COUCH_EXTENDERS_LIGHT_BLUE.get());
                        output.accept(ModBlocks.COUCH_EXTENDERS_LIGHT_GRAY.get());
                        output.accept(ModBlocks.COUCH_EXTENDERS_LIME.get());
                        output.accept(ModBlocks.COUCH_EXTENDERS_ORANGE.get());
                        output.accept(ModBlocks.COUCH_EXTENDERS_PINK.get());
                        output.accept(ModBlocks.COUCH_EXTENDERS_PURPLE.get());
                        output.accept(ModBlocks.COUCH_EXTENDERS_RED.get());
                        output.accept(ModBlocks.COUCH_EXTENDERS_WHITE.get());
                        output.accept(ModBlocks.COUCH_EXTENDERS_YELLOW.get());
                        output.accept(ModBlocks.DRAWER.get());
                        output.accept(ModBlocks.OAK_TABLE.get());
                        output.accept(ModBlocks.JUNGLE_TABLE.get());
                        output.accept(ModBlocks.MANGROVE_TABLE.get());
                        output.accept(ModBlocks.CHERRY_TABLE.get());
                        output.accept(ModBlocks.CRIMSON_TABLE.get());
                        output.accept(ModBlocks.WARPED_TABLE.get());
                        output.accept(ModBlocks.DARK_OAK_TABLE.get());
                        output.accept(ModBlocks.ACACIA_TABLE.get());
                        output.accept(ModBlocks.SPRUCE_TABLE.get());
                        output.accept(ModBlocks.WOODEN_COUCH_EDGE.get());
                        output.accept(ModBlocks.WOODEN_COUCH_END.get());
                        output.accept(ModBlocks.WOODEN_COUCH_SINGLE.get());
                        output.accept(ModBlocks.WOODEN_COUCH_EDGE_RIGHT.get());
                        output.accept(ModBlocks.COUCH_EXTENDORS.get());

                        output.accept(ModBlocks.CUSSION_LOW.get());
                        output.accept(ModBlocks.WOODEN_COUCH_EDGE_LEFT_RED.get());
                        output.accept(ModBlocks.COUCH_SINGLE_RED.get());
                        output.accept(ModBlocks.COUCH_EDGE_RIGHT_RED.get());
                        output.accept(ModBlocks.MICROWAVE_BLOCK.get());
                        output.accept(ModBlocks.TOASTER.get());
                        output.accept(ModBlocks.SINGLE_CUSSION_BLACK.get());
                        output.accept(ModBlocks.BLUE_PET_BED.get());
                        output.accept(ModBlocks.TOAST.get());


                    }).build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
