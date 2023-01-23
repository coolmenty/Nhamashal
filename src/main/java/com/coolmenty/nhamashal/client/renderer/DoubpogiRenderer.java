package com.coolmenty.nhamashal.client.renderer;

import com.coolmenty.nhamashal.NhamashalMain;
import com.coolmenty.nhamashal.client.models.DoubpogiModel;
import com.coolmenty.nhamashal.entities.Doubpogi;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class DoubpogiRenderer extends MobRenderer<Doubpogi, DoubpogiModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(NhamashalMain.MODID, "textures/entities/doubpogi.png");

    public DoubpogiRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new DoubpogiModel(ctx.bakeLayer(DoubpogiModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Doubpogi entity) {
        return TEXTURE;
    }
}
