package io.github.spiral6.testplugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public final class TestPlugin extends JavaPlugin
{
	@Override
	public void onEnable() 
	{
		getLogger().info("onEnable has been invoked! Your plugin works, congratulations!");
	}
	
	@Override
	public void onDisable() 
	{
		getLogger().info("onDisable has been invoked!");
	}
}
