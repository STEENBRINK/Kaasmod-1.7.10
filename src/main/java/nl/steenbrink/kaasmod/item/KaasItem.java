package nl.steenbrink.kaasmod.item;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class KaasItem extends BasicItem
{
    private Block kaas;

    public KaasItem(Block kaas)
    {
        super();
        this.kaas = kaas;
        this.setUnlocalizedName("kaas");
    }

    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int i, float a, float b, float c)
    {
        Block block = world.getBlock(x, y, z);

        if (block == Blocks.snow_layer && (world.getBlockMetadata(x, y, z) & 7) < 1) {
            i = 1;
        } else if (block != Blocks.vine && block != Blocks.tallgrass && block != Blocks.deadbush) {
            if (i == 0) {
                --y;
            }

            if (i == 1) {
                ++y;
            }

            if (i == 2) {
                --z;
            }

            if (i == 3) {
                ++z;
            }

            if (i == 4) {
                --x;
            }

            if (i == 5) {
                ++x;
            }
        }

        if (!player.canPlayerEdit(x, y, z, i, itemStack)) {
            return false;
        } else if (itemStack.stackSize == 0) {
            return false;
        } else {
            if (world.canPlaceEntityOnSide(this.kaas, x, y, z, false, i, (Entity) null, itemStack)) {
                int i1 = this.kaas.onBlockPlaced(world, x, y, z, i, a, b, c, 0);

                if (world.setBlock(x, y, z, this.kaas, i1, 3)) {
                    if (world.getBlock(x, y, z) == this.kaas) {
                        this.kaas.onBlockPlacedBy(world, x, y, z, player, itemStack);
                        this.kaas.onPostBlockPlaced(world, x, y, z, i1);
                    }

                    world.playSoundEffect((double) ((float) x + 0.5F), (double) ((float) y + 0.5F), (double) ((float) z + 0.5F), this.kaas.stepSound.func_150496_b(), (this.kaas.stepSound.getVolume() + 1.0F) / 2.0F, this.kaas.stepSound.getPitch() * 0.8F);
                    --itemStack.stackSize;
                }
            }

            return true;
        }
    }
}
