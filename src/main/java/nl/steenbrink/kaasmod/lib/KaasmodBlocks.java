package nl.steenbrink.kaasmod.lib;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockCake;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import nl.steenbrink.kaasmod.block.*;
import nl.steenbrink.kaasmod.item.ItemKaasBrickSlab;
import nl.steenbrink.kaasmod.item.ItemSmoothKaasSlab;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class KaasmodBlocks
{
    public static final BlockBasic saltOre = new BlockSaltOreBlock();
    public static final BlockCake kaasBlock = new BlockKaas();
    public static final BlockBasic kaasBricks = new BlockKaasBricks();
    public static final BlockSlab kaasBricksSlab = new BlockKaasBricksSlab(false);
    public static final BlockSlab kaasBricksDoubleSlab = new BlockKaasBricksSlab(true);
    public static final BlockStairs kaasBrickStairs = new BlockKaasBricksStairs(KaasmodBlocks.kaasBricks, 0);
    public static final BlockBasic smoothKaasBlock = new BlockSmoothKaas();
    public static final BlockSlab smoothKaasSlab = new BlockSmoothKaasSlab(false);
    public static final BlockSlab smoothKaasDoubleSlab = new BlockSmoothKaasSlab(true);
    public static final BlockStairs smoothKaasStairs = new BlockSmoothKaasStairs(KaasmodBlocks.smoothKaasBlock, 0);

    public static void init()
    {
        GameRegistry.registerBlock(saltOre, "saltOre");
        GameRegistry.registerBlock(kaasBlock, "kaasBlock");
        GameRegistry.registerBlock(kaasBricks, "kaasBricks");
        GameRegistry.registerBlock(kaasBricksSlab, ItemKaasBrickSlab.class, "kaasBricksSlab");
        GameRegistry.registerBlock(kaasBricksDoubleSlab, ItemKaasBrickSlab.class, "kaasBricksDoubleSlab");
        GameRegistry.registerBlock(kaasBrickStairs, "kaasBricksStairs");
        GameRegistry.registerBlock(smoothKaasBlock, "smoothKaasBlock");
        GameRegistry.registerBlock(smoothKaasSlab, ItemSmoothKaasSlab.class, "smoothKaasSlab");
        GameRegistry.registerBlock(smoothKaasDoubleSlab, ItemSmoothKaasSlab.class, "smoothKaasDoubleSlab");
        GameRegistry.registerBlock(smoothKaasStairs, "smoothKaasStairs");
    }
}
