package net.end.forgery.mixin;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SimpleInventory.class)
public class ExampleMixin {
	@Inject(method = "method_49106", at = @At("HEAD"), cancellable = true)
	private void checkWithinActualReach(BlockEntity blockEntity, PlayerEntity playerEntity, int i, CallbackInfoReturnable<Boolean> cir) {
		// Your custom logic here
	}
}