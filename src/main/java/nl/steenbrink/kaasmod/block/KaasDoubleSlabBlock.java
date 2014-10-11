package nl.steenbrink.kaasmod.block;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import nl.steenbrink.kaasmod.creativetab.KaasmodCreativetab;

public class KaasDoubleSlabBlock extends BlockSlab
{
    public KaasDoubleSlabBlock(boolean isDoubleSlab)
    {
        super(isDoubleSlab, Material.rock);
        this.setHardness(1.5F);
        this.setCreativeTab(KaasmodCreativetab.KAASMOD_TAB);
        this.setResistance(10.0F);
        this.setBlockName("kaasSlab");
        this.setStepSound(soundTypePiston);
    }

    @Override
    public String func_150002_b(int a)
    {
        return this.getUnlocalizedName();
    }
}
