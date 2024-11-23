package net.end.forgery.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;

public class WindArrowEntity extends ArrowEntity {
    public WindArrowEntity(EntityType<? extends ArrowEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        createExplosion(this.getPos());
        this.discard();
    }

    @Override
    protected void onBlockHit(BlockHitResult blockHitResult) {
        super.onBlockHit(blockHitResult);
        createExplosion(this.getPos());
        this.discard();
    }

    private void createExplosion(Vec3d pos) {
        this.getWorld().createExplosion(this, pos.x, pos.y, pos.z, 2.0F, World.ExplosionSourceType.MOB);
    }
}