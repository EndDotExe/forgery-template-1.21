package net.end.forgery.datagen;

import net.end.forgery.block.ModBlocks;
import net.end.forgery.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SMITHING_TABLE_EX);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.AMETHYST_EXCAVATOR_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.REDSTONE_EXCAVATOR_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LAPIS_EXCAVATOR_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_EXCAVATOR_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLIGHTED_BLADE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FRIGID_FLAMBERGE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.SMITHING_TEMPLATE_EX, Models.GENERATED);
        itemModelGenerator.register(ModItems.SMITHING_TEMPLATE_GC, Models.GENERATED);
        itemModelGenerator.register(ModItems.SMITHING_TEMPLATE_PH, Models.GENERATED);
        itemModelGenerator.register(ModItems.SMITHING_TEMPLATE_WI, Models.GENERATED);
        itemModelGenerator.register(ModItems.SMITHING_TEMPLATE_FL, Models.GENERATED);

    }
}
