
package net.travis.furnitura.block.custom;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.travis.furnitura.block.FurnitureHorizontalBlock;
import net.travis.furnitura.entity.SeatEntity;
import net.travis.furnitura.util.VoxelShapeHelper;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: MrCrayfish
 */
public class SingleCouchBlock extends FurnitureHorizontalBlock
{
    public static final EnumProperty<Type> TYPE = EnumProperty.create("type", Type.class);

    public final ImmutableMap<BlockState, VoxelShape> SHAPES;

    public SingleCouchBlock(Properties properties)
    {
        super(properties);
        this.registerDefaultState(this.getStateDefinition().any().setValue(DIRECTION, Direction.SOUTH).setValue(TYPE, Type.SINGLE));
        SHAPES = this.generateShapes(this.getStateDefinition().getPossibleStates());
    }

    private ImmutableMap<BlockState, VoxelShape> generateShapes(ImmutableList<BlockState> states)
    {

        final VoxelShape[] BASE_ONE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 4, 5, 16, 6, 14), Direction.SOUTH));
        final VoxelShape[] BASE_TWO = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 4, 14, 16, 16, 16), Direction.SOUTH));
        final VoxelShape[] BASE_THREE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(14, 2, 7, 16, 4, 14), Direction.SOUTH));
        final VoxelShape[] BASE_FOUR = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 2, 7, 2, 4, 14), Direction.SOUTH));
        final VoxelShape[] BASE_FIVE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(2, 2, 14, 14, 4, 16), Direction.SOUTH));
        final VoxelShape[] BASE_SIX = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(2, 2, 5, 14, 4, 7), Direction.SOUTH));
        final VoxelShape[] BASE_SEVEN = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(14, 0, 5, 16, 4, 7), Direction.SOUTH));
        final VoxelShape[] BASE_EIGHT = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 0, 5, 2, 4, 7), Direction.SOUTH));
        final VoxelShape[] BASE_NINE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(14, 0, 14, 16, 4, 16), Direction.SOUTH));
        final VoxelShape[] BASE_TEN = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 0, 14, 2, 4, 16), Direction.SOUTH));
        final VoxelShape[] SINGLE_ONE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(15, 6, 4, 17, 9, 14), Direction.SOUTH));
        final VoxelShape[] SINGLE_TWO = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(-1, 6, 4, 1, 9, 14), Direction.SOUTH));
        final VoxelShape[] LEFT_ONE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(16, 6, 5, 18, 9, 15), Direction.SOUTH));
        final VoxelShape[] RIGHT_ONE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(-2, 6, 5, 0, 9, 15), Direction.SOUTH));
        final VoxelShape[] ONE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(5, 4, 0, 14, 6, 14), Direction.SOUTH));
        final VoxelShape[] TWO = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(14, 4, 0, 16, 16, 16), Direction.SOUTH));
        final VoxelShape[] THREE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(7, 2, 0, 14, 4, 2), Direction.SOUTH));
        final VoxelShape[] FOUR = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(2, 2, 14, 14, 4, 16), Direction.SOUTH));
        final VoxelShape[] FIVE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(14, 2, 2, 16, 4, 14), Direction.SOUTH));
        final VoxelShape[] SIX = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 2, 7, 2, 4, 14), Direction.SOUTH));
        final VoxelShape[] SEVEN = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(5, 0, 0, 7, 4, 2), Direction.SOUTH));
        final VoxelShape[] EIGHT = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 0, 5, 2, 4, 7), Direction.SOUTH));
        final VoxelShape[] NINE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 0, 14, 2, 4, 16), Direction.SOUTH));
        final VoxelShape[] TEN = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(14, 0, 0, 16, 4, 2), Direction.SOUTH));
        final VoxelShape[] ELEVEN = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(14, 0, 14, 16, 4, 16), Direction.SOUTH));
        final VoxelShape[] TWELVE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 4, 14, 14, 16, 16), Direction.SOUTH));
        final VoxelShape[] THIRTEEN = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 4, 5, 5, 6, 14), Direction.SOUTH));
        final VoxelShape[] SHAPE_ONE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(2, 4, 5, 16, 6, 14), Direction.SOUTH));
        final VoxelShape[] SHAPE_TWO = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 4, 14, 16, 16, 16), Direction.SOUTH));
        final VoxelShape[] SHAPE_THREE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(14, 2, 7, 16, 4, 14), Direction.SOUTH));
        final VoxelShape[] SHAPE_FOUR = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 2, 2, 2, 4, 14), Direction.SOUTH));
        final VoxelShape[] SHAPE_FIVE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(2, 2, 14, 14, 4, 16), Direction.SOUTH));
        final VoxelShape[] SHAPE_SIX = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(2, 2, 0, 9, 4, 2), Direction.SOUTH));
        final VoxelShape[] SHAPE_SEVEN = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(14, 0, 5, 16, 4, 7), Direction.SOUTH));
        final VoxelShape[] SHAPE_EIGHT = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(9, 0, 0, 11, 4, 2), Direction.SOUTH));
        final VoxelShape[] SHAPE_NINE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 0, 0, 2, 4, 2), Direction.SOUTH));
        final VoxelShape[] SHAPE_TEN = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(14, 0, 14, 16, 4, 16), Direction.SOUTH));
        final VoxelShape[] SHAPE_ELEVEN = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 0, 14, 2, 4, 16), Direction.SOUTH));
        final VoxelShape[] SHAPE_TWELVE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 4, 0, 2, 16, 14), Direction.SOUTH));
        final VoxelShape[] SHAPE_THIRTEEN = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(2, 4, 0, 11, 6, 5), Direction.SOUTH));


        ImmutableMap.Builder<BlockState, VoxelShape> builder = new ImmutableMap.Builder<>();
        for(BlockState state : states)
        {
            Direction direction = state.getValue(DIRECTION);
            Type type = state.getValue(TYPE);
            List<VoxelShape> shapes = new ArrayList<>();


            switch(type)
            {
                case SINGLE:
                    shapes.add(BASE_ONE[direction.get2DDataValue()]);
                    shapes.add(BASE_TWO[direction.get2DDataValue()]);
                    shapes.add(BASE_THREE[direction.get2DDataValue()]);
                    shapes.add(BASE_FOUR[direction.get2DDataValue()]);
                    shapes.add(BASE_FIVE[direction.get2DDataValue()]);
                    shapes.add(BASE_SIX[direction.get2DDataValue()]);
                    shapes.add(BASE_SEVEN[direction.get2DDataValue()]);
                    shapes.add(BASE_EIGHT[direction.get2DDataValue()]);
                    shapes.add(BASE_NINE[direction.get2DDataValue()]);
                    shapes.add(BASE_TEN[direction.get2DDataValue()]);
                    shapes.add(SINGLE_ONE[direction.get2DDataValue()]);
                    shapes.add(SINGLE_TWO[direction.get2DDataValue()]);


                    break;
                case LEFT:
                    shapes.add(BASE_ONE[direction.get2DDataValue()]);
                    shapes.add(BASE_TWO[direction.get2DDataValue()]);
                    shapes.add(BASE_THREE[direction.get2DDataValue()]);
                    shapes.add(BASE_FOUR[direction.get2DDataValue()]);
                    shapes.add(BASE_FIVE[direction.get2DDataValue()]);
                    shapes.add(BASE_SIX[direction.get2DDataValue()]);
                    shapes.add(BASE_SEVEN[direction.get2DDataValue()]);
                    shapes.add(BASE_EIGHT[direction.get2DDataValue()]);
                    shapes.add(BASE_NINE[direction.get2DDataValue()]);
                    shapes.add(BASE_TEN[direction.get2DDataValue()]);
                    shapes.add(LEFT_ONE[direction.get2DDataValue()]);
                    break;
                case RIGHT:
                    shapes.add(BASE_ONE[direction.get2DDataValue()]);
                    shapes.add(BASE_TWO[direction.get2DDataValue()]);
                    shapes.add(BASE_THREE[direction.get2DDataValue()]);
                    shapes.add(BASE_FOUR[direction.get2DDataValue()]);
                    shapes.add(BASE_FIVE[direction.get2DDataValue()]);
                    shapes.add(BASE_SIX[direction.get2DDataValue()]);
                    shapes.add(BASE_SEVEN[direction.get2DDataValue()]);
                    shapes.add(BASE_EIGHT[direction.get2DDataValue()]);
                    shapes.add(BASE_NINE[direction.get2DDataValue()]);
                    shapes.add(BASE_TEN[direction.get2DDataValue()]);
                    shapes.add(RIGHT_ONE[direction.get2DDataValue()]);

                    break;
                case CORNER_LEFT:
                    shapes.add(ONE[direction.get2DDataValue()]);
                    shapes.add(TWO[direction.get2DDataValue()]);
                    shapes.add(THREE[direction.get2DDataValue()]);
                    shapes.add(FOUR[direction.get2DDataValue()]);
                    shapes.add(FIVE[direction.get2DDataValue()]);
                    shapes.add(SIX[direction.get2DDataValue()]);
                    shapes.add(SEVEN[direction.get2DDataValue()]);
                    shapes.add(EIGHT[direction.get2DDataValue()]);
                    shapes.add(NINE[direction.get2DDataValue()]);
                    shapes.add(TEN[direction.get2DDataValue()]);
                    shapes.add(ELEVEN[direction.get2DDataValue()]);
                    shapes.add(TWELVE[direction.get2DDataValue()]);
                    shapes.add(THIRTEEN[direction.get2DDataValue()]);

                    break;
                case CORNER_RIGHT:
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
                    break;

                case MIDDLE:
                    shapes.add(BASE_ONE[direction.get2DDataValue()]);
                    shapes.add(BASE_TWO[direction.get2DDataValue()]);
                    shapes.add(BASE_THREE[direction.get2DDataValue()]);
                    shapes.add(BASE_FOUR[direction.get2DDataValue()]);
                    shapes.add(BASE_FIVE[direction.get2DDataValue()]);
                    shapes.add(BASE_SIX[direction.get2DDataValue()]);
                    shapes.add(BASE_SEVEN[direction.get2DDataValue()]);
                    shapes.add(BASE_EIGHT[direction.get2DDataValue()]);
                    shapes.add(BASE_NINE[direction.get2DDataValue()]);
                    shapes.add(BASE_TEN[direction.get2DDataValue()]);
                    break;
            }
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
    public BlockState getStateForPlacement(BlockPlaceContext context)
    {
        BlockState state = super.getStateForPlacement(context);
        return this.getSofaState(state, context.getLevel(), context.getClickedPos(), state.getValue(DIRECTION));
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result)
    {
        return SeatEntity.create(level, pos, 0.2, player, state.getValue(DIRECTION));
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState newState, LevelAccessor level, BlockPos pos, BlockPos newPos)
    {
        return this.getSofaState(state, level, pos, state.getValue(DIRECTION));
    }

    private BlockState getSofaState(BlockState state, LevelAccessor level, BlockPos pos, Direction dir)
    {
        boolean left = this.isSofa(level, pos, dir.getCounterClockWise(), dir) || this.isSofa(level, pos, dir.getCounterClockWise(), dir.getCounterClockWise());
        boolean right = this.isSofa(level, pos, dir.getClockWise(), dir) || this.isSofa(level, pos, dir.getClockWise(), dir.getClockWise());
        boolean cornerLeft = this.isSofa(level, pos, dir.getOpposite(), dir.getCounterClockWise());
        boolean cornerRight = this.isSofa(level, pos, dir.getOpposite(), dir.getClockWise());

        if(cornerLeft)
        {
            return state.setValue(TYPE, Type.CORNER_LEFT);
        }
        else if(cornerRight)
        {
            return state.setValue(TYPE, Type.CORNER_RIGHT);
        }
        else if(left && right)
        {
            return state.setValue(TYPE, Type.MIDDLE);
        }
        else if(left)
        {
            return state.setValue(TYPE, Type.RIGHT);
        }
        else if(right)
        {
            return state.setValue(TYPE, Type.LEFT);
        }
        return state.setValue(TYPE, Type.SINGLE);
    }

    private boolean isSofa(LevelAccessor level, BlockPos source, Direction direction, Direction targetDirection)
    {
        BlockState state = level.getBlockState(source.relative(direction.getOpposite()));
        if(state.getBlock() == this)
        {
            Direction sofaDirection = state.getValue(DIRECTION);
            return sofaDirection.equals(targetDirection);
        }
        return false;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        super.createBlockStateDefinition(builder);
        builder.add(TYPE);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return null;
    }

    public enum Type implements StringRepresentable
    {
        SINGLE("single"),
        LEFT("left"),
        RIGHT("right"),
        MIDDLE("middle"),
        CORNER_LEFT("corner_left"),
        CORNER_RIGHT("corner_right");

        private final String id;

        Type(String id)
        {
            this.id = id;
        }

        @Override
        public String getSerializedName()
        {
            return id;
        }

        @Override
        public String toString()
        {
            return id;
        }
    }
}