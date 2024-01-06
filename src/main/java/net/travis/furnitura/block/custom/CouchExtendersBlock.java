
package net.travis.furnitura.block.custom;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.travis.furnitura.block.FurnitureHorizontalBlock;
import net.travis.furnitura.entity.SeatEntity;
import net.travis.furnitura.util.VoxelShapeHelper;

import java.util.ArrayList;
import java.util.List;

public class CouchExtendersBlock extends FurnitureHorizontalBlock
{
    public final ImmutableMap<BlockState, VoxelShape> SHAPES;

    public CouchExtendersBlock(Properties properties)
    {
        super(properties);
        this.registerDefaultState(this.getStateDefinition().any().setValue(DIRECTION, Direction.NORTH));
        SHAPES = this.generateShapes(this.getStateDefinition().getPossibleStates());
    }

    private ImmutableMap<BlockState, VoxelShape> generateShapes(ImmutableList<BlockState> states)
    {
        final VoxelShape[] SHAPE_ONE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 4, 2, 16, 6, 11), Direction.NORTH));
        final VoxelShape[] SHAPE_TWO = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 4, 0, 16, 16, 2), Direction.NORTH));
        final VoxelShape[] SHAPE_THREE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 2, 2, 2, 4, 9), Direction.NORTH));
        final VoxelShape[] SHAPE_FOUR = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(14, 2, 2, 16, 4, 9), Direction.NORTH));
        final VoxelShape[] SHAPE_FIVE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(2, 2, 0, 14, 4, 2), Direction.NORTH));
        final VoxelShape[] SHAPE_SIX = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(2, 2, 9, 14, 4, 11), Direction.NORTH));
        final VoxelShape[] SHAPE_SEVEN = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 0, 9, 2, 4, 11), Direction.NORTH));
        final VoxelShape[] SHAPE_EIGHT = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(14, 0, 9, 16, 4, 11), Direction.NORTH));
        final VoxelShape[] SHAPE_NINE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 0, 0, 2, 4, 2), Direction.NORTH));
        final VoxelShape[] SHAPE_TEN = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(14, 0, 0, 16, 4, 2), Direction.NORTH));

        ImmutableMap.Builder<BlockState, VoxelShape> builder = new ImmutableMap.Builder<>();
        for(BlockState state : states)
        {
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
            builder.put(state, VoxelShapeHelper.combineAll(shapes));
        }
        return builder.build();
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter reader, BlockPos pos, CollisionContext context)
    {
        return SHAPES.get(state);
    }

    @Override
    public VoxelShape getOcclusionShape(BlockState state, BlockGetter reader, BlockPos pos)
    {
        return SHAPES.get(state);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result)
    {
        return SeatEntity.create(level, pos, 0.2, player, state.getValue(DIRECTION));
    }
}