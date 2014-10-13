package nl.steenbrink.kaasmod.lib;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemTool;
import nl.steenbrink.kaasmod.item.*;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class KaasmodItems
{
    public static final BasicItem rawSalt = new RawSaltItem();
    public static final BasicItem kaas = new KaasItem(KaasmodBlocks.kaasBlock);
    public static final BasicFoodItem cheeseSlice = new CheeseSliceItem();
    public static final BasicFoodItem cheeseBread = new CheeseBreadItem();
    public static final BasicFoodItem cheeseBaconBread = new CheeseBaconBreadItem();
    public static final BasicFoodItem roastedSandwich = new RoastedSandwichItem();
    public static final ItemTool cheeseSlicer = new CheeseSlicerItem();
    public static final BasicItem ingredients = new IngredientsItem();
    public static final BasicItem pureSalt = new PureSaltItem();
    public static final BasicItem kaasBrick = new KaasBrickItem();
    public static final BasicItem knive = new KniveItem();
    public static final BasicFoodItem breadSlice = new BreadSliceItem();

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
