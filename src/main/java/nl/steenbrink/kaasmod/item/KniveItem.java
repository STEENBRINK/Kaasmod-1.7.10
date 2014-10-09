package nl.steenbrink.kaasmod.item;

import net.minecraft.item.ItemStack;

public class KniveItem extends BasicItem
{
    public KniveItem()
    {
        super();
        this.setUnlocalizedName("knive");
        this.setContainerItem(this);
    }

    @Override
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemStack)
    {
        return false;
    }
}

