package plugins.magicalness;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
 
public class ChickenSoup extends ItemFood {
    
    public ChickenSoup(int heal, float saturation, boolean wolfMeat) {
        super(heal, saturation, wolfMeat);
        setUnlocalizedName("chickenSoup");
        setCreativeTab(MainMod.modtab);
        setTextureName(MainMod.modid + ":" + "chickenSoup");
        setMaxStackSize(1);
    }
}
