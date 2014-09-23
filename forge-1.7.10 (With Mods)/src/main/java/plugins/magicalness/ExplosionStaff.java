package plugins.magicalness;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
 
public class ExplosionStaff extends Item
{
    public ExplosionStaff()
    {
        setUnlocalizedName("staffExplode");
        setCreativeTab(MainMod.modtab);
        setTextureName(MainMod.modid + ":" + "staffExplode");
        setMaxStackSize(1);
    }
    
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!par2World.isRemote)
        {
        	EntityRocket rocket = new EntityRocket(par2World, par3EntityPlayer);
        	rocket.motionX *= 10;
        	rocket.motionY *= 10;
        	rocket.motionZ *= 10;
            par2World.spawnEntityInWorld(rocket);
        }

        return par1ItemStack;
    }
}