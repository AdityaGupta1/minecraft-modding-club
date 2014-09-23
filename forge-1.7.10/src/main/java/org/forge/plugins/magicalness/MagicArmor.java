package org.forge.plugins.magicalness;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class MagicArmor extends ItemArmor {

	public MagicArmor(ArmorMaterial material, int type, String name){
		super(material, 0, type);
		 setUnlocalizedName(name);
	     setCreativeTab(MainMod.modtab);
	     setTextureName(MainMod.modid + ":" + name);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		
		if(stack.getItem() == MainMod.capMagic || stack.getItem() == MainMod.chestMagic || stack.getItem() == MainMod.bootsMagic){
			return MainMod.modid + ":" + "textures/armor/magicarmor_1.png";
		} else if(stack.getItem() == MainMod.legsMagic){
			return MainMod.modid + ":" + "textures/armor/magicarmor_2.png";
		}
		
		return null;
	}
	
}
