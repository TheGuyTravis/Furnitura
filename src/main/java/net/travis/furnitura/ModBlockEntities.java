package net.travis.furnitura;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.travis.furnitura.block.ModBlocks;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, FurnituraMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<CabinetBlockEntity>> CABINET =
            BLOCK_ENTITIES.register("cabinet", () ->
                    BlockEntityType.Builder.of(CabinetBlockEntity::new,
                            ModBlocks.CABINET_OAK.get()).build(null));

    public static final RegistryObject<BlockEntityType<CrateBlockEntity>> CRATE =
            BLOCK_ENTITIES.register("crate", () ->
                    BlockEntityType.Builder.of(CrateBlockEntity::new,
                            ModBlocks.OAK_CRATE.get()).build(null));

    public static final RegistryObject<BlockEntityType<MailBoxBlockEntity>> MAIL_BOX =
            BLOCK_ENTITIES.register("mail_box", () ->
                    BlockEntityType.Builder.of(MailBoxBlockEntity::new,
                            ModBlocks.OAK_CRATE.get()).build(null));



    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
