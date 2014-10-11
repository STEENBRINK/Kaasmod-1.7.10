package nl.steenbrink.kaasmod.lib;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockCake;
import nl.steenbrink.kaasmod.block.*;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class KaasmodBlocks
{
    public static final BasicBlock saltOre = new SaltoreBlock();
    public static final BlockCake kaasBlock = new KaasBlock();
    public static final BasicBlock kaasBricks = new KaasBricksBlock();
    public static final SlabBase kaasSlab = new KaasSlabBlock();
    //public static final SlabBase kaasDoubleSlab = new KaasDoubleSlabBlock();

    public static void init()
    {
        GameRegistry.registerBlock(saltOre, "saltOre");
        GameRegistry.registerBlock(kaasBlock, "kaasBlock");
        GameRegistry.registerBlock(kaasBricks, "kaasBricks");
        GameRegistry.registerBlock(kaasSlab, "kaasSlab");
        //GameRegistry.registerBlock(kaasDoubleSlab, "kaasDoubleSlab");
    }
}
