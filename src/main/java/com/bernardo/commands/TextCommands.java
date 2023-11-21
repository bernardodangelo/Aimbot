package com.bernardo.commands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TextCommands implements CommandExecutor {

  @Override
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    if (cmd.getName().equalsIgnoreCase("regras")) {
      if (sender instanceof Player) {
        Player player = (Player) sender;
        player.sendMessage(
          ChatColor.GRAY +
          "[" +
          ChatColor.LIGHT_PURPLE +
          ChatColor.BOLD +
          "SEASON 9.5" +
          ChatColor.GRAY +
          "] " +
          ChatColor.DARK_RED +
          "Principais Regras: " +
          ChatColor.RED +
          "Proibido utilizar qualquer tipo de Cheat, Proibido Griefing, Probido Roubar, Proibido Abusar de Bugs, Proibido Divulgação e Discurso de Ódio no Chat e PvP apenas se ambos jogadores concordarem"
        );
      } else {
        sender.sendMessage(ChatColor.RED + "Este comando só pode ser executado por jogadores.");
      }
      return true;
    } else if (cmd.getName().equalsIgnoreCase("twitch")) {
      if (sender instanceof Player) {
        Player player = (Player) sender;
        player.sendMessage(
          ChatColor.GRAY +
          "[" +
          ChatColor.LIGHT_PURPLE +
          ChatColor.BOLD +
          "SEASON 9.5" +
          ChatColor.GRAY +
          "] " +
          ChatColor.DARK_PURPLE +
          "Twitch: " +
          ChatColor.AQUA +
          ChatColor.UNDERLINE +
          "twitch.tv/excambaw"
        );
      } else {
        sender.sendMessage(ChatColor.RED + "Este comando só pode ser executado por jogadores.");
      }
      return true;
    } else if (cmd.getName().equalsIgnoreCase("youtube")) {
      if (sender instanceof Player) {
        Player player = (Player) sender;
        player.sendMessage(
          ChatColor.GRAY +
          "[" +
          ChatColor.LIGHT_PURPLE +
          ChatColor.BOLD +
          "SEASON 9.5" +
          ChatColor.GRAY +
          "] " +
          ChatColor.DARK_RED +
          "Youtube: " +
          ChatColor.AQUA +
          ChatColor.UNDERLINE +
          "youtube.com/@livesdoexcambaw"
        );
      } else {
        sender.sendMessage(ChatColor.RED + "Este comando só pode ser executado por jogadores.");
      }
      return true;
    } else if (cmd.getName().equalsIgnoreCase("host")) {
      if (sender instanceof Player) {
        Player player = (Player) sender;
        player.sendMessage(
          ChatColor.GRAY +
          "[" +
          ChatColor.LIGHT_PURPLE +
          ChatColor.BOLD +
          "SEASON 9.5" +
          ChatColor.GRAY +
          "] " +
          ChatColor.BLUE +
          "Temos uma parceria com a Astral Cloud, você pode adquirir Hospedagens de Servidor de Minecraft e de Gta San Andreas: " +
          ChatColor.AQUA +
          ChatColor.UNDERLINE +
          "discord.gg/hhQDqhBTTG"
        );
      } else {
        sender.sendMessage(ChatColor.RED + "Este comando só pode ser executado por jogadores.");
      }
      return true;
    } else if (cmd.getName().equalsIgnoreCase("loja")) {
      if (sender instanceof Player) {
        Player player = (Player) sender;
        player.sendMessage(
          ChatColor.GRAY +
          "[" +
          ChatColor.LIGHT_PURPLE +
          ChatColor.BOLD +
          "SEASON 9.5" +
          ChatColor.GRAY +
          "] " +
          ChatColor.GOLD +
          "Adquira Vips, Cosméticos e Unbans na Loja: " +
          ChatColor.AQUA +
          ChatColor.UNDERLINE +
          "excambaw.craftingstore.net"
        );
      } else {
        sender.sendMessage(ChatColor.RED + "Este comando só pode ser executado por jogadores.");
      }
      return true;
    } else if (cmd.getName().equalsIgnoreCase("tutorialterreno")) {
      if (sender instanceof Player) {
        Player player = (Player) sender;
        player.sendMessage(
          ChatColor.GRAY +
          "[" +
          ChatColor.LIGHT_PURPLE +
          ChatColor.BOLD +
          "SEASON 9.5" +
          ChatColor.GRAY +
          "] " +
          ChatColor.GREEN +
          "Proteja o seu terreno utilizando um pá de ouro para ninguém roubar e quebrar sua construção, clique com o botão direito no chão segurando a pá de ouro para marcar seu terreno, tutorial completo em: " +
          ChatColor.AQUA +
          ChatColor.UNDERLINE +
          "youtu.be/skhldWT3qc8"
        );
      } else {
        sender.sendMessage(ChatColor.RED + "Este comando só pode ser executado por jogadores.");
      }
      return true;
    } else if (cmd.getName().equalsIgnoreCase("tutorialvip")) {
      if (sender instanceof Player) {
        Player player = (Player) sender;
        player.sendMessage(
          ChatColor.GRAY +
          "[" +
          ChatColor.LIGHT_PURPLE +
          ChatColor.BOLD +
          "SEASON 9.5" +
          ChatColor.GRAY +
          "] " +
          ChatColor.LIGHT_PURPLE +
          "Conheça todos os VIPs do servidor e como ativá-los: " +
          ChatColor.AQUA +
          ChatColor.UNDERLINE +
          "youtu.be/etX90ir2UGc"
        );
      } else {
        sender.sendMessage(ChatColor.RED + "Este comando só pode ser executado por jogadores.");
      }
      return true;
    } else if (cmd.getName().equalsIgnoreCase("tutorialloja")) {
      if (sender instanceof Player) {
        Player player = (Player) sender;
        player.sendMessage(
          ChatColor.GRAY +
          "[" +
          ChatColor.LIGHT_PURPLE +
          ChatColor.BOLD +
          "SEASON 9.5" +
          ChatColor.GRAY +
          "] " +
          ChatColor.YELLOW +
          "Como ganhar dinheiro, criar lojas e vender itens: " +
          ChatColor.AQUA +
          ChatColor.UNDERLINE +
          "youtu.be/DtzsKn92P24"
        );
      } else {
        sender.sendMessage(ChatColor.RED + "Este comando só pode ser executado por jogadores.");
      }
      return true;
    } else if (cmd.getName().equalsIgnoreCase("vipgratis")) {
      if (sender instanceof Player) {
        Player player = (Player) sender;
        player.sendMessage(
          ChatColor.GRAY +
          "[" +
          ChatColor.LIGHT_PURPLE +
          ChatColor.BOLD +
          "SEASON 9.5" +
          ChatColor.GRAY +
          "] " +
          ChatColor.GREEN +
          "Adquira um Vip grátis no server seguindo esse tutorial: " +
          ChatColor.AQUA +
          ChatColor.UNDERLINE +
          "youtu.be/o52sxxtdtQE"
        );
      } else {
        sender.sendMessage(ChatColor.RED + "Este comando só pode ser executado por jogadores.");
      }
      return true;
    } else if (cmd.getName().equalsIgnoreCase("encantamentos")) {
      if (sender instanceof Player) {
        Player player = (Player) sender;
        player.sendMessage(
                ChatColor.GRAY + "[" + ChatColor.LIGHT_PURPLE +
                        ChatColor.BOLD +
                        "SEASON 9.5" +
                        ChatColor.GRAY +
                        "] " +
                        ChatColor.DARK_PURPLE +
                        "Todos os encantamentos customizados do server: " +
                        ChatColor.AQUA +
                        ChatColor.UNDERLINE +
                        "youtu.be/ayVwM3D-6mg?si=fwEm9uohCaLIGnM3"
        );
      } else {
        sender.sendMessage(ChatColor.RED + "Este comando só pode ser executado por jogadores.");
      }
      return true;
    }

    return false;
  }
}
