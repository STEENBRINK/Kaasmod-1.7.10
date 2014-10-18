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
    public static final ItemBasic knife = new ItemKnife();
    public static final ItemBasicFood breadSlice = new ItemBreadSlice();


    public static void init()
    {
        GameRegistry.registerItem(breadSlice, NameReference.Items.BREAD_SLICE);
        GameRegistry.registerItem(cheeseBaconBread, NameReference.Items.CHEESE_BACON_BREAD);
        GameRegistry.registerItem(cheeseBread, NameReference.Items.CHEESE_BREAD);
        GameRegistry.registerItem(cheeseSlice, NameReference.Items.CHEESE_SLICE);
        GameRegistry.registerItem(cheeseSlicer, NameReference.Items.CHEESE_SLICER);
        GameRegistry.registerItem(ingredients, NameReference.Items.INGREDIENTS);
        GameRegistry.registerItem(kaas, NameReference.Items.KAAS);
        GameRegistry.registerItem(kaasBrick, NameReference.Items.KAAS_BRICK);
        GameRegistry.registerItem(knife, NameReference.Items.KNIFE);
        GameRegistry.registerItem(pureSalt, NameReference.Items.PURE_SALT);
        GameRegistry.registerItem(rawSalt, NameReference.Items.RAW_SALT);
        GameRegistry.registerItem(roastedSandwich, NameReference.Items.ROASTED_SANDWICH);
    }
}
