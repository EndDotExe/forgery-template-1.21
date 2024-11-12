package net.end.forgery.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.List;

public class PoisonSwordItem extends SwordItem {

    public PoisonSwordItem(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

// Making the sword inflict the poison debuff on struck enemies for 2 seconds (40 ticks)
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 40, 3), attacker);
        if (target.isDead()) {
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 40, 3), attacker);
        }
        return super.postHit(stack, target, attacker);
    }
    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("tooltip.forgery.blighted_blade"));
    }
}


