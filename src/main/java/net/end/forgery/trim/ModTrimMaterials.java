package net.end.forgery.trim;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.trim.ArmorTrimMaterial;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;

public class ModTrimMaterials {
    public static final RegistryKey<ArmorTrimMaterial> ECHO_SHARD = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(String.valueOf(Items.ECHO_SHARD)));

    public static void bootstrap(Registerable<ArmorTrimMaterial> registerable) {
        register(registerable, Registries.ITEM.getEntry(Items.ECHO_SHARD),
                Style.EMPTY.withColor(TextColor.parse("#003366").getOrThrow()));

    }

    private static void register(Registerable<ArmorTrimMaterial> registerable,
                                 RegistryEntry<Item> item, Style style) {
        ArmorTrimMaterial trimMaterial = new ArmorTrimMaterial(ModTrimMaterials.ECHO_SHARD.getValue().getPath(), item, (float) 1.0, Map.of(),
                Text.translatable(Util.createTranslationKey("trim_material", ModTrimMaterials.ECHO_SHARD.getValue())).fillStyle(style));

        registerable.register(ModTrimMaterials.ECHO_SHARD, trimMaterial);
    }
}