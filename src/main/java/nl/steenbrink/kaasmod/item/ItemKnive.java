package nl.steenbrink.kaasmod.item;

import net.minecraft.item.ItemStack;
import nl.steenbrink.kaasmod.lib.NameReference;

public class ItemKnive extends ItemBasic
{
    public ItemKnive()
    {
        super();
        this.setUnlocalizedName(NameReference.Items.KNIVE);
        this.setContainerItem(this);
    }

    @Override
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemStack)
    {
        return false;
    }
}

