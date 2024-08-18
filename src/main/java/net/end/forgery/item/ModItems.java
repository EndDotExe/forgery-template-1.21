package net.end.forgery.item;

import net.end.forgery.Forgery;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier; //Use the correct package

public class ModItems {
    public static final Item SMITHING_TEMPLATE = registerItem(new Item(new Item.Settings()));
    public static final Item SMITHING_TEMPLATE_TWO = registerItem(new Item(new Item.Settings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(SMITHING_TEMPLATE);
        entries.add(SMITHING_TEMPLATE_TWO);
    }

    private static Item registerItem(Item item) {
        /*
        * In the comments of the tutorial, you need to use Identifier.of (in the minecraft identifier package)
        * instead of new Identifier
        *
        * Comment in question:
        * "If anyone is having an error at 2:56 where it says "Identifier has private access"",
        * if you're modding for 1.21+ you need to replace 'new Identifier' with 'Identifier.of', and keep all the parameters the same."
        *
        * Thank you tk <3
         */
        return Registry.register(Registries.ITEM, Identifier.of(Forgery.MOD_ID, "smithing_template"), item);
    }

    public static void registerModItems() {
        Forgery.LOGGER.info("Registering Mod Items for " + Forgery.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
