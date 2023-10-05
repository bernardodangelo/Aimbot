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
                player.sendMessage(ChatColor.GRAY + "[" + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + "SEASON 9.5" + ChatColor.GRAY + "] " + ChatColor.RED + "Regras do Servidor: " + ChatColor.AQUA + ChatColor.UNDERLINE + "docs.google.com/document/d/1TCZrqdJc6_h1r1O-T2q5v0l2jnFeOTE2ZuuHEi3PIOs/edit?usp=sharing");
            } else {
                sender.sendMessage(ChatColor.RED + "Este comando só pode ser executado por jogadores.");
            }
            return true;
        }
        else if(cmd.getName().equalsIgnoreCase("twitch")){
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.sendMessage(ChatColor.GRAY + "[" + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + "SEASON 9.5" + ChatColor.GRAY + "] " + ChatColor.DARK_PURPLE + "Twitch: " + ChatColor.AQUA + ChatColor.UNDERLINE + "twitch.tv/excambaw");
            } else {
                sender.sendMessage(ChatColor.RED + "Este comando só pode ser executado por jogadores.");
            }
            return true;
        }
        else if(cmd.getName().equalsIgnoreCase("youtube")){
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.sendMessage(ChatColor.GRAY + "[" + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + "SEASON 9.5" + ChatColor.GRAY + "] " + ChatColor.DARK_RED + "Youtube: " + ChatColor.AQUA + ChatColor.UNDERLINE + "youtube.com/@livesdoexcambaw");
            } else {
                sender.sendMessage(ChatColor.RED + "Este comando só pode ser executado por jogadores.");
            }
            return true;
        }
        return false;
    }
}
