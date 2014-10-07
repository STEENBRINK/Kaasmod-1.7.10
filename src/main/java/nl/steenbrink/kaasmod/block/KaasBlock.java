package nl.steenbrink.kaasmod.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import nl.steenbrink.kaasmod.lib.KaasmodItems;

import java.util.Random;

public class KaasBlock extends BasicBlock
{
    @SideOnly(Side.CLIENT)
    private IIcon iconTop;
    @SideOnly(Side.CLIENT)
    private IIcon iconBottom;
    @SideOnly(Side.CLIENT)
    private IIcon iconInside;

    public KaasBlock()
    {
        super(Material.cake);
        this.setBlockName("kaas");
        this.setCreativeTab(null);
        this.setTickRandomly(true);
    }

    /**
     * Updates the blocks bounds based on its current state. Args: world, x, y, z
     */
    @Override
    public void setBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z)
    {
        int l = world.getBlockMetadata(x, y, z);
        float f = 0.0625F;
        float f1 = (float) (1 + l * 2) / 16.0F;
        float f2 = 0.5F;
        this.setBlockBounds(f1, 0.0F, f, 1.0F - f, f2, 1.0F - f);
    }

    /**
     * Sets the block's bounds for rendering it as an item
     */
    @Override
    public void setBlockBoundsForItemRender()
    {
        float f = 0.0625F;
        float f1 = 0.5F;
        this.setBlockBounds(f, 0.0F, f, 1.0F - f, f1, 1.0F - f);
    }

    /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     */
    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z)
    {
        int l = world.getBlockMetadata(x, y, z);
        float f = 0.0625F;
        float f1 = (float) (1 + l * 2) / 16.0F;
        float f2 = 0.5F;
        return AxisAlignedBB.getBoundingBox((double) ((float) x + f1), (double) y, (double) ((float) z + f), (double) ((float) (x + 1) - f), (double) ((float) y + f2 - f), (double) ((float) (z + 1) - f));
    }

    /**
     * Returns the bounding box of the wired rectangular prism to render.
     */
    @Override
    @SideOnly(Side.CLIENT)
    public AxisAlignedBB getSelectedBoundingBoxFromPool(World world, int x, int y, int z)
    {
        int l = world.getBlockMetadata(x, y, z);
        float f = 0.0625F;
        float f1 = (float) (1 + l * 2) / 16.0F;
        float f2 = 0.5F;
        return AxisAlignedBB.getBoundingBox((double) ((float) x + f1), (double) y, (double) ((float) z + f), (double) ((float) (x + 1) - f), (double) ((float) y + f2), (double) ((float) (z + 1) - f));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metaData)
    {
        if (ForgeDirection.getOrientation(side) == ForgeDirection.UP) {
            return iconTop;
        }
        if (ForgeDirection.getOrientation(side) == ForgeDirection.DOWN) {
            return iconBottom;
        }
        if (ForgeDirection.getOrientation(side) == ForgeDirection.WEST && metaData > 0) {
            return iconInside;
        } else {
            return blockIcon;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        this.iconTop = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())) + "Top");
        this.iconBottom = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())) + "Bottom");
        this.iconInside = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())) + "Inside");
        this.blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())) + "Side");
    }

    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    /**
     * Called upon block activation (right click on the block.)
     */

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float j, float k, float l)
    {
        this.kaas(world, x, y, z, player);
        return true;
    }

    private void kaas(World world, int x, int y, int z, EntityPlayer player)
    {
        if (player.canEat(false)) {
            player.getFoodStats().addStats(2, 0.1F);
            int l = world.getBlockMetadata(x, y, z) + 1;

            if (l >= 6) {
                world.setBlockToAir(x, y, z);
            } else {
                world.setBlockMetadataWithNotify(x, y, z, l, 2);
            }
        }
    }

    /**
     * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
     */
    @Override
    public boolean canPlaceBlockAt(World world, int x, int y, int z)
    {
        return !super.canPlaceBlockAt(world, x, y, z) ? false : this.canBlockStay(world, x, y, z);
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor Block
     */
    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block block)
    {
        if (!this.canBlockStay(world, x, y, z)) {
            world.setBlockToAir(x, y, z);
        }
    }

    /**
     * Can this block stay at this position.  Similar to canPlaceBlockAt except gets checked often with plants.
     */
    @Override
    public boolean canBlockStay(World world, int x, int y, int z)
    {
        return world.getBlock(x, y - 1, z).getMaterial().isSolid();
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    @Override
    public int quantityDropped(Random rand)
    {
        return 0;
    }

    @Override
    public Item getItemDropped(int x, Random rand, int z)
    {
        return null;
    }

    /**
     * Gets an item for the block being called on. Args: world, x, y, z
     */
    @Override
    @SideOnly(Side.CLIENT)
    public Item getItem(World world, int x, int y, int z)
    {
        return KaasmodItems.kaas;
    }
}
