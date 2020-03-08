package com.hackquest.shenlong55.advancedsurvivalplugin.utility;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.bukkit.Material;

public final class MaterialTypeLists
{
	private static final Set<Material>	axes			= Collections.unmodifiableSet(setupAxesList());
	private static final Set<Material>	pickaxes		= Collections.unmodifiableSet(setupPickaxesList());
	private static final Set<Material>	requiresAxe		= Collections.unmodifiableSet(setupRequiresAxeList());
	private static final Set<Material>	requiresPickaxe	= Collections.unmodifiableSet(setupRequiresPickaxeList());
	private static final Set<Material>	requiresShovel	= Collections.unmodifiableSet(setupRequiresShovelList());
	private static final Set<Material>	shovels			= Collections.unmodifiableSet(setupShovelsList());

	public static boolean isAxe(final Material material)
	{
		return axes.contains(material);
	}

	public static boolean isPickaxe(final Material material)
	{
		return pickaxes.contains(material);
	}

	public static boolean isShovel(final Material material)
	{
		return shovels.contains(material);
	}

	public static boolean requiresAxe(final Material material)
	{
		return requiresAxe.contains(material);
	}

	public static boolean requiresPickaxe(final Material material)
	{
		return requiresPickaxe.contains(material);
	}

	public static boolean requiresShovel(final Material material)
	{
		return requiresShovel.contains(material);
	}

	private static Set<Material> setupAxesList()
	{
		final Set<Material> axes = new HashSet<>();

		axes.add(Material.DIAMOND_AXE);
		axes.add(Material.GOLDEN_AXE);
		axes.add(Material.IRON_AXE);
		axes.add(Material.STONE_AXE);
		axes.add(Material.WOODEN_AXE);

		return axes;
	}

	private static Set<Material> setupPickaxesList()
	{
		final Set<Material> pickaxes = new HashSet<>();

		pickaxes.add(Material.DIAMOND_PICKAXE);
		pickaxes.add(Material.GOLDEN_PICKAXE);
		pickaxes.add(Material.IRON_PICKAXE);
		pickaxes.add(Material.STONE_PICKAXE);
		pickaxes.add(Material.WOODEN_PICKAXE);

		return pickaxes;
	}

	private static Set<Material> setupRequiresAxeList()
	{
		final Set<Material> requiresAxes = new HashSet<>();

		requiresAxes.add(Material.ACACIA_LOG);
		requiresAxes.add(Material.ACACIA_PLANKS);
		requiresAxes.add(Material.ACACIA_WOOD);
		requiresAxes.add(Material.BIRCH_LOG);
		requiresAxes.add(Material.BIRCH_PLANKS);
		requiresAxes.add(Material.BIRCH_WOOD);
		requiresAxes.add(Material.BROWN_MUSHROOM_BLOCK);
		requiresAxes.add(Material.DARK_OAK_LOG);
		requiresAxes.add(Material.DARK_OAK_PLANKS);
		requiresAxes.add(Material.DARK_OAK_WOOD);
		requiresAxes.add(Material.JUNGLE_LOG);
		requiresAxes.add(Material.JUNGLE_PLANKS);
		requiresAxes.add(Material.JUNGLE_WOOD);
		requiresAxes.add(Material.MUSHROOM_STEM);
		requiresAxes.add(Material.OAK_LOG);
		requiresAxes.add(Material.OAK_PLANKS);
		requiresAxes.add(Material.OAK_WOOD);
		requiresAxes.add(Material.RED_MUSHROOM_BLOCK);
		requiresAxes.add(Material.SPRUCE_LOG);
		requiresAxes.add(Material.SPRUCE_PLANKS);
		requiresAxes.add(Material.SPRUCE_WOOD);
		requiresAxes.add(Material.STRIPPED_ACACIA_LOG);
		requiresAxes.add(Material.STRIPPED_ACACIA_WOOD);
		requiresAxes.add(Material.STRIPPED_DARK_OAK_LOG);
		requiresAxes.add(Material.STRIPPED_DARK_OAK_WOOD);
		requiresAxes.add(Material.STRIPPED_JUNGLE_LOG);
		requiresAxes.add(Material.STRIPPED_JUNGLE_WOOD);
		requiresAxes.add(Material.STRIPPED_OAK_LOG);
		requiresAxes.add(Material.STRIPPED_OAK_WOOD);
		requiresAxes.add(Material.STRIPPED_SPRUCE_LOG);
		requiresAxes.add(Material.STRIPPED_SPRUCE_WOOD);

		return requiresAxes;
	}

