package net.travis.furnitura.block.custom;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.travis.furnitura.block.FurnitureHorizontalBlock;
import net.travis.furnitura.util.VoxelShapeHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: MrCrayfish
 */
public class SmallTableBlock extends FurnitureHorizontalBlock
{
    public static final EnumProperty<Type> TYPE = EnumProperty.create("type", Type.class);

    private final MaterialType materialType;
    public final ImmutableMap<BlockState, VoxelShape> SHAPES;

    public SmallTableBlock(Properties properties, MaterialType materialType)
    {
        super(properties);
        this.materialType = materialType;
        this.registerDefaultState(this.getStateDefinition().any().setValue(DIRECTION, Direction.NORTH).setValue(TYPE, Type.SINGLE));
        SHAPES = this.generateShapes(this.getStateDefinition().getPossibleStates());
    }

    protected ImmutableMap<BlockState, VoxelShape> generateShapes(ImmutableList<BlockState> states)
    {
        final VoxelShape[] SMALL_TABLE_TOP = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 8, 0, 16, 10, 16), Direction.SOUTH));
        final VoxelShape[] SMALL_TABLE_RIGHT_ONE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(14, 0, 1, 16, 2, 15), Direction.SOUTH));
        final VoxelShape[] SMALL_TABLE_RIGHT_TWO = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(14, 0, 0, 16, 8, 1), Direction.SOUTH));
        final VoxelShape[] SMALL_TABLE_RIGHT_THREE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(14, 0, 15, 16, 8, 16), Direction.SOUTH));
        final VoxelShape[] SMALL_TABLE_LEFT_ONE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 0, 1, 2, 2, 15), Direction.SOUTH));
        final VoxelShape[] SMALL_TABLE_LEFT_TWO = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 0, 0, 2, 8, 1), Direction.SOUTH));
        final VoxelShape[] SMALL_TABLE_LEFT_THREE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 0, 15, 2, 8, 16), Direction.SOUTH));

        ImmutableMap.Builder<BlockState, VoxelShape> builder = new ImmutableMap.Builder<>();
        for(BlockState state : states)
        {
            Direction direction = state.getValue(DIRECTION);
            Type type = state.getValue(TYPE);
            List<VoxelShape> shapes = new ArrayList<>();
            shapes.add(SMALL_TABLE_TOP[direction.get2DDataValue()]);
            switch(type)
            {
                case SINGLE:
                    shapes.add(SMALL_TABLE_LEFT_ONE[direction.get2DDataValue()]);
                    shapes.add(SMALL_TABLE_LEFT_TWO[direction.get2DDataValue()]);
                    shapes.add(SMALL_TABLE_LEFT_THREE[direction.get2DDataValue()]);
                    shapes.add(SMALL_TABLE_RIGHT_ONE[direction.get2DDataValue()]);
                    shapes.add(SMALL_TABLE_RIGHT_TWO[direction.get2DDataValue()]);
                    shapes.add(SMALL_TABLE_RIGHT_THREE[direction.get2DDataValue()]);

                    break;
                case LEFT:
                    shapes.add(SMALL_TABLE_LEFT_ONE[direction.get2DDataValue()]);
                    shapes.add(SMALL_TABLE_LEFT_TWO[direction.get2DDataValue()]);
                    shapes.add(SMALL_TABLE_LEFT_THREE[direction.get2DDataValue()]);
                    break;
                case RIGHT:
                    shapes.add(SMALL_TABLE_RIGHT_ONE[direction.get2DDataValue()]);
                    shapes.add(SMALL_TABLE_RIGHT_TWO[direction.get2DDataValue()]);
                    shapes.add(SMALL_TABLE_RIGHT_THREE[direction.get2DDataValue()]);

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
    public BlockState updateShape(BlockState state, Direction direction, BlockState newState, LevelAccessor level, BlockPos pos, BlockPos newPos)
    {
        Direction dir = state.getValue(DIRECTION);
        boolean left = this.isDesk(level, pos, dir.getCounterClockWise(), dir);
        boolean right = this.isDesk(level, pos, dir.getClockWise(), dir);
        if(left && right)
        {
            return state.setValue(TYPE, Type.MIDDLE);
        }
        if(left)
        {
            return state.setValue(TYPE, Type.RIGHT);
        }
        if(right)
        {
            return state.setValue(TYPE, Type.LEFT);
        }
        return state.setValue(TYPE, Type.SINGLE);
    }

    private boolean isDesk(LevelAccessor level, BlockPos source, Direction checkDirection, Direction tableDirection)
    {
        BlockState state = level.getBlockState(source.relative(checkDirection));
        return state.getBlock() instanceof SmallTableBlock && ((SmallTableBlock) state.getBlock()).materialType == materialType && state.getValue(DIRECTION) == tableDirection;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        super.createBlockStateDefinition(builder);
        builder.add(TYPE);
    }

    public enum Type implements StringRepresentable
    {
        SINGLE("single"),
        LEFT("left"),
        RIGHT("right"),
        MIDDLE("middle");

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

    public enum MaterialType
    {
        OAK,
        BIRCH,
        SPRUCE,
        JUNGLE,
        ACACIA,
        DARK_OAK,
        CRIMSON,
        WARPED,
        MANGROVE,
        STONE,
        GRANITE,
        DIORITE,
        ANDESITE,
        STRIPPED_OAK,
        STRIPPED_BIRCH,
        STRIPPED_SPRUCE,
        STRIPPED_JUNGLE,
        STRIPPED_ACACIA,
        STRIPPED_DARK_OAK,
        STRIPPED_CRIMSON,
        STRIPPED_WARPED,
        STRIPPED_MANGROVE
    }
}
