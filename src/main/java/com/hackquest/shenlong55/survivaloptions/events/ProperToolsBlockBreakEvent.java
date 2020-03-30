package com.hackquest.shenlong55.survivaloptions.events;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import com.hackquest.shenlong55.ddpluginlibrary.DDMaterialTags;
import com.hackquest.shenlong55.ddpluginlibrary.DDPlugin;
import com.hackquest.shenlong55.survivaloptions.configuration.ProperToolsConfiguration;

public final class ProperToolsBlockBreakEvent implements Listener
{
	private final ProperToolsConfiguration config;

	public ProperToolsBlockBreakEvent(final DDPlugin plugin)
	{
		config = ProperToolsConfiguration.getInstance(plugin);
	}

	@EventHandler
	public void onBlockBreak(final BlockBreakEvent event)
	{
		final GameMode playerGameMode = event.getPlayer().getGameMode();

		if (playerGameMode.equals(GameMode.SURVIVAL))
		{
			final Material blockType = event.getBlock().getType();
			final Material mainHandItem = event.getPlayer().getEquipment().getItemInMainHand().getType();

			final boolean holdingAxe = DDMaterialTags.AXES.contains(mainHandItem);
			final boolean holdingHammer = Material.WOODEN_SHOVEL.equals(mainHandItem);
			final boolean holdingPickaxe = DDMaterialTags.PICKAXES.contains(mainHandItem);
			final boolean holdingShears = Material.SHEARS.equals(mainHandItem);
			final boolean holdingShovel = DDMaterialTags.SHOVELS.contains(mainHandItem);
			final boolean holdingSword = DDMaterialTags.SWORDS.contains(mainHandItem);

			if (!holdingAxe && config.getAxeRequiredBlocksList().contains(blockType))
			{
				CancelBlockBreak(event, "an axe");
			}

			if (!holdingHammer && config.getHammerRequiredBlocksList().contains(blockType))
			{
				CancelBlockBreak(event, "a hammer");
			}

			if ((holdingAxe || holdingPickaxe || holdingShears || holdingShovel || holdingSword)
					&& config.getFragileBlocksList().contains(blockType))
			{
				event.setDropItems(false);
			}

			if (!holdingPickaxe && config.getPickaxeRequiredBlocksList().contains(blockType))
			{
				CancelBlockBreak(event, "a pickaxe");
			}

			if (!(holdingAxe || holdingSword || holdingShears)
					&& config.getSharpRequiredBlocksList().contains(blockType))
			{
				CancelBlockBreak(event, "a sharp tool");
			}

			if (!holdingShears && config.getShearsRequiredBlocksList().contains(blockType))
			{
				CancelBlockBreak(event, "shears");
			}

			if (!holdingShovel && config.getShovelRequiredBlocksList().contains(blockType))
			{
				CancelBlockBreak(event, "a shovel");
			}
		}
	}

	private void CancelBlockBreak(final BlockBreakEvent event, final String requiredTool)
	{
		event.setCancelled(true);

		if (config.isMessagePlayerEnabled())
		{
			event.getPlayer().sendMessage("You need to use " + requiredTool + " to break this block.");
		}
	}
}