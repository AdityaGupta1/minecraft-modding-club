package org.forge.plugins;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PlayerWelcome {
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void welcomePlayer(EntityJoinWorldEvent event) {
		if (!(event.entity instanceof EntityPlayer)) {
			return;
		}

		((EntityPlayer) event.entity).addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "Welcome to your world!"));
	}
}