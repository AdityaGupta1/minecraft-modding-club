package org.forge.plugins;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

/**
 * @author Aditya Gupta
 */

@Mod(modid = "Moreland", name = "Moreland", version = "1.0")
public class MainModMoreland {

	public static String modid = "Moreland";
//	public static Achievement boomTime = new Achievement("Boom Time!", "Craft a TNT and light it", AchievementList.killEnemy.displayColumn, AchievementList.killEnemy.displayRow + 2, Blocks.tnt, AchievementList.killEnemy);

	@EventHandler
	public void init(FMLInitializationEvent event) {
		// MinecraftForge.EVENT_BUS.register(new BiggerTNTExplosions());
		// MinecraftForge.EVENT_BUS.register(new BlockMoney());
        // MinecraftForge.EVENT_BUS.register(new AwardTNTAchievement());
        // MinecraftForge.EVENT_BUS.register(new PlayerEntryExit());
		// MinecraftForge.EVENT_BUS.register(new PlayerWelcome());
		MinecraftForge.EVENT_BUS.register(new ZombieDroppingDiamonds());
		MinecraftForge.EVENT_BUS.register(new RottenFleshZombie());
	}
}
