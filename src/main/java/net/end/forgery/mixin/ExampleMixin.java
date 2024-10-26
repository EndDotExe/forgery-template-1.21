package net.end.forgery.mixin;

import com.jamieswhiteshirt.reachentityattributes.ReachEntityAttributes;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ReachEntityAttributes.class)
public class ExampleMixin {
	@Inject(method = "getAttackRange", at = @At("HEAD"))
	private static void checkWithinActualReach(LivingEntity entity, double baseAttackRange, CallbackInfoReturnable<Double> cir) {
		// Your custom logic here
	}
}