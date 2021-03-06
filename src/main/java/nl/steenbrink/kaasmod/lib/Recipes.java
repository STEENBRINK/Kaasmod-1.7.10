package nl.steenbrink.kaasmod.lib;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(KaasmodItems.knive), "I ", " S", 'S', "stickWood", 'I', "ingotIron"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(KaasmodItems.cheeseSlicer), "I", "S", 'I', "ingotIron", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(KaasmodBlocks.kaasBricks), "KK", "KK", 'K', new ItemStack(KaasmodItems.kaasBrick)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(KaasmodItems.kaas), "CCC", "CCC", 'C', new ItemStack(KaasmodItems.cheeseSlice)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(KaasmodItems.cheeseBread), " B ", "CCC", " B ", 'C', new ItemStack(KaasmodItems.cheeseSlice), 'B', new ItemStack(KaasmodItems.breadSlice)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(KaasmodItems.cheeseBaconBread), " B ", "CPC", " B ", 'C', new ItemStack(KaasmodItems.cheeseSlice), 'P', new ItemStack(Items.cooked_porkchop), 'B', new ItemStack(KaasmodItems.breadSlice)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(KaasmodBlocks.kaasBricksSlab, 6), "CCC", 'C', new ItemStack(KaasmodBlocks.kaasBricks)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(KaasmodBlocks.kaasBricksStairs, 4), "C  ", "CC ", "CCC", 'C', new ItemStack(KaasmodBlocks.kaasBricks)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(KaasmodBlocks.smoothKaasSlab, 6), "CCC", 'C', new ItemStack(KaasmodBlocks.smoothKaas)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(KaasmodBlocks.smoothKaasStairs, 4), "C  ", "CC ", "CCC", 'C', new ItemStack(KaasmodBlocks.smoothKaas)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(KaasmodBlocks.kaasBricks, 4), "KK", "KK", 'K', new ItemStack(KaasmodBlocks.smoothKaas)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(KaasmodBlocks.smoothKaas, 4), "CC", "CC", 'C', new ItemStack(KaasmodItems.kaasBrick)));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(KaasmodItems.ingredients), new ItemStack(KaasmodItems.pureSalt), new ItemStack(Items.milk_bucket)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(KaasmodItems.breadSlice, 2), new ItemStack(Items.bread), new ItemStack(KaasmodItems.knive)));

        GameRegistry.addSmelting(new ItemStack(KaasmodItems.cheeseBaconBread), new ItemStack(KaasmodItems.roastedSandwich), 0.35F);
        GameRegistry.addSmelting(new ItemStack(KaasmodItems.kaasBrick), new ItemStack(KaasmodItems.cheeseSlice), 0.15F);
    }
}
