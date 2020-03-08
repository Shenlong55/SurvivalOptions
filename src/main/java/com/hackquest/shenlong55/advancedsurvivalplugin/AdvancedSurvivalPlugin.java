package com.hackquest.shenlong55.advancedsurvivalplugin;

import org.bukkit.plugin.java.JavaPlugin;

import com.hackquest.shenlong55.advancedsurvivalplugin.events.ToolsRequiredBlockBreakEvent;

public final class AdvancedSurvivalPlugin extends JavaPlugin
{
	@Override
	public void onEnable()
	{
		getServer().getPluginManager().registerEvents(new ToolsRequiredBlockBreakEvent(), this);
	}
}