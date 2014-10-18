package nl.steenbrink.kaasmod.item;

import net.minecraft.item.ItemStack;
import nl.steenbrink.kaasmod.lib.NameReference;

public class ItemKnife extends ItemBasic
{
    public ItemKnife()
    {
        super();
        this.setUnlocalizedName(NameReference.Items.KNIFE);
        this.setContainerItem(this);
    }

    @Override
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemStack)
    {
        return false;
    }
}

