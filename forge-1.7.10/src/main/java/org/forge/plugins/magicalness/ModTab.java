package org.forge.plugins.magicalness;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public final class ModTab extends CreativeTabs
{	
	public ModTab(int par1, String par2Str)
	{
		super(par1, par2Str);
	}

	public String getTranslatedTabLabel()
	{
		return "Magicalness";
	}

	@Override
	public Item getTabIconItem() {
		return MainMod.ingotMagic;
	}
}