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

public class ShelfBlock extends FurnitureHorizontalBlock {
    public final ImmutableMap<BlockState, VoxelShape> SHAPES;

    public ShelfBlock(Properties properties) {
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
        final VoxelShape[] SHAPE_ONE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 8, 1, 16, 9, 12), Direction.SOUTH));
        final VoxelShape[] SHAPE_TWO = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(6, 7, 12, 11, 9, 15), Direction.SOUTH));
        final VoxelShape[] SHAPE_THREE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(4, 7, 15, 13, 10, 16), Direction.SOUTH));

        ImmutableMap.Builder<BlockState, VoxelShape> builder = new ImmutableMap.Builder<>();
        for (BlockState state : states) {
            Direction direction = state.getValue(DIRECTION);
            List<VoxelShape> shapes = new ArrayList<>();
            shapes.add(SHAPE_ONE[direction.get2DDataValue()]);
            shapes.add(SHAPE_TWO[direction.get2DDataValue()]);
            shapes.add(SHAPE_THREE[direction.get2DDataValue()]);
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
