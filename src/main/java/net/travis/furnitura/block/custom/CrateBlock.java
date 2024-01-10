package net.travis.furnitura.block.custom;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.travis.furnitura.block.FurnitureHorizontalBlock;
import net.travis.furnitura.util.VoxelShapeHelper;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CrateBlock extends FurnitureHorizontalBlock {
    public final ImmutableMap<BlockState, VoxelShape> SHAPES;

    public CrateBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.getStateDefinition().any().setValue(DIRECTION, Direction.SOUTH));
        SHAPES = this.generateShapes(this.getStateDefinition().getPossibleStates());
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return null;
    }

    private ImmutableMap<BlockState, VoxelShape> generateShapes(ImmutableList<BlockState> states) {
        final VoxelShape[] SHAPE_ONE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 1, 0.5, 2, 14, 1), Direction.SOUTH));
        final VoxelShape[] SHAPE_TWO = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(14, 1, 0.5, 16, 14, 1), Direction.SOUTH));
        final VoxelShape[] SHAPE_THREE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 1, 15, 2, 14, 15.5), Direction.SOUTH));
        final VoxelShape[] SHAPE_FOUR = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(14, 1, 15, 16, 14, 15.5), Direction.SOUTH));
        final VoxelShape[] SHAPE_FIVE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 15, 0, 16, 16, 1.5), Direction.SOUTH));
        final VoxelShape[] SHAPE_SIX = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 15, 14.5, 16, 16, 16), Direction.SOUTH));
        final VoxelShape[] SHAPE_SEVEN = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 0, 0.5, 16, 1, 15.5), Direction.SOUTH));
        final VoxelShape[] SHAPE_EIGHT = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 14, 0, 16, 15, 1), Direction.SOUTH));
        final VoxelShape[] SHAPE_NINE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 14, 15, 16, 15, 16), Direction.SOUTH));
        final VoxelShape[] SHAPE_TEN = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 15, 1.5, 2, 16, 14.5), Direction.SOUTH));
        final VoxelShape[] SHAPE_ELEVEN = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(14, 15, 1.5, 16, 16, 14.5), Direction.SOUTH));
        final VoxelShape[] SHAPE_TWELVE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(15, 14, 1, 16, 15, 15), Direction.SOUTH));
        final VoxelShape[] SHAPE_THIRTEEN = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 14, 1, 1, 15, 15), Direction.SOUTH));
        final VoxelShape[] SHAPE_FOURTEEN = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(15, 1, 14, 16, 14, 15), Direction.SOUTH));
        final VoxelShape[] SHAPE_FIFTEEN = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 1, 1, 1, 14, 2), Direction.SOUTH));
        final VoxelShape[] SHAPE_SIXTEEN = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 1, 14, 1, 14, 15), Direction.SOUTH));
        final VoxelShape[] SHAPE_SEVENTEEN = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(15, 1, 1, 16, 14, 2), Direction.SOUTH));
        final VoxelShape[] SHAPE_TWENTY_TWO = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(1, 1, 1, 15, 15, 15), Direction.SOUTH));

        ImmutableMap.Builder<BlockState, VoxelShape> builder = new ImmutableMap.Builder<>();
        for (BlockState state : states) {
            Direction direction = state.getValue(DIRECTION);
            List<VoxelShape> shapes = new ArrayList<>();
            shapes.add(SHAPE_ONE[direction.get2DDataValue()]);
            shapes.add(SHAPE_TWO[direction.get2DDataValue()]);
            shapes.add(SHAPE_THREE[direction.get2DDataValue()]);
            shapes.add(SHAPE_FOUR[direction.get2DDataValue()]);
            shapes.add(SHAPE_FIVE[direction.get2DDataValue()]);
            shapes.add(SHAPE_SIX[direction.get2DDataValue()]);
            shapes.add(SHAPE_SEVEN[direction.get2DDataValue()]);
            shapes.add(SHAPE_EIGHT[direction.get2DDataValue()]);
            shapes.add(SHAPE_NINE[direction.get2DDataValue()]);
            shapes.add(SHAPE_TEN[direction.get2DDataValue()]);
            shapes.add(SHAPE_ELEVEN[direction.get2DDataValue()]);
            shapes.add(SHAPE_TWELVE[direction.get2DDataValue()]);
            shapes.add(SHAPE_THIRTEEN[direction.get2DDataValue()]);
            shapes.add(SHAPE_FOURTEEN[direction.get2DDataValue()]);
            shapes.add(SHAPE_FIFTEEN[direction.get2DDataValue()]);
            shapes.add(SHAPE_SIXTEEN[direction.get2DDataValue()]);
            shapes.add(SHAPE_SEVENTEEN[direction.get2DDataValue()]);
            shapes.add(SHAPE_TWENTY_TWO[direction.get2DDataValue()]);
            builder.put(state, VoxelShapeHelper.combineAll(shapes));
        }
        return builder.build();
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter reader, BlockPos pos, CollisionContext context) {
        return SHAPES.get(state);
    }

    @Override
    public VoxelShape getOcclusionShape(BlockState state, BlockGetter reader, BlockPos pos) {
        return SHAPES.get(state);
    }
}
