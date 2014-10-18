package nl.steenbrink.kaasmod.block;

import net.minecraft.client.renderer.texture.IIconRegister;
import nl.steenbrink.kaasmod.lib.KaasmodBlocks;
import nl.steenbrink.kaasmod.lib.NameReference;

public class BlockSmoothKaasSlab extends BlockBasicSlab
{

    public BlockSmoothKaasSlab(boolean isDouble)
    {
        super(isDouble, true);
        this.setBlockName(NameReference.Blocks.SMOOTH_KAAS_SLAB);
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {
        super.registerBlockIcons(iconRegister);
        this.setSlabBlock(KaasmodBlocks.smoothKaasSlab);
    }
}

