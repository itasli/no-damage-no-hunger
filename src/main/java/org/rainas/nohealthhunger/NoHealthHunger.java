package org.rainas.nohealthhunger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class NoHealthHunger extends JavaPlugin {

	@Override
	public void onDisable() {
		getLogger().info("Plugin disabled");
	}

	@Override
	public void onEnable() {
		getLogger().info("Plugin enabled");
		this.saveDefaultConfig();
		Bukkit.getServer().getPluginManager().registerEvents(new HealthHungerListener(this), this);
	}

}