	private static Set<Material> setupRequiresPickaxeList()
	{
		final Set<Material> requiresPickaxe = new HashSet<>();

		requiresPickaxe.add(Material.ANDESITE);
		requiresPickaxe.add(Material.BLUE_ICE);
		requiresPickaxe.add(Material.BRICKS);
		requiresPickaxe.add(Material.CHISELED_STONE_BRICKS);
		requiresPickaxe.add(Material.COAL_BLOCK);
		requiresPickaxe.add(Material.COAL_ORE);
		requiresPickaxe.add(Material.COBBLESTONE);
		requiresPickaxe.add(Material.COBBLESTONE_WALL);

		// Concrete
		requiresPickaxe.add(Material.BLACK_CONCRETE);
		requiresPickaxe.add(Material.BLUE_CONCRETE);
		requiresPickaxe.add(Material.BROWN_CONCRETE);
		requiresPickaxe.add(Material.CYAN_CONCRETE);
		requiresPickaxe.add(Material.GRAY_CONCRETE);
		requiresPickaxe.add(Material.GREEN_CONCRETE);
		requiresPickaxe.add(Material.LIGHT_BLUE_CONCRETE);
		requiresPickaxe.add(Material.LIGHT_GRAY_CONCRETE);
		requiresPickaxe.add(Material.LIME_CONCRETE);
		requiresPickaxe.add(Material.MAGENTA_CONCRETE);
		requiresPickaxe.add(Material.ORANGE_CONCRETE);
		requiresPickaxe.add(Material.PINK_CONCRETE);
		requiresPickaxe.add(Material.PURPLE_CONCRETE);
		requiresPickaxe.add(Material.RED_CONCRETE);
		requiresPickaxe.add(Material.WHITE_CONCRETE);
		requiresPickaxe.add(Material.YELLOW_CONCRETE);

		requiresPickaxe.add(Material.CRACKED_STONE_BRICKS);
		requiresPickaxe.add(Material.DARK_PRISMARINE);
		requiresPickaxe.add(Material.DIORITE);
		requiresPickaxe.add(Material.DIAMOND_BLOCK);
		requiresPickaxe.add(Material.DIAMOND_ORE);
		requiresPickaxe.add(Material.DISPENSER);
		requiresPickaxe.add(Material.DROPPER);
		requiresPickaxe.add(Material.EMERALD_BLOCK);
		requiresPickaxe.add(Material.EMERALD_ORE);
		requiresPickaxe.add(Material.ENCHANTING_TABLE);
		requiresPickaxe.add(Material.END_STONE);
		requiresPickaxe.add(Material.ENDER_CHEST);
		requiresPickaxe.add(Material.FURNACE);
		requiresPickaxe.add(Material.GOLD_BLOCK);
		requiresPickaxe.add(Material.GOLD_ORE);

		// Glazed Terracotta
		requiresPickaxe.add(Material.BLACK_GLAZED_TERRACOTTA);
		requiresPickaxe.add(Material.BLUE_GLAZED_TERRACOTTA);
		requiresPickaxe.add(Material.BROWN_GLAZED_TERRACOTTA);
		requiresPickaxe.add(Material.CYAN_GLAZED_TERRACOTTA);
		requiresPickaxe.add(Material.GRAY_GLAZED_TERRACOTTA);
		requiresPickaxe.add(Material.GREEN_GLAZED_TERRACOTTA);
		requiresPickaxe.add(Material.LIGHT_BLUE_GLAZED_TERRACOTTA);
		requiresPickaxe.add(Material.LIGHT_GRAY_GLAZED_TERRACOTTA);
		requiresPickaxe.add(Material.LIME_GLAZED_TERRACOTTA);
		requiresPickaxe.add(Material.MAGENTA_GLAZED_TERRACOTTA);
		requiresPickaxe.add(Material.ORANGE_GLAZED_TERRACOTTA);
		requiresPickaxe.add(Material.PINK_GLAZED_TERRACOTTA);
		requiresPickaxe.add(Material.PURPLE_GLAZED_TERRACOTTA);
		requiresPickaxe.add(Material.RED_GLAZED_TERRACOTTA);
		requiresPickaxe.add(Material.WHITE_GLAZED_TERRACOTTA);
		requiresPickaxe.add(Material.YELLOW_GLAZED_TERRACOTTA);

		requiresPickaxe.add(Material.GRANITE);
		requiresPickaxe.add(Material.ICE);
		requiresPickaxe.add(Material.IRON_BLOCK);
		requiresPickaxe.add(Material.IRON_ORE);
		requiresPickaxe.add(Material.LAPIS_BLOCK);
		requiresPickaxe.add(Material.LAPIS_ORE);
		requiresPickaxe.add(Material.MOSSY_COBBLESTONE);
		requiresPickaxe.add(Material.MOSSY_STONE_BRICKS);
		requiresPickaxe.add(Material.NETHER_BRICK);
		requiresPickaxe.add(Material.NETHER_BRICK_FENCE);
		requiresPickaxe.add(Material.NETHER_QUARTZ_ORE);
		requiresPickaxe.add(Material.NETHERRACK);
		requiresPickaxe.add(Material.OBSIDIAN);
		requiresPickaxe.add(Material.PACKED_ICE);
		requiresPickaxe.add(Material.POLISHED_ANDESITE);
		requiresPickaxe.add(Material.POLISHED_DIORITE);
		requiresPickaxe.add(Material.POLISHED_GRANITE);
		requiresPickaxe.add(Material.PRISMARINE);
		requiresPickaxe.add(Material.PRISMARINE_BRICKS);
		requiresPickaxe.add(Material.QUARTZ_BLOCK);
		requiresPickaxe.add(Material.RED_SANDSTONE);
		requiresPickaxe.add(Material.RED_SANDSTONE_SLAB);
		requiresPickaxe.add(Material.REDSTONE_BLOCK);
		requiresPickaxe.add(Material.REDSTONE_ORE);
		requiresPickaxe.add(Material.SANDSTONE);

		// Slabs
		requiresPickaxe.add(Material.STONE_SLAB);
		requiresPickaxe.add(Material.SMOOTH_STONE_SLAB);
		requiresPickaxe.add(Material.GRANITE_SLAB);
		requiresPickaxe.add(Material.POLISHED_GRANITE_SLAB);
		requiresPickaxe.add(Material.DIORITE_SLAB);
		requiresPickaxe.add(Material.POLISHED_DIORITE_SLAB);
		requiresPickaxe.add(Material.ANDESITE_SLAB);
		requiresPickaxe.add(Material.POLISHED_ANDESITE_SLAB);
		requiresPickaxe.add(Material.COBBLESTONE_SLAB);
		requiresPickaxe.add(Material.MOSSY_COBBLESTONE_SLAB);
		requiresPickaxe.add(Material.STONE_BRICK_SLAB);
		requiresPickaxe.add(Material.STONE_BRICK_SLAB);
		requiresPickaxe.add(Material.MOSSY_STONE_BRICK_SLAB);
		requiresPickaxe.add(Material.BRICK_SLAB);
		requiresPickaxe.add(Material.END_STONE_BRICK_SLAB);
		requiresPickaxe.add(Material.NETHER_BRICK_SLAB);
		requiresPickaxe.add(Material.RED_NETHER_BRICK_SLAB);
		requiresPickaxe.add(Material.SANDSTONE_SLAB);
		requiresPickaxe.add(Material.CUT_SANDSTONE_SLAB);
		requiresPickaxe.add(Material.SMOOTH_SANDSTONE_SLAB);
		requiresPickaxe.add(Material.RED_SANDSTONE_SLAB);
		requiresPickaxe.add(Material.CUT_RED_SANDSTONE_SLAB);
		requiresPickaxe.add(Material.SMOOTH_RED_SANDSTONE_SLAB);
		requiresPickaxe.add(Material.QUARTZ_SLAB);
		requiresPickaxe.add(Material.SMOOTH_QUARTZ_SLAB);
		requiresPickaxe.add(Material.PURPUR_SLAB);
		requiresPickaxe.add(Material.PRISMARINE_SLAB);
		requiresPickaxe.add(Material.PRISMARINE_BRICK_SLAB);
		requiresPickaxe.add(Material.DARK_PRISMARINE_SLAB);
		requiresPickaxe.add(Material.PETRIFIED_OAK_SLAB);

		requiresPickaxe.add(Material.SMOOTH_STONE);

		// Stairs
		requiresPickaxe.add(Material.STONE_STAIRS);
		requiresPickaxe.add(Material.GRANITE_STAIRS);
		requiresPickaxe.add(Material.POLISHED_GRANITE_STAIRS);
		requiresPickaxe.add(Material.DIORITE_STAIRS);
		requiresPickaxe.add(Material.POLISHED_DIORITE_STAIRS);
		requiresPickaxe.add(Material.ANDESITE_STAIRS);
		requiresPickaxe.add(Material.POLISHED_ANDESITE_STAIRS);
		requiresPickaxe.add(Material.COBBLESTONE_STAIRS);
		requiresPickaxe.add(Material.MOSSY_COBBLESTONE_STAIRS);
		requiresPickaxe.add(Material.STONE_BRICK_STAIRS);
		requiresPickaxe.add(Material.MOSSY_STONE_BRICK_STAIRS);
		requiresPickaxe.add(Material.BRICK_STAIRS);
		requiresPickaxe.add(Material.END_STONE_BRICK_STAIRS);
		requiresPickaxe.add(Material.NETHER_BRICK_STAIRS);
		requiresPickaxe.add(Material.RED_NETHER_BRICK_STAIRS);
		requiresPickaxe.add(Material.SANDSTONE_STAIRS);
		requiresPickaxe.add(Material.SMOOTH_SANDSTONE_STAIRS);
		requiresPickaxe.add(Material.RED_SANDSTONE_STAIRS);
		requiresPickaxe.add(Material.SMOOTH_RED_SANDSTONE_STAIRS);
		requiresPickaxe.add(Material.QUARTZ_STAIRS);
		requiresPickaxe.add(Material.SMOOTH_QUARTZ_STAIRS);
		requiresPickaxe.add(Material.PURPUR_STAIRS);
		requiresPickaxe.add(Material.PRISMARINE_STAIRS);
		requiresPickaxe.add(Material.PRISMARINE_BRICK_STAIRS);
		requiresPickaxe.add(Material.DARK_PRISMARINE_STAIRS);

		requiresPickaxe.add(Material.STONE);
		requiresPickaxe.add(Material.STONE_BRICKS);
		requiresPickaxe.add(Material.STONE_BUTTON);
		requiresPickaxe.add(Material.STONE_PRESSURE_PLATE);
		requiresPickaxe.add(Material.SPAWNER);

		// Terracotta
		requiresPickaxe.add(Material.TERRACOTTA);
		requiresPickaxe.add(Material.WHITE_TERRACOTTA);
		requiresPickaxe.add(Material.ORANGE_TERRACOTTA);
		requiresPickaxe.add(Material.MAGENTA_TERRACOTTA);
		requiresPickaxe.add(Material.LIGHT_BLUE_TERRACOTTA);
		requiresPickaxe.add(Material.YELLOW_TERRACOTTA);
		requiresPickaxe.add(Material.LIME_TERRACOTTA);
		requiresPickaxe.add(Material.PINK_TERRACOTTA);
		requiresPickaxe.add(Material.GRAY_TERRACOTTA);
		requiresPickaxe.add(Material.LIGHT_GRAY_TERRACOTTA);
		requiresPickaxe.add(Material.CYAN_TERRACOTTA);
		requiresPickaxe.add(Material.PURPLE_TERRACOTTA);
		requiresPickaxe.add(Material.BLUE_TERRACOTTA);
		requiresPickaxe.add(Material.BROWN_TERRACOTTA);
		requiresPickaxe.add(Material.GREEN_TERRACOTTA);
		requiresPickaxe.add(Material.RED_TERRACOTTA);
		requiresPickaxe.add(Material.BLACK_TERRACOTTA);

		return requiresPickaxe;
	}

