package net.end.forgery.item.custom;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class BlockInteractionRangeTool extends PickaxeItem {
    private static final double INCREASED_RANGE = 10.0;

    public BlockInteractionRangeTool(ToolMaterial material, Settings settings) {
        super(material, settings);
    }

    @Override
    public boolean canMine(BlockState state, World world, BlockPos pos, PlayerEntity player) {
        Vec3d playerPos = player.getPos();
        Vec3d blockPos = new Vec3d(pos.getX(), pos.getY(), pos.getZ());
        double distance = playerPos.distanceTo(blockPos);
        return distance <= INCREASED_RANGE && super.canMine(state, world, pos, player);
    }
}