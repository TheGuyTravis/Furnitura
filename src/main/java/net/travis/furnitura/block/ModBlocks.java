package net.travis.furnitura.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.travis.furnitura.FurnituraMod;
import net.travis.furnitura.block.custom.*;
import net.travis.furnitura.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, FurnituraMod.MOD_ID);

    public static final RegistryObject<Block> DRAWER = registerBlock("drawer",
            () -> new DrawerBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> OAK_TABLE = registerBlock("oak_table",
            () -> new OakTableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_EDGE = registerBlock("wooden_couch_edge",
            () -> new WoodenCouchEdgeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_END = registerBlock("wooden_couch_end",
            () -> new WoodenCouchEndBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_SINGLE = registerBlock("wooden_couch_single",
            () -> new WoodenCouchSingleBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_EDGE_RIGHT = registerBlock("wooden_couch_edge_right",
            () -> new WoodenCouchEdgeRightBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> COUCH_EXTENDORS = registerBlock("couch_extendors",
            () -> new CouchExtendorsBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> CUSSION_LOW = registerBlock("cussion_low",
            () -> new CussionLowBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_EDGE_LEFT_RED = registerBlock("wooden_couch_edge_left_red",
            () -> new WoodenCouchEdgeLeftRedBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> COUCH_SINGLE_RED = registerBlock("couch_single_red",
            () -> new CouchSingleRedBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> COUCH_EDGE_RIGHT_RED = registerBlock("couch_edge_right_red",
            () -> new CouchEdgeRightRedBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> MICROWAVE_BLOCK = registerBlock("microwave_block",
            () -> new MicrowaveBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> TOASTER = registerBlock("toaster",
            () -> new ToasterBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> LARGE_CHAIR_RIGHT = registerBlock("large_chair_right",
            () -> new LargeChairRightBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> SINGLE_CUSSION_BLACK = registerBlock("single_cussion_black",
            () -> new SingleCussionBlackBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> BLUE_PET_BED = registerBlock("blue_pet_bed",
            () -> new BluePetBedBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> LARGE_SINGLE_COUCH = registerBlock("large_single_couch",
            () -> new LargeSingleCouchBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> LARGE_CHAIR_LEFT = registerBlock("large_chair_left",
            () -> new LargeChairLeftBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> YELLOW_WOODEN_COUCH_END = registerBlock("yellow_wooden_couch_end",
            () -> new YellowWoodenCouchEndBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> YELLOW_WOODEN_COUCH_SINGLE = registerBlock("yellow_wooden_couch_single",
            () -> new YellowWoodenCouchSingleBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> YELLOW_WOODEN_COUCH_EDGE_RIGHT = registerBlock("yellow_wooden_couch_edge_right",
            () -> new YellowWoodenCouchEdgeRightBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> YELLOW_COUCH_EXTENDORS = registerBlock("yellow_couch_extendors",
            () -> new YellowCouchExtendorsBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> TOAST = registerBlock("toast",
            () -> new ToastBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> OAK_CHAIR = registerBlock("oak_chair",
            () -> new OakChairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> JUNGLE_CHAIR = registerBlock("jungle_chair",
            () -> new JungleChairBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> MANGROVE_CHAIR = registerBlock("mangrove_chair",
            () -> new MangroveChairBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> CHERRY_CHAIR = registerBlock("cherry_chair",
            () -> new CherryChairBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> CRIMSON_CHAIR = registerBlock("crimson_chair",
            () -> new CrimsonChairBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WARPED_CHAIR = registerBlock("warped_chair",
            () -> new WarpedChairBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> DARK_OAK_CHAIR = registerBlock("dark_oak_chair",
            () -> new DarkOakChairBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> ACACIA_CHAIR = registerBlock("acacia_chair",
            () -> new AcaciaChairBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> OAK_SHELF = registerBlock("oak_shelf",
            () -> new OakShelfBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> OAK_SHELF_EXTENDERS = registerBlock("oak_shelf_extenders",
            () -> new OakShelfExtendersBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> SPRUCE_CHAIR = registerBlock("spruce_chair",
            () -> new SpruceChairBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> JUNGLE_SHELF = registerBlock("jungle_shelf",
            () -> new JungleShelfBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> JUNGLE_SHELF_EXTENDERS = registerBlock("jungle_shelf_extenders",
            () -> new JungleShelfExtendersBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> MANGROVE_SHELF = registerBlock("mangrove_shelf",
            () -> new MangroveShelfBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> MANGROVE_SHELF_EXTENDERS = registerBlock("mangrove_shelf_extenders",
            () -> new MangroveShelfExtendersBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> CHERRY_SHELF = registerBlock("cherry_shelf",
            () -> new CherryShelfBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> CHERRY_SHELF_EXTENDERS = registerBlock("cherry_shelf_extenders",
            () -> new CherryShelfExtendersBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> CRIMSON_SHELF = registerBlock("crimson_shelf",
            () -> new CrimsonShelfBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> CRIMSON_SHELF_EXTENDERS = registerBlock("crimson_shelf_extenders",
            () -> new CrimsonShelfExtendersBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WARPED_SHELF = registerBlock("warped_shelf",
            () -> new WarpedShelfBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WARPED_SHELF_EXTENDERS = registerBlock("warped_shelf_extenders",
            () -> new WarpedShelfExtendersBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> DARK_OAK_SHELF = registerBlock("dark_oak_shelf",
            () -> new DarkOakShelfBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> DARK_OAK_SHELF_EXTENDERS = registerBlock("dark_oak_shelf_extenders",
            () -> new DarkOakShelfExtendersBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> ACACIA_SHELF = registerBlock("acacia_shelf",
            () -> new AcaciaShelfBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> ACACIA_SHELF_EXTENDERS = registerBlock("acacia_shelf_extenders",
            () -> new AcaciaShelfExtendersBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> SPRUCE_SHELF = registerBlock("spruce_shelf",
            () -> new SpruceShelfBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> SPRUCE_SHELF_EXTENDERS = registerBlock("spruce_shelf_extenders",
            () -> new SpruceShelfExtendersBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> OAK_CABINET = registerBlock("oak_cabinet",
            () -> new OakCabinetBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> JUNGLE_CABINET = registerBlock("jungle_cabinet",
            () -> new JungleCabinetBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> MANGROVE_CABINET = registerBlock("mangrove_cabinet",
            () -> new MangroveCabinetBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> CHERRY_CABINET = registerBlock("cherry_cabinet",
            () -> new CherryCabinetBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> CRIMSON_CABINET = registerBlock("crimson_cabinet",
            () -> new CrimsonCabinetBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WARPED_CABINET = registerBlock("warped_cabinet",
            () -> new WarpedCabinetBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> DARK_OAK_CABINET = registerBlock("dark_oak_cabinet",
            () -> new DarkOakCabinetBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> ACACIA_CABINET = registerBlock("acacia_cabinet",
            () -> new AcaciaCabinetBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> SPRUCE_CABINET = registerBlock("spruce_cabinet",
            () -> new SpruceCabinetBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_EDGE_BLUE = registerBlock("wooden_couch_edge_blue",
            () -> new WoodenCouchEdgeBlueBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_EDGE_BROWN = registerBlock("wooden_couch_edge_brown",
            () -> new WoodenCouchEdgeBrownBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_EDGE_CYAN = registerBlock("wooden_couch_edge_cyan",
            () -> new WoodenCouchEdgeCyanBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_EDGE_GRAY = registerBlock("wooden_couch_edge_gray",
            () -> new WoodenCouchEdgeGrayBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_EDGE_GREEN = registerBlock("wooden_couch_edge_green",
            () -> new WoodenCouchEdgeGreenBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_EDGE_LIGHT_BLUE = registerBlock("wooden_couch_edge_light_blue",
            () -> new WoodenCouchEdgeLightBlueBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_EDGE_LIGHT_GRAY = registerBlock("wooden_couch_edge_light_gray",
            () -> new WoodenCouchEdgeLightGrayBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_EDGE_LIME = registerBlock("wooden_couch_edge_lime",
            () -> new WoodenCouchEdgeLimeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_EDGE_ORANGE = registerBlock("wooden_couch_edge_orange",
            () -> new WoodenCouchEdgeOrangeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_EDGE_PINK = registerBlock("wooden_couch_edge_pink",
            () -> new WoodenCouchEdgePinkBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_EDGE_PURPLE = registerBlock("wooden_couch_edge_purple",
            () -> new WoodenCouchEdgePurpleBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_EDGE_RED = registerBlock("wooden_couch_edge_red",
            () -> new WoodenCouchEdgeRedBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_EDGE_WHITE = registerBlock("wooden_couch_edge_white",
            () -> new WoodenCouchEdgeWhiteBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_EDGE_YELLOW = registerBlock("wooden_couch_edge_yellow",
            () -> new WoodenCouchEdgeYellowBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_END_BLUE = registerBlock("wooden_couch_end_blue",
            () -> new WoodenCouchEndBlueBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_END_BROWN = registerBlock("wooden_couch_end_brown",
            () -> new WoodenCouchEndBrownBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_END_CYAN = registerBlock("wooden_couch_end_cyan",
            () -> new WoodenCouchEndCyanBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_END_GRAY = registerBlock("wooden_couch_end_gray",
            () -> new WoodenCouchEndGrayBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_END_GREEN = registerBlock("wooden_couch_end_green",
            () -> new WoodenCouchEndGreenBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_END_LIGHT_BLUE = registerBlock("wooden_couch_end_light_blue",
            () -> new WoodenCouchEndLightBlueBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_END_LIGHT_GRAY = registerBlock("wooden_couch_end_light_gray",
            () -> new WoodenCouchEndLightGrayBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_END_LIME = registerBlock("wooden_couch_end_lime",
            () -> new WoodenCouchEndLimeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_END_ORANGE = registerBlock("wooden_couch_end_orange",
            () -> new WoodenCouchEndOrangeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_END_PINK = registerBlock("wooden_couch_end_pink",
            () -> new WoodenCouchEndPinkBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_END_PURPLE = registerBlock("wooden_couch_end_purple",
            () -> new WoodenCouchEndPurpleBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_END_RED = registerBlock("wooden_couch_end_red",
            () -> new WoodenCouchEndRedBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_END_WHITE = registerBlock("wooden_couch_end_white",
            () -> new WoodenCouchEndWhiteBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_END_YELLOW = registerBlock("wooden_couch_end_yellow",
            () -> new WoodenCouchEndYellowBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_SINGLE_BLUE = registerBlock("wooden_couch_single_blue",
            () -> new WoodenCouchSingleBlueBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_SINGLE_BROWN = registerBlock("wooden_couch_single_brown",
            () -> new WoodenCouchSingleBrownBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_SINGLE_CYAN = registerBlock("wooden_couch_single_cyan",
            () -> new WoodenCouchSingleCyanBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_SINGLE_GRAY = registerBlock("wooden_couch_single_gray",
            () -> new WoodenCouchSingleGrayBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_SINGLE_GREEN = registerBlock("wooden_couch_single_green",
            () -> new WoodenCouchSingleGreenBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_SINGLE_LIGHT_BLUE = registerBlock("wooden_couch_single_light_blue",
            () -> new WoodenCouchSingleLightBlueBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_SINGLE_LIGHT_GRAY = registerBlock("wooden_couch_single_light_gray",
            () -> new WoodenCouchSingleLightGrayBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_SINGLE_LIME = registerBlock("wooden_couch_single_lime",
            () -> new WoodenCouchSingleLimeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_SINGLE_ORANGE = registerBlock("wooden_couch_single_orange",
            () -> new WoodenCouchSingleOrangeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_SINGLE_PINK = registerBlock("wooden_couch_single_pink",
            () -> new WoodenCouchSinglePinkBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_SINGLE_PURPLE = registerBlock("wooden_couch_single_purple",
            () -> new WoodenCouchSinglePurpleBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_SINGLE_RED = registerBlock("wooden_couch_single_red",
            () -> new WoodenCouchSingleRedBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_SINGLE_WHITE = registerBlock("wooden_couch_single_white",
            () -> new WoodenCouchSingleWhiteBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_SINGLE_YELLOW = registerBlock("wooden_couch_single_yellow",
            () -> new WoodenCouchSingleYellowBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_EDGE_RIGHT_BLUE = registerBlock("wooden_couch_edge_right_blue",
            () -> new WoodenCouchEdgeRightBlueBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_EDGE_RIGHT_BROWN = registerBlock("wooden_couch_edge_right_brown",
            () -> new WoodenCouchEdgeRightBrownBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_EDGE_RIGHT_CYAN = registerBlock("wooden_couch_edge_right_cyan",
            () -> new WoodenCouchEdgeRightCyanBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_EDGE_RIGHT_GRAY = registerBlock("wooden_couch_edge_right_gray",
            () -> new WoodenCouchEdgeRightGrayBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_EDGE_RIGHT_GREEN = registerBlock("wooden_couch_edge_right_green",
            () -> new WoodenCouchEdgeRightGreenBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_EDGE_RIGHT_LIGHT_BLUE = registerBlock("wooden_couch_edge_right_light_blue",
            () -> new WoodenCouchEdgeRightLightBlueBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_EDGE_RIGHT_LIGHT_GRAY = registerBlock("wooden_couch_edge_right_light_gray",
            () -> new WoodenCouchEdgeRightLightGrayBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_EDGE_RIGHT_LIME = registerBlock("wooden_couch_edge_right_lime",
            () -> new WoodenCouchEdgeRightLimeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_EDGE_RIGHT_ORANGE = registerBlock("wooden_couch_edge_right_orange",
            () -> new WoodenCouchEdgeRightOrangeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_EDGE_RIGHT_PINK = registerBlock("wooden_couch_edge_right_pink",
            () -> new WoodenCouchEdgeRightPinkBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_EDGE_RIGHT_PURPLE = registerBlock("wooden_couch_edge_right_purple",
            () -> new WoodenCouchEdgeRightPurpleBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_EDGE_RIGHT_RED = registerBlock("wooden_couch_edge_right_red",
            () -> new WoodenCouchEdgeRightRedBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_EDGE_RIGHT_WHITE = registerBlock("wooden_couch_edge_right_white",
            () -> new WoodenCouchEdgeRightWhiteBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WOODEN_COUCH_EDGE_RIGHT_YELLOW = registerBlock("wooden_couch_edge_right_yellow",
            () -> new WoodenCouchEdgeRightYellowBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> COUCH_EXTENDERS_BLUE = registerBlock("couch_extenders_blue",
            () -> new CouchExtendersBlueBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> COUCH_EXTENDERS_BROWN = registerBlock("couch_extenders_brown",
            () -> new CouchExtendersBrownBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> COUCH_EXTENDERS_CYAN = registerBlock("couch_extenders_cyan",
            () -> new CouchExtendersCyanBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> COUCH_EXTENDERS_GRAY = registerBlock("couch_extenders_gray",
            () -> new CouchExtendersGrayBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> COUCH_EXTENDERS_GREEN = registerBlock("couch_extenders_green",
            () -> new CouchExtendersGreenBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> COUCH_EXTENDERS_LIGHT_BLUE = registerBlock("couch_extenders_light_blue",
            () -> new CouchExtendersLightBlueBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> COUCH_EXTENDERS_LIGHT_GRAY = registerBlock("couch_extenders_light_gray",
            () -> new CouchExtendersLightGrayBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> COUCH_EXTENDERS_LIME = registerBlock("couch_extenders_lime",
            () -> new CouchExtendersLimeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> COUCH_EXTENDERS_ORANGE = registerBlock("couch_extenders_orange",
            () -> new CouchExtendersOrangeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> COUCH_EXTENDERS_PINK = registerBlock("couch_extenders_pink",
            () -> new CouchExtendersPinkBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> COUCH_EXTENDERS_PURPLE = registerBlock("couch_extenders_purple",
            () -> new CouchExtendersPurpleBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> COUCH_EXTENDERS_RED = registerBlock("couch_extenders_red",
            () -> new CouchExtendersRedBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> COUCH_EXTENDERS_WHITE = registerBlock("couch_extenders_white",
            () -> new CouchExtendersWhiteBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> COUCH_EXTENDERS_YELLOW = registerBlock("couch_extenders_yellow",
            () -> new CouchExtendersYellowBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> JUNGLE_TABLE = registerBlock("jungle_table",
            () -> new JungleTableBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> MANGROVE_TABLE = registerBlock("mangrove_table",
            () -> new MangroveTableBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> CHERRY_TABLE = registerBlock("cherry_table",
            () -> new CherryTableBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> WARPED_TABLE = registerBlock("warped_table",
            () -> new WarpedTableBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> CRIMSON_TABLE = registerBlock("crimson_table",
            () -> new CrimsonTableBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> DARK_OAK_TABLE = registerBlock("dark_oak_table",
            () -> new DarkOakTableBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> ACACIA_TABLE = registerBlock("acacia_table",
            () -> new AcaciaTableBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> SPRUCE_TABLE = registerBlock("spruce_table",
            () -> new SpruceTableBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> SINGLE_CUSHION_BLUE = registerBlock("single_cushion_blue",
            () -> new SingleCushionBlueBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> SINGLE_CUSHION_BROWN = registerBlock("single_cushion_brown",
            () -> new SingleCushionBrownBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> SINGLE_CUSHION_CYAN = registerBlock("single_cushion_cyan",
            () -> new SingleCushionCyanBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> SINGLE_CUSHION_GRAY = registerBlock("single_cushion_gray",
            () -> new SingleCushionGrayBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> SINGLE_CUSHION_GREEN = registerBlock("single_cushion_green",
            () -> new SingleCushionGreenBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> SINGLE_CUSHION_LIGHT_BLUE = registerBlock("single_cushion_light_blue",
            () -> new SingleCushionLightBlueBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> SINGLE_CUSHION_LIGHT_GRAY = registerBlock("single_cushion_light_gray",
            () -> new SingleCushionLightGrayBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> SINGLE_CUSHION_LIME = registerBlock("single_cushion_lime",
            () -> new SingleCushionLimeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> SINGLE_CUSHION_ORANGE = registerBlock("single_cushion_orange",
            () -> new SingleCushionOrangeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> SINGLE_CUSHION_PINK = registerBlock("single_cushion_pink",
            () -> new SingleCushionPinkBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> SINGLE_CUSHION_PURPLE = registerBlock("single_cushion_purple",
            () -> new SingleCushionPurpleBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> SINGLE_CUSHION_RED = registerBlock("single_cushion_red",
            () -> new SingleCushionRedBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> SINGLE_CUSHION_WHITE = registerBlock("single_cushion_white",
            () -> new SingleCushionWhiteBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> SINGLE_CUSHION_YELLOW = registerBlock("single_cushion_yellow",
            () -> new SingleCushionYellowBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> LARGE_COUCH_SINGLE_BLACK = registerBlock("large_couch_single_black",
            () -> new LargeCouchSingleBlackBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> SMALL_TABLE_OAK = registerBlock("small_table_oak",
            () -> new SmallTableOakBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> SMALL_TABLE_JUNGLE = registerBlock("small_table_jungle",
            () -> new SmallTableJungleBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> SMALL_TABLE_MANGROVE = registerBlock("small_table_mangrove",
            () -> new SmallTableMangroveBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> SMALL_TABLE_CHERRY = registerBlock("small_table_cherry",
            () -> new SmallTableCherryBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> SMALL_TABLE_CRIMSON = registerBlock("small_table_crimson",
            () -> new SmallTableCrimsonBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> SMALL_TABLE_WARPED = registerBlock("small_table_warped",
            () -> new SmallTableWarpedBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> SMALL_TABLE_DARK_OAK = registerBlock("small_table_dark_oak",
            () -> new SmallTableDarkOakBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> SMALL_TABLE_ACACIA = registerBlock("small_table_acacia",
            () -> new SmallTableAcaciaBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> SMALL_TABLE_SPRUCE = registerBlock("small_table_spruce",
            () -> new SmallTableSpruceBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).noOcclusion()));

    public static final RegistryObject<Block> MAILBOX = registerBlock("mailbox",
            () -> new MailboxBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));







    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
