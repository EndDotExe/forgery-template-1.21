package net.end.forgery.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

import java.util.List;
import java.util.Map;

public class VeinminerToolItem extends Item {
    private static final Map<Block, Block> VEINMINERTOOL_MAP =
            Map.ofEntries(
                    Map.entry(Blocks.COAL_ORE, Blocks.AIR),
                    Map.entry(Blocks.DIAMOND_ORE, Blocks.AIR),
                    Map.entry(Blocks.IRON_ORE, Blocks.AIR),
                    Map.entry(Blocks.COPPER_ORE, Blocks.AIR),
                    Map.entry(Blocks.GOLD_ORE, Blocks.AIR),
                    Map.entry(Blocks.LAPIS_ORE, Blocks.AIR),
                    Map.entry(Blocks.EMERALD_ORE, Blocks.AIR),
                    Map.entry(Blocks.DEEPSLATE_COAL_ORE, Blocks.AIR),
                    Map.entry(Blocks.DEEPSLATE_DIAMOND_ORE, Blocks.AIR),
                    Map.entry(Blocks.DEEPSLATE_IRON_ORE, Blocks.AIR),
                    Map.entry(Blocks.DEEPSLATE_GOLD_ORE, Blocks.AIR),
                    Map.entry(Blocks.DEEPSLATE_REDSTONE_ORE, Blocks.AIR),
                    Map.entry(Blocks.DEEPSLATE_EMERALD_ORE, Blocks.AIR),
                    Map.entry(Blocks.DEEPSLATE_LAPIS_ORE, Blocks.AIR),
                    Map.entry(Blocks.DEEPSLATE_COPPER_ORE, Blocks.AIR)

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

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("tooltip.forgery.veinminertool"));
        tooltip.add(Text.translatable("tooltip.forgery.veinminertool_two"));
        tooltip.add(Text.translatable("tooltip.forgery.veinminertool_three"));
        tooltip.add(Text.translatable("tooltip.forgery.veinminertool_four"));
        super.appendTooltip(stack, context, tooltip, type);
    }
}
