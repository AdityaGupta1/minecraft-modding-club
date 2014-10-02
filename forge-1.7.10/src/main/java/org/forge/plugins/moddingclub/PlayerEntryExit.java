package org.forge.plugins.moddingclub;

import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class PlayerEntryExit {
	@SubscribeEvent
    public void logIn(PlayerEvent.PlayerLoggedInEvent event) {
    	System.out.println(event.player.getGameProfile().getName() + " logged in.");
    }

	@SubscribeEvent
    public void logOut(PlayerEvent.PlayerLoggedOutEvent event) {
    	System.out.println(event.player.getGameProfile().getName() + " logged out.");
    }
}