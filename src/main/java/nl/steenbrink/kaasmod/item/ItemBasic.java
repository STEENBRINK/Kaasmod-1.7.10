package nl.steenbrink.kaasmod.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import nl.steenbrink.kaasmod.creativetab.KaasmodCreativetab;
import nl.steenbrink.kaasmod.lib.UnlocalizedNameHelper;

public class ItemBasic extends Item
{
    public ItemBasic()
    {
        super();
        this.setCreativeTab(KaasmodCreativetab.KAASMOD_TAB);
    }

    @Override
    public String getUnlocalizedName()
    {
        return UnlocalizedNameHelper.getUnlocalizedItemName(super.getUnlocalizedName());
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        return this.getUnlocalizedName();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(UnlocalizedNameHelper.getUnwrappedUnlocalizedName(this.getUnlocalizedName()));
    }
}
