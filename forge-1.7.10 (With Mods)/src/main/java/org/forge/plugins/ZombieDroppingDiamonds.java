package org.forge.plugins;

import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.init.Items;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ZombieDroppingDiamonds {
	int power = 20;

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