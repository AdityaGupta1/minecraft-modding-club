package org.forge.plugins;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.init.Items;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class RottenFleshZombie {
	@SubscribeEvent
    public void init(ItemTossEvent event) {
		if (event.entityItem.getEntityItem().getItem() != Items.rotten_flesh) {
			return;
		}
		
    	EntityItem item = event.entityItem;
    	World world = item.worldObj;
    	EntityZombie zombie = new EntityZombie(world);
    	zombie.setLocationAndAngles(item.posX, item.posY, item.posZ, 0, 0);
    	
    	world.spawnEntityInWorld(zombie);
    	
    	item.setDead();
    }
}