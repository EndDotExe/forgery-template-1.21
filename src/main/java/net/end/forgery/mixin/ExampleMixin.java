package net.end.forgery.mixin;

import com.jamieswhiteshirt.reachentityattributes.ReachEntityAttributes;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ReachEntityAttributes.class)
public class ExampleMixin {
	@Inject(method = "getReachDistance", at = @At("HEAD"))
	private static void checkWithinActualReach(CallbackInfoReturnable<Boolean> cir) {
		// Your custom logic here
	}
}