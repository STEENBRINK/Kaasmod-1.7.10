package nl.steenbrink.kaasmod.handler;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import nl.steenbrink.kaasmod.lib.Reference;

import java.io.File;

public class ConfigHandler
{
    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile)
    {
        if (configuration == null) {
            configuration = new Configuration(configFile);
        }
    }

    @SubscribeEvent
    public void onConfigChangedEvt(ConfigChangedEvent.OnConfigChangedEvent evt)
    {
        if (evt.modID.equalsIgnoreCase(Reference.MOD_ID)) {
            //resync
        }
    }

    public void loadConfiguration()
    {
        testValue = configuration.getBoolean("testValue", Reference.CFG_TEST, false, "A Comment :O");
        if (configuration.hasChanged()) {
            configuration.save();
        }
    }
}
