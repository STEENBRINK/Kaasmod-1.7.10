package nl.steenbrink.kaasmod.block;

import nl.steenbrink.kaasmod.lib.KaasmodBlocks;
import nl.steenbrink.kaasmod.lib.NameReference;

public class BlockKaasBricksStairs extends BlockBasicStair
{
    public BlockKaasBricksStairs(int meta)
    {
        super(KaasmodBlocks.kaasBricks, meta);
        this.setBlockName(NameReference.Blocks.KAAS_BRICK_STAIRS);
    }

}
