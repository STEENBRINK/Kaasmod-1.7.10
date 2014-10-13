package nl.steenbrink.kaasmod.lib;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockCake;
import net.minecraft.block.BlockSlab;
import nl.steenbrink.kaasmod.block.*;
import nl.steenbrink.kaasmod.item.ItemKaasSlab;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class KaasmodBlocks
{
    public static final BasicBlock saltOre = new SaltoreBlock();
    public static final BlockCake kaasBlock = new KaasBlock();
    public static final BasicBlock kaasBricks = new KaasBricksBlock();
    public static final BlockSlab kaasBricksSlab = new KaasBricksSlab(false);
    public static final BlockSlab kaasBricksDoubleSlab = new KaasBricksSlab(true);

    public static void init()
    {
        GameRegistry.registerBlock(saltOre, "saltOre");
        GameRegistry.registerBlock(kaasBlock, "kaasBlock");
        GameRegistry.registerBlock(kaasBricks, "kaasBricks");
        GameRegistry.registerBlock(kaasBricksSlab, ItemKaasSlab.class, "kaasBricksSlab");
        GameRegistry.registerBlock(kaasBricksDoubleSlab, ItemKaasSlab.class, "kaasBricksDoubleSlab");
    }
}
