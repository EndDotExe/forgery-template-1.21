package net.end.forgery.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;

public class SlownessSwordItem extends SwordItem {

    public SlownessSwordItem(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

// Making the sword inflict the slowness debuff on enemies for 2 seconds (40 ticks) when they're hit
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 40, 2), attacker);
        return super.postHit(stack, target, attacker);
    }
}


