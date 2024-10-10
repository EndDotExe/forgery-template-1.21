package net.end.forgery.item.custom;
/*
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class BlockInteractionRangeTool extends ToolItem {
  public static double reach = 0;
  public static double attack_range = 0;
  private static LivingEntity liver = null;
  private static boolean active = false;
    private Object ReachEntityAttributes;

    public BlockInteractionRangeTool(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
        reach = reachBonus;
        attack_range = attackReachBonus;
        ReachEntityAttributes = reachEntityAttributes;
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected)
    {
        if(active != (((LivingEntity)entity).getStackInHand(Hand.MAIN_HAND).getItem() == this))
        {
            System.out.println("New entity reaching: " + entity);
            liver = (LivingEntity)entity;
            SetRange(((LivingEntity)entity).getStackInHand(Hand.MAIN_HAND).getItem() == this);
        }
        active = ((LivingEntity)entity).getStackInHand(Hand.MAIN_HAND).getItem() == this;
        super.inventoryTick(stack, world, entity, slot, selected);
    }

    private void SetRange(boolean b) {
    }

    private void SetRange(boolean change_range)
    {
        if (change_range)
        {
            System.out.println("On");
            liver.getAttributeInstance(ReachEntityAttributes.REACH).setBaseValue(reach);
            liver.getAttributeInstance(ReachEntityAttributes.ATTACK_RANGE).setBaseValue(attack_range);

        }
        else
        {
            System.out.println("Off");
            liver.getAttributeInstance(ReachEntityAttributes.REACH).setBaseValue(0.0);
            liver.getAttributeInstance(ReachEntityAttributes.ATTACK_RANGE).setBaseValue(0.0);
        }
    }
} */






