package org.forge.plugins.moddingclub;

import net.minecraftforge.event.entity.minecart.MinecartCollisionEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class MinecartExplode {
	@SubscribeEvent
	public void explode(MinecartCollisionEvent event) {
		event.minecart.worldObj.createExplosion(event.minecart, event.minecart.posX, event.minecart.posY, event.minecart.posZ, 2, false);
	}
}