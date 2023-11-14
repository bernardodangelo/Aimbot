package com.bernardo;

import com.bernardo.commands.*;
import java.util.Objects;
import org.bukkit.plugin.java.JavaPlugin;

public final class Season95 extends JavaPlugin {

  @Override
  public void onEnable() {
    Objects.requireNonNull(getCommand("regras")).setExecutor(new TextCommands());
    Objects.requireNonNull(getCommand("twitch")).setExecutor(new TextCommands());
    Objects.requireNonNull(getCommand("youtube")).setExecutor(new TextCommands());
    Objects.requireNonNull(getCommand("host")).setExecutor(new TextCommands());
    Objects.requireNonNull(getCommand("loja")).setExecutor(new TextCommands());
    Objects.requireNonNull(getCommand("liveon")).setExecutor(new Aliases());
    Objects.requireNonNull(getCommand("tutorialterreno")).setExecutor(new TextCommands());
    Objects.requireNonNull(getCommand("tutorialvip")).setExecutor(new TextCommands());
    Objects.requireNonNull(getCommand("tutorialloja")).setExecutor(new TextCommands());

    Objects.requireNonNull(getCommand("vipgratis")).setExecutor(new TextCommands());
  }

  @Override
  public void onDisable() {}
}
