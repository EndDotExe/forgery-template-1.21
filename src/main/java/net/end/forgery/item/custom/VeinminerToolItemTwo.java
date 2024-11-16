package net.end.forgery.item.custom;

import net.end.forgery.util.ModTags;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class VeinminerToolItemTwo extends PickaxeItem {
    private static final int BLOCK_BREAK_LIMIT = 128; // Maximum number of blocks that can be broken in a single veinmine operation

    public VeinminerToolItemTwo(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, settings);
        PlayerBlockBreakEvents.BEFORE.register(this::onBlockBreak);
    }

    private boolean onBlockBreak(World world, PlayerEntity playerEntity, BlockPos blockPos, BlockState blockState, @Nullable BlockEntity blockEntity) {
        return true;
    }

    public void onBlockBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!world.isClient && player.getMainHandStack().getItem() instanceof VeinminerToolItemTwo) {
            if (state.isIn(BlockTags.COAL_ORES) || state.isIn(BlockTags.GOLD_ORES) || state.isIn(BlockTags.DIAMOND_ORES)
                    || state.isIn(BlockTags.EMERALD_ORES) || state.isIn(BlockTags.LAPIS_ORES) || state.isIn(BlockTags.REDSTONE_ORES)
                      || state.isIn(BlockTags.IRON_ORES) || state.isIn(BlockTags.COPPER_ORES)) {
                mineConnectedBlocks((ServerWorld) world, pos, state.getBlock(), player, 0);
                world.breakBlock(pos, true, player);
            }
        }
    }

    private int mineConnectedBlocks(ServerWorld world, BlockPos pos, Block block, PlayerEntity player, int blocksBroken) {
        if (blocksBroken >= BLOCK_BREAK_LIMIT) {
            return blocksBroken;
        }

        for (Direction direction : Direction.values()) {
            BlockPos adjacentPos = pos.offset(direction);
            BlockState adjacentState = world.getBlockState(adjacentPos);
            if (adjacentState.isIn(BlockTags.COAL_ORES) || adjacentState.isIn(BlockTags.GOLD_ORES) || adjacentState.isIn(BlockTags.DIAMOND_ORES)
                    || adjacentState.isIn(BlockTags.EMERALD_ORES) || adjacentState.isIn(BlockTags.LAPIS_ORES) || adjacentState.isIn(BlockTags.REDSTONE_ORES)
                    || adjacentState.isIn(BlockTags.IRON_ORES) || adjacentState.isIn(BlockTags.COPPER_ORES) && adjacentState.getBlock() == block) {
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

    // Adding a custom tooltip to the tool
    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
        if (Screen.hasShiftDown()){
            tooltip.add(Text.translatable("tooltip.forgery.veinminertool"));
            tooltip.add(Text.translatable("tooltip.forgery.veinminertool_two"));
            tooltip.add(Text.translatable("tooltip.forgery.veinminertool_three"));
        } else {
            tooltip.add(Text.translatable("tooltip.forgery.veinminertool_pressshiftdumbass"));
        }

        super.appendTooltip(stack, context, tooltip, type);
    }
}