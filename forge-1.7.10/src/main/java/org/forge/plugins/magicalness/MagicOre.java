package org.forge.plugins.magicalness;
 
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.World;
 
public class MagicOre extends Block
{
    public MagicOre()
    {
        super(Material.rock);
        setBlockName("oreMagic");
        setCreativeTab(MainMod.modtab);
        setBlockTextureName(MainMod.modid + ":" + "oreMagic");
        setHarvestLevel("pickaxe", 3);
        setHardness(5.0F);
        setResistance(10.0F);
    }
    
    public Item getItemDropped(int par1, Random par2Random, int par3) {
		return MainMod.dustMagic;
	}
	
	/**
     * Returns the usual quantity dropped by the block plus a bonus of 1 to 'i' (inclusive).
     */
    public int quantityDroppedWithBonus(int par1, Random par2Random)
    {
        return this.quantityDropped(par2Random) + par2Random.nextInt(par1 + 1);
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random par1Random)
    {
        return 4 + par1Random.nextInt(2);
    }

    /**
     * Drops the block items with a specified chance of dropping the specified items
     */
    public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
    {
        super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, par7);

    }
}