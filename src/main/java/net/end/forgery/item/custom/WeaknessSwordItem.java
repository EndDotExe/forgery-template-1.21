package net.end.forgery.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;

public class WeaknessSwordItem extends SwordItem {

    public WeaknessSwordItem(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    // Making the sword inflict the weakness debuff with a modifier of 3 on enemies for 4 seconds (80 ticks) when they're hit
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 80, 3), attacker);
        return super.postHit(stack, target, attacker);
    }
}


