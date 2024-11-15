package net.end.forgery.util;

import net.end.forgery.item.custom.VeinminerToolItemTwo;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class VeinMinerUsageEvent {
    public static void register() {
        PlayerBlockBreakEvents.BEFORE.register(VeinMinerUsageEvent::onBlockBreak);
    }

    private static boolean onBlockBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity) {
        if (!world.isClient && player.getMainHandStack().getItem() instanceof VeinminerToolItemTwo) {
            ((VeinminerToolItemTwo) player.getMainHandStack().getItem()).onBlockBreak(world, pos, state, player);
        }
        return true;
    }

}