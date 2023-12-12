package net.travis.furnitura.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.travis.furnitura.block.ModBlocks;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        this.dropSelf(ModBlocks.DRAWER.get());
        this.dropSelf(ModBlocks.OAK_TABLE.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_EDGE.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_END.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_SINGLE.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_EDGE_RIGHT.get());
        this.dropSelf(ModBlocks.COUCH_EXTENDORS.get());
        this.dropSelf(ModBlocks.CUSSION_LOW.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_EDGE_LEFT_RED.get());
        this.dropSelf(ModBlocks.COUCH_SINGLE_RED.get());
        this.dropSelf(ModBlocks.COUCH_EDGE_RIGHT_RED.get());
        this.dropSelf(ModBlocks.MICROWAVE_BLOCK.get());
        this.dropSelf(ModBlocks.TOASTER.get());
        this.dropSelf(ModBlocks.LARGE_CHAIR_RIGHT.get());
        this.dropSelf(ModBlocks.SINGLE_CUSSION_BLACK.get());
        this.dropSelf(ModBlocks.BLUE_PET_BED.get());
        this.dropSelf(ModBlocks.LARGE_SINGLE_COUCH.get());
        this.dropSelf(ModBlocks.LARGE_CHAIR_LEFT.get());
        this.dropSelf(ModBlocks.YELLOW_WOODEN_COUCH_END.get());
        this.dropSelf(ModBlocks.YELLOW_WOODEN_COUCH_SINGLE.get());
        this.dropSelf(ModBlocks.YELLOW_WOODEN_COUCH_EDGE_RIGHT.get());
        this.dropSelf(ModBlocks.YELLOW_COUCH_EXTENDORS.get());
        this.dropSelf(ModBlocks.TOAST.get());
        this.dropSelf(ModBlocks.OAK_CHAIR.get());
        this.dropSelf(ModBlocks.JUNGLE_CHAIR.get());
        this.dropSelf(ModBlocks.MANGROVE_CHAIR.get());
        this.dropSelf(ModBlocks.CHERRY_CHAIR.get());
        this.dropSelf(ModBlocks.CRIMSON_CHAIR.get());
        this.dropSelf(ModBlocks.WARPED_CHAIR.get());
        this.dropSelf(ModBlocks.DARK_OAK_CHAIR.get());
        this.dropSelf(ModBlocks.ACACIA_CHAIR.get());
        this.dropSelf(ModBlocks.OAK_SHELF.get());
        this.dropSelf(ModBlocks.OAK_SHELF_EXTENDERS.get());
        this.dropSelf(ModBlocks.SPRUCE_CHAIR.get());
        this.dropSelf(ModBlocks.JUNGLE_SHELF.get());
        this.dropSelf(ModBlocks.JUNGLE_SHELF_EXTENDERS.get());
        this.dropSelf(ModBlocks.MANGROVE_SHELF.get());
        this.dropSelf(ModBlocks.MANGROVE_SHELF_EXTENDERS.get());
        this.dropSelf(ModBlocks.CHERRY_SHELF.get());
        this.dropSelf(ModBlocks.CHERRY_SHELF_EXTENDERS.get());
        this.dropSelf(ModBlocks.CRIMSON_SHELF.get());
        this.dropSelf(ModBlocks.CRIMSON_SHELF_EXTENDERS.get());
        this.dropSelf(ModBlocks.WARPED_SHELF.get());
        this.dropSelf(ModBlocks.WARPED_SHELF_EXTENDERS.get());
        this.dropSelf(ModBlocks.DARK_OAK_SHELF.get());
        this.dropSelf(ModBlocks.DARK_OAK_SHELF_EXTENDERS.get());
        this.dropSelf(ModBlocks.ACACIA_SHELF.get());
        this.dropSelf(ModBlocks.ACACIA_SHELF_EXTENDERS.get());
        this.dropSelf(ModBlocks.SPRUCE_SHELF.get());
        this.dropSelf(ModBlocks.SPRUCE_SHELF_EXTENDERS.get());
        this.dropSelf(ModBlocks.OAK_CABINET.get());
        this.dropSelf(ModBlocks.JUNGLE_CABINET.get());
        this.dropSelf(ModBlocks.MANGROVE_CABINET.get());
        this.dropSelf(ModBlocks.CHERRY_CABINET.get());
        this.dropSelf(ModBlocks.CRIMSON_CABINET.get());
        this.dropSelf(ModBlocks.WARPED_CABINET.get());
        this.dropSelf(ModBlocks.DARK_OAK_CABINET.get());
        this.dropSelf(ModBlocks.ACACIA_CABINET.get());
        this.dropSelf(ModBlocks.SPRUCE_CABINET.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_EDGE_BLUE.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_EDGE_BROWN.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_EDGE_CYAN.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_EDGE_GRAY.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_EDGE_GREEN.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_EDGE_LIGHT_BLUE.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_EDGE_LIGHT_GRAY.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_EDGE_LIME.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_EDGE_ORANGE.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_EDGE_PINK.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_EDGE_PURPLE.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_EDGE_RED.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_EDGE_WHITE.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_EDGE_YELLOW.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_END_BLUE.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_END_BROWN.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_END_CYAN.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_END_GRAY.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_END_GREEN.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_END_LIGHT_BLUE.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_END_LIGHT_GRAY.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_END_LIME.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_END_ORANGE.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_END_PINK.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_END_PURPLE.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_END_RED.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_END_WHITE.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_END_YELLOW.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_SINGLE_BLUE.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_SINGLE_BROWN.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_SINGLE_CYAN.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_SINGLE_GRAY.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_SINGLE_GREEN.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_SINGLE_LIGHT_BLUE.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_SINGLE_LIGHT_GRAY.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_SINGLE_LIME.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_SINGLE_ORANGE.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_SINGLE_PINK.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_SINGLE_PURPLE.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_SINGLE_RED.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_SINGLE_WHITE.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_SINGLE_YELLOW.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_BLUE.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_BROWN.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_CYAN.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_GRAY.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_GREEN.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_LIGHT_BLUE.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_LIGHT_GRAY.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_LIME.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_ORANGE.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_PINK.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_PURPLE.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_RED.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_WHITE.get());
        this.dropSelf(ModBlocks.WOODEN_COUCH_EDGE_RIGHT_YELLOW.get());
        this.dropSelf(ModBlocks.COUCH_EXTENDERS_BLUE.get());
        this.dropSelf(ModBlocks.COUCH_EXTENDERS_BROWN.get());
        this.dropSelf(ModBlocks.COUCH_EXTENDERS_CYAN.get());
        this.dropSelf(ModBlocks.COUCH_EXTENDERS_GRAY.get());
        this.dropSelf(ModBlocks.COUCH_EXTENDERS_GREEN.get());
        this.dropSelf(ModBlocks.COUCH_EXTENDERS_LIGHT_BLUE.get());
        this.dropSelf(ModBlocks.COUCH_EXTENDERS_LIGHT_GRAY.get());
        this.dropSelf(ModBlocks.COUCH_EXTENDERS_LIME.get());
        this.dropSelf(ModBlocks.COUCH_EXTENDERS_ORANGE.get());
        this.dropSelf(ModBlocks.COUCH_EXTENDERS_PINK.get());
        this.dropSelf(ModBlocks.COUCH_EXTENDERS_PURPLE.get());
        this.dropSelf(ModBlocks.COUCH_EXTENDERS_RED.get());
        this.dropSelf(ModBlocks.COUCH_EXTENDERS_WHITE.get());
        this.dropSelf(ModBlocks.COUCH_EXTENDERS_YELLOW.get());
        this.dropSelf(ModBlocks.JUNGLE_TABLE.get());
        this.dropSelf(ModBlocks.MANGROVE_TABLE.get());
        this.dropSelf(ModBlocks.CHERRY_TABLE.get());
        this.dropSelf(ModBlocks.WARPED_TABLE.get());
        this.dropSelf(ModBlocks.CRIMSON_TABLE.get());
        this.dropSelf(ModBlocks.DARK_OAK_TABLE.get());
        this.dropSelf(ModBlocks.ACACIA_TABLE.get());
        this.dropSelf(ModBlocks.SPRUCE_TABLE.get());
        this.dropSelf(ModBlocks.SINGLE_CUSHION_BLUE.get());
        this.dropSelf(ModBlocks.SINGLE_CUSHION_BROWN.get());
        this.dropSelf(ModBlocks.SINGLE_CUSHION_CYAN.get());
        this.dropSelf(ModBlocks.SINGLE_CUSHION_GRAY.get());
        this.dropSelf(ModBlocks.SINGLE_CUSHION_GREEN.get());
        this.dropSelf(ModBlocks.SINGLE_CUSHION_LIGHT_BLUE.get());
        this.dropSelf(ModBlocks.SINGLE_CUSHION_LIGHT_GRAY.get());
        this.dropSelf(ModBlocks.SINGLE_CUSHION_LIME.get());
        this.dropSelf(ModBlocks.SINGLE_CUSHION_ORANGE.get());
        this.dropSelf(ModBlocks.SINGLE_CUSHION_PINK.get());
        this.dropSelf(ModBlocks.SINGLE_CUSHION_PURPLE.get());
        this.dropSelf(ModBlocks.SINGLE_CUSHION_RED.get());
        this.dropSelf(ModBlocks.SINGLE_CUSHION_WHITE.get());
        this.dropSelf(ModBlocks.SINGLE_CUSHION_YELLOW.get());

    }


    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
