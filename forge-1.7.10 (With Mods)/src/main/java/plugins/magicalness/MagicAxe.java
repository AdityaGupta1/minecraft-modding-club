package plugins.magicalness;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class MagicAxe extends ItemAxe {

	public MagicAxe(ToolMaterial material){
		super(material);
		setUnlocalizedName("axeMagic");
		setCreativeTab(MainMod.modtab);
		setTextureName(MainMod.modid + ":" + "axeMagic");
	}
}
