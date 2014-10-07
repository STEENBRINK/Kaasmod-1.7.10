package nl.steenbrink.kaasmod.lib;

import cpw.mods.fml.common.registry.GameRegistry;
import nl.steenbrink.kaasmod.item.BasicItem;
import nl.steenbrink.kaasmod.item.KaasItem;
import nl.steenbrink.kaasmod.item.RawSaltItem;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class KaasmodItems
{
    public static final BasicItem rawSalt = new RawSaltItem();
    public static final BasicItem kaas = new KaasItem(KaasmodBlocks.kaasBlock);

    public static void init()
    {
        GameRegistry.registerItem(rawSalt, "rawSalt");
        GameRegistry.registerItem(kaas, "kaas");
    }
}
