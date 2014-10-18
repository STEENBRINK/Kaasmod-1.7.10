package nl.steenbrink.kaasmod.block;

import net.minecraft.client.renderer.texture.IIconRegister;
import nl.steenbrink.kaasmod.lib.KaasmodBlocks;
import nl.steenbrink.kaasmod.lib.NameReference;

public class BlockKaasBricksSlab extends BlockBasicSlab
{
    public BlockKaasBricksSlab(boolean isDouble)
    {
        super(isDouble, false);
        this.setBlockName(NameReference.Blocks.KAAS_BRICKS_SLAB);
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {
        super.registerBlockIcons(iconRegister);
        this.setSlabBlock(KaasmodBlocks.kaasBricksSlab);
    }

}
