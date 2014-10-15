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
    public static final BlockStairs kaasBricksStairs = new BlockKaasBricksStairs(KaasmodBlocks.kaasBricks, 0);
    public static final BlockBasic smoothKaas = new BlockSmoothKaas();
    public static final BlockSlab smoothKaasSlab = new BlockSmoothKaasSlab(false);
    public static final BlockSlab smoothKaasDoubleSlab = new BlockSmoothKaasSlab(true);
    public static final BlockStairs smoothKaasStairs = new BlockSmoothKaasStairs(KaasmodBlocks.smoothKaas, 0);

    public static void init()
    {
        GameRegistry.registerBlock(kaasBlock, NameReference.Blocks.KAAS_BLOCK);
        GameRegistry.registerBlock(kaasBricks, NameReference.Blocks.KAAS_BRICKS);
        GameRegistry.registerBlock(kaasBricksSlab, ItemKaasBrickSlab.class, NameReference.Blocks.KAAS_BRICKS_SLAB);
        GameRegistry.registerBlock(kaasBricksDoubleSlab, ItemKaasBrickSlab.class, NameReference.Blocks.KAAS_BRICKS_DOUBLE_SLAB);
        GameRegistry.registerBlock(kaasBricksStairs, NameReference.Blocks.KAAS_BRICK_STAIRS);
        GameRegistry.registerBlock(saltOre, NameReference.Blocks.SALT_ORE);
        GameRegistry.registerBlock(smoothKaas, NameReference.Blocks.SMOOTH_KAAS);
        GameRegistry.registerBlock(smoothKaasSlab, ItemSmoothKaasSlab.class, NameReference.Blocks.SMOOTH_KAAS_SLAB);
        GameRegistry.registerBlock(smoothKaasDoubleSlab, ItemSmoothKaasSlab.class, NameReference.Blocks.SMOOTH_KAAS_DOUBLE_SLAB);
        GameRegistry.registerBlock(smoothKaasStairs, NameReference.Blocks.SMOOTH_KAAS_STAIRS);
    }
}
