package net.end.forgery.entity;

import net.end.forgery.entity.custom.WindArrowEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<WindArrowEntity> WIND_ARROW = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of("forgery", "wind_arrow"),
            EntityType.Builder.create(WindArrowEntity::new, SpawnGroup.MISC)
                    .dimensions(EntityType.ARROW.getWidth(), EntityType.ARROW.getHeight())
                    .build(Identifier.of("forgery", "wind_arrow").toString())
    );

    public static void registerModEntities() {
        // This method can be used to register other entities if needed
    }
}