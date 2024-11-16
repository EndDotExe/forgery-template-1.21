package net.end.forgery.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class FortuneToolItem extends PickaxeItem {

    private final int fortuneLevel;

    public FortuneToolItem(ToolMaterial material, int fortuneLevel, Settings settings) {
        super(material, settings);
        this.fortuneLevel = fortuneLevel;
    }
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, PlayerEntity miner) {
        if (!world.isClient && world instanceof ServerWorld serverWorld) {
            List<ItemStack> drops = Block.getDroppedStacks(state, serverWorld, pos, null, miner, stack);
            Random random = new Random();

            for (ItemStack drop : drops) {
                int count = drop.getCount();
                for (int i = 0; i < fortuneLevel; i++) {
                    if (random.nextFloat() < 0.5f) {
                        count++;
                    }
                }
                drop.setCount(count);
                Block.dropStack(world, pos, drop);
            }
        }
        return super.postMine(stack, world, state, pos, miner);
    }
}