package com.hackquest.shenlong55.survivaloptions.configuration;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;

import com.hackquest.shenlong55.ddpluginlibrary.DDMaterialTags;
import com.hackquest.shenlong55.ddpluginlibrary.DDPlugin;

public class ProperToolsConfiguration
{
	private static ProperToolsConfiguration instance;

	private final YamlConfiguration	config;
	private final Logger			logger;
	private final boolean			messagePlayer;

	private final String		configFileName				= "properTools.yml";
	private final Set<Material>	axeRequiredBlocks		= new HashSet<>();
	private final Set<Material>	hammerRequiredBlocks	= new HashSet<>();
	private final Set<Material>	fragileBlocks			= new HashSet<>();
	private final Set<Material>	pickaxeRequiredBlocks	= new HashSet<>();
	private final Set<Material>	sharpRequiredBlocks		= new HashSet<>();
	private final Set<Material>	shearsRequiredBlocks	= new HashSet<>();
	private final Set<Material>	shovelRequiredBlocks	= new HashSet<>();

	public ProperToolsConfiguration(final DDPlugin plugin)
	{
		config = plugin.updateConfiguration(configFileName);
		logger = plugin.getLogger();

		messagePlayer = config.getBoolean("MessagePlayer");

		if (config.getBoolean("AxeRequired.Enabled"))
		{
			loadBlockSet("AxeRequired.Blocks", axeRequiredBlocks);
		}

		if (config.getBoolean("HammerRequired.Enabled"))
		{
			loadBlockSet("HammerRequired.Blocks", hammerRequiredBlocks);
		}

		if (config.getBoolean("Fragile.Enabled"))
		{
			loadBlockSet("Fragile.Blocks", fragileBlocks);
		}

		if (config.getBoolean("PickaxeRequired.Enabled"))
		{
			loadBlockSet("PickaxeRequired.Blocks", pickaxeRequiredBlocks);
		}

		if (config.getBoolean("SharpRequired.Enabled"))
		{
			loadBlockSet("SharpRequired.Blocks", sharpRequiredBlocks);
		}

		if (config.getBoolean("ShearsRequired.Enabled"))
		{
			loadBlockSet("ShearsRequired.Blocks", shearsRequiredBlocks);
		}

		if (config.getBoolean("ShovelRequired.Enabled"))
		{
			loadBlockSet("ShovelRequired.Blocks", shovelRequiredBlocks);
		}
	}

	public static ProperToolsConfiguration getInstance(final DDPlugin plugin)
	{
		if (instance == null)
		{
			instance = new ProperToolsConfiguration(plugin);
		}

		return instance;
	}

	public Set<Material> getAxeRequiredBlocksList()
	{
		return axeRequiredBlocks;
	}

	public Set<Material> getFragileBlocksList()
	{
		return fragileBlocks;
	}

	public Set<Material> getHammerRequiredBlocksList()
	{
		return hammerRequiredBlocks;
	}

	public Set<Material> getPickaxeRequiredBlocksList()
	{
		return pickaxeRequiredBlocks;
	}

	public Set<Material> getSharpRequiredBlocksList()
	{
		return sharpRequiredBlocks;
	}

	public Set<Material> getShearsRequiredBlocksList()
	{
		return shearsRequiredBlocks;
	}

	public Set<Material> getShovelRequiredBlocksList()
	{
		return shovelRequiredBlocks;
	}

	public boolean isMessagePlayerEnabled()
	{
		return messagePlayer;
	}

	private void loadBlockSet(final String blockListNode, final Set<Material> set)
	{
		for (final Object object : config.getList(blockListNode))
		{
			if (object instanceof String)
			{
				final Set<Material> typeList = DDMaterialTags.getTaggedMaterials((String) object);

				if (typeList != null)
				{
					for (final Material material : typeList)
					{
						set.add(material);
					}
				}
				else
				{
					try
					{
						set.add(Material.valueOf((String) object));
					}
					catch (final IllegalArgumentException exception)
					{
						logger.warning("Ignoring invalid block entry: " + (String) object);
					}
				}
			}
		}
	}
}