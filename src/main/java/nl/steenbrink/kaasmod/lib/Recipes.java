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
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(KaasmodBlocks.kaasBricks), "kk", "kk", 'k', new ItemStack(KaasmodItems.kaasBrick)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(KaasmodItems.kaas), "ccc", "ccc", 'c', new ItemStack(KaasmodItems.cheeseSlice)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(KaasmodItems.cheeseBread), new Object[]{"KKK", "WWW", 'K', KaasmodItems.cheeseSlice, 'W', Items.wheat}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(KaasmodItems.cheeseBaconBread), new Object[]{" B ", "KKK", "WWW", 'B', Items.cooked_porkchop, 'K', KaasmodItems.cheeseSlice, 'W', Items.wheat}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(KaasmodItems.cheeseSlicer), new Object[]{"  I", " S ", "S  ", 'S', "stickWood", 'I', "ingotIron"}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(KaasmodItems.cheeseSlicer), new Object[]{"I  ", " S ", "  S", 'S', "stickWood", 'I', "ingotIron"}));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(KaasmodItems.ingredients), new Object[]{new ItemStack(KaasmodItems.pureSalt), new ItemStack(Items.milk_bucket)}));
    }
}
