package net.travis.furnitura.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.travis.furnitura.FurnituraMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FurnituraMod.MOD_ID);



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
