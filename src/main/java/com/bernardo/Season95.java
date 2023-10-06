package com.bernardo;

import com.bernardo.commands.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class Season95 extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("regras").setExecutor(new TextCommands());
        getCommand("twitch").setExecutor(new TextCommands());
        getCommand("youtube").setExecutor(new TextCommands());
        getCommand("host").setExecutor(new TextCommands());
        getCommand("loja").setExecutor(new TextCommands());
    }

    @Override
    public void onDisable() {
    }
}
