package com.coolmenty.nhamashal.init;

import com.coolmenty.nhamashal.NhamashalMain;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NhamashalMain.MODID);



    public static final RegistryObject<ForgeSpawnEggItem> DOUBPOGI_SPAWN_EGG = ITEMS.register("doubpogi_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.DOUBPOGI, 0xFF55AA, 0x27DA9F, props().stacksTo(16)));

    private static Item.Properties props() {
        return new Item.Properties().tab(NhamashalMain.TAB);
    }{


    }
}
