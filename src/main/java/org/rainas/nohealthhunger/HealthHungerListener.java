package io.github.itasli.nodamagenohunger;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

public class HealthHungerListener implements Listener {
	NoDamageNoHunger plugin;

	public HealthHungerListener(NoDamageNoHunger plugin) {
		this.plugin = plugin;
	}

	@EventHandler
	public void onEntityDamage(EntityDamageEvent event) {
		if (event.getEntity() instanceof Player) {
			Player player = (Player) event.getEntity();
			if (player.hasPermission("NoDamageNoHunger.nodamage")) {	
				event.setCancelled(true);
			}
		}
	}

	@EventHandler
	public void onFoodLevelChange(FoodLevelChangeEvent event) {
		if (event.getEntity() instanceof Player) {
			Player player = (Player) event.getEntity();
			if (player.hasPermission("NoDamageNoHunger.nohunger")) {
				event.setCancelled(true);
			}
		}
	}
}
