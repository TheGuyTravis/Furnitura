package net.travis.furnitura.datagen;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.travis.furnitura.block.ModBlocks;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ACACIA_CABINET.get())
                .pattern("ABA")
                .pattern("ACA")
                .pattern("ABA")
                .define('A', Items.ACACIA_LOG)
                .define('B', Items.ACACIA_PLANKS)
                .define('C', Items.ACACIA_SLAB)
                .unlockedBy("has_acacia_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.ACACIA_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ACACIA_CHAIR.get())
                .pattern("B  ")
                .pattern("BC ")
                .pattern("AAA")
                .define('A', Items.ACACIA_LOG)
                .define('B', Items.ACACIA_PLANKS)
                .define('C', Items.ACACIA_SLAB)
                .unlockedBy("has_acacia_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.ACACIA_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ACACIA_SHELF.get())
                .pattern("BBB")
                .pattern("BBA")
                .pattern("BBB")
                .define('A', Items.ACACIA_LOG)
                .define('B', Items.ACACIA_PLANKS)
                .unlockedBy("has_acacia_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.ACACIA_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ACACIA_SHELF_EXTENDERS.get())
                .pattern("BBB")
                .pattern("BB ")
                .pattern("BBB")
                .define('B', Items.ACACIA_PLANKS)
                .unlockedBy("has_acacia_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.ACACIA_PLANKS).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLUE_PET_BED.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', Items.OAK_PLANKS)
                .define('B', Items.BLUE_WOOL)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHERRY_CABINET.get())
                .pattern("ABA")
                .pattern("ACA")
                .pattern("ABA")
                .define('A', Items.CHERRY_LOG)
                .define('B', Items.CHERRY_PLANKS)
                .define('C', Items.CHERRY_SLAB)
                .unlockedBy("has_cherry_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.CHERRY_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHERRY_CHAIR.get())
                .pattern("B  ")
                .pattern("BC ")
                .pattern("AAA")
                .define('A', Items.CHERRY_LOG)
                .define('B', Items.CHERRY_PLANKS)
                .define('C', Items.CHERRY_SLAB)
                .unlockedBy("has_cherry_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.CHERRY_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHERRY_SHELF.get())
                .pattern("BBB")
                .pattern("BBA")
                .pattern("BBB")
                .define('A', Items.CHERRY_LOG)
                .define('B', Items.CHERRY_PLANKS)
                .unlockedBy("has_cherry_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.CHERRY_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHERRY_SHELF_EXTENDERS.get())
                .pattern("BBB")
                .pattern("BB ")
                .pattern("BBB")
                .define('B', Items.CHERRY_PLANKS)
                .unlockedBy("has_cherry_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.CHERRY_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COUCH_EDGE_RIGHT_RED.get())
                .pattern("  B")
                .pattern("CCC")
                .pattern("DDD")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.RED_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COUCH_EXTENDERS_BLUE.get())
                .pattern("   ")
                .pattern("CCC")
                .pattern("DDD")
                .define('C', Items.BLUE_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COUCH_EXTENDERS_BROWN.get())
                .pattern("   ")
                .pattern("CCC")
                .pattern("DDD")
                .define('C', Items.BROWN_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COUCH_EXTENDERS_CYAN.get())
                .pattern("   ")
                .pattern("CCC")
                .pattern("DDD")
                .define('C', Items.CYAN_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COUCH_EXTENDERS_GRAY.get())
                .pattern("   ")
                .pattern("CCC")
                .pattern("DDD")
                .define('C', Items.GRAY_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COUCH_EXTENDERS_GREEN.get())
                .pattern("   ")
                .pattern("CCC")
                .pattern("DDD")
                .define('C', Items.GREEN_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COUCH_EXTENDERS_LIGHT_BLUE.get())
                .pattern("   ")
                .pattern("CCC")
                .pattern("DDD")
                .define('C', Items.LIGHT_BLUE_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COUCH_EXTENDERS_LIGHT_GRAY.get())
                .pattern("   ")
                .pattern("CCC")
                .pattern("DDD")
                .define('C', Items.LIGHT_GRAY_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COUCH_EXTENDERS_LIME.get())
                .pattern("   ")
                .pattern("CCC")
                .pattern("DDD")
                .define('C', Items.LIME_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COUCH_EXTENDERS_ORANGE.get())
                .pattern("   ")
                .pattern("CCC")
                .pattern("DDD")
                .define('C', Items.ORANGE_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COUCH_EXTENDERS_PINK.get())
                .pattern("   ")
                .pattern("CCC")
                .pattern("DDD")
                .define('C', Items.PINK_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COUCH_EXTENDERS_PURPLE.get())
                .pattern("   ")
                .pattern("CCC")
                .pattern("DDD")
                .define('C', Items.PURPLE_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COUCH_EXTENDERS_RED.get())
                .pattern("   ")
                .pattern("CCC")
                .pattern("DDD")
                .define('C', Items.RED_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COUCH_EXTENDERS_WHITE.get())
                .pattern("   ")
                .pattern("CCC")
                .pattern("DDD")
                .define('C', Items.WHITE_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COUCH_EXTENDERS_YELLOW.get())
                .pattern("   ")
                .pattern("CCC")
                .pattern("DDD")
                .define('C', Items.YELLOW_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COUCH_EXTENDORS.get())
                .pattern("   ")
                .pattern("CCC")
                .pattern("DDD")
                .define('C', Items.BLACK_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COUCH_SINGLE_RED.get())
                .pattern("A A")
                .pattern("CCC")
                .pattern("DDD")
                .define('C', Items.RED_WOOL)
                .define('D', Items.OAK_LOG)
                .define('A', Items.OAK_PLANKS)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CRIMSON_CABINET.get())
                .pattern("ABA")
                .pattern("ACA")
                .pattern("ABA")
                .define('A', Items.CRIMSON_STEM)
                .define('B', Items.CRIMSON_PLANKS)
                .define('C', Items.CRIMSON_SLAB)
                .unlockedBy("has_crimson_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.CRIMSON_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CRIMSON_CHAIR.get())
                .pattern("B  ")
                .pattern("BC ")
                .pattern("AAA")
                .define('A', Items.CRIMSON_STEM)
                .define('B', Items.CRIMSON_PLANKS)
                .define('C', Items.CRIMSON_SLAB)
                .unlockedBy("has_crimson_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.CRIMSON_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CRIMSON_SHELF.get())
                .pattern("BBB")
                .pattern("BBA")
                .pattern("BBB")
                .define('A', Items.CRIMSON_STEM)
                .define('B', Items.CRIMSON_PLANKS)
                .unlockedBy("has_crimson_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.CRIMSON_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CRIMSON_SHELF_EXTENDERS.get())
                .pattern("BBB")
                .pattern("BB ")
                .pattern("BBB")
                .define('B', Items.CRIMSON_PLANKS)
                .unlockedBy("has_crimson_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.CRIMSON_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CUSSION_LOW.get())
                .pattern("   ")
                .pattern(" B ")
                .pattern(" A ")
                .define('A', Items.OAK_PLANKS)
                .define('B', Items.BLACK_WOOL)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DARK_OAK_CABINET.get())
                .pattern("ABA")
                .pattern("ACA")
                .pattern("ABA")
                .define('A', Items.DARK_OAK_LOG)
                .define('B', Items.DARK_OAK_PLANKS)
                .define('C', Items.DARK_OAK_SLAB)
                .unlockedBy("has_dark_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.DARK_OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DARK_OAK_CHAIR.get())
                .pattern("B  ")
                .pattern("BC ")
                .pattern("AAA")
                .define('A', Items.DARK_OAK_LOG)
                .define('B', Items.DARK_OAK_PLANKS)
                .define('C', Items.DARK_OAK_SLAB)
                .unlockedBy("has_dark_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.DARK_OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DARK_OAK_SHELF.get())
                .pattern("BBB")
                .pattern("BBA")
                .pattern("BBB")
                .define('A', Items.DARK_OAK_LOG)
                .define('B', Items.DARK_OAK_PLANKS)
                .unlockedBy("has_dark_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.DARK_OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DARK_OAK_SHELF_EXTENDERS.get())
                .pattern("BBB")
                .pattern("BB ")
                .pattern("BBB")
                .define('B', Items.DARK_OAK_PLANKS)
                .unlockedBy("has_dark_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.DARK_OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DRAWER.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', Items.OAK_BUTTON)
                .define('B', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JUNGLE_CABINET.get())
                .pattern("ABA")
                .pattern("ACA")
                .pattern("ABA")
                .define('A', Items.JUNGLE_LOG)
                .define('B', Items.JUNGLE_PLANKS)
                .define('C', Items.JUNGLE_SLAB)
                .unlockedBy("has_jungle_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.JUNGLE_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JUNGLE_CHAIR.get())
                .pattern("B  ")
                .pattern("BC ")
                .pattern("AAA")
                .define('A', Items.JUNGLE_LOG)
                .define('B', Items.JUNGLE_PLANKS)
                .define('C', Items.JUNGLE_SLAB)
                .unlockedBy("has_jungle_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.JUNGLE_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JUNGLE_SHELF.get())
                .pattern("BBB")
                .pattern("BBA")
                .pattern("BBB")
                .define('A', Items.JUNGLE_LOG)
                .define('B', Items.JUNGLE_PLANKS)
                .unlockedBy("has_jungle_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.JUNGLE_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JUNGLE_SHELF_EXTENDERS.get())
                .pattern("BBB")
                .pattern("BB ")
                .pattern("BBB")
                .define('B', Items.JUNGLE_PLANKS)
                .unlockedBy("has_jungle_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.JUNGLE_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MANGROVE_CABINET.get())
                .pattern("ABA")
                .pattern("ACA")
                .pattern("ABA")
                .define('A', Items.MANGROVE_LOG)
                .define('B', Items.MANGROVE_PLANKS)
                .define('C', Items.MANGROVE_SLAB)
                .unlockedBy("has_mangrove_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.MANGROVE_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MANGROVE_CHAIR.get())
                .pattern("B  ")
                .pattern("BC ")
                .pattern("AAA")
                .define('A', Items.MANGROVE_LOG)
                .define('B', Items.MANGROVE_PLANKS)
                .define('C', Items.MANGROVE_SLAB)
                .unlockedBy("has_mangrove_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.MANGROVE_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MANGROVE_SHELF.get())
                .pattern("BBB")
                .pattern("BBA")
                .pattern("BBB")
                .define('A', Items.MANGROVE_LOG)
                .define('B', Items.MANGROVE_PLANKS)
                .unlockedBy("has_mangrove_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.MANGROVE_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MANGROVE_SHELF_EXTENDERS.get())
                .pattern("BBB")
                .pattern("BB ")
                .pattern("BBB")
                .define('B', Items.MANGROVE_PLANKS)
                .unlockedBy("has_mangrove_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.MANGROVE_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MICROWAVE_BLOCK.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', Items.GLASS_PANE)
                .define('B', Items.IRON_BLOCK)
                .unlockedBy("has_iron_blocks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_BLOCK).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.OAK_CABINET.get())
                .pattern("ABA")
                .pattern("ACA")
                .pattern("ABA")
                .define('A', Items.OAK_LOG)
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.OAK_SLAB)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.OAK_CHAIR.get())
                .pattern("B  ")
                .pattern("BC ")
                .pattern("AAA")
                .define('A', Items.OAK_LOG)
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.OAK_SLAB)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.OAK_SHELF.get())
                .pattern("BBB")
                .pattern("BBA")
                .pattern("BBB")
                .define('A', Items.OAK_LOG)
                .define('B', Items.OAK_PLANKS)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.OAK_SHELF_EXTENDERS.get())
                .pattern("BBB")
                .pattern("BB ")
                .pattern("BBB")
                .define('B', Items.OAK_PLANKS)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.OAK_TABLE.get())
                .pattern("BBB")
                .pattern("A A")
                .pattern("A A")
                .define('A', Items.STICK)
                .define('B', Items.OAK_PLANKS)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SPRUCE_CABINET.get())
                .pattern("ABA")
                .pattern("ACA")
                .pattern("ABA")
                .define('A', Items.SPRUCE_LOG)
                .define('B', Items.SPRUCE_PLANKS)
                .define('C', Items.SPRUCE_SLAB)
                .unlockedBy("has_spruce_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SPRUCE_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SPRUCE_CHAIR.get())
                .pattern("B  ")
                .pattern("BC ")
                .pattern("AAA")
                .define('A', Items.SPRUCE_LOG)
                .define('B', Items.SPRUCE_PLANKS)
                .define('C', Items.SPRUCE_SLAB)
                .unlockedBy("has_spruce_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SPRUCE_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SPRUCE_SHELF.get())
                .pattern("BBB")
                .pattern("BBA")
                .pattern("BBB")
                .define('A', Items.SPRUCE_LOG)
                .define('B', Items.SPRUCE_PLANKS)
                .unlockedBy("has_spruce_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SPRUCE_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SPRUCE_SHELF_EXTENDERS.get())
                .pattern("BBB")
                .pattern("BB ")
                .pattern("BBB")
                .define('B', Items.SPRUCE_PLANKS)
                .unlockedBy("has_spruce_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SPRUCE_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TOAST.get())
                .pattern("ABA")
                .pattern("ABA")
                .pattern("ABA")
                .define('A', Items.IRON_BLOCK)
                .define('B', Items.MAGMA_BLOCK)
                .unlockedBy("has_iron_blocks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_BLOCK).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TOASTER.get())
                .pattern("ABA")
                .pattern("ABA")
                .pattern("ABA")
                .define('A', Items.IRON_BLOCK)
                .define('B', Items.MAGMA_BLOCK)
                .unlockedBy("has_iron_blocks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_BLOCK).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WARPED_CABINET.get())
                .pattern("ABA")
                .pattern("ACA")
                .pattern("ABA")
                .define('A', Items.WARPED_STEM)
                .define('B', Items.WARPED_PLANKS)
                .define('C', Items.WARPED_SLAB)
                .unlockedBy("has_warped_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.WARPED_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WARPED_CHAIR.get())
                .pattern("B  ")
                .pattern("BC ")
                .pattern("AAA")
                .define('A', Items.WARPED_STEM)
                .define('B', Items.WARPED_PLANKS)
                .define('C', Items.WARPED_SLAB)
                .unlockedBy("has_warped_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.WARPED_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WARPED_SHELF.get())
                .pattern("BBB")
                .pattern("BBA")
                .pattern("BBB")
                .define('A', Items.WARPED_STEM)
                .define('B', Items.WARPED_PLANKS)
                .unlockedBy("has_warped_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.WARPED_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WARPED_SHELF_EXTENDERS.get())
                .pattern("BBB")
                .pattern("BB ")
                .pattern("BBB")
                .define('B', Items.WARPED_PLANKS)
                .unlockedBy("has_warped_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.WARPED_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_EDGE.get())
                .pattern("BB ")
                .pattern("BA ")
                .pattern("   ")
                .define('A', Items.BLACK_WOOL)
                .define('B', Items.OAK_PLANKS)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_EDGE_BLUE.get())
                .pattern("BB ")
                .pattern("BA ")
                .pattern("   ")
                .define('A', Items.BLUE_WOOL)
                .define('B', Items.OAK_PLANKS)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_EDGE_BROWN.get())
                .pattern("BB ")
                .pattern("BA ")
                .pattern("   ")
                .define('A', Items.BROWN_WOOL)
                .define('B', Items.OAK_PLANKS)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_EDGE_CYAN.get())
                .pattern("BB ")
                .pattern("BA ")
                .pattern("   ")
                .define('A', Items.CYAN_WOOL)
                .define('B', Items.OAK_PLANKS)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_EDGE_GRAY.get())
                .pattern("BB ")
                .pattern("BA ")
                .pattern("   ")
                .define('A', Items.CYAN_WOOL)
                .define('B', Items.OAK_PLANKS)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_EDGE_GREEN.get())
                .pattern("BB ")
                .pattern("BA ")
                .pattern("   ")
                .define('A', Items.GREEN_WOOL)
                .define('B', Items.OAK_PLANKS)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_EDGE_LEFT_RED.get())
                .pattern("B  ")
                .pattern("AAA")
                .pattern("CCC")
                .define('A', Items.RED_WOOL)
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_EDGE_LIGHT_BLUE.get())
                .pattern("BB ")
                .pattern("BC ")
                .pattern("   ")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.LIGHT_BLUE_WOOL)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_EDGE_LIGHT_GRAY.get())
                .pattern("BB ")
                .pattern("BC ")
                .pattern("   ")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.LIGHT_GRAY_WOOL)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_EDGE_LIME.get())
                .pattern("BB ")
                .pattern("BC ")
                .pattern("   ")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.LIME_WOOL)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_EDGE_ORANGE.get())
                .pattern("BB ")
                .pattern("BC ")
                .pattern("   ")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.ORANGE_WOOL)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_EDGE_PINK.get())
                .pattern("BB ")
                .pattern("BC ")
                .pattern("   ")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.PINK_WOOL)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_EDGE_PURPLE.get())
                .pattern("BB ")
                .pattern("BC ")
                .pattern("   ")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.PURPLE_WOOL)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_EDGE_RED.get())
                .pattern("BB ")
                .pattern("BC ")
                .pattern("   ")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.RED_WOOL)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_EDGE_RIGHT.get())
                .pattern("  B")
                .pattern("AAA")
                .pattern("CCC")
                .define('A', Items.BLACK_WOOL)
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_EDGE_RIGHT_BLUE.get())
                .pattern("  B")
                .pattern("AAA")
                .pattern("CCC")
                .define('A', Items.BLUE_WOOL)
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_EDGE_RIGHT_BROWN.get())
                .pattern("  B")
                .pattern("AAA")
                .pattern("CCC")
                .define('A', Items.BROWN_WOOL)
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_EDGE_RIGHT_CYAN.get())
                .pattern("  B")
                .pattern("AAA")
                .pattern("CCC")
                .define('A', Items.CYAN_WOOL)
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_EDGE_RIGHT_GRAY.get())
                .pattern("  B")
                .pattern("AAA")
                .pattern("CCC")
                .define('A', Items.GRAY_WOOL)
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_EDGE_RIGHT_GREEN.get())
                .pattern("  B")
                .pattern("AAA")
                .pattern("CCC")
                .define('A', Items.GREEN_WOOL)
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_EDGE_RIGHT_LIGHT_BLUE.get())
                .pattern("  B")
                .pattern("AAA")
                .pattern("CCC")
                .define('A', Items.LIGHT_BLUE_WOOL)
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_EDGE_RIGHT_LIGHT_GRAY.get())
                .pattern("  B")
                .pattern("AAA")
                .pattern("CCC")
                .define('A', Items.LIGHT_GRAY_WOOL)
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_EDGE_RIGHT_LIME.get())
                .pattern("  B")
                .pattern("AAA")
                .pattern("CCC")
                .define('A', Items.LIME_WOOL)
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_EDGE_RIGHT_ORANGE.get())
                .pattern("  B")
                .pattern("AAA")
                .pattern("CCC")
                .define('A', Items.ORANGE_WOOL)
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_EDGE_RIGHT_PINK.get())
                .pattern("  B")
                .pattern("AAA")
                .pattern("CCC")
                .define('A', Items.PINK_WOOL)
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_EDGE_RIGHT_PURPLE.get())
                .pattern("  B")
                .pattern("AAA")
                .pattern("CCC")
                .define('A', Items.PURPLE_WOOL)
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_EDGE_RIGHT_RED.get())
                .pattern("  B")
                .pattern("AAA")
                .pattern("CCC")
                .define('A', Items.RED_WOOL)
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_EDGE_RIGHT_WHITE.get())
                .pattern("  B")
                .pattern("AAA")
                .pattern("CCC")
                .define('A', Items.WHITE_WOOL)
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_EDGE_RIGHT_YELLOW.get())
                .pattern("  B")
                .pattern("AAA")
                .pattern("CCC")
                .define('A', Items.YELLOW_WOOL)
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_EDGE_WHITE.get())
                .pattern("BB ")
                .pattern("BC ")
                .pattern("   ")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.WHITE_WOOL)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_EDGE_YELLOW.get())
                .pattern("BB ")
                .pattern("BC ")
                .pattern("   ")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.YELLOW_WOOL)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_END.get())
                .pattern("B  ")
                .pattern("CCC")
                .pattern("DDD")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.BLACK_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_END_BLUE.get())
                .pattern("B  ")
                .pattern("CCC")
                .pattern("DDD")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.BLUE_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_END_BROWN.get())
                .pattern("B  ")
                .pattern("CCC")
                .pattern("DDD")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.BROWN_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_END_CYAN.get())
                .pattern("B  ")
                .pattern("CCC")
                .pattern("DDD")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.CYAN_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_END_GRAY.get())
                .pattern("B  ")
                .pattern("CCC")
                .pattern("DDD")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.GRAY_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_END_GREEN.get())
                .pattern("B  ")
                .pattern("CCC")
                .pattern("DDD")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.GREEN_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_END_LIGHT_BLUE.get())
                .pattern("B  ")
                .pattern("CCC")
                .pattern("DDD")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.LIGHT_BLUE_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_END_LIGHT_GRAY.get())
                .pattern("B  ")
                .pattern("CCC")
                .pattern("DDD")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.LIGHT_GRAY_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_END_LIME.get())
                .pattern("B  ")
                .pattern("CCC")
                .pattern("DDD")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.LIME_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_END_ORANGE.get())
                .pattern("B  ")
                .pattern("CCC")
                .pattern("DDD")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.ORANGE_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_END_PINK.get())
                .pattern("B  ")
                .pattern("CCC")
                .pattern("DDD")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.PINK_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_END_PURPLE.get())
                .pattern("B  ")
                .pattern("CCC")
                .pattern("DDD")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.PURPLE_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_END_RED.get())
                .pattern("B  ")
                .pattern("CCC")
                .pattern("DDD")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.RED_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_END_WHITE.get())
                .pattern("B  ")
                .pattern("CCC")
                .pattern("DDD")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.WHITE_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_END_YELLOW.get())
                .pattern("B  ")
                .pattern("CCC")
                .pattern("DDD")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.YELLOW_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_SINGLE.get())
                .pattern("B B")
                .pattern("CCC")
                .pattern("DDD")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.BLACK_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_SINGLE_BLUE.get())
                .pattern("B B")
                .pattern("CCC")
                .pattern("DDD")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.BLUE_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_SINGLE_BROWN.get())
                .pattern("B B")
                .pattern("CCC")
                .pattern("DDD")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.BROWN_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_SINGLE_CYAN.get())
                .pattern("B B")
                .pattern("CCC")
                .pattern("DDD")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.CYAN_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_SINGLE_GRAY.get())
                .pattern("B B")
                .pattern("CCC")
                .pattern("DDD")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.GRAY_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_SINGLE_GREEN.get())
                .pattern("B B")
                .pattern("CCC")
                .pattern("DDD")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.GREEN_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_SINGLE_LIGHT_BLUE.get())
                .pattern("B B")
                .pattern("CCC")
                .pattern("DDD")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.LIGHT_BLUE_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_SINGLE_LIGHT_GRAY.get())
                .pattern("B B")
                .pattern("CCC")
                .pattern("DDD")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.LIGHT_GRAY_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_SINGLE_LIME.get())
                .pattern("B B")
                .pattern("CCC")
                .pattern("DDD")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.LIME_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_SINGLE_ORANGE.get())
                .pattern("B B")
                .pattern("CCC")
                .pattern("DDD")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.ORANGE_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_SINGLE_PINK.get())
                .pattern("B B")
                .pattern("CCC")
                .pattern("DDD")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.PINK_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_SINGLE_PURPLE.get())
                .pattern("B B")
                .pattern("CCC")
                .pattern("DDD")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.PURPLE_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_SINGLE_RED.get())
                .pattern("B B")
                .pattern("CCC")
                .pattern("DDD")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.RED_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_SINGLE_WHITE.get())
                .pattern("B B")
                .pattern("CCC")
                .pattern("DDD")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.WHITE_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODEN_COUCH_SINGLE_YELLOW.get())
                .pattern("B B")
                .pattern("CCC")
                .pattern("DDD")
                .define('B', Items.OAK_PLANKS)
                .define('C', Items.YELLOW_WOOL)
                .define('D', Items.OAK_LOG)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JUNGLE_TABLE.get())
                .pattern("BBB")
                .pattern("A A")
                .pattern("A A")
                .define('A', Items.STICK)
                .define('B', Items.JUNGLE_PLANKS)
                .unlockedBy("has_jungle_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.JUNGLE_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MANGROVE_TABLE.get())
                .pattern("BBB")
                .pattern("A A")
                .pattern("A A")
                .define('A', Items.STICK)
                .define('B', Items.MANGROVE_PLANKS)
                .unlockedBy("has_mangrove_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.MANGROVE_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHERRY_TABLE.get())
                .pattern("BBB")
                .pattern("A A")
                .pattern("A A")
                .define('A', Items.STICK)
                .define('B', Items.CHERRY_PLANKS)
                .unlockedBy("has_cherry_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.CHERRY_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WARPED_TABLE.get())
                .pattern("BBB")
                .pattern("A A")
                .pattern("A A")
                .define('A', Items.STICK)
                .define('B', Items.WARPED_PLANKS)
                .unlockedBy("has_warped_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.WARPED_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CRIMSON_TABLE.get())
                .pattern("BBB")
                .pattern("A A")
                .pattern("A A")
                .define('A', Items.STICK)
                .define('B', Items.CRIMSON_PLANKS)
                .unlockedBy("has_crimson_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.CRIMSON_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DARK_OAK_TABLE.get())
                .pattern("BBB")
                .pattern("A A")
                .pattern("A A")
                .define('A', Items.STICK)
                .define('B', Items.DARK_OAK_PLANKS)
                .unlockedBy("has_dark_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.DARK_OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ACACIA_TABLE.get())
                .pattern("BBB")
                .pattern("A A")
                .pattern("A A")
                .define('A', Items.STICK)
                .define('B', Items.ACACIA_PLANKS)
                .unlockedBy("has_acacia_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.ACACIA_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SPRUCE_TABLE.get())
                .pattern("BBB")
                .pattern("A A")
                .pattern("A A")
                .define('A', Items.STICK)
                .define('B', Items.SPRUCE_PLANKS)
                .unlockedBy("has_spruce_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SPRUCE_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SINGLE_CUSSION_BLACK.get())
                .pattern("BBB")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.OAK_PLANKS)
                .define('B', Items.BLACK_WOOL)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SINGLE_CUSHION_BLUE.get())
                .pattern("BBB")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.OAK_PLANKS)
                .define('B', Items.BLUE_WOOL)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SINGLE_CUSHION_BROWN.get())
                .pattern("BBB")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.OAK_PLANKS)
                .define('B', Items.BROWN_WOOL)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SINGLE_CUSHION_CYAN.get())
                .pattern("BBB")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.OAK_PLANKS)
                .define('B', Items.CYAN_WOOL)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SINGLE_CUSHION_GRAY.get())
                .pattern("BBB")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.OAK_PLANKS)
                .define('B', Items.GRAY_WOOL)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SINGLE_CUSHION_GREEN.get())
                .pattern("BBB")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.OAK_PLANKS)
                .define('B', Items.GREEN_WOOL)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SINGLE_CUSHION_LIGHT_BLUE.get())
                .pattern("BBB")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.OAK_PLANKS)
                .define('B', Items.LIGHT_BLUE_WOOL)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SINGLE_CUSHION_LIGHT_GRAY.get())
                .pattern("BBB")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.OAK_PLANKS)
                .define('B', Items.LIGHT_GRAY_WOOL)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SINGLE_CUSHION_LIME.get())
                .pattern("BBB")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.OAK_PLANKS)
                .define('B', Items.LIME_WOOL)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SINGLE_CUSHION_ORANGE.get())
                .pattern("BBB")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.OAK_PLANKS)
                .define('B', Items.ORANGE_WOOL)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SINGLE_CUSHION_PINK.get())
                .pattern("BBB")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.OAK_PLANKS)
                .define('B', Items.PINK_WOOL)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SINGLE_CUSHION_PURPLE.get())
                .pattern("BBB")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.OAK_PLANKS)
                .define('B', Items.PURPLE_WOOL)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SINGLE_CUSHION_RED.get())
                .pattern("BBB")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.OAK_PLANKS)
                .define('B', Items.RED_WOOL)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SINGLE_CUSHION_WHITE.get())
                .pattern("BBB")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.OAK_PLANKS)
                .define('B', Items.WHITE_WOOL)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SINGLE_CUSHION_YELLOW.get())
                .pattern("BBB")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.OAK_PLANKS)
                .define('B', Items.YELLOW_WOOL)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LARGE_COUCH_SINGLE_BLACK.get())
                .pattern("C C")
                .pattern("BBB")
                .pattern("AAA")
                .define('A', Items.OAK_LOG)
                .define('B', Items.BLACK_WOOL)
                .define('C', Items.OAK_PLANKS)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SMALL_TABLE_OAK.get())
                .pattern("BBB")
                .pattern("A A")
                .pattern("A A")
                .define('A', Items.OAK_LOG)
                .define('B', Items.OAK_PLANKS)
                .unlockedBy("has_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SMALL_TABLE_JUNGLE.get())
                .pattern("BBB")
                .pattern("A A")
                .pattern("A A")
                .define('A', Items.JUNGLE_LOG)
                .define('B', Items.JUNGLE_PLANKS)
                .unlockedBy("has_jungle_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.JUNGLE_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SMALL_TABLE_MANGROVE.get())
                .pattern("BBB")
                .pattern("A A")
                .pattern("A A")
                .define('A', Items.MANGROVE_LOG)
                .define('B', Items.MANGROVE_PLANKS)
                .unlockedBy("has_mangrove_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.MANGROVE_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SMALL_TABLE_CHERRY.get())
                .pattern("BBB")
                .pattern("A A")
                .pattern("A A")
                .define('A', Items.CHERRY_LOG)
                .define('B', Items.CHERRY_PLANKS)
                .unlockedBy("has_cherry_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.CHERRY_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SMALL_TABLE_CRIMSON.get())
                .pattern("BBB")
                .pattern("A A")
                .pattern("A A")
                .define('A', Items.CRIMSON_STEM)
                .define('B', Items.CRIMSON_PLANKS)
                .unlockedBy("has_crimson_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.CRIMSON_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SMALL_TABLE_WARPED.get())
                .pattern("BBB")
                .pattern("A A")
                .pattern("A A")
                .define('A', Items.WARPED_STEM)
                .define('B', Items.WARPED_PLANKS)
                .unlockedBy("has_warped_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.WARPED_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SMALL_TABLE_DARK_OAK.get())
                .pattern("BBB")
                .pattern("A A")
                .pattern("A A")
                .define('A', Items.DARK_OAK_LOG)
                .define('B', Items.DARK_OAK_PLANKS)
                .unlockedBy("has_dark_oak_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.DARK_OAK_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SMALL_TABLE_ACACIA.get())
                .pattern("BBB")
                .pattern("A A")
                .pattern("A A")
                .define('A', Items.ACACIA_LOG)
                .define('B', Items.ACACIA_PLANKS)
                .unlockedBy("has_acacia_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.ACACIA_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SMALL_TABLE_SPRUCE.get())
                .pattern("BBB")
                .pattern("A A")
                .pattern("A A")
                .define('A', Items.SPRUCE_LOG)
                .define('B', Items.SPRUCE_PLANKS)
                .unlockedBy("has_spruce_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SPRUCE_PLANKS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAILBOX.get())
                .pattern(" B ")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', Items.STICK)
                .define('B', Items.CHEST)
                .unlockedBy("has_iron_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_BLOCK).build()))
                .save(pWriter);


    }
}
