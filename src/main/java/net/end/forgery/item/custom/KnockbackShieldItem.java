package net.end.forgery.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ShieldItem;
import net.minecraft.util.math.Vec3d;

public class KnockbackShieldItem extends ShieldItem {

    public KnockbackShieldItem(Settings settings) {
        super(settings);
    }

    public static void applyKnockback(LivingEntity attacker, PlayerEntity defender) {
        Vec3d direction = attacker.getPos().subtract(defender.getPos()).normalize();
        attacker.addVelocity(direction.x * 2, 0.5, direction.z * 2);
    }
}