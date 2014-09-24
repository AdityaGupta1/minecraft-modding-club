package org.forge.plugins;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ExplodeJoin {
	@SubscribeEvent
	public void explode(PlayerEvent.PlayerLoggedInEvent event) {
		event.player.worldObj.createExplosion(event.player, event.player.posX, event.player.posY, event.player.posZ, 5, true);
	}
}