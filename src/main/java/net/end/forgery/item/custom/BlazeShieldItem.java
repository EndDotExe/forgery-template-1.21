package net.end.forgery.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShieldItem;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.List;

public class BlazeShieldItem extends ShieldItem {
    public BlazeShieldItem(Settings settings) {
        super(settings);
    }

    public boolean useOnEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        World world = target.getWorld();
        if (!world.isClient) {
            for (int i = 0; i < 3; i++) {
                Vec3d look = target.getRotationVec(1.0F);
                FireballEntity fireball = new FireballEntity(world, target, look, 1);
                fireball.setPosition(target.getX() + look.x, target.getEyeY() + look.y, target.getZ() + look.z);
                fireball.setVelocity(look.x, look.y, look.z, 5F, 0F);
                world.spawnEntity(fireball);
            }
        }
        return super.postHit(stack, target, attacker);
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {

            tooltip.add(Text.translatable("tooltip.forgery.blaze_shield"));
            tooltip.add(Text.translatable("tooltip.forgery.blaze_shield_two"));

        super.appendTooltip(stack, context, tooltip, type);
    }
}