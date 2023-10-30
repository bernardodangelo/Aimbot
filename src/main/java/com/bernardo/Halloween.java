package com.bernardo;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class Halloween implements Listener {

    @EventHandler
    public void onEntityDeath(EntityDeathEvent event) {
        LivingEntity entity = event.getEntity();
        EntityType entityType = entity.getType();

        Random random = new Random();

        if (random.nextDouble() < 0.10) {
            if (entityType == EntityType.ZOMBIE || entityType == EntityType.SKELETON || entityType == EntityType.SPIDER || entityType == EntityType.CREEPER) {
                Location deathLocation = entity.getLocation();
                deathLocation.getWorld().strikeLightningEffect(deathLocation);
            }
        }

        if (random.nextDouble() < 0.2) {
            event.getDrops().add(new ItemStack(Material.PUMPKIN_PIE, 1));
        }

        if (random.nextDouble() < 0.05) {
            event.getDrops().add(new ItemStack(Material.CARVED_PUMPKIN, 1));
        }

        if (random.nextDouble() < 0.05) {
            event.getDrops().add(new ItemStack(Material.JACK_O_LANTERN, 1));
        }
    }
}