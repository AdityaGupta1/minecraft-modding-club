package org.forge.plugins.moddingclub;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

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