package net.end.forgery.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.AbstractWindChargeEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.explosion.AdvancedExplosionBehavior;
import net.minecraft.world.explosion.ExplosionBehavior;

import java.util.Optional;
import java.util.function.Function;

public class WindArrowEntity extends AbstractWindChargeEntity {
    public WindArrowEntity(World world) {
        super(EntityType.WIND_CHARGE, world);
    }

    @Override
    protected void createExplosion(Vec3d pos) {
        final ExplosionBehavior EXPLOSION_BEHAVIOR = new AdvancedExplosionBehavior(
                false, true, Optional.of(10.0F), Registries.BLOCK.getEntryList(BlockTags.BLOCKS_WIND_CHARGE_EXPLOSIONS).map(Function.identity())
        );
    }
}
