package org.forge.plugins.moddingclub;

import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class AwardTNTAchievement {

	@SubscribeEvent
	public void makeExplosion(EntityJoinWorldEvent event) {
		if (!(event.entity instanceof EntityTNTPrimed)) {
			return;
		}
		
		if (!(((EntityTNTPrimed) event.entity).getTntPlacedBy() instanceof EntityPlayer)) {
			return;
		}
		
		EntityPlayer player = ((EntityPlayer) ((EntityTNTPrimed) event.entity).getTntPlacedBy());
//		player.addStat(MainModMoreland.boomTime, 1);
	}
}