package nl.steenbrink.kaasmod.client.gui;

import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import nl.steenbrink.kaasmod.handler.ConfigHandler;
import nl.steenbrink.kaasmod.lib.Reference;

public class MyGuiConfig extends GuiConfig
{
    public MyGuiConfig(GuiScreen guiScreen)
    {
        super(guiScreen,
                new ConfigElement(ConfigHandler.configuration.getCategory(Reference.CFG_TEST)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigHandler.configuration.toString()));
    }
}