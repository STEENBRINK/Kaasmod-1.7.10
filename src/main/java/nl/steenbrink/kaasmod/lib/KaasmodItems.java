package nl.steenbrink.kaasmod.lib;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemTool;
import nl.steenbrink.kaasmod.item.*;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class KaasmodItems
{
    public static final ItemBasic rawSalt = new ItemRawSalt();
    public static final ItemBasic kaas = new ItemKaas(KaasmodBlocks.kaasBlock);
    public static final ItemBasicFood cheeseSlice = new ItemCheeseSlice();
    public static final ItemBasicFood cheeseBread = new ItemCheeseBread();
    public static final ItemBasicFood cheeseBaconBread = new ItemCheeseBaconBread();
    public static final ItemBasicFood roastedSandwich = new ItemRoastedSandwich();
    public static final ItemTool cheeseSlicer = new ItemCheeseSlicer();
    public static final ItemBasic ingredients = new ItemIngredients();
    public static final ItemBasic pureSalt = new ItemPureSalt();
    public static final ItemBasic kaasBrick = new ItemKaasBrick();
    public static final ItemBasic knive = new ItemKnive();
    public static final ItemBasicFood breadSlice = new ItemBreadSlice();


    public static void init()
    {
        GameRegistry.registerItem(rawSalt, "rawSalt");
        GameRegistry.registerItem(kaas, "kaas");
        GameRegistry.registerItem(cheeseSlice, "cheeseSlice");
        GameRegistry.registerItem(cheeseBread, "cheeseBread");
        GameRegistry.registerItem(cheeseBaconBread, "cheeseBaconBread");
        GameRegistry.registerItem(roastedSandwich, "roastedSandwich");
        GameRegistry.registerItem(cheeseSlicer, "cheeseSlicer");
        GameRegistry.registerItem(ingredients, "ingredients");
        GameRegistry.registerItem(pureSalt, "pureSalt");
        GameRegistry.registerItem(kaasBrick, "kaasBrick");
        GameRegistry.registerItem(knive, "knive");
        GameRegistry.registerItem(breadSlice, "breadSlice");
    }
}
