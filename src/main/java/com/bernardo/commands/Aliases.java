package com.bernardo.commands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class Aliases implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("liveon")) {
            ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
            String live = "broadcast &b&lLIVE ON &r- &dTWITCH.TV/EXCAMBAW";
            Bukkit.dispatchCommand(console, live);
        }
        return true;
    }
}