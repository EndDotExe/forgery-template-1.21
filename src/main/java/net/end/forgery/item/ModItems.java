package net.end.forgery.item;

import net.end.forgery.Forgery;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
// All the items in the mod & their properties
public class ModItems {
    public static final Item SMITHING_TEMPLATE_EX = registerItem("smithing_template_ex", SmithingTemplateItem.createNetheriteUpgrade());
    public static final Item SMITHING_TEMPLATE_PH = registerItem("smithing_template_ph", SmithingTemplateItem.createNetheriteUpgrade());
    public static final Item SMITHING_TEMPLATE_GC = registerItem("smithing_template_gc", SmithingTemplateItem.createNetheriteUpgrade());
    public static final Item SMITHING_TEMPLATE_WI = registerItem("smithing_template_wi", SmithingTemplateItem.createNetheriteUpgrade());
    public static final Item SMITHING_TEMPLATE_FL = registerItem("smithing_template_fl", SmithingTemplateItem.createNetheriteUpgrade());
    public static final Item LAPIS_EXCAVATOR_PICKAXE = registerItem("lapis_excavator_pickaxe", (new net.end.forgery.item.custom.VeinminerToolItem(ToolMaterials.NETHERITE, (new Item.Settings()).rarity(Rarity.EPIC).attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.NETHERITE, 1.0F, -2.8F)))));
    public static final Item AMETHYST_EXCAVATOR_PICKAXE = registerItem("amethyst_excavator_pickaxe", (new net.minecraft.item.PickaxeItem(ToolMaterials.NETHERITE, (new Item.Settings()).rarity(Rarity.EPIC).attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.NETHERITE, 1.0F, -2.8F )))));
    public static final Item REDSTONE_EXCAVATOR_PICKAXE = registerItem("redstone_excavator_pickaxe", (new net.minecraft.item.PickaxeItem(ToolMaterials.NETHERITE, (new Item.Settings()).rarity(Rarity.EPIC).attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.NETHERITE, 1.0F, -2.8F )))));
    public static final Item EMERALD_EXCAVATOR_PICKAXE = registerItem("emerald_excavator_pickaxe",(new net.minecraft.item.PickaxeItem(ToolMaterials.NETHERITE, (new Item.Settings()).rarity(Rarity.EPIC).attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.NETHERITE, 1.0F, -2.8F )))));
    public static final Item BLIGHTED_BLADE = registerItem("blighted_blade", (new net.end.forgery.item.custom.PoisonSwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).rarity(Rarity.UNCOMMON).attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -1.0F)))));
    public static final Item FRIGID_FLAMBERGE = registerItem("frigid_flamberge", (new net.end.forgery.item.custom.SlownessSwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).rarity(Rarity.UNCOMMON).attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 6, -2.0F)))));
    public static final Item EDGE_OF_FRAILTY = registerItem("edge_of_frailty", (new net.end.forgery.item.custom.WeaknessSwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).rarity(Rarity.UNCOMMON).attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 7, -3.0F)))));
    public static final Item ECHO_TRIDENT = registerItem("echo_trident", (new net.minecraft.item.TridentItem (new Item.Settings())));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Forgery.MOD_ID, name), item);
    }
// Adding items to their respective item groups
    public static void registerModItems() {
        Forgery.LOGGER.info("Registering Mod Items for " + Forgery.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {

            entries.add(LAPIS_EXCAVATOR_PICKAXE);
            entries.add(AMETHYST_EXCAVATOR_PICKAXE);
            entries.add(REDSTONE_EXCAVATOR_PICKAXE);
            entries.add(EMERALD_EXCAVATOR_PICKAXE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(BLIGHTED_BLADE);
            entries.add(FRIGID_FLAMBERGE);
            entries.add(EDGE_OF_FRAILTY);
            entries.add(ECHO_TRIDENT);

                });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(SMITHING_TEMPLATE_EX);
            entries.add(SMITHING_TEMPLATE_PH);
            entries.add(SMITHING_TEMPLATE_GC);
            entries.add(SMITHING_TEMPLATE_WI);
            entries.add(SMITHING_TEMPLATE_FL);
        });
    }
}
