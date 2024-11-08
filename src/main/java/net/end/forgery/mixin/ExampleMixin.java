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
	@Inject(method="createPlayerAttributes", at=@At("HEAD"), cancellable = true)
	private static void createPlayerAttributes(CallbackInfoReturnable<Float> cir){
		PlayerEntity player = MinecraftClient.getInstance().player;
		if(MinecraftClient.getInstance().player != null && MinecraftClient.getInstance().player.getMainHandStack().getItem() instanceof BlockInteractionRangeTool){
			cir.setReturnValue(6.0f);
		}
	}
}