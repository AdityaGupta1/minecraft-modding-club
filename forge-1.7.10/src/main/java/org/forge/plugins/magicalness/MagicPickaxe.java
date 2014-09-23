package org.forge.plugins.magicalness;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class MagicPickaxe extends ItemPickaxe {

	public MagicPickaxe(ToolMaterial material){
		super(material);
		setUnlocalizedName("pickaxeMagic");
		setCreativeTab(MainMod.modtab);
		setTextureName(MainMod.modid + ":" + "pickaxeMagic");
	}
}
