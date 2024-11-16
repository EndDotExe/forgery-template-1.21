package net.end.forgery.item;

import java.util.function.Supplier;
import com.google.common.base.Suppliers;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

public enum ModToolMaterials implements ToolMaterial {
    FORGERY_UPGRADED (BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 15000, 20.0F, 5.0F, 0, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    FORGERY_INSTATOOL (BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 20000, 1000.0F, 5.0F, 0, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    FORGERY_VEINMINER (BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 10000, 25.0F, 5.0F, 0, () -> Ingredient.ofItems(Items.NETHERITE_INGOT));

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(
            final TagKey<Block> inverseTag,
            final int itemDurability,
            final float miningSpeed,
            final float attackDamage,
            final int enchantability,
            final Supplier<Ingredient> repairIngredient
    ) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
