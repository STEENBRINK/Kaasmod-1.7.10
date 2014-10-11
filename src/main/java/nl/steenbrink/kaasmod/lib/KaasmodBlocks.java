package nl.steenbrink.kaasmod.lib;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockCake;
import net.minecraft.block.BlockStoneSlab;
import nl.steenbrink.kaasmod.block.*;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class KaasmodBlocks
{
    public static final BasicBlock saltOre = new SaltoreBlock();
    public static final BlockCake kaasBlock = new KaasBlock();
    public static final BasicBlock kaasBricks = new KaasBricksBlock();
    public static final BlockStoneSlab kaasSlab = new KaasSlabBlock(false);

    public static void init()
    {
        GameRegistry.registerBlock(saltOre, "saltOre");
        GameRegistry.registerBlock(kaasBlock, "kaasBlock");
        GameRegistry.registerBlock(kaasBricks, "kaasBricks");
        GameRegistry.registerBlock(kaasSlab, "kaasSlab");
    }
}
