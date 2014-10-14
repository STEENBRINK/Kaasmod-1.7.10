package nl.steenbrink.kaasmod.item;

import nl.steenbrink.kaasmod.lib.NameReference;

public class ItemCheeseBread extends ItemBasicFood
{
    public ItemCheeseBread()
    {
        super(6, 0.7F, false);
        this.setUnlocalizedName(NameReference.Items.CHEESE_BREAD);
    }
}
