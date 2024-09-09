package net.end.forgery.item;

import net.end.forgery.Forgery;
import net.end.forgery.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ALL_FORGERY_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Forgery.MOD_ID, "all_forgery_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SMITHING_TEMPLATE_EX))
                    .displayName(Text.translatable("itemgroup.forgery.all_forgery_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.SMITHING_TEMPLATE_EX);
                        entries.add(ModItems.SMITHING_TEMPLATE_PH);
                        entries.add(ModItems.SMITHING_TEMPLATE_GC);
                        entries.add(ModItems.SMITHING_TEMPLATE_FL);
                        entries.add(ModItems.SMITHING_TEMPLATE_WI);
                        entries.add(ModBlocks.SMITHING_TABLE_EX);
                        entries.add(ModItems.AMETHYST_EXCAVATOR_PICKAXE);
                        entries.add(ModItems.REDSTONE_EXCAVATOR_PICKAXE);
                        entries.add(ModItems.EMERALD_EXCAVATOR_PICKAXE);
                        entries.add(ModItems.LAPIS_EXCAVATOR_PICKAXE);
                        entries.add(ModItems.BEDEVILLED_BLADE);


                    })
                    .build());



    public static void registerItemGroups() {
        Forgery.LOGGER.info("Registerin Item Groups For " + Forgery.MOD_ID);
    }
}