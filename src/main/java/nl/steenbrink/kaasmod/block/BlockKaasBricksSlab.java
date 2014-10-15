package nl.steenbrink.kaasmod.block;

import nl.steenbrink.kaasmod.lib.KaasmodBlocks;
import nl.steenbrink.kaasmod.lib.NameReference;

public class BlockKaasBricksSlab extends BlockBasicSlab
{
    public BlockKaasBricksSlab(boolean isDouble)
    {
        super(KaasmodBlocks.kaasBricksSlab, isDouble, false);
        this.setBlockName(NameReference.Blocks.KAAS_BRICKS_SLAB);
    }

}
