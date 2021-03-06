package nl.steenbrink.kaasmod.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.client.renderer.texture.IIconRegister;
import nl.steenbrink.kaasmod.creativetab.KaasmodCreativetab;
import nl.steenbrink.kaasmod.lib.UnlocalizedNameHelper;

public class BlockBasicStair extends BlockStairs {

    protected BlockBasicStair(Block block, int meta) {
        super(block, meta);
        this.setCreativeTab(KaasmodCreativetab.KAASMOD_TAB);
        this.setLightOpacity(0);
    }

    @Override
    public String getUnlocalizedName() {
        return UnlocalizedNameHelper.getUnlocalizedBlockName(super.getUnlocalizedName());
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        blockIcon = iconRegister.registerIcon(String.format("%s", UnlocalizedNameHelper.getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

}
