package org.forge.plugins.moddingclub;

import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ServerChatEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ChatItems {

	@SubscribeEvent
	public void giveChatItemToPlayer(ServerChatEvent event) {
		if (event.message.toLowerCase().contains("potato")) {
			event.player.inventory.addItemStackToInventory(new ItemStack(Items.potato, 64));
		}	
	}
}