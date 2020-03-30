package com.hackquest.shenlong55.survivaloptions.events;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

import com.hackquest.shenlong55.ddpluginlibrary.DDPlugin;
import com.hackquest.shenlong55.survivaloptions.configuration.ProperToolsConfiguration;

public final class ProperToolsBlockPlaceEvent implements Listener
{
	private final ProperToolsConfiguration config;

	public ProperToolsBlockPlaceEvent(final DDPlugin plugin)
	{
		config = ProperToolsConfiguration.getInstance(plugin);
	}

	@EventHandler
	public void onBlockPlaceEvent(final BlockPlaceEvent event)
	{
		final GameMode playerGameMode = event.getPlayer().getGameMode();

		if (playerGameMode.equals(GameMode.SURVIVAL))
		{
			final Material blockType = event.getBlock().getType();
			final Material offHandItem = event.getPlayer().getEquipment().getItemInOffHand().getType();

			final boolean holdingHammer = Material.WOODEN_SHOVEL.equals(offHandItem);

			if (!holdingHammer && config.getHammerRequiredBlocksList().contains(blockType))
			{
				event.setCancelled(true);

				if (config.isMessagePlayerEnabled())
				{
					event.getPlayer().sendMessage("You need to use a hammer to place this block.");
				}
			}
		}
	}
}