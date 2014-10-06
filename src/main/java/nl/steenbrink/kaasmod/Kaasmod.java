package nl.steenbrink.kaasmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import nl.steenbrink.kaasmod.handler.ConfigHandler;
import nl.steenbrink.kaasmod.lib.Reference;
import nl.steenbrink.kaasmod.proxy.IProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Kaasmod
{
    @Mod.Instance(Reference.MOD_ID)
    public static Kaasmod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent evt)
    {
        ConfigHandler.init(evt.getSuggestedConfigurationFile());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent evt)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent evt)
    {

    }
}

