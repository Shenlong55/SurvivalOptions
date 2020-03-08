package com.hackquest.shenlong55.advancedsurvivalplugin.events;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import com.hackquest.shenlong55.advancedsurvivalplugin.utility.MaterialTypeLists;

public final class ToolsRequiredBlockBreakEvent implements Listener
{
	private final boolean toolsRequired = true;

	@EventHandler
	public void onBlockBreak(final BlockBreakEvent event)
	{
		final GameMode gameMode = event.getPlayer().getGameMode();

		if (toolsRequired && gameMode.equals(GameMode.SURVIVAL))
		{
			final Material blockType = event.getBlock().getType();
			final Material toolType = event.getPlayer().getEquipment().getItemInMainHand().getType();

			if (MaterialTypeLists.requiresShovel(blockType) && !MaterialTypeLists.isShovel(toolType))
			{
				event.setCancelled(true);
				event.getPlayer().sendMessage("You need to use a shovel to break this block.");
			}

			if (MaterialTypeLists.requiresAxe(blockType) && !MaterialTypeLists.isAxe(toolType))
			{
				event.setCancelled(true);
				event.getPlayer().sendMessage("You need to use an axe to break this block.");
			}
		}
	}
}