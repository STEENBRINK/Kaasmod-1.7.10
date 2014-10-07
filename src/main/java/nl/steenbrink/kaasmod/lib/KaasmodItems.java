package nl.steenbrink.kaasmod.lib;

import cpw.mods.fml.common.registry.GameRegistry;
import nl.steenbrink.kaasmod.item.BasicItem;
import nl.steenbrink.kaasmod.item.RawSaltItem;

public class KaasmodItems
{
    public static final BasicItem rawSalt = new RawSaltItem();

    public static void init()
    {
        GameRegistry.registerItem(rawSalt, "RawSalt");
    }
}
