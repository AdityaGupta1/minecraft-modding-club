package org.forge.plugins;

import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ZombieKnights {
	@SubscribeEvent
	public void giveArmorToZombie(LivingHurtEvent event) {
		if (!(event.entity instanceof EntityZombie)) {
			return;
		}
		
		EntityZombie zombie = (EntityZombie) event.entity;
		
		zombie.setCurrentItemOrArmor(0, new ItemStack(Items.iron_axe));
		zombie.setCurrentItemOrArmor(1, new ItemStack(Items.leather_helmet));
		zombie.setCurrentItemOrArmor(2, new ItemStack(Items.chainmail_chestplate));
		zombie.setCurrentItemOrArmor(3, new ItemStack(Items.leather_leggings));
		zombie.setCurrentItemOrArmor(4, new ItemStack(Items.iron_boots));
		zombie.addPotionEffect(new PotionEffect(2, 1000000, 1, false));
		zombie.setCustomNameTag(EnumChatFormatting.GOLD + "Zombie Knight");
		zombie.setChild(false);
	}
}