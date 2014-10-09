package nl.steenbrink.kaasmod.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockCake;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import nl.steenbrink.kaasmod.lib.KaasmodItems;
import nl.steenbrink.kaasmod.lib.Reference;

public class KaasBlock extends BlockCake
{
    @SideOnly(Side.CLIENT)
    private IIcon iconTop;
    @SideOnly(Side.CLIENT)
    private IIcon iconBottom;
    @SideOnly(Side.CLIENT)
    private IIcon iconInside;

    public KaasBlock()
    {
        super();
        this.setBlockName("kaas");
        this.setHardness(0.5F);
        this.setStepSound(soundTypeCloth);
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
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

    @Override
    public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int meta)
    {
        if (!world.isRemote && meta < 6) {

            EntityItem k = new EntityItem(world, x + 0.5, y + 0.5, z + 0.5, new ItemStack(KaasmodItems.cheeseSlice, 6 - meta));
            k.setVelocity(0, 0.2, 0);
            world.spawnEntityInWorld(k);
        }
    }

}