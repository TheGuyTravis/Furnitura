package net.travis.furnitura.datagen;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.travis.furnitura.block.ModBlocks;
import net.travis.furnitura.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TILE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.TILE.get())
                .unlockedBy("has_tile", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TILE.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TILE.get())
                .requires(ModBlocks.TILE_BLOCK.get())
                .unlockedBy("has_tile_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.TILE_BLOCK.get()).build()))
                .save(pWriter);
    }
}
