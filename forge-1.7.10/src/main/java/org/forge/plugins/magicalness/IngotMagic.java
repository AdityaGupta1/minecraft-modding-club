package org.forge.plugins.magicalness;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
 
public class IngotMagic extends Item
{
    public IngotMagic()
    {
        setUnlocalizedName("ingotMagic");
        setCreativeTab(MainMod.modtab);
        setTextureName(MainMod.modid + ":" + "ingotMagic");
    }
}