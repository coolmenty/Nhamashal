package com.coolmenty.nhamashal.events;

import com.coolmenty.nhamashal.client.models.DoubpogiModel;
import com.coolmenty.nhamashal.client.renderer.DoubpogiRenderer;
import com.coolmenty.nhamashal.init.EntityInit;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ModClientEvents {

    @SubscribeEvent
    public static void entityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EntityInit.DOUBPOGI.get(), DoubpogiRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DoubpogiModel.LAYER_LOCATION, DoubpogiModel::createBodyLayer);
    }
}
