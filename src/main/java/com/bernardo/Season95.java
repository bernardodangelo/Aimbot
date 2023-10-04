package com.bernardo;

import com.bernardo.commands.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class Season95 extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("regras").setExecutor(new TextCommands());
    }

    @Override
    public void onDisable() {
    }
}
