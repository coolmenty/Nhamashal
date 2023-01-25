package com.coolmenty.nhamashal.events;

import com.coolmenty.nhamashal.NhamashalMain;
import com.coolmenty.nhamashal.client.models.DoubpogiModel;
import com.coolmenty.nhamashal.client.renderer.DoubpogiRenderer;
import com.coolmenty.nhamashal.init.EntityInit;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = NhamashalMain.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModClientEvents {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {

    }

    @SubscribeEvent
    public static void entityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EntityInit.DOUBPOGI.get(), DoubpogiRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DoubpogiModel.LAYER_LOCATION, DoubpogiModel::createBodyLayer);
    }
}
