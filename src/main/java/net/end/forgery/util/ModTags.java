package net.end.forgery.util;

import net.end.forgery.Forgery;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.block.Block;

public class ModTags {
    public static class Blocks {

        public static final TagKey <Block> ORES = createTag("ores");
      private static TagKey <Block> createTag(String name) {

            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Forgery.MOD_ID, name));
        }
    }
}