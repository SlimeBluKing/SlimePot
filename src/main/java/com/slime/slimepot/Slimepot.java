package com.slime.slimepot;

import com.slime.slimepot.commands.cmdReload;
import org.bukkit.plugin.java.JavaPlugin;
import com.slime.slimepot.listeners.PotionListener;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;

public final class Slimepot extends JavaPlugin {
    public void onEnable() {
        //Enabling listener
        registerListener((Listener)new PotionListener());

        //config.yml
        getConfig().options().copyDefaults(true);
        getConfig().options().header("Turn everything you need true or off\nFor more info https://hub.spigotmc.org/javadocs/spigot/org/bukkit/potion/PotionType.html\nPlugin by SlimeBluKing for ChillGames with <3\n\n");
        getConfig().options().copyHeader(true);
        saveConfig();

        //Commands
        this.getCommand("sp-reload").setExecutor(new cmdReload());

        getLogger().info("Plugin enabled! Author: SlimeBluKing");
    }

    public void registerListener(Listener listener) {
        Bukkit.getPluginManager().registerEvents(listener, (Plugin)this);
    }

    public void onDisable() {
        getLogger().info("Plugin deactivated!");
    }
}
