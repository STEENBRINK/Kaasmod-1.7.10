package nl.steenbrink.kaasmod.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockCake;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import nl.steenbrink.kaasmod.lib.KaasmodItems;
import nl.steenbrink.kaasmod.lib.NameReference;
import nl.steenbrink.kaasmod.lib.UnlocalizedNameHelper;

public class BlockKaas extends BlockCake
{
    @SideOnly(Side.CLIENT)
    private IIcon iconTop;
    @SideOnly(Side.CLIENT)
    private IIcon iconBottom;
    @SideOnly(Side.CLIENT)
    private IIcon iconInside;

    public BlockKaas()
    {
        super();
        this.setBlockName(NameReference.Blocks.KAAS_BLOCK);
        this.setHardness(0.5F);
        this.setStepSound(soundTypeCloth);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metaData)
    {
        switch (ForgeDirection.getOrientation(side)) {
            case UP:
                return iconTop;
            case DOWN:
                return iconBottom;
            case WEST:
                if (metaData > 0) return iconInside;
            default:
                return blockIcon;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        this.iconTop = iconRegister.registerIcon(String.format("%s", UnlocalizedNameHelper.getUnwrappedUnlocalizedName(this.getUnlocalizedName())) + "Top");
        this.iconBottom = iconRegister.registerIcon(String.format("%s", UnlocalizedNameHelper.getUnwrappedUnlocalizedName(this.getUnlocalizedName())) + "Bottom");
        this.iconInside = iconRegister.registerIcon(String.format("%s", UnlocalizedNameHelper.getUnwrappedUnlocalizedName(this.getUnlocalizedName())) + "Inside");
        this.blockIcon = iconRegister.registerIcon(String.format("%s", UnlocalizedNameHelper.getUnwrappedUnlocalizedName(this.getUnlocalizedName())) + "Side");
    }

    @Override
    public String getUnlocalizedName()
    {
        return UnlocalizedNameHelper.getUnlocalizedBlockName(super.getUnlocalizedName());
    }

    @Override
    public void onBlockHarvested(World world, int x, int y, int z, int metaData, EntityPlayer entityPlayer) {
        if (!world.isRemote && metaData < 6) {
            int itemsDropped = 6 - metaData;
            if (entityPlayer.getHeldItem() == null || entityPlayer.getHeldItem().getItem() != KaasmodItems.cheeseSlicer)
                itemsDropped /= 2;
            EntityItem entityItem = new EntityItem(world, x + 0.5, y + 0.5, z + 0.5, new ItemStack(KaasmodItems.cheeseSlice, itemsDropped));
            entityItem.setVelocity(0, 0.2, 0);
            world.spawnEntityInWorld(entityItem);
        }
    }
}