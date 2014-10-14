package nl.steenbrink.kaasmod.item;

import nl.steenbrink.kaasmod.lib.NameReference;

public class ItemCheeseSlice extends ItemBasicFood
{
    public ItemCheeseSlice()
    {
        super(1, 0.3F, false);
        this.setUnlocalizedName(NameReference.Items.CHEESE_SLICE);
    }
}
