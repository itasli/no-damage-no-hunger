package org.rainas.nohealthhunger;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

public class HealthHungerListener implements Listener {
	NoHealthHunger plugin;

	public HealthHungerListener(NoHealthHunger plugin) {
		this.plugin = plugin;
	}

	@EventHandler
	public void onEntityDamage(EntityDamageEvent event) {
		if (event.getEntity() instanceof Player) {
			Player player = (Player) event.getEntity();
			if (player.hasPermission("NoHealthHunger.nohealth")) {	
				event.setCancelled(true);
			}
			
			if (event.getCause() == DamageCause.VOID) {
				if (plugin.doVoid && player.hasPermission("NoHealthHunger.escapevoid")) {
					player.teleport(plugin.spawn);
					player.sendMessage(plugin.voidMessage);
				}
			}
		}
	}

	@EventHandler
	public void onFoodLevelChange(FoodLevelChangeEvent event) {
		if (event.getEntity() instanceof Player) {
			Player player = (Player) event.getEntity();
			if (player.hasPermission("NoHealthHunger.nohunger")) {
				event.setCancelled(true);
			}
		}
	}
}
