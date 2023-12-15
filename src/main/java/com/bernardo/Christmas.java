package com.bernardo;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class Christmas implements Listener {

    @EventHandler
    public void onEntityDeath(EntityDeathEvent event){

        Random random = new Random();

        if(random.nextDouble() < .08){
            event.getDrops().add(new ItemStack(Material.COOKIE, 1));
        }

    }
}
