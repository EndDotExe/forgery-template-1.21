package net.end.forgery.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

import java.util.Map;

public class VeinminerToolItem extends Item {
    private static final Map<Block, Block> VEINMINERTOOL_MAP =
            Map.of(
                    Blocks.COAL_ORE, Blocks.AIR

                    );

    public VeinminerToolItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        Block clickedBlock = world.getBlockState(context.getBlockPos()).getBlock();

        if(VEINMINERTOOL_MAP.containsKey(clickedBlock)) {
            if(!world.isClient()) {
                world.setBlockState(context.getBlockPos(), VEINMINERTOOL_MAP.get(clickedBlock).getDefaultState());

            world.playSound(null, context.getBlockPos(), SoundEvents.BLOCK_AMETHYST_BLOCK_PLACE, SoundCategory.BLOCKS, 5.0F, 1.0F);
            }
        }

        return ActionResult.SUCCESS;
    }
}
