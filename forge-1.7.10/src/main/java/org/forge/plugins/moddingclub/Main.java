package org.forge.plugins.moddingclub;

import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

/**
 * @author Aditya Gupta
 */

@Mod(modid = "Moreland", name = "Moreland", version = "1.0")
public class Main {

	public static String modid = "Moreland";

	@EventHandler
	public void init(FMLInitializationEvent event) {
		// Not Working
		// MinecraftForge.EVENT_BUS.register(new BiggerTNTExplosions());
		// MinecraftForge.EVENT_BUS.register(new BlockMoney());
        // MinecraftForge.EVENT_BUS.register(new AwardTNTAchievement());
		// MinecraftForge.EVEN T_BUS.register(new PlayerWelcome());
		// FMLCommonHandler.instance().bus().register(new PlayerEntryExit());
        // MinecraftForge.EVENT_BUS.register(new ShrineOfAwesomeness());
		
		// Disabled
		// FMLCommonHandler.instance().bus().register(new ExplodeJoin());
		
		// Working
		MinecraftForge.EVENT_BUS.register(new ZombieDroppingDiamonds());
		MinecraftForge.EVENT_BUS.register(new RottenFleshZombie());
		MinecraftForge.EVENT_BUS.register(new ZombieKnights());
		MinecraftForge.EVENT_BUS.register(new MinecartExplode());
		MinecraftForge.EVENT_BUS.register(new ArrowBarrage());
		MinecraftForge.EVENT_BUS.register(new CreeperDoom());
		MinecraftForge.EVENT_BUS.register(new ChatItems());
		MinecraftForge.EVENT_BUS.register(new BlockBreakChatMessage());
		
		// In Testing
		
	}
}
