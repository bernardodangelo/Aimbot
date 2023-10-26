package com.bernardo;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import java.util.Random;

public class Halloween implements Listener {

    @EventHandler
    public void onEntityDeath(EntityDeathEvent event) {
        LivingEntity entity = event.getEntity();
        EntityType entityType = entity.getType();

        Random random = new Random();

        if (random.nextDouble() < 0.20) {
            if (entityType == EntityType.ZOMBIE || entityType == EntityType.SKELETON || entityType == EntityType.SPIDER || entityType == EntityType.CREEPER) {
                Location deathLocation = entity.getLocation();
                deathLocation.getWorld().strikeLightningEffect(deathLocation);
            }
        }
    }
}