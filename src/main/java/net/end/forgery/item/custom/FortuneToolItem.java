package net.end.forgery.item.custom;

import net.minecraft.component.DataComponentTypes;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.world.World;

public class FortuneToolItem extends ToolItem {


    public FortuneToolItem(ToolMaterial material, Settings settings) {
        super(material, settings);
    }
DataComponentTypes getDataComponentType(ItemStack stack) {
        return null;
}


}


