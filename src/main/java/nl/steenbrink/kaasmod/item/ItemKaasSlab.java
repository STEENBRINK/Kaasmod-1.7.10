package nl.steenbrink.kaasmod.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import nl.steenbrink.kaasmod.lib.KaasmodBlocks;

public class ItemKaasSlab extends ItemBlock {
    private final boolean isDouble;
    private final BlockSlab singleSlab;
    private final BlockSlab doubleSlab;

    public ItemKaasSlab(Block block) {
        super(block);
        this.singleSlab = KaasmodBlocks.kaasBricksSlab;
        this.doubleSlab = KaasmodBlocks.kaasBricksDoubleSlab;
        this.isDouble = false;
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    /**
     * Gets an icon index based on an item's damage value
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int metaData)
    {
        return Block.getBlockFromItem(this).getIcon(2, metaData);
    }

    /**
     * Returns the metadata of the block which this Item (ItemBlock) can place
     */
    public int getMetadata(int metaData)
    {
        return metaData;
    }

    /**
     * Returns the unlocalized name of this item. This version accepts an ItemStack so different stacks can have
     * different names based on their damage or NBT.
     */
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return this.singleSlab.func_150002_b(itemStack.getItemDamage());
    }

    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    public boolean onItemUse(ItemStack itemStack, EntityPlayer entityPlayer, World world, int x, int y, int z, int metaData, float a, float b, float c)
    {
        if (this.isDouble) {
            return super.onItemUse(itemStack, entityPlayer, world, x, y, z, metaData, a, b, c);
        } else if (itemStack.stackSize == 0) {
            return false;
        } else if (!entityPlayer.canPlayerEdit(x, y, z, metaData, itemStack)) {
            return false;
        } else {
            Block block = world.getBlock(x, y, z);
            int i1 = world.getBlockMetadata(x, y, z);
            int j1 = i1 & 7;
            boolean flag = (i1 & 8) != 0;

            if ((metaData == 1 && !flag || metaData == 0 && flag) && block == this.singleSlab && j1 == itemStack.getItemDamage()) {
                if (world.checkNoEntityCollision(this.doubleSlab.getCollisionBoundingBoxFromPool(world, x, y, z)) && world.setBlock(x, y, z, this.doubleSlab, j1, 3)) {
                    world.playSoundEffect((double) ((float) x + 0.5F), (double) ((float) y + 0.5F), (double) ((float) z + 0.5F), this.doubleSlab.stepSound.func_150496_b(), (this.doubleSlab.stepSound.getVolume() + 1.0F) / 2.0F, this.doubleSlab.stepSound.getPitch() * 0.8F);
                    --itemStack.stackSize;
                }

                return true;
            } else {
                return this.func_150946_a(itemStack, entityPlayer, world, x, y, z, metaData) ? true : super.onItemUse(itemStack, entityPlayer, world, x, y, z, metaData, a, b, c);
            }
        }
    }

    @SideOnly(Side.CLIENT)
    public boolean func_150936_a(World world, int x, int y, int z, int metaData, EntityPlayer entityPlayer, ItemStack itemStack)
    {
        int i1 = x;
        int j1 = y;
        int k1 = z;
        Block block = world.getBlock(x, y, z);
        int l1 = world.getBlockMetadata(x, y, z);
        int i2 = l1 & 7;
        boolean flag = (l1 & 8) != 0;

        if ((metaData == 1 && !flag || metaData == 0 && flag) && block == this.singleSlab && i2 == itemStack.getItemDamage()) {
            return true;
        } else {
            if (metaData == 0) {
                --y;
            }

            if (metaData == 1) {
                ++y;
            }

            if (metaData == 2) {
                --z;
            }

            if (metaData == 3) {
                ++z;
            }

            if (metaData == 4) {
                --x;
            }

            if (metaData == 5) {
                ++x;
            }

            Block block1 = world.getBlock(x, y, z);
            int j2 = world.getBlockMetadata(x, y, z);
            i2 = j2 & 7;
            return block1 == this.singleSlab && i2 == itemStack.getItemDamage() ? true : super.func_150936_a(world, i1, j1, k1, metaData, entityPlayer, itemStack);
        }
    }

    private boolean func_150946_a(ItemStack itemStack, EntityPlayer entityPlayer, World world, int x, int y, int z, int metaData)
    {
        if (metaData == 0) {
            --y;
        }

        if (metaData == 1) {
            ++y;
        }

        if (metaData == 2) {
            --z;
        }

        if (metaData == 3) {
            ++z;
        }

        if (metaData == 4) {
            --x;
        }

        if (metaData == 5) {
            ++x;
        }

        Block block = world.getBlock(x, y, z);
        int i1 = world.getBlockMetadata(x, y, z);
        int j1 = i1 & 7;

        if (block == this.singleSlab && j1 == itemStack.getItemDamage()) {
            if (world.checkNoEntityCollision(this.doubleSlab.getCollisionBoundingBoxFromPool(world, x, y, z)) && world.setBlock(x, y, z, this.doubleSlab, j1, 3)) {
                world.playSoundEffect((double) ((float) x + 0.5F), (double) ((float) y + 0.5F), (double) ((float) z + 0.5F), this.doubleSlab.stepSound.func_150496_b(), (this.doubleSlab.stepSound.getVolume() + 1.0F) / 2.0F, this.doubleSlab.stepSound.getPitch() * 0.8F);
                --itemStack.stackSize;
            }

            return true;
        } else {
            return false;
        }
    }
}
