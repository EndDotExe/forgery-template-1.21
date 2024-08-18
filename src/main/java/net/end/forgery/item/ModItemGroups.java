package net.end.forgery.item;

import net.end.forgery.Forgery;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup FORGERY_GROUP;

    static {
        FORGERY_GROUP = Registry.register(Registries.ITEM_GROUP,
                Identifier.of(Forgery.MOD_ID, "smithing"),
                FabricItemGroup.builder().displayName(Text.translatable("itemgroup.smithing"))
                        .icon(() -> new ItemStack(ModItems.SMITHING_TEMPLATE)).entries((displayContext, entries) -> {
                            entries.add(ModItems.SMITHING_TEMPLATE);
                            entries.add(ModItems.SMITHING_TEMPLATE_TWO);

                        }).build());
    }


    public static void RegisterItemGroups (){
        Forgery.LOGGER.info("Registering Item Groups For " +Forgery.MOD_ID);
    }

    public static void preregistration() {
    }
}