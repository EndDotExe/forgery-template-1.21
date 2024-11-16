package net.end.forgery.util;

import net.end.forgery.item.custom.VeinminerToolItemTwo;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;


public class VeinMinerUsageEvent {
    public static void register() {
        PlayerBlockBreakEvents.BEFORE.register(VeinMinerUsageEvent::onBlockBreak);
    }
    private static final int BLOCK_BREAK_LIMIT = 128; // Maximum number of blocks that can be broken in a single veinmine operation

    private static boolean onBlockBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity) {
        if (!world.isClient && player.getMainHandStack().getItem() instanceof VeinminerToolItemTwo) {
            ((VeinminerToolItemTwo) player.getMainHandStack().getItem()).onBlockBreak(world, pos, state, player);
        }

        return true;
    }
    private int mineConnectedBlocks(ServerWorld world, BlockPos pos, Block block, PlayerEntity player, int blocksBroken) {
        if (blocksBroken >= BLOCK_BREAK_LIMIT) {
            return blocksBroken;
        }

        for (Direction direction : Direction.values()) {
            BlockPos adjacentPos = pos.offset(direction);
            BlockState adjacentState = world.getBlockState(adjacentPos);
            if (adjacentState.isIn(ModTags.Blocks.ORES) && adjacentState.getBlock() == block) {
                world.breakBlock(adjacentPos, true, player);
                blocksBroken++;
                if (blocksBroken >= BLOCK_BREAK_LIMIT) {
                    return blocksBroken;
                }
                blocksBroken = mineConnectedBlocks(world, adjacentPos, block, player, blocksBroken);
            }
        }
        return blocksBroken;

    }
}


