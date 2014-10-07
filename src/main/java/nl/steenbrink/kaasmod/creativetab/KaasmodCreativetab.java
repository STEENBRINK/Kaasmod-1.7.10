package nl.steenbrink.kaasmod.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import nl.steenbrink.kaasmod.lib.KaasmodItems;
import nl.steenbrink.kaasmod.lib.Reference;

public class KaasmodCreativetab
{
    public static final CreativeTabs KAASMOD_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return KaasmodItems.kaas;
        }
    };
}
