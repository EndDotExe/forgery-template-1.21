package net.end.forgery.item.custom;

import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.hit.HitResult;

public class PoisonSwordItem extends SwordItem {

    public PoisonSwordItem(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }



    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 200, 4), attacker);
        return super.postHit(stack, target, attacker);
    }
}


