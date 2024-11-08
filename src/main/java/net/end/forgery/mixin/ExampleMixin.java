package net.end.forgery.mixin;

import net.end.forgery.item.custom.BlockInteractionRangeTool;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public class ExampleMixin {
	@Inject(method = "createPlayerAttributes", at = @At("HEAD"), cancellable = true)
	private static void createPlayerAttributes(CallbackInfoReturnable<Float> cir) {
		MinecraftClient client = MinecraftClient.getInstance();
		if (client != null && client.player != null && client.player.getMainHandStack().getItem() instanceof BlockInteractionRangeTool) {
			cir.setReturnValue(10.0f);
		}
	}
}