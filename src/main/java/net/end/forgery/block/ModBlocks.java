package net.end.forgery.block;

import net.end.forgery.Forgery;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SmithingTableBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block SMITHING_TABLE_EX = registerBlock("smithing_table_ex",
            new Block(SmithingTableBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.NETHERITE)));
//adding a new block with the netherite sound groupe

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Forgery.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Forgery.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
// the registering process thingy ^^^
    public static void registerModBlocks() {
        Forgery.LOGGER.info("Registering Mod Blocks for" + Forgery.MOD_ID);

        ItemGroupEvents .modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.add(ModBlocks.SMITHING_TABLE_EX);
        });
    } // adding the block to an item group
}
