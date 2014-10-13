package nl.steenbrink.kaasmod.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

public class MySlabItem extends ItemSlab
{
    public MySlabItem(Block block, BlockSlab slabHalf, BlockSlab slabFull, boolean isDouble)
    {
        super(block, slabHalf, slabFull, isDouble);
    }
}
