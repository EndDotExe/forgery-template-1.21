package net.end.forgery.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PhantomEntity;
import net.minecraft.world.World;

public class EndArrowEntity extends PhantomEntity {
    public EndArrowEntity(EntityType<? extends PhantomEntity> entityType, World world) {
        super(entityType, world);
    }
}
