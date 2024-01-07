package net.travis.furnitura.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.travis.furnitura.FurnituraMod;
import net.travis.furnitura.block.ModBlocks;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, FurnituraMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        complexBlock(ModBlocks.DRAWER.get());

        complexBlock(ModBlocks.OAK_TABLE.get());

        complexBlock(ModBlocks.WOODEN_COUCH_EDGE.get());

        complexBlock(ModBlocks.WOODEN_COUCH_END.get());

        complexBlock(ModBlocks.WOODEN_COUCH_SINGLE.get());

        complexBlock(ModBlocks.WOODEN_COUCH_EDGE_RIGHT.get());

        complexBlock(ModBlocks.COUCH_EXTENDORS.get());

        complexBlock(ModBlocks.CUSSION_LOW.get());

        complexBlock(ModBlocks.WOODEN_COUCH_EDGE_LEFT_RED.get());

        complexBlock(ModBlocks.COUCH_EDGE_RIGHT_RED.get());

        complexBlock(ModBlocks.COUCH_SINGLE_RED.get());

        complexBlock(ModBlocks.MICROWAVE_BLOCK.get());

        complexBlock(ModBlocks.TOASTER.get());

        complexBlock(ModBlocks.LARGE_CHAIR_RIGHT.get());

        complexBlock(ModBlocks.SINGLE_CUSSION_BLACK.get());

        complexBlock(ModBlocks.BLUE_PET_BED.get());

        complexBlock(ModBlocks.LARGE_SINGLE_COUCH.get());

        complexBlock(ModBlocks.LARGE_CHAIR_LEFT.get());

        complexBlock(ModBlocks.YELLOW_WOODEN_COUCH_END.get());

        complexBlock(ModBlocks.YELLOW_WOODEN_COUCH_SINGLE.get());

        complexBlock(ModBlocks.YELLOW_WOODEN_COUCH_EDGE_RIGHT.get());

        complexBlock(ModBlocks.YELLOW_COUCH_EXTENDORS.get());

        complexBlock(ModBlocks.TOAST.get());

        complexBlock(ModBlocks.OAK_CHAIR.get());

        complexBlock(ModBlocks.JUNGLE_CHAIR.get());

        complexBlock(ModBlocks.MANGROVE_CHAIR.get());

        complexBlock(ModBlocks.CHERRY_CHAIR.get());

        complexBlock(ModBlocks.CRIMSON_CHAIR.get());

        complexBlock(ModBlocks.WARPED_CHAIR.get());

        complexBlock(ModBlocks.DARK_OAK_CHAIR.get());

        complexBlock(ModBlocks.ACACIA_CHAIR.get());

        complexBlock(ModBlocks.OAK_SHELF.get());

        complexBlock(ModBlocks.OAK_SHELF_EXTENDERS.get());

        complexBlock(ModBlocks.SPRUCE_CHAIR.get());

        complexBlock(ModBlocks.JUNGLE_SHELF.get());

        complexBlock(ModBlocks.JUNGLE_SHELF_EXTENDERS.get());

        complexBlock(ModBlocks.MANGROVE_SHELF.get());

        complexBlock(ModBlocks.MANGROVE_SHELF_EXTENDERS.get());

        complexBlock(ModBlocks.CHERRY_SHELF.get());

        complexBlock(ModBlocks.CHERRY_SHELF_EXTENDERS.get());

        complexBlock(ModBlocks.CRIMSON_SHELF.get());

        complexBlock(ModBlocks.CRIMSON_SHELF_EXTENDERS.get());

        complexBlock(ModBlocks.WARPED_SHELF.get());

        complexBlock(ModBlocks.WARPED_SHELF_EXTENDERS.get());

        complexBlock(ModBlocks.DARK_OAK_SHELF.get());

        complexBlock(ModBlocks.DARK_OAK_SHELF_EXTENDERS.get());

        complexBlock(ModBlocks.ACACIA_SHELF.get());

        complexBlock(ModBlocks.ACACIA_SHELF_EXTENDERS.get());

        complexBlock(ModBlocks.SPRUCE_SHELF.get());

        complexBlock(ModBlocks.SPRUCE_SHELF_EXTENDERS.get());

        complexBlock(ModBlocks.OAK_CABINET.get());

        complexBlock(ModBlocks.JUNGLE_CABINET.get());

        complexBlock(ModBlocks.MANGROVE_CABINET.get());

        complexBlock(ModBlocks.CHERRY_CABINET.get());

        complexBlock(ModBlocks.CRIMSON_CABINET.get());

        complexBlock(ModBlocks.WARPED_CABINET.get());

        complexBlock(ModBlocks.DARK_OAK_CABINET.get());

        complexBlock(ModBlocks.ACACIA_CABINET.get());

        complexBlock(ModBlocks.SPRUCE_CABINET.get());

        complexBlock(ModBlocks.WOODEN_COUCH_EDGE_BLUE.get());

        complexBlock(ModBlocks.WOODEN_COUCH_EDGE_BROWN.get());

        complexBlock(ModBlocks.WOODEN_COUCH_EDGE_CYAN.get());

        complexBlock(ModBlocks.WOODEN_COUCH_EDGE_GRAY.get());

        complexBlock(ModBlocks.WOODEN_COUCH_EDGE_GREEN.get());

        complexBlock(ModBlocks.WOODEN_COUCH_EDGE_LIGHT_BLUE.get());

        complexBlock(ModBlocks.WOODEN_COUCH_EDGE_LIGHT_GRAY.get());

        complexBlock(ModBlocks.WOODEN_COUCH_EDGE_LIME.get());

        complexBlock(ModBlocks.WOODEN_COUCH_EDGE_ORANGE.get());

        complexBlock(ModBlocks.WOODEN_COUCH_EDGE_PINK.get());

        complexBlock(ModBlocks.WOODEN_COUCH_EDGE_PURPLE.get());

        complexBlock(ModBlocks.WOODEN_COUCH_EDGE_RED.get());

        complexBlock(ModBlocks.WOODEN_COUCH_EDGE_WHITE.get());

        complexBlock(ModBlocks.WOODEN_COUCH_EDGE_YELLOW.get());

        complexBlock(ModBlocks.WOODEN_COUCH_END_BLUE.get());

        complexBlock(ModBlocks.WOODEN_COUCH_END_BROWN.get());

        complexBlock(ModBlocks.WOODEN_COUCH_END_CYAN.get());

        complexBlock(ModBlocks.WOODEN_COUCH_END_GRAY.get());

        complexBlock(ModBlocks.WOODEN_COUCH_END_GREEN.get());

        complexBlock(ModBlocks.WOODEN_COUCH_END_LIGHT_BLUE.get());

        complexBlock(ModBlocks.WOODEN_COUCH_END_LIGHT_GRAY.get());

        complexBlock(ModBlocks.WOODEN_COUCH_END_LIME.get());

        complexBlock(ModBlocks.WOODEN_COUCH_END_ORANGE.get());

        complexBlock(ModBlocks.WOODEN_COUCH_END_PINK.get());

        complexBlock(ModBlocks.WOODEN_COUCH_END_PURPLE.get());

        complexBlock(ModBlocks.WOODEN_COUCH_END_RED.get());

        complexBlock(ModBlocks.WOODEN_COUCH_END_WHITE.get());

        complexBlock(ModBlocks.WOODEN_COUCH_END_YELLOW.get());

        complexBlock(ModBlocks.WOODEN_COUCH_SINGLE_BLUE.get());

        complexBlock(ModBlocks.WOODEN_COUCH_SINGLE_BROWN.get());

        complexBlock(ModBlocks.WOODEN_COUCH_SINGLE_CYAN.get());

        complexBlock(ModBlocks.WOODEN_COUCH_SINGLE_GRAY.get());

        complexBlock(ModBlocks.WOODEN_COUCH_SINGLE_GREEN.get());

        complexBlock(ModBlocks.WOODEN_COUCH_SINGLE_LIGHT_BLUE.get());

        complexBlock(ModBlocks.WOODEN_COUCH_SINGLE_LIGHT_GRAY.get());

        complexBlock(ModBlocks.WOODEN_COUCH_SINGLE_LIME.get());

        complexBlock(ModBlocks.WOODEN_COUCH_SINGLE_ORANGE.get());

        complexBlock(ModBlocks.WOODEN_COUCH_SINGLE_PINK.get());

        complexBlock(ModBlocks.WOODEN_COUCH_SINGLE_PURPLE.get());

        complexBlock(ModBlocks.WOODEN_COUCH_SINGLE_RED.get());

        complexBlock(ModBlocks.WOODEN_COUCH_SINGLE_WHITE.get());

        complexBlock(ModBlocks.WOODEN_COUCH_SINGLE_YELLOW.get());

        complexBlock(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_BLUE.get());

        complexBlock(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_BROWN.get());

        complexBlock(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_CYAN.get());

        complexBlock(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_GRAY.get());

        complexBlock(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_GREEN.get());

        complexBlock(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_LIGHT_BLUE.get());

        complexBlock(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_LIGHT_GRAY.get());

        complexBlock(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_LIME.get());

        complexBlock(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_ORANGE.get());

        complexBlock(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_PINK.get());

        complexBlock(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_PURPLE.get());

        complexBlock(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_RED.get());

        complexBlock(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_WHITE.get());

        complexBlock(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_YELLOW.get());

        complexBlock(ModBlocks.COUCH_EXTENDERS_BLUE.get());

        complexBlock(ModBlocks.COUCH_EXTENDERS_BROWN.get());

        complexBlock(ModBlocks.COUCH_EXTENDERS_CYAN.get());

        complexBlock(ModBlocks.COUCH_EXTENDERS_GRAY.get());

        complexBlock(ModBlocks.COUCH_EXTENDERS_GREEN.get());

        complexBlock(ModBlocks.COUCH_EXTENDERS_LIGHT_BLUE.get());

        complexBlock(ModBlocks.COUCH_EXTENDERS_LIGHT_GRAY.get());

        complexBlock(ModBlocks.COUCH_EXTENDERS_LIME.get());

        complexBlock(ModBlocks.COUCH_EXTENDERS_ORANGE.get());

        complexBlock(ModBlocks.COUCH_EXTENDERS_PINK.get());

        complexBlock(ModBlocks.COUCH_EXTENDERS_PURPLE.get());

        complexBlock(ModBlocks.COUCH_EXTENDERS_RED.get());

        complexBlock(ModBlocks.COUCH_EXTENDERS_WHITE.get());

        complexBlock(ModBlocks.COUCH_EXTENDERS_YELLOW.get());

        complexBlock(ModBlocks.JUNGLE_TABLE.get());

        complexBlock(ModBlocks.MANGROVE_TABLE.get());

        complexBlock(ModBlocks.CHERRY_TABLE.get());

        complexBlock(ModBlocks.WARPED_TABLE.get());

        complexBlock(ModBlocks.CRIMSON_TABLE.get());

        complexBlock(ModBlocks.DARK_OAK_TABLE.get());

        complexBlock(ModBlocks.ACACIA_TABLE.get());

        complexBlock(ModBlocks.SPRUCE_TABLE.get());

        complexBlock(ModBlocks.SINGLE_CUSHION_BLUE.get());

        complexBlock(ModBlocks.SINGLE_CUSHION_BROWN.get());

        complexBlock(ModBlocks.SINGLE_CUSHION_CYAN.get());

        complexBlock(ModBlocks.SINGLE_CUSHION_GRAY.get());

        complexBlock(ModBlocks.SINGLE_CUSHION_GREEN.get());

        complexBlock(ModBlocks.SINGLE_CUSHION_LIGHT_BLUE.get());

        complexBlock(ModBlocks.SINGLE_CUSHION_LIGHT_GRAY.get());

        complexBlock(ModBlocks.SINGLE_CUSHION_LIME.get());

        complexBlock(ModBlocks.SINGLE_CUSHION_ORANGE.get());

        complexBlock(ModBlocks.SINGLE_CUSHION_PINK.get());

        complexBlock(ModBlocks.SINGLE_CUSHION_PURPLE.get());

        complexBlock(ModBlocks.SINGLE_CUSHION_RED.get());

        complexBlock(ModBlocks.SINGLE_CUSHION_WHITE.get());

        complexBlock(ModBlocks.SINGLE_CUSHION_YELLOW.get());

        complexBlock(ModBlocks.LARGE_COUCH_SINGLE_BLACK.get());

        complexBlock(ModBlocks.SMALL_TABLE_OAK.get());

        complexBlock(ModBlocks.SMALL_TABLE_JUNGLE.get());

        complexBlock(ModBlocks.SMALL_TABLE_MANGROVE.get());

        complexBlock(ModBlocks.SMALL_TABLE_CHERRY.get());

        complexBlock(ModBlocks.SMALL_TABLE_CRIMSON.get());

        complexBlock(ModBlocks.SMALL_TABLE_WARPED.get());

        complexBlock(ModBlocks.SMALL_TABLE_DARK_OAK.get());

        complexBlock(ModBlocks.SMALL_TABLE_ACACIA.get());

        complexBlock(ModBlocks.SMALL_TABLE_SPRUCE.get());

        complexBlock(ModBlocks.MAILBOX.get());

        complexBlock(ModBlocks.OAK_LOG_SHELF.get());

        complexBlock(ModBlocks.JUNGLE_LOG_SHELF.get());

        complexBlock(ModBlocks.MANGROVE_LOG_SHELF.get());

        complexBlock(ModBlocks.CHERRY_LOG_SHELF.get());

        complexBlock(ModBlocks.CRIMSON_STEM_SHELF.get());

        complexBlock(ModBlocks.WARPED_STEM_SHELF.get());

        complexBlock(ModBlocks.DARK_OAK_LOG_SHELF.get());

        complexBlock(ModBlocks.ACACIA_LOG_SHELF.get());

        complexBlock(ModBlocks.SPRUCE_LOG_SHELF.get());

        complexBlock(ModBlocks.SINGLE_LEG_TABLE_OAK.get());

        complexBlock(ModBlocks.SINGLE_LEG_TABLE_JUNGLE.get());

        complexBlock(ModBlocks.SINGLE_LEG_TABLE_MANGROVE.get());

        complexBlock(ModBlocks.SINGLE_LEG_TABLE_CHERRY.get());

        complexBlock(ModBlocks.SINGLE_LEG_TABLE_CRIMSON.get());

        complexBlock(ModBlocks.SINGLE_LEG_TABLE_WARPED.get());

        complexBlock(ModBlocks.SINGLE_LEG_TABLE_DARK_OAK.get());

        complexBlock(ModBlocks.SINGLE_LEG_TABLE_ACACIA.get());

        complexBlock(ModBlocks.SINGLE_LEG_TABLE_SPRUCE.get());

        complexBlock(ModBlocks.OAK_STUMP.get());

        complexBlock(ModBlocks.JUNGLE_STUMP.get());

        complexBlock(ModBlocks.MANGROVE_STUMP.get());

        complexBlock(ModBlocks.CHERRY_STUMP.get());

        complexBlock(ModBlocks.CRIMSON_STUMP.get());

        complexBlock(ModBlocks.WARPED_STUMP.get());

        complexBlock(ModBlocks.DARK_OAK_STUMP.get());

        complexBlock(ModBlocks.ACACIA_STUMP.get());

        complexBlock(ModBlocks.SPRUCE_STUMP.get());

        complexBlock(ModBlocks.OAK_CRATE.get());

        complexBlock(ModBlocks.OAK_DESK.get());





    }

    private ItemModelBuilder complexBlock(Block block) {
        return withExistingParent(ForgeRegistries.BLOCKS.getKey(block).getPath(), new ResourceLocation(FurnituraMod.MOD_ID,
                "block/" + ForgeRegistries.BLOCKS.getKey(block).getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(FurnituraMod.MOD_ID, "item/" + item.getId().getPath()));
    }
}
