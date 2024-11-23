package net.end.forgery.util;

import net.end.forgery.item.custom.BlazeShieldItem;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class BlazeShieldUsageEvent {
    public static void register() {
        AttackEntityCallback.EVENT.register((player, world, offhand, entity, attackResult) -> {
            if (entity instanceof LivingEntity && player.getOffHandStack().getItem() instanceof BlazeShieldItem) {
                fireFireballsAtEnemy((LivingEntity) entity, player, world);
            }
            return ActionResult.PASS;
        });
    }

    private static void fireFireballsAtEnemy(LivingEntity target, PlayerEntity attacker, World world) {
        if (!world.isClient) {
            for (int i = 0; i < 3; i++) {
                Vec3d look = target.getRotationVec(1.0F);
                FireballEntity fireball = new FireballEntity(world, target, look, 0);
                fireball.setPosition(target.getX() + look.x, target.getEyeY() + look.y, target.getZ() + look.z);
                fireball.setVelocity(look.x, look.y, look.z, 5F, 0F);
                world.spawnEntity(fireball);
            }
        }
    }
}