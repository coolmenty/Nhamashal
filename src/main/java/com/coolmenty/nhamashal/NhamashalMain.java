package com.coolmenty.nhamashal;

import com.coolmenty.nhamashal.init.*;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;

@Mod(NhamashalMain.MODID)
public class NhamashalMain {
    public static final String MODID = "nhamashal";

    public NhamashalMain() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();


        ItemInit.ITEMS.register(bus);

        EntityInit.ENTITIES.register(bus);

    }

    public static final CreativeModeTab TAB = new CreativeModeTab(MODID) {
        @Override
        public @NotNull ItemStack makeIcon() {
            return ItemInit.DOUBPOGI_SPAWN_EGG.get().getDefaultInstance();
        }
    };
}
