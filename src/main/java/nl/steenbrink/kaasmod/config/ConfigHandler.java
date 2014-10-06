package nl.steenbrink.kaasmod.config;

import net.minecraftforge.common.config.Configuration;
import nl.steenbrink.kaasmod.lib.Reference;

import java.io.File;

public class ConfigHandler
{
    public static void init(File configFile)
    {
        Configuration configuration = new Configuration(configFile);

        try {
            configuration.load();

            boolean configValue = configuration.get(Reference.CFG_TEST, "configValue", true, "Comment :O").getBoolean(true);
        } catch (Exception e) {

        } finally {
            configuration.save();
        }
    }
}
