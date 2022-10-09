package com.max.helpgui;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class HelpGui extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {

        getCommand("help").setExecutor(new HelpCommand());
        Bukkit.getPluginManager().registerEvents(this, this);

    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {

        if (!e.getView().getTitle().equals(ChatColor.translateAlternateColorCodes('&', ChatColor.GREEN + "Starter Tools"))) return;
        e.setCancelled(true);

        if (e.getSlot() == 20) {

            e.getWhoClicked().closeInventory();
            TextComponent clickable = new TextComponent(ChatColor.GREEN + "https://discord.gg/WWS7gUWY44");
            clickable.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://discord.gg/WWS7gUWY44"));
            e.getWhoClicked().spigot().sendMessage(clickable);

        } else if (e.getSlot() == 22) {

            e.getWhoClicked().closeInventory();
            TextComponent clickable = new TextComponent(ChatColor.GREEN + "https://ventyvines-mc.tebex.io/");
            clickable.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://ventyvines-mc.tebex.io/"));
            e.getWhoClicked().spigot().sendMessage(clickable);

        } else if (e.getSlot() == 24) {

            e.getWhoClicked().closeInventory();
            TextComponent clickable = new TextComponent(ChatColor.GREEN + "http://135.148.39.160:25644/");
            clickable.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "http://135.148.39.160:25644/"));
            e.getWhoClicked().spigot().sendMessage(clickable);

        }
    }
}
