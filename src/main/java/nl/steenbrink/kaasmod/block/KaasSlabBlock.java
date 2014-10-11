package nl.steenbrink.kaasmod.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockStoneSlab;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import nl.steenbrink.kaasmod.creativetab.KaasmodCreativetab;
import nl.steenbrink.kaasmod.lib.KaasmodBlocks;
import nl.steenbrink.kaasmod.lib.Reference;

public class KaasSlabBlock extends BlockStoneSlab
{
    public KaasSlabBlock(boolean isDoubleSlab)
    {
        super(isDoubleSlab);
        this.setHardness(1.5F);
        this.setCreativeTab(KaasmodCreativetab.KAASMOD_TAB);
        this.setResistance(10.0F);
        this.setBlockName("kaasSlab");
        this.setStepSound(soundTypePiston);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metaData)
    {
        return blockIcon;
    }


    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        this.blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(KaasmodBlocks.kaasBricks.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

}
