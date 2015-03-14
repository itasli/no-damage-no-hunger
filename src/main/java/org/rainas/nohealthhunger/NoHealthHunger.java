package org.rainas.nohealthhunger;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;

public class NoHealthHunger extends JavaPlugin {

	public Location spawn;
	public boolean doVoid;
	public String voidMessage;
	
	@Override
	public void onDisable() {
		getLogger().info("Plugin disabled");
	}

	@Override
	public void onEnable() {
		getLogger().info("Plugin enabled");
		this.saveDefaultConfig();
		
		double x  = this.getConfig().getDouble("spawn.x");
		double y  = this.getConfig().getDouble("spawn.y");
		double z  = this.getConfig().getDouble("spawn.z");
		String world = this.getConfig().getString("spawn.world");
		spawn = new Location(Bukkit.getWorld(world), x, y, z);
		
		doVoid = this.getConfig().getBoolean("escapevoid.teleport_out_of_void");
		voidMessage = this.getConfig().getString("escapevoid.message");
		
		Bukkit.getServer().getPluginManager().registerEvents(new HealthHungerListener(this), this);
	}

}
