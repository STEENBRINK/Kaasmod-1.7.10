package nl.steenbrink.kaasmod.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import nl.steenbrink.kaasmod.creativetab.KaasmodCreativetab;
import nl.steenbrink.kaasmod.lib.KaasmodBlocks;
import nl.steenbrink.kaasmod.lib.NameReference;
import nl.steenbrink.kaasmod.lib.Reference;

import java.util.Random;

public class BlockKaasBricksSlab extends BlockSlab
{
    public BlockKaasBricksSlab(boolean isDouble)
    {
        super(isDouble, Material.rock);
        this.setBlockName(NameReference.Blocks.KAAS_BRICKS_SLAB);
        this.setHardness(1.5F);
        this.setResistance(10.0F);
        this.setStepSound(soundTypePiston);
        this.setLightOpacity(0);

        if (!isDouble) {
            this.setCreativeTab(KaasmodCreativetab.KAASMOD_TAB);
        }
    }

    @Override
    public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z)
    {
        return new ItemStack(KaasmodBlocks.kaasBricksSlab, 0, 0);
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
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(KaasmodBlocks.kaasBricks.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

    @Override
    public Item getItemDropped(int metadata, Random rand, int fortune)
    {
        return Item.getItemFromBlock(KaasmodBlocks.kaasBricksSlab);
    }

    @Override
    protected ItemStack createStackedBlock(int meta)
    {
        return new ItemStack(KaasmodBlocks.kaasBricksSlab, 2, meta & 7);
    }


    @Override
    public IIcon getIcon(int side, int metaData)
    {
        return blockIcon;
    }

    @Override
    public String func_150002_b(int metaData)
    {
        return this.getUnlocalizedName();
    }
}