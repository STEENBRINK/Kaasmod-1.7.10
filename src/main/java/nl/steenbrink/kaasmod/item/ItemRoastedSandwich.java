package nl.steenbrink.kaasmod.item;

import nl.steenbrink.kaasmod.lib.NameReference;

public class ItemRoastedSandwich extends ItemBasicFood
{
    public ItemRoastedSandwich()
    {
        super(10, 1.2F, false);
        this.setUnlocalizedName(NameReference.Items.ROASTED_SANDWICH);
    }
}
