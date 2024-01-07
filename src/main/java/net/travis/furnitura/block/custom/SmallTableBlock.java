package net.travis.furnitura.block.custom;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.travis.furnitura.block.FurnitureHorizontalBlock;
import net.travis.furnitura.util.VoxelShapeHelper;

import java.util.ArrayList;
import java.util.List;

public class SmallTableBlock extends FurnitureHorizontalBlock {
    public final ImmutableMap<BlockState, VoxelShape> SHAPES;

    public SmallTableBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.getStateDefinition().any().setValue(DIRECTION, Direction.SOUTH));
        SHAPES = this.generateShapes(this.getStateDefinition().getPossibleStates());
    }

    private ImmutableMap<BlockState, VoxelShape> generateShapes(ImmutableList<BlockState> states) {
        final VoxelShape[] SHAPE_ONE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 0, 1, 2, 2, 15), Direction.SOUTH));
        final VoxelShape[] SHAPE_TWO = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(14, 0, 1, 16, 2, 15), Direction.SOUTH));
        final VoxelShape[] SHAPE_THREE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 0, 0, 2, 8, 1), Direction.SOUTH));
        final VoxelShape[] SHAPE_FOUR = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(14, 0, 0, 16, 8, 1), Direction.SOUTH));
        final VoxelShape[] SHAPE_FIVE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 0, 15, 2, 8, 16), Direction.SOUTH));
        final VoxelShape[] SHAPE_SIX = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(14, 0, 15, 16, 8, 16), Direction.SOUTH));
        final VoxelShape[] SHAPE_SEVEN = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 8, 0, 16, 10, 16), Direction.SOUTH));

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
