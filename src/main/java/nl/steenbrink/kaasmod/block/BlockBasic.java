package nl.steenbrink.kaasmod.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import nl.steenbrink.kaasmod.creativetab.KaasmodCreativetab;
import nl.steenbrink.kaasmod.lib.UnlocalizedNameHelper;

public class BlockBasic extends Block
{
    public BlockBasic(Material material)
    {
        super(material);
        this.setCreativeTab(KaasmodCreativetab.KAASMOD_TAB);
    }

    public BlockBasic()
    {
        this(Material.rock);
        this.setHardness(1.5F);
        this.setResistance(10.0F);
        this.setStepSound(soundTypeStone);
    }

    @Override
    public String getUnlocalizedName()
    {
        return UnlocalizedNameHelper.getUnlocalizedBlockName(super.getUnlocalizedName());
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", UnlocalizedNameHelper.getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }
}
