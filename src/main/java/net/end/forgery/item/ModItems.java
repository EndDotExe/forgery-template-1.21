package net.end.forgery.item;

import net.end.forgery.Forgery;
import net.end.forgery.item.custom.VeinminerToolItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier; //Use the correct package

public class ModItems {
    public static final Item SMITHING_TEMPLATE_EX = registerItem("smithing_template_ex", new Item(new Item.Settings()));

    public static final Item SMITHING_TEMPLATE_PH = registerItem("smithing_template_ph", new Item(new Item.Settings()));

    public static final Item LAPIS_EXCAVATOR_PICKAXE = registerItem("lapis_excavator_pickaxe", new VeinminerToolItem(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Forgery.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Forgery.LOGGER.info("Registering Mod Items for " + Forgery.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(LAPIS_EXCAVATOR_PICKAXE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(SMITHING_TEMPLATE_EX);
            entries.add(SMITHING_TEMPLATE_PH);
        });
    }
}
