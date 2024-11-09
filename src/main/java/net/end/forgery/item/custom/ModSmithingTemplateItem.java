package net.end.forgery.item.custom;

import net.end.forgery.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.List;

public class ModSmithingTemplateItem extends Item {
    public ModSmithingTemplateItem(Item.Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
        if (stack.getItem() == ModItems.SMITHING_TEMPLATE_EX) {

            tooltip.add(Text.translatable("tooltip.forgery.smithing_template_ex"));
            tooltip.add(Text.translatable("tooltip.forgery.smithing_template_ex_two"));
            tooltip.add(Text.translatable("tooltip.forgery.smithing_template_ex_three"));

        } else if (stack.getItem() == ModItems.SMITHING_TEMPLATE_PH) {

            tooltip.add(Text.translatable("tooltip.forgery.smithing_template_ph"));
            tooltip.add(Text.translatable("tooltip.forgery.smithing_template_ph_two"));
            tooltip.add(Text.translatable("tooltip.forgery.smithing_template_ph_three"));

        } else if (stack.getItem() == ModItems.SMITHING_TEMPLATE_GC) {

            tooltip.add(Text.translatable("tooltip.forgery.smithing_template_gc"));
            tooltip.add(Text.translatable("tooltip.forgery.smithing_template_gc_two"));
            tooltip.add(Text.translatable("tooltip.forgery.smithing_template_gc_three"));

        } else if (stack.getItem() == ModItems.SMITHING_TEMPLATE_WI) {

            tooltip.add(Text.translatable("tooltip.forgery.smithing_template_wi"));
            tooltip.add(Text.translatable("tooltip.forgery.smithing_template_wi_two"));
            tooltip.add(Text.translatable("tooltip.forgery.smithing_template_wi_three"));

        } else if (stack.getItem() == ModItems.SMITHING_TEMPLATE_FL) {

            tooltip.add(Text.translatable("tooltip.forgery.smithing_template_fl"));
            tooltip.add(Text.translatable("tooltip.forgery.smithing_template_fl_two"));
            tooltip.add(Text.translatable("tooltip.forgery.smithing_template_fl_three"));
        }
    }
}