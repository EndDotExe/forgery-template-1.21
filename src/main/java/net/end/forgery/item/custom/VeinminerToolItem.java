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
                    Blocks.COAL_ORE, Blocks.AIR,
                    Blocks.COPPER_ORE, Blocks.AIR,
                    Blocks.DIAMOND_ORE, Blocks.AIR,
                    Blocks.DEEPSLATE_COAL_ORE, Blocks.AIR,
                    Blocks.DEEPSLATE_DIAMOND_ORE, Blocks.AIR,
                    Blocks.DEEPSLATE_COPPER_ORE, Blocks.AIR,
                    Blocks.DEEPSLATE_EMERALD_ORE, Blocks.AIR,
                    Blocks.DEEPSLATE_GOLD_ORE, Blocks.AIR,
                    Blocks.DEEPSLATE_IRON_ORE, Blocks.AIR,
                    Blocks.DEEPSLATE_LAPIS_ORE, Blocks.AIR,
                    Blocks.DEEPSLATE_REDSTONE_ORE, Blocks.AIR,
                    Blocks.EMERALD_ORE, Blocks.AIR,
                    Blocks.GOLD_ORE, Blocks.AIR,
                    Blocks.IRON_ORE, Blocks.AIR,
                    Blocks.LAPIS_ORE, Blocks.AIR,
                    Blocks.REDSTONE_ORE, Blocks.AIR,
                    Blocks.NETHER_GOLD_ORE, Blocks.AIR,
                    Blocks.NETHER_QUARTZ_ORE, Blocks.AIR,
                    Blocks.ANCIENT_DEBRIS, Blocks.AIR,

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

            world.playSound(null, context.getBlockPos(), SoundEvents.BLOCK_AMETHYST_BLOCK_CHIME, SoundCategory.BLOCKS, 1.0F, 2.0F);
            }
        }

        return ActionResult.SUCCESS;
    }
}
