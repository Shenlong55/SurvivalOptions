package com.hackquest.shenlong55.survivaloptions;

import com.hackquest.shenlong55.ddpluginlibrary.DDPlugin;
import com.hackquest.shenlong55.survivaloptions.events.ProperToolsBlockBreakEvent;
import com.hackquest.shenlong55.survivaloptions.events.ProperToolsBlockPlaceEvent;

public final class SurvivalOptionsPlugin extends DDPlugin
{
	@Override
	protected void preEnable()
	{
		updateConfiguration("config.yml");
		setDebugging(getConfig().getBoolean("debug"));
	}

	@Override
	protected void registerEvents()
	{
		if (getConfig().getBoolean(("ProperTools")))
		{
			registerEvent(new ProperToolsBlockBreakEvent(this));
			registerEvent(new ProperToolsBlockPlaceEvent(this));
		}
	}
}