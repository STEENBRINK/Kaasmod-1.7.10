package nl.steenbrink.kaasmod.item;

import net.minecraft.item.ItemStack;

public class ItemKnive extends ItemBasic
{
    public ItemKnive()
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

