package net.end.forgery.item;

import net.end.forgery.Forgery;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

// Adding a new item group for all the custom items in the mod

public class ModItemGroups {
    public static final ItemGroup ALL_FORGERY_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Forgery.MOD_ID, "all_forgery_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SMITHING_TEMPLATE_EX))
                    .displayName(Text.translatable("itemgroup.forgery.all_forgery_items"))
// Adding the modded items to the "all_forgery_items" group
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.SMITHING_TEMPLATE_EX);
                        entries.add(ModItems.SMITHING_TEMPLATE_PH);
                        entries.add(ModItems.SMITHING_TEMPLATE_GC);
                        entries.add(ModItems.SMITHING_TEMPLATE_FL);
                        entries.add(ModItems.SMITHING_TEMPLATE_WI);
                        entries.add(ModItems.AMETHYST_EXCAVATOR_PICKAXE);
                        entries.add(ModItems.REDSTONE_EXCAVATOR_PICKAXE);
                        entries.add(ModItems.EMERALD_EXCAVATOR_PICKAXE);
                        entries.add(ModItems.LAPIS_EXCAVATOR_PICKAXE);
                        entries.add(ModItems.BLIGHTED_BLADE);
                        entries.add(ModItems.FRIGID_FLAMBERGE);
                        entries.add(ModItems.EDGE_OF_FRAILTY);
                        entries.add(ModItems.ECHO_TRIDENT);
                        entries.add(ModItems.COPPER_TRIDENT);
                        entries.add(ModItems.NETHERITE_SHIELD);
                        entries.add(ModItems.GOLD_SHIELD);
                        entries.add(ModItems.BLAZE_SHIELD);
                        entries.add(ModItems.ENDER_BOW);
                        entries.add(ModItems.SWIRLING_WINDS);


                    })
                    .build());
    public static final ItemGroup FORGERY_FUNSIES = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(Forgery.MOD_ID, "forgeryfunnies"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.TERRA_BLADE))
                    .displayName(Text.translatable("itemgroup.forgeryfunnies"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.TERRA_BLADE);
                    })
                    .build()
);



    public static void registerItemGroups() {
        Forgery.LOGGER.info("Registering Item Groups For " + Forgery.MOD_ID);
    }
}