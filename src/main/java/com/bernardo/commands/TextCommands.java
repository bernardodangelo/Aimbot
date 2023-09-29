package com.bernardo.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import net.md_5.bungee.api.ChatColor;

public class TextCommands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("regras")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.sendMessage(ChatColor.GRAY + "[" + ChatColor.YELLOW + ChatColor.BOLD + "SEASON 9" + ChatColor.GRAY + "] " + ChatColor.RED + "Regras do Servidor: " + ChatColor.LIGHT_PURPLE + ChatColor.UNDERLINE + "docs.google.com/document/d/1TCZrqdJc6_h1r1O-T2q5v0l2jnFeOTE2ZuuHEi3PIOs/edit?usp=sharing");
            } else {
                sender.sendMessage(ChatColor.RED + "Este comando só pode ser executado por jogadores.");
            }
            return true;
        }
        return false;
    }
}
