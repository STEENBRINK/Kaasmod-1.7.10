package nl.steenbrink.kaasmod.block;

import nl.steenbrink.kaasmod.lib.NameReference;

public class BlockSmoothKaasSlab extends BlockBasicSlab
{

    public BlockSmoothKaasSlab(boolean isDouble)
    {
        super(isDouble, true);
        this.setBlockName(NameReference.Blocks.SMOOTH_KAAS_SLAB);
    }

}

