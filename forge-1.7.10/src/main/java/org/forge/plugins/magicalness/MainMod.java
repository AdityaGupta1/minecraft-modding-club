package org.forge.plugins.magicalness;

import net.minecraft.block.Block;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBlaze;
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
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * @author Aditya Gupta
 */

@Mod(modid = "Magicalness", name = "Magicalness", version = "1.0")
public class MainMod {

	public static String modid = "Magicalness";

	// Blocks
	public static Block oreMagic;

	// Items
	public static Item dustMagic;
	public static Item chunkMagic;
	public static Item ingotMagic;
	public static Item staffExplode;

	// Tools

	public static Item pickaxeMagic;
	public static Item axeMagic;
	public static Item shovelMagic;
	public static Item swordMagic;

	// Armor

	public static Item capMagic;
	public static Item chestMagic;
	public static Item legsMagic;
	public static Item bootsMagic;

	// Food

	public static Item chickenSoup;

	// Other Variables

	public static int startEntityId = 300;

	public static CreativeTabs modtab = new ModTab(CreativeTabs.getNextID(),
			"Magicalness");

	@EventHandler
	public void init(FMLInitializationEvent event) {

		// Register Blocks

		oreMagic = new MagicOre();
		GameRegistry.registerBlock(oreMagic, "oreMagic");

		// Register Items

		dustMagic = new DustMagic();
		GameRegistry.registerItem(dustMagic, "dustMagic");

		chunkMagic = new ChunkMagic();
		GameRegistry.registerItem(chunkMagic, "chunkMagic");

		ingotMagic = new IngotMagic();
		GameRegistry.registerItem(ingotMagic, "ingotMagic");

		staffExplode = new ExplosionStaff();
		GameRegistry.registerItem(staffExplode, "staffExplode");

		// Register Food

		chickenSoup = new ChickenSoup(10, 1.2F, false);
		GameRegistry.registerItem(chickenSoup, "chickenSoup");

		// Register Tools

		ToolMaterial MagicTool = EnumHelper.addToolMaterial("MagicTool", 3,
				2048, 10.0F, 8.0F, 50);

		pickaxeMagic = new MagicPickaxe(MagicTool);
		GameRegistry.registerItem(pickaxeMagic, "pickaxeMagic");
		axeMagic = new MagicAxe(MagicTool);
		GameRegistry.registerItem(axeMagic, "axeMagic");
		shovelMagic = new MagicShovel(MagicTool);
		GameRegistry.registerItem(shovelMagic, "shovelMagic");
		swordMagic = new MagicSword(MagicTool);
		GameRegistry.registerItem(swordMagic, "swordMagic");

		// Register Armor

		ArmorMaterial MagicArmor = EnumHelper.addArmorMaterial("magicArmor",
				2048, new int[] { 4, 8, 7, 4 }, 50);

		capMagic = new MagicArmor(MagicArmor, 0, "capMagic");
		GameRegistry.registerItem(capMagic, "capMagic");
		chestMagic = new MagicArmor(MagicArmor, 1, "chestMagic");
		GameRegistry.registerItem(chestMagic, "chestMagic");
		legsMagic = new MagicArmor(MagicArmor, 2, "legsMagic");
		GameRegistry.registerItem(legsMagic, "legsMagic");
		bootsMagic = new MagicArmor(MagicArmor, 3, "bootsMagic");
		GameRegistry.registerItem(bootsMagic, "bootsMagic");

		// Crafting Recipes

		GameRegistry.addRecipe(new ItemStack(chunkMagic, 1), new Object[] {
				"DDD", "DDD", "DDD", 'D', dustMagic });

		GameRegistry.addRecipe(new ItemStack(pickaxeMagic, 1), new Object[] {
				"TTT", " Y ", " Y ", 'T', ingotMagic, 'Y', Items.stick });
		GameRegistry.addRecipe(new ItemStack(axeMagic, 1), new Object[] {
				" TT", " YT", " Y ", 'T', ingotMagic, 'Y', Items.stick });
		GameRegistry.addRecipe(new ItemStack(axeMagic, 1), new Object[] {
				"TT ", "TY ", " Y ", 'T', ingotMagic, 'Y', Items.stick });
		GameRegistry.addRecipe(new ItemStack(shovelMagic, 1), new Object[] {
				" T ", " Y ", " Y ", 'T', ingotMagic, 'Y', Items.stick });
		GameRegistry.addRecipe(new ItemStack(swordMagic, 1), new Object[] {
				" T ", " T ", " Y ", 'T', ingotMagic, 'Y', Items.stick });
		
		GameRegistry.addRecipe(new ItemStack(staffExplode, 1), new Object[] {
				"PTP", "PTP", "PtP", 'T', ingotMagic, 't', Blocks.tnt, 'P',
				dustMagic });

		GameRegistry.addRecipe(new ItemStack(dustMagic, 1), new Object[] {
				"RGR", "GBG", "RGR", 'R', Items.redstone, 'B',
				Items.blaze_powder, 'G', Items.glowstone_dust });

		GameRegistry.addShapelessRecipe(new ItemStack(chickenSoup, 1),
				new ItemStack(Items.cooked_chicken), new ItemStack(Items.bowl),
				new ItemStack(Items.potato), new ItemStack(Items.carrot));

		// Smelting Recipes

		GameRegistry
				.addSmelting(chunkMagic, new ItemStack(ingotMagic, 1), 2.5F);

		// Register Ore Generators

		GameRegistry.registerWorldGenerator(new WorldGeneratorMagic(), 0);

		// Entities
		
		//   Miner
		EntityRegistry.registerModEntity(EntityMiner.class, "Miner", 5, this,
				100, 10, true);
		RenderingRegistry.registerEntityRenderingHandler(EntityMiner.class,
				new RenderEntityMiner(new ModelBiped(), 0.4F));

		LanguageRegistry.instance().addStringLocalization(
				"entity.Magicalness.Miner.name", "Miner");

		EntityRegistry.addSpawn(EntityMiner.class, 3, 1, 3,
				EnumCreatureType.monster, BiomeGenBase.plains,
				BiomeGenBase.forest, BiomeGenBase.desert, BiomeGenBase.taiga,
				BiomeGenBase.extremeHills);

		// Spawn Eggs

		registerEntityEgg(EntityMiner.class, 0x20E824, 0x0012D9);
	}

	public static int getUniqueEntityId() {
		startEntityId = 300;
		do {
			startEntityId++;
		} while (EntityList.getStringFromID(startEntityId) != null);

		return startEntityId;
	}

	public static void registerEntityEgg(Class<? extends Entity> entity,
			int primaryColor, int secondaryColor) {
		int id = getUniqueEntityId();
		EntityList.IDtoClassMapping.put(id, entity);
		EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor,
				secondaryColor));
	}
}
