package net.end.forgery.item;

import net.end.forgery.Forgery;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import org.intellij.lang.annotations.Identifier;

public class ModItems {
    public static final Item SMITHING_TEMPLATE = registerItem(new Item(new Item.Settings()));


private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
    entries.add(SMITHING_TEMPLATE);
}

    private static Item registerItem(Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Forgery.MOD_ID, "smithing_template"));
    }

    public static void registerModItems() {
        Forgery.LOGGER.info("Registering Mod Items for " + Forgery.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
