package com.github.leanfe.listeners;

import org.bukkit.block.Bed;
import org.bukkit.entity.EnderDragon;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByBlockEvent;
import org.bukkit.event.entity.EntityDamageEvent;

public class DamageListener implements Listener {

    @EventHandler(priority = EventPriority.HIGH)
    public void onDamage(EntityDamageByBlockEvent event) {
        if (!(event.getEntity() instanceof EnderDragon)) return;
        if (event.getDamager() instanceof Bed) {
            event.setCancelled(true);
        }
    }
}
