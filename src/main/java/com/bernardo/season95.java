package com.bernardo;

import com.bernardo.commands.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class season95 extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("TextCommands").setExecutor(new TextCommands());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
