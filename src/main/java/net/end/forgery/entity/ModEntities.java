package net.end.forgery.entity;

import net.end.forgery.entity.custom.WindArrowEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import net.end.forgery.Forgery;

public class ModEntities {
    public static final EntityType<WindArrowEntity> WIND_ARROW_ENTITY = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(Forgery.MOD_ID, "wind_arrow"),
            EntityType.Builder.<WindArrowEntity>create((entityType, world) -> new WindArrowEntity(world), SpawnGroup.MISC)
                    .dimensions(0.5F, 0.5F)
                    .build()
    );

    public static void registerEntities(net.end.forgery.entity.custom.WindArrowEntity windArrowEntity) {
        // Register other entities here
    }

    public static void registerModEntities() {
        Forgery.LOGGER.info("Registering Mod Entities for " + Forgery.MOD_ID);
    }
}