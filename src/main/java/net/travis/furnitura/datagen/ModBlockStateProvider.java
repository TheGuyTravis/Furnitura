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
        blockWithItem(ModBlocks.TILE_BLOCK);

        horizontalBlock(ModBlocks.DRAWER.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/drawer")));

        horizontalBlock(ModBlocks.OAK_TABLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/oak_table")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_EDGE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_edge")));

        horizontalBlock(ModBlocks.WOODEN_COUCH_END.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/wooden_couch_end")));
    }


    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
