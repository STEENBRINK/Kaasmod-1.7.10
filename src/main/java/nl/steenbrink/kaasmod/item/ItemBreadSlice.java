package nl.steenbrink.kaasmod.item;

import nl.steenbrink.kaasmod.lib.NameReference;

public class ItemBreadSlice extends ItemBasicFood
{
    public ItemBreadSlice()
    {
        super(2, 0.3F, false);
        this.setUnlocalizedName(NameReference.Items.BREAD_SLICE);
    }
}
