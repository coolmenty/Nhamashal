package com.coolmenty.nhamashal.init;

import com.coolmenty.nhamashal.NhamashalMain;
import com.coolmenty.nhamashal.entities.Doubpogi;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, NhamashalMain.MODID);

    public static final RegistryObject<EntityType<Doubpogi>> DOUBPOGI = ENTITIES.register("doubpogi",
            () -> EntityType.Builder.of(Doubpogi::new, MobCategory.CREATURE).build(NhamashalMain.MODID + ":doubpogi"));
}
