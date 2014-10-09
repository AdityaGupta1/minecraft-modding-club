package org.forge.plugins.moddingclub;

import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.init.Items;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ZombieDroppingDiamonds {
	@SubscribeEvent
	public void dropDiamonds(LivingDeathEvent event) {
		if (!(event.entity instanceof EntityZombie)) {
			return;
		}
		
		Entity entity = event.entity;
		Random random = new Random();
		
		entity.dropItem(Items.diamond, random.nextInt(3));
	}
}