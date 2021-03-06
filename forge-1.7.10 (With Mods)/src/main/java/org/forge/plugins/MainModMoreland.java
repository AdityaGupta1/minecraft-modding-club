package org.forge.plugins;

import org.forge.plugins.BiggerTNTExplosions;
import org.forge.plugins.BlockMoney;
import org.forge.plugins.PlayerEntryExit;
import org.forge.plugins.ZombieDroppingDiamonds;

import net.minecraft.block.Block;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityList.EntityEggInfo;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * @author Aditya Gupta
 */

@Mod(modid = "Moreland", name = "Moreland", version = "1.0")
public class MainModMoreland {

	public static String modid = "Moreland";

	@EventHandler
	public void init(FMLInitializationEvent event) {
		// MinecraftForge.EVENT_BUS.register(new BiggerTNTExplosions());
		// MinecraftForge.EVENT_BUS.register(new BlockMoney());
		MinecraftForge.EVENT_BUS.register(new ZombieDroppingDiamonds());
		MinecraftForge.EVENT_BUS.register(new PlayerEntryExit());
	}
}
