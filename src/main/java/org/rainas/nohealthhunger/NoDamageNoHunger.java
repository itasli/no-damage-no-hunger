package io.github.itasli.nodamagenohunger;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;

public class NoDamageNoHunger extends JavaPlugin {

	
	@Override
	public void onDisable() {
		getLogger().info("Plugin disabled");
	}

	@Override
	public void onEnable() {
		getLogger().info("Plugin enabled");
		Bukkit.getServer().getPluginManager().registerEvents(new HealthHungerListener(this), this);
	}

}
