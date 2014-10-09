package org.forge.plugins.moddingclub;

import net.minecraft.entity.monster.EntityCreeper;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class CreeperDoom {

	@SubscribeEvent
	public void summonHelp(LivingDeathEvent event) {
		if (!(event.entity instanceof EntityCreeper)) {
			return;
		}
		
		for (int i = 0 ; i < 5 ; i++) {
			EntityCreeper creeper = new EntityCreeper(event.entity.worldObj);
			creeper.setLocationAndAngles(event.entity.posX, event.entity.posY, event.entity.posZ, 0, 0);
			event.entity.worldObj.spawnEntityInWorld(creeper);
		}
	}
}