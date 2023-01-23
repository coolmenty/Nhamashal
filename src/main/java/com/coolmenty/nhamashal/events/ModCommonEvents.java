package com.coolmenty.nhamashal.events;

import com.coolmenty.nhamashal.NhamashalMain;
import com.coolmenty.nhamashal.entities.Doubpogi;
import com.coolmenty.nhamashal.init.EntityInit;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = NhamashalMain.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModCommonEvents {
    @SubscribeEvent
    public static void entityAttributes(EntityAttributeCreationEvent event) {
        event.put(EntityInit.DOUBPOGI.get(), Doubpogi.createDoubpogiAttributes().build());
    }
}
