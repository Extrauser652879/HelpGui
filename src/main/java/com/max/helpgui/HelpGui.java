package com.max.helpgui;

import com.max.helpgui.op.Op;
import com.max.helpgui.pluginmanager.PluginManager;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.chat.hover.content.Text;
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

        if (!e.getView().getTitle().equals(ChatColor.translateAlternateColorCodes('&', ChatColor.DARK_GREEN + ChatColor.BOLD.toString() + "Help"))) return;
        e.setCancelled(true);

        if (e.getSlot() == 20) {

            e.getWhoClicked().closeInventory();

            TextComponent discord = new TextComponent(ChatColor.GRAY +
                    " \n===================================\n" +
                            "|                                                   |\n" +
                            "|" + ChatColor.RESET + ChatColor.GOLD + "     Click ");
            TextComponent discord2 = new TextComponent(
                    ChatColor.RESET + ChatColor.RED.toString() + ChatColor.BOLD + "HERE");
            discord2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text("Click me!")));
            discord2.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://discord.gg/WWS7gUWY44"));
            TextComponent discord3 = new TextComponent(
                    ChatColor.RESET + ChatColor.GOLD.toString() + " to join the ");
            TextComponent discord4 = new TextComponent(
                    ChatColor.RESET + ChatColor.RED.toString() + ChatColor.BOLD + "DISCORD");
            discord4.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text("Click me!")));
            discord4.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://discord.gg/WWS7gUWY44"));
            TextComponent discord5 = new TextComponent(ChatColor.RESET + ChatColor.GRAY.toString() + "     |\n" +
                    "|                                                   |\n" +
                    "===================================\n ");
            discord.addExtra(discord2);
            discord.addExtra(discord3);
            discord.addExtra(discord4);
            discord.addExtra(discord5);

            e.getWhoClicked().spigot().sendMessage(discord);

        } else if (e.getSlot() == 22) {

            e.getWhoClicked().closeInventory();

            TextComponent store = new TextComponent(ChatColor.GRAY +
                    " \n==========================================\n" +
                            "|                                                             |\n" +
                            "|" + ChatColor.RESET + ChatColor.GOLD + "     Click ");
            TextComponent store2 = new TextComponent(
                    ChatColor.RESET + ChatColor.RED.toString() + ChatColor.BOLD + "HERE");
            store2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text("Click me!")));
            store2.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://ventyvines-mc.tebex.io/"));
            TextComponent store3 = new TextComponent(
                    ChatColor.RESET + ChatColor.GOLD.toString() + " to open the ");
            TextComponent store4 = new TextComponent(
                    ChatColor.RESET + ChatColor.RED.toString() + ChatColor.BOLD + "SERVER STORE");
            store4.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text("Click me!")));
            store4.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://ventyvines-mc.tebex.io/"));
            TextComponent store5 = new TextComponent(ChatColor.RESET + ChatColor.GRAY.toString() + "     |\n" +
                    "|                                                             |\n" +
                    "==========================================\n ");
            store.addExtra(store2);
            store.addExtra(store3);
            store.addExtra(store4);
            store.addExtra(store5);

            e.getWhoClicked().spigot().sendMessage(store);

        } else if (e.getSlot() == 24) {

            e.getWhoClicked().closeInventory();

            TextComponent dynmap = new TextComponent(ChatColor.GRAY +
                    " \n===================================\n" +
                            "|                                                   |\n" +
                            "|" + ChatColor.RESET + ChatColor.GOLD + "     Click ");
            TextComponent dynmap2 = new TextComponent(
                    ChatColor.RESET + ChatColor.RED.toString() + ChatColor.BOLD + "HERE");
            dynmap2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text("Click me!")));
            dynmap2.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://ventyvines-mc.tebex.io/"));
            TextComponent dynmap3 = new TextComponent(
                    ChatColor.RESET + ChatColor.GOLD.toString() + " to open the ");
            TextComponent dynmap4 = new TextComponent(
                    ChatColor.RESET + ChatColor.RED.toString() + ChatColor.BOLD + "DYNMAP");
            dynmap4.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text("Click me!")));
            dynmap4.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "http://135.148.39.160:25644/"));
            TextComponent dynmap5 = new TextComponent(ChatColor.RESET + ChatColor.GRAY.toString() + "     |\n" +
                    "|                                                   |\n" +
                    "===================================\n ");
            dynmap.addExtra(dynmap2);
            dynmap.addExtra(dynmap3);
            dynmap.addExtra(dynmap4);
            dynmap.addExtra(dynmap5);

            e.getWhoClicked().spigot().sendMessage(dynmap);

        }
    }
}
