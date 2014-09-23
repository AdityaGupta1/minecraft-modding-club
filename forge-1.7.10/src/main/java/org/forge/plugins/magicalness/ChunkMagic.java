package org.forge.plugins.magicalness;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
 
public class ChunkMagic extends Item
{
    public ChunkMagic()
    {
        setUnlocalizedName("chunkMagic");
        setCreativeTab(MainMod.modtab);
        setTextureName(MainMod.modid + ":" + "chunkMagic");
    }
    
    @Override
	public boolean hasEffect(ItemStack par1ItemStack){
		return true;
	}
}