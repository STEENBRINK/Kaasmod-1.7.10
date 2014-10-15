package nl.steenbrink.kaasmod.item;

import com.google.common.collect.Sets;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import nl.steenbrink.kaasmod.creativetab.KaasmodCreativetab;
import nl.steenbrink.kaasmod.lib.KaasmodBlocks;
import nl.steenbrink.kaasmod.lib.NameReference;
import nl.steenbrink.kaasmod.lib.UnlocalizedNameHelper;

public class ItemCheeseSlicer extends ItemTool
{
    public ItemCheeseSlicer()
    {
        super(2.0F, ToolMaterial.IRON, Sets.newHashSet(KaasmodBlocks.kaasBlock));
        this.setUnlocalizedName(NameReference.Items.CHEESE_SLICER);
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
