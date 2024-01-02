package net.travis.furnitura.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.travis.furnitura.FurnituraMod;
import net.travis.furnitura.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, FurnituraMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        horizontalBlock(ModBlocks.DRAWER.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/drawer")));

        horizontalBlock(ModBlocks.OAK_TABLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/oak_table")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_EDGE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_edge")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_END.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_end")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_SINGLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_single")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_EDGE_RIGHT.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_edge_right")));

        horizontalBlock(ModBlocks.COUCH_EXTENDORS.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/couch_extendors")));

        horizontalBlock(ModBlocks.CUSSION_LOW.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/cussion_low")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_EDGE_LEFT_RED.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_edge_left_red")));

        horizontalBlock(ModBlocks.COUCH_SINGLE_RED.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/couch_single_red")));

        horizontalBlock(ModBlocks.COUCH_EDGE_RIGHT_RED.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/couch_edge_right_red")));

        horizontalBlock(ModBlocks.MICROWAVE_BLOCK.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/microwave_block")));

        horizontalBlock(ModBlocks.TOASTER.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/toaster")));

        horizontalBlock(ModBlocks.LARGE_CHAIR_RIGHT.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/large_chair_right")));

        horizontalBlock(ModBlocks.SINGLE_CUSSION_BLACK.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/single_cussion_black")));

        horizontalBlock(ModBlocks.BLUE_PET_BED.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/blue_pet_bed")));

        horizontalBlock(ModBlocks.LARGE_SINGLE_COUCH.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/large_single_couch")));

        horizontalBlock(ModBlocks.LARGE_CHAIR_LEFT.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/large_chair_left")));

        horizontalBlock(ModBlocks.YELLOW_WOODEN_COUCH_END.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/yellow_wooden_couch_end")));

        horizontalBlock(ModBlocks.YELLOW_WOODEN_COUCH_SINGLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/yellow_wooden_couch_single")));

        horizontalBlock(ModBlocks.YELLOW_WOODEN_COUCH_EDGE_RIGHT.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/yellow_wooden_couch_edge_right")));

        horizontalBlock(ModBlocks.YELLOW_COUCH_EXTENDORS.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/yellow_couch_extendors")));

        horizontalBlock(ModBlocks.TOAST.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/toast")));

        horizontalBlock(ModBlocks.OAK_CHAIR.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/oak_chair")));

        horizontalBlock(ModBlocks.JUNGLE_CHAIR.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/jungle_chair")));

        horizontalBlock(ModBlocks.MANGROVE_CHAIR.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/mangrove_chair")));

        horizontalBlock(ModBlocks.CHERRY_CHAIR.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/cherry_chair")));

        horizontalBlock(ModBlocks.CRIMSON_CHAIR.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/crimson_chair")));

        horizontalBlock(ModBlocks.WARPED_CHAIR.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/warped_chair")));

        horizontalBlock(ModBlocks.DARK_OAK_CHAIR.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/dark_oak_chair")));

        horizontalBlock(ModBlocks.ACACIA_CHAIR.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/acacia_chair")));

        horizontalBlock(ModBlocks.OAK_SHELF.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/oak_shelf")));

        horizontalBlock(ModBlocks.OAK_SHELF_EXTENDERS.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/oak_shelf_extenders")));

        horizontalBlock(ModBlocks.SPRUCE_CHAIR.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/spruce_chair")));

        horizontalBlock(ModBlocks.JUNGLE_SHELF.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/jungle_shelf")));

        horizontalBlock(ModBlocks.JUNGLE_SHELF_EXTENDERS.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/jungle_shelf_extenders")));

        horizontalBlock(ModBlocks.MANGROVE_SHELF.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/mangrove_shelf")));

        horizontalBlock(ModBlocks.MANGROVE_SHELF_EXTENDERS.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/mangrove_shelf_extenders")));

        horizontalBlock(ModBlocks.CHERRY_SHELF.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/cherry_shelf")));

        horizontalBlock(ModBlocks.CHERRY_SHELF_EXTENDERS.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/cherry_shelf_extenders")));

        horizontalBlock(ModBlocks.CRIMSON_SHELF.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/crimson_shelf")));

        horizontalBlock(ModBlocks.CRIMSON_SHELF_EXTENDERS.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/crimson_shelf_extenders")));

        horizontalBlock(ModBlocks.WARPED_SHELF.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/warped_shelf")));

        horizontalBlock(ModBlocks.WARPED_SHELF_EXTENDERS.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/warped_shelf_extenders")));

        horizontalBlock(ModBlocks.DARK_OAK_SHELF.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/dark_oak_shelf")));

        horizontalBlock(ModBlocks.DARK_OAK_SHELF_EXTENDERS.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/dark_oak_shelf_extenders")));

        horizontalBlock(ModBlocks.ACACIA_SHELF.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/acacia_shelf")));

        horizontalBlock(ModBlocks.ACACIA_SHELF_EXTENDERS.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/acacia_shelf_extenders")));

        horizontalBlock(ModBlocks.SPRUCE_SHELF.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/spruce_shelf")));

        horizontalBlock(ModBlocks.SPRUCE_SHELF_EXTENDERS.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/spruce_shelf_extenders")));

        horizontalBlock(ModBlocks.OAK_CABINET.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/oak_cabinet")));

        horizontalBlock(ModBlocks.JUNGLE_CABINET.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/jungle_cabinet")));

        horizontalBlock(ModBlocks.MANGROVE_CABINET.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/mangrove_cabinet")));

        horizontalBlock(ModBlocks.CHERRY_CABINET.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/cherry_cabinet")));

        horizontalBlock(ModBlocks.CRIMSON_CABINET.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/crimson_cabinet")));

        horizontalBlock(ModBlocks.WARPED_CABINET.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/warped_cabinet")));

        horizontalBlock(ModBlocks.DARK_OAK_CABINET.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/dark_oak_cabinet")));

        horizontalBlock(ModBlocks.ACACIA_CABINET.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/acacia_cabinet")));

        horizontalBlock(ModBlocks.SPRUCE_CABINET.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/spruce_cabinet")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_EDGE_BLUE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_edge_blue")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_EDGE_BROWN.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_edge_brown")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_EDGE_CYAN.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_edge_cyan")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_EDGE_GRAY.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_edge_gray")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_EDGE_GREEN.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_edge_green")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_EDGE_LIGHT_BLUE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_edge_light_blue")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_EDGE_LIGHT_GRAY.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_edge_light_gray")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_EDGE_LIME.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_edge_lime")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_EDGE_ORANGE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_edge_orange")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_EDGE_PINK.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_edge_pink")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_EDGE_PURPLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_edge_purple")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_EDGE_RED.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_edge_red")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_EDGE_WHITE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_edge_white")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_EDGE_YELLOW.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_edge_yellow")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_END_BLUE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_end_blue")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_END_BROWN.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_end_brown")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_END_CYAN.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_end_cyan")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_END_GRAY.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_end_gray")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_END_GREEN.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_end_green")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_END_LIGHT_BLUE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_end_light_blue")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_END_LIGHT_GRAY.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_end_light_gray")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_END_LIME.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_end_lime")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_END_ORANGE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_end_orange")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_END_PINK.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_end_pink")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_END_PURPLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_end_purple")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_END_RED.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_end_red")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_END_WHITE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_end_white")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_END_YELLOW.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_end_yellow")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_SINGLE_BLUE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_single_blue")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_SINGLE_BROWN.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_single_brown")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_SINGLE_CYAN.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_single_cyan")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_SINGLE_GRAY.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_single_gray")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_SINGLE_GREEN.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_single_green")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_SINGLE_LIGHT_BLUE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_single_light_blue")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_SINGLE_LIGHT_GRAY.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_single_light_gray")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_SINGLE_LIME.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_single_lime")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_SINGLE_ORANGE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_single_orange")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_SINGLE_PINK.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_single_pink")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_SINGLE_PURPLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_single_purple")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_SINGLE_RED.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_single_red")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_SINGLE_WHITE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_single_white")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_SINGLE_YELLOW.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_single_yellow")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_BLUE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_edge_right_blue")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_BROWN.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_edge_right_brown")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_CYAN.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_edge_right_cyan")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_GRAY.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_edge_right_gray")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_GREEN.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_edge_right_green")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_LIGHT_BLUE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_edge_right_light_blue")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_LIGHT_GRAY.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_edge_right_light_gray")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_LIME.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_edge_right_lime")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_ORANGE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_edge_right_orange")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_PINK.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_edge_right_pink")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_PURPLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_edge_right_purple")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_RED.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_edge_right_red")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_WHITE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_edge_right_white")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_YELLOW.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_edge_right_yellow")));

        horizontalBlock(ModBlocks.COUCH_EXTENDERS_BLUE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/couch_extenders_blue")));

        horizontalBlock(ModBlocks.COUCH_EXTENDERS_BROWN.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/couch_extenders_brown")));

        horizontalBlock(ModBlocks.COUCH_EXTENDERS_CYAN.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/couch_extenders_cyan")));

        horizontalBlock(ModBlocks.COUCH_EXTENDERS_GRAY.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/couch_extenders_gray")));

        horizontalBlock(ModBlocks.COUCH_EXTENDERS_GREEN.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/couch_extenders_green")));

        horizontalBlock(ModBlocks.COUCH_EXTENDERS_LIGHT_BLUE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/couch_extenders_light_blue")));

        horizontalBlock(ModBlocks.COUCH_EXTENDERS_LIGHT_GRAY.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/couch_extenders_light_gray")));

        horizontalBlock(ModBlocks.COUCH_EXTENDERS_LIME.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/couch_extenders_lime")));

        horizontalBlock(ModBlocks.COUCH_EXTENDERS_ORANGE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/couch_extenders_orange")));

        horizontalBlock(ModBlocks.COUCH_EXTENDERS_PINK.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/couch_extenders_pink")));

        horizontalBlock(ModBlocks.COUCH_EXTENDERS_PURPLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/couch_extenders_purple")));

        horizontalBlock(ModBlocks.COUCH_EXTENDERS_RED.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/couch_extenders_red")));

        horizontalBlock(ModBlocks.COUCH_EXTENDERS_WHITE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/couch_extenders_white")));

        horizontalBlock(ModBlocks.COUCH_EXTENDERS_YELLOW.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/couch_extenders_yellow")));

        horizontalBlock(ModBlocks.JUNGLE_TABLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/jungle_table")));

        horizontalBlock(ModBlocks.MANGROVE_TABLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/mangrove_table")));

        horizontalBlock(ModBlocks.CHERRY_TABLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/cherry_table")));

        horizontalBlock(ModBlocks.WARPED_TABLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/warped_table")));

        horizontalBlock(ModBlocks.CRIMSON_TABLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/crimson_table")));

        horizontalBlock(ModBlocks.DARK_OAK_TABLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/dark_oak_table")));

        horizontalBlock(ModBlocks.ACACIA_TABLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/acacia_table")));

        horizontalBlock(ModBlocks.SPRUCE_TABLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/spruce_table")));

        horizontalBlock(ModBlocks.SINGLE_CUSHION_BLUE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/single_cushion_blue")));

        horizontalBlock(ModBlocks.SINGLE_CUSHION_BROWN.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/single_cushion_brown")));

        horizontalBlock(ModBlocks.SINGLE_CUSHION_CYAN.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/single_cushion_cyan")));

        horizontalBlock(ModBlocks.SINGLE_CUSHION_GRAY.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/single_cushion_gray")));

        horizontalBlock(ModBlocks.SINGLE_CUSHION_GREEN.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/single_cushion_green")));

        horizontalBlock(ModBlocks.SINGLE_CUSHION_LIGHT_BLUE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/single_cushion_light_blue")));

        horizontalBlock(ModBlocks.SINGLE_CUSHION_LIGHT_GRAY.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/single_cushion_light_gray")));

        horizontalBlock(ModBlocks.SINGLE_CUSHION_LIME.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/single_cushion_lime")));

        horizontalBlock(ModBlocks.SINGLE_CUSHION_ORANGE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/single_cushion_orange")));

        horizontalBlock(ModBlocks.SINGLE_CUSHION_PINK.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/single_cushion_pink")));

        horizontalBlock(ModBlocks.SINGLE_CUSHION_PURPLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/single_cushion_purple")));

        horizontalBlock(ModBlocks.SINGLE_CUSHION_RED.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/single_cushion_red")));

        horizontalBlock(ModBlocks.SINGLE_CUSHION_WHITE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/single_cushion_white")));

        horizontalBlock(ModBlocks.SINGLE_CUSHION_YELLOW.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/single_cushion_yellow")));

        horizontalBlock(ModBlocks.LARGE_COUCH_SINGLE_BLACK.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/large_couch_single_black")));

        horizontalBlock(ModBlocks.SMALL_TABLE_OAK.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/small_table_oak")));

        horizontalBlock(ModBlocks.SMALL_TABLE_JUNGLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/small_table_jungle")));

        horizontalBlock(ModBlocks.SMALL_TABLE_MANGROVE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/small_table_mangrove")));

        horizontalBlock(ModBlocks.SMALL_TABLE_CHERRY.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/small_table_cherry")));

        horizontalBlock(ModBlocks.SMALL_TABLE_CRIMSON.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/small_table_crimson")));

        horizontalBlock(ModBlocks.SMALL_TABLE_WARPED.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/small_table_warped")));

        horizontalBlock(ModBlocks.SMALL_TABLE_DARK_OAK.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/small_table_dark_oak")));

        horizontalBlock(ModBlocks.SMALL_TABLE_ACACIA.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/small_table_acacia")));

        horizontalBlock(ModBlocks.SMALL_TABLE_SPRUCE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/small_table_spruce")));

        horizontalBlock(ModBlocks.MAILBOX.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/mailbox")));

        horizontalBlock(ModBlocks.OAK_LOG_SHELF.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/oak_log_shelf")));

        horizontalBlock(ModBlocks.JUNGLE_LOG_SHELF.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/jungle_log_shelf")));

        horizontalBlock(ModBlocks.MANGROVE_LOG_SHELF.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/mangrove_log_shelf")));

        horizontalBlock(ModBlocks.CHERRY_LOG_SHELF.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/cherry_log_shelf")));

        horizontalBlock(ModBlocks.CRIMSON_STEM_SHELF.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/crimson_stem_shelf")));

        horizontalBlock(ModBlocks.WARPED_STEM_SHELF.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/warped_stem_shelf")));

        horizontalBlock(ModBlocks.DARK_OAK_LOG_SHELF.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/dark_oak_log_shelf")));

        horizontalBlock(ModBlocks.ACACIA_LOG_SHELF.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/acacia_log_shelf")));

        horizontalBlock(ModBlocks.SPRUCE_LOG_SHELF.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/spruce_log_shelf")));

        horizontalBlock(ModBlocks.SINGLE_LEG_TABLE_OAK.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/single_leg_table_oak")));

        horizontalBlock(ModBlocks.SINGLE_LEG_TABLE_JUNGLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/single_leg_table_jungle")));

        horizontalBlock(ModBlocks.SINGLE_LEG_TABLE_MANGROVE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/single_leg_table_mangrove")));

        horizontalBlock(ModBlocks.SINGLE_LEG_TABLE_CHERRY.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/single_leg_table_cherry")));

        horizontalBlock(ModBlocks.SINGLE_LEG_TABLE_CRIMSON.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/single_leg_table_crimson")));

        horizontalBlock(ModBlocks.SINGLE_LEG_TABLE_WARPED.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/single_leg_table_warped")));

        horizontalBlock(ModBlocks.SINGLE_LEG_TABLE_DARK_OAK.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/single_leg_table_dark_oak")));

        horizontalBlock(ModBlocks.SINGLE_LEG_TABLE_ACACIA.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/single_leg_table_acacia")));

        horizontalBlock(ModBlocks.SINGLE_LEG_TABLE_SPRUCE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/single_leg_table_spruce")));

        horizontalBlock(ModBlocks.OAK_STUMP.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/oak_stump")));

        horizontalBlock(ModBlocks.JUNGLE_STUMP.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/jungle_stump")));

        horizontalBlock(ModBlocks.MANGROVE_STUMP.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/mangrove_stump")));

        horizontalBlock(ModBlocks.CHERRY_STUMP.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/cherry_stump")));

        horizontalBlock(ModBlocks.CRIMSON_STUMP.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/crimson_stump")));

        horizontalBlock(ModBlocks.WARPED_STUMP.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/warped_stump")));

        horizontalBlock(ModBlocks.DARK_OAK_STUMP.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/dark_oak_stump")));

        horizontalBlock(ModBlocks.ACACIA_STUMP.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/acacia_stump")));

        horizontalBlock(ModBlocks.SPRUCE_STUMP.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/spruce_stump")));





    }


    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
