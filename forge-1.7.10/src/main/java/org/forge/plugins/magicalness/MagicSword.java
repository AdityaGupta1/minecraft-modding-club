package org.forge.plugins.magicalness;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class MagicSword extends ItemAxe {

	public MagicSword(ToolMaterial material){
		super(material);
		setUnlocalizedName("swordMagic");
		setCreativeTab(MainMod.modtab);
		setTextureName(MainMod.modid + ":" + "swordMagic");
	}
}
