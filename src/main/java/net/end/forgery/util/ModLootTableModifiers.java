package net.end.forgery.util;

import net.end.forgery.item.ModItems;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableModifiers {

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, resourceManager) -> {
            if(source.isBuiltin() && (EntityType.WARDEN.getLootTableId().equals(key)))
    {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f)) //100% chance drop
                        .with(ItemEntry.builder(ModItems.SMITHING_TEMPLATE_EX))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
        });
    }
    static {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, resourceManager) -> {
            if(source.isBuiltin() && (EntityType.PIGLIN_BRUTE.getLootTableId().equals(key)))
            {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.2f)) //20% chance drop
                        .with(ItemEntry.builder(ModItems.SMITHING_TEMPLATE_PH))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
        });
    }
    static {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, resourceManager) -> {
            if(source.isBuiltin() && (EntityType.WITHER.getLootTableId().equals(key)))
            {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f)) //100% chance drop
                        .with(ItemEntry.builder(ModItems.SMITHING_TEMPLATE_WI))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
        });
    }
    static {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, resourceManager) -> {
            if(source.isBuiltin() && (EntityType.ENDER_DRAGON.getLootTableId().equals(key)))
            {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f)) //100% chance drop
                        .with(ItemEntry.builder(ModItems.SMITHING_TEMPLATE_FL))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
        });
    }
    static {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, resourceManager) -> {
            if(source.isBuiltin() && (EntityType.ELDER_GUARDIAN.getLootTableId().equals(key)))
            {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f)) //50% chance drop
                        .with(ItemEntry.builder(ModItems.SMITHING_TEMPLATE_GC))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
        });
    }
    static {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, resourceManager) -> {
            if(source.isBuiltin() && (EntityType.DROWNED.getLootTableId().equals(key)))
            {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) //30% chance drop
                        .with(ItemEntry.builder(Items.PRISMARINE_SHARD))
                        .with(ItemEntry.builder(Items.PRISMARINE_CRYSTALS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(3.0f,1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
        });
    }
    public static void registerModLootTableModifiers() {
        modifyLootTables();
    }
}
