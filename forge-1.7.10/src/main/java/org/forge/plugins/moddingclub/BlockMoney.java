package org.forge.plugins.moddingclub;

import java.util.HashMap;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class BlockMoney {
	HashMap<String, Float> money = new HashMap();
	public static final float moneyToReward = 0.1f;

	@SubscribeEvent
	public void init(EntityJoinWorldEvent event) {
		if (!(event.entity instanceof EntityPlayer))
			return;

		money.put((((EntityPlayer) event.entity).getDisplayName()), 0F);
	}

	@SubscribeEvent
	public void blockPlace(PlayerInteractEvent event) {
		Item item = event.entityPlayer.getItemInUse().getItem();
		
		if (event.action != PlayerInteractEvent.Action.RIGHT_CLICK_BLOCK) {
			return;
		}
		
		money.put(event.entityPlayer.getGameProfile().getName(),
				money.get(event.entityPlayer.getGameProfile().getName())
						+ moneyToReward);

		event.entityPlayer.addChatMessage(new ChatComponentText(
				EnumChatFormatting.GOLD
						+ "You now have "
						+ EnumChatFormatting.GREEN
						+ "$"
						+ String.format("%.2f", money
								.get((((EntityPlayer) event.entity)
										.getDisplayName())))));
	}

	@SubscribeEvent
	public void blockBreak(BreakEvent event) {
		money.put(event.getPlayer().getGameProfile().getName(),
				money.get(event.getPlayer().getGameProfile().getName())
						+ moneyToReward);

		event.getPlayer().addChatMessage(
				new ChatComponentText(EnumChatFormatting.GOLD
						+ "You now have "
						+ EnumChatFormatting.GREEN
						+ "$"
						+ String.format("%.2f", money.get(((event.getPlayer())
								.getDisplayName())))));
	}

}