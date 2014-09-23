package org.forge.plugins.magicalness;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class MagicShovel extends ItemAxe {

	public MagicShovel(ToolMaterial material){
		super(material);
		setUnlocalizedName("shovelMagic");
		setCreativeTab(MainMod.modtab);
		setTextureName(MainMod.modid + ":" + "shovelMagic");
	}
}
