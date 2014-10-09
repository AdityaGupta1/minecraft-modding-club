package org.forge.plugins.moddingclub;

import java.util.Random;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;


public class ArrowBarrage {
	EntityArrow arrow;
	int numberOfArrows = 5;
	Random random = new Random();
	double y;
	
	@SubscribeEvent
	public void shootArrowBarrage(ArrowLooseEvent event) {
		y = event.entityPlayer.eyeHeight;
		for (int i = 0 ; i < numberOfArrows ; i++) {
			y += 0.5;
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
			arrow.setLocationAndAngles(arrow.posX, arrow.posY + y, arrow.posZ, arrow.rotationYaw, arrow.rotationPitch);
			
			if (f == 1.0F)
            {
				arrow.setIsCritical(true);
            }

            int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, event.bow);

            if (k > 0)
            {
            	arrow.setDamage(arrow.getDamage() + (double)k * 0.5D + 0.5D);
            }

            int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, event.bow);

            if (l > 0)
            {
            	arrow.setKnockbackStrength(l);
            }

            if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, event.bow) > 0)
            {
            	arrow.setFire(100);
            }
		}
	}
}