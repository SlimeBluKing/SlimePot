package com.slime.slimepot.commands;

import com.slime.slimepot.Slimepot;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.bukkit.plugin.Plugin;
import org.bukkit.ChatColor;

public class cmdReload implements CommandExecutor {
    private Plugin plugin = Slimepot.getPlugin(Slimepot.class);
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if (sender.hasPermission("slimepot.reload")) {
            plugin.getConfig().options().header("Turn everything you need true or off\nFor more info https://hub.spigotmc.org/javadocs/spigot/org/bukkit/potion/PotionType.html\nPlugin by SlimeBluKing for ChillGames with <3\n\n");
            plugin.getConfig().options().copyHeader(true);
            plugin.reloadConfig();
            plugin.saveConfig();
            Bukkit.getServer().getPluginManager().disablePlugin(plugin);
            Bukkit.getServer().getPluginManager().enablePlugin(plugin);
            sender.sendMessage(ChatColor.GREEN + "SlimePot reloaded! ヾ(•ω•`)o");
        }
        else {
            sender.sendMessage(ChatColor.RED + "No permission");
        }
        return true;
    }
}