	private static Set<Material> setupRequiresShovelList()
	{
		final Set<Material> requiresShovel = new HashSet<>();

		requiresShovel.add(Material.CLAY);
		requiresShovel.add(Material.COARSE_DIRT);
		requiresShovel.add(Material.BLACK_CONCRETE_POWDER);
		requiresShovel.add(Material.DIRT);
		requiresShovel.add(Material.FARMLAND);
		requiresShovel.add(Material.GRASS_BLOCK);
		requiresShovel.add(Material.GRASS_PATH);
		requiresShovel.add(Material.GRAVEL);
		requiresShovel.add(Material.MYCELIUM);
		requiresShovel.add(Material.PODZOL);
		requiresShovel.add(Material.RED_SAND);
		requiresShovel.add(Material.SAND);
		requiresShovel.add(Material.SOUL_SAND);
		requiresShovel.add(Material.SNOW_BLOCK);

		return requiresShovel;
	}

	private static Set<Material> setupShovelsList()
	{
		final Set<Material> shovels = new HashSet<>();

		shovels.add(Material.DIAMOND_SHOVEL);
		shovels.add(Material.GOLDEN_SHOVEL);
		shovels.add(Material.IRON_SHOVEL);
		shovels.add(Material.STONE_SHOVEL);
		shovels.add(Material.WOODEN_SHOVEL);

		return shovels;
	}
}