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
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(KaasmodItems.cheeseSlicer), "K ", " S", 'K', new ItemStack(KaasmodItems.knive), 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(KaasmodBlocks.kaasBricks), "KK", "KK", 'K', new ItemStack(KaasmodItems.kaasBrick)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(KaasmodItems.kaas), "CCC", "CCC", 'C', new ItemStack(KaasmodItems.cheeseSlice)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(KaasmodItems.cheeseBread), " B ", "CCC", " B ", 'C', new ItemStack(KaasmodItems.cheeseSlice), 'B', new ItemStack(KaasmodItems.breadSlice)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(KaasmodItems.cheeseBaconBread), " B ", "CPC", " B ", 'C', new ItemStack(KaasmodItems.cheeseSlice), 'P', new ItemStack(Items.cooked_porkchop), 'B', new ItemStack(KaasmodItems.breadSlice)));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(KaasmodItems.ingredients), new ItemStack(KaasmodItems.pureSalt), new ItemStack(Items.milk_bucket)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(KaasmodItems.breadSlice, 2), new ItemStack(Items.bread), new ItemStack(KaasmodItems.knive)));

        GameRegistry.addSmelting(new ItemStack(KaasmodItems.cheeseBaconBread), new ItemStack(KaasmodItems.roastedSandwich), 0.35F);
    }
}
