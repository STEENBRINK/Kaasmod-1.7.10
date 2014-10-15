package nl.steenbrink.kaasmod.block;

import nl.steenbrink.kaasmod.lib.KaasmodBlocks;
import nl.steenbrink.kaasmod.lib.NameReference;

public class BlockSmoothKaasStairs extends BlockBasicStair
{
    public BlockSmoothKaasStairs(int meta)
    {
        super(KaasmodBlocks.smoothKaas, meta);
        this.setBlockName(NameReference.Blocks.SMOOTH_KAAS_STAIRS);
    }

}
