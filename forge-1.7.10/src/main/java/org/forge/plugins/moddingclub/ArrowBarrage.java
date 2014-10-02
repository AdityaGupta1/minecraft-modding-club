package org.forge.plugins.moddingclub;

import java.util.Random;

import net.minecraft.entity.projectile.EntityArrow;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;


public class ArrowBarrage {
	EntityArrow arrow;
	int numberOfArrows = 5;
	Random random = new Random();
	
	@SubscribeEvent
	public void shootArrowBarrage(ArrowLooseEvent event) {
		for (int i = 0 ; i < numberOfArrows ; i++) {
			float f = (float)event.charge / 20.0F;
            f = (f * f + f * 2.0F) / 3.0F;

            if ((double)f < 0.1D)
            {
                return;
            }

            if (f > 1.0F)
            {
                f = 1.0F;
            }
			
			arrow = new EntityArrow(event.entity.worldObj, event.entityPlayer, f * 2.0F);
			event.entity.worldObj.spawnEntityInWorld(arrow);
		}
	}
}