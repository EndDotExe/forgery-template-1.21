package net.end.forgery.item.custom;

import net.end.forgery.entity.ModEntities;
import net.end.forgery.entity.custom.WindArrowEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.RangedWeaponItem;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.function.Predicate;

public class BreezeBowItem extends RangedWeaponItem {
    public BreezeBowItem(Settings settings) {
        super(settings);
    }

    @Override
    public Predicate<ItemStack> getProjectiles() {
        return BOW_PROJECTILES;
    }

    @Override
    public int getRange() {
        return 0;
    }

    @Override
    protected void shoot(LivingEntity shooter, ProjectileEntity projectile, int index, float speed, float divergence, float yaw, @Nullable LivingEntity target) {

    }


    public void onStoppedUsing(ItemStack stack, World world, PlayerEntity user, int remainingUseTicks) {
        if (!world.isClient) {
            System.out.println("BreezeBowItem: onStoppedUsing called");
            WindArrowEntity windArrow = new WindArrowEntity(ModEntities.WIND_ARROW, world);
            windArrow.setPos(user.getX(), user.getEyeY() - 0.1, user.getZ());
            windArrow.setOwner(user);
            Vec3d look = user.getRotationVec(1.0F);
            windArrow.setVelocity(look.x, look.y, look.z, 4.0F, 0.5F);

            System.out.println("BreezeBowItem: Spawning WindArrowEntity at " + windArrow.getPos());
            world.spawnEntity(windArrow);
            world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_ARROW_SHOOT, SoundCategory.PLAYERS, 1.0F, 1.0F);
        }

        user.getItemCooldownManager().set(this, 20);
    }
}