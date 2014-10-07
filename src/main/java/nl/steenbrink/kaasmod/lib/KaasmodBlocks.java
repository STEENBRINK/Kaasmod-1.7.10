package nl.steenbrink.kaasmod.lib;

import cpw.mods.fml.common.registry.GameRegistry;
import nl.steenbrink.kaasmod.block.BasicBlock;
import nl.steenbrink.kaasmod.block.KaasBlock;
import nl.steenbrink.kaasmod.block.SaltoreBlock;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class KaasmodBlocks
{
    public static final BasicBlock saltOre = new SaltoreBlock();
    public static final BasicBlock kaasBlock = new KaasBlock();

    public static void init()
    {
        GameRegistry.registerBlock(saltOre, "saltOre");
        GameRegistry.registerBlock(kaasBlock, "kaasBlock");
    }
}
