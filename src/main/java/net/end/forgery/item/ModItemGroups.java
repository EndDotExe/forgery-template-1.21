package net.end.forgery.item;

import net.end.forgery.Forgery;
import net.minecraft.item.ItemGroup;

public class ModItemGroups {
    public static final ItemGroup FORGERY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Forgery.MOD_ID, "smithing_template"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.smithing_template"))
                    .icon(() -> new ItemStack(ModItems.SMITHING_TEMPLATE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SMITHING_TEMPLATE);
                        entries.add(ModItems.SMITHING_TEMPLATE_2);

                    }).build());


    public static void RegisterItemGroups (){
        Forgery.LOGGER.info("Registering Item Groups For " +Forgery.MOD_ID)
    }
}