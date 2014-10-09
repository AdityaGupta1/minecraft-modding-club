package org.forge.plugins.moddingclub;

import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class BlockBreakChatMessage {
	
	@SubscribeEvent
	public void sendMessage(BreakEvent event) {
		event.getPlayer().addChatMessage(new ChatComponentText("You broke a block!"));
	}
}