package nl.steenbrink.kaasmod.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockStoneSlab;
import net.minecraft.client.renderer.texture.IIconRegister;
import nl.steenbrink.kaasmod.creativetab.KaasmodCreativetab;
import nl.steenbrink.kaasmod.lib.Reference;

public class KaasSlabBlock extends BlockStoneSlab
{
    public KaasSlabBlock(boolean isDoubleSlab)
    {
        super(false);
        this.setHardness(1.5F);
        this.setCreativeTab(KaasmodCreativetab.KAASMOD_TAB);
        this.setResistance(10.0F);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

}
