package net.end.forgery.mixin;

import net.minecraft.entity.ai.brain.task.SonicBoomTask;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.WardenEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(WardenEntity.class)
public class WardenNerfMixin {

    @Inject(method = "addAttributes", at = @At("RETURN"), cancellable = true)
    private static void modifyAttributes(CallbackInfoReturnable<DefaultAttributeContainer.Builder> cir) {
        DefaultAttributeContainer.Builder builder = cir.getReturnValue();
        builder.add(EntityAttributes.GENERIC_MAX_HEALTH, 180.0);
        builder.add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 12.0);
        builder.add(EntityAttributes.GENERIC_ATTACK_KNOCKBACK, 1.0);
        cir.setReturnValue(builder);
    }
}