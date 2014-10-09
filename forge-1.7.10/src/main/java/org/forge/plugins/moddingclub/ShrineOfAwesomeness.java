package org.forge.plugins.moddingclub;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.Action;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ShrineOfAwesomeness {

	@SubscribeEvent
	public void turnGoldIntoDiamonds(PlayerInteractEvent event) {
		if (event.action != Action.RIGHT_CLICK_BLOCK) {
			return;
		}	
		
		int x = event.entityPlayer.rayTrace(100.0D, 1.0F).blockX;
		int y = event.entityPlayer.rayTrace(100.0D, 1.0F).blockY;
		int z = event.entityPlayer.rayTrace(100.0D, 1.0F).blockZ;
		
		if (event.entityPlayer.worldObj.getBlock(x, y, z) != Blocks.diamond_block) {
			return;
		}
		
		if (event.entityPlayer.inventory.getCurrentItem().getItem() != Items.gold_ingot) {
			return;
		}
		
		event.entityPlayer.inventory.addItemStackToInventory(new ItemStack(Items.diamond));
		event.entityPlayer.inventory.getCurrentItem().stackSize -= 1;
	}
}