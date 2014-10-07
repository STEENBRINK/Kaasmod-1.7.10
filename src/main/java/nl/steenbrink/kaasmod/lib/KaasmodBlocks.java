package nl.steenbrink.kaasmod.lib;

import cpw.mods.fml.common.registry.GameRegistry;
import nl.steenbrink.kaasmod.block.BasicBlock;
import nl.steenbrink.kaasmod.block.SaltoreBlock;

public class KaasmodBlocks
{
    public static final BasicBlock saltOre = new SaltoreBlock();

    public void init()
    {
        GameRegistry.registerBlock(saltOre, "saltOre");
    }
}
