package nl.steenbrink.kaasmod.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.client.renderer.texture.IIconRegister;
import nl.steenbrink.kaasmod.creativetab.KaasmodCreativetab;
import nl.steenbrink.kaasmod.lib.KaasmodBlocks;
import nl.steenbrink.kaasmod.lib.NameReference;
import nl.steenbrink.kaasmod.lib.Reference;

public class BlockSmoothKaasStairs extends BlockStairs
{
    public BlockSmoothKaasStairs(Block block, int meta)
    {
        super(block, meta);
        this.setBlockName(NameReference.Blocks.KAAS_BRICK_STAIRS);
        this.setCreativeTab(KaasmodCreativetab.KAASMOD_TAB);
        this.setLightOpacity(0);
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
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(KaasmodBlocks.smoothKaasSlab.getUnlocalizedName())) + "Side");
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
