package org.forge.plugins.moddingclub;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.relauncher.Side;

public class BiggerTNTExplosions {
	int power = 16;
	long cachedTime = 0;
	Entity entity = null;
	boolean run = false;

	@SubscribeEvent
	public void makeExplosion(EntityJoinWorldEvent event) {
		if (!(event.entity instanceof EntityTNTPrimed)) {
			return;
		}
		
		entity = event.entity;
		World world = entity.worldObj;
		run = true;
	}
	
	@SubscribeEvent
	public void waitFourSeconds(TickEvent.WorldTickEvent event)
	{
		cachedTime = event.world.getTotalWorldTime();
	    if(event.side == Side.SERVER && event.phase == TickEvent.Phase.START)
	    {
	        if(event.world.getTotalWorldTime() >= cachedTime + 80 && run)
	        {
	            cachedTime = event.world.getTotalWorldTime();
	            event.world.createExplosion(entity, entity.posX, entity.posY,
	    				entity.posZ, power, true);
	            run = false;
	            entity.setDead();
	        }
	    }
	}
}