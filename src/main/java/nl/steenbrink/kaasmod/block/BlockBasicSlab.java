package nl.steenbrink.kaasmod.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import nl.steenbrink.kaasmod.creativetab.KaasmodCreativetab;
import nl.steenbrink.kaasmod.lib.UnlocalizedNameHelper;

import java.util.Random;

public class BlockBasicSlab extends BlockSlab {

    private Block slabBlock;

    private boolean alternateTextures;
    protected IIcon sideTexture;
    protected IIcon topTexture;

    public BlockBasicSlab(Block slabBlock, boolean isDouble, boolean alternateTextures) {
        super(isDouble, Material.rock);
        this.slabBlock = slabBlock;
        this.alternateTextures = alternateTextures;

        this.setHardness(1.5F);
        this.setResistance(10.0F);
        this.setStepSound(soundTypePiston);
        this.setLightOpacity(0);

        if (!isDouble) {
            this.setCreativeTab(KaasmodCreativetab.KAASMOD_TAB);
        }
    }

    @Override
    public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z) {
        return new ItemStack(this.slabBlock, 0, 0);
    }

    @Override
    public String getUnlocalizedName() {
        return UnlocalizedNameHelper.getUnlocalizedBlockName(super.getUnlocalizedName());
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        if (alternateTextures) {
            this.sideTexture = iconRegister.registerIcon(UnlocalizedNameHelper.getUnwrappedUnlocalizedName(this.getUnlocalizedName() + "_Side"));
            this.topTexture = iconRegister.registerIcon(UnlocalizedNameHelper.getUnwrappedUnlocalizedName(this.getUnlocalizedName() + "_Top"));
        } else {
            this.blockIcon = iconRegister.registerIcon(UnlocalizedNameHelper.getUnwrappedUnlocalizedName(this.getUnlocalizedName()));
        }
    }

    @Override
    public Item getItemDropped(int metadata, Random rand, int fortune) {
        return Item.getItemFromBlock(this.slabBlock);
    }

    @Override
    protected ItemStack createStackedBlock(int meta) {
        return new ItemStack(this.slabBlock, 2, meta & 7);
    }


    @Override
    public IIcon getIcon(int side, int metaData) {
        if (!this.alternateTextures) return this.blockIcon;
        if (ForgeDirection.getOrientation(side).offsetY != 0) {
            return this.topTexture;
        } else {
            return this.sideTexture;
        }
    }

    @Override
    public String func_150002_b(int metaData) {
        return this.getUnlocalizedName();
    }
}
