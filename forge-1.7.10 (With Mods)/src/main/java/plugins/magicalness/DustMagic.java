package plugins.magicalness;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
 
public class DustMagic extends Item
{
    public DustMagic()
    {
        setUnlocalizedName("dustMagic");
        setCreativeTab(MainMod.modtab);
        setTextureName(MainMod.modid + ":" + "dustMagic");
    }
    
    @Override
	public boolean hasEffect(ItemStack par1ItemStack){
		return true;
	}
}