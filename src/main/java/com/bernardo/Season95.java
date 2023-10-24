package com.bernardo;

import com.bernardo.commands.*;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Season95 extends JavaPlugin {

    @Override
    public void onEnable() {
        Objects.requireNonNull(getCommand("regras")).setExecutor(new TextCommands());
        Objects.requireNonNull(getCommand("twitch")).setExecutor(new TextCommands());
        Objects.requireNonNull(getCommand("youtube")).setExecutor(new TextCommands());
        Objects.requireNonNull(getCommand("host")).setExecutor(new TextCommands());
        Objects.requireNonNull(getCommand("loja")).setExecutor(new TextCommands());
        Objects.requireNonNull(getCommand("terreno")).setExecutor(new TextCommands());
        Objects.requireNonNull(getCommand("tags")).setExecutor(new TextCommands());
        Objects.requireNonNull(getCommand("liveon")).setExecutor(new Aliases());
    }

    @Override
    public void onDisable() {
    }



}
