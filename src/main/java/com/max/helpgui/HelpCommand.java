package com.max.helpgui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFactory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HelpCommand implements CommandExecutor {

    private List<Integer> frames = new ArrayList<>();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            System.out.println("Only players can do that!");
            return false;
        }
        Player player = (Player) sender;
        if (args.length != 0) {
            player.sendMessage(ChatColor.RED + "Usage: /help");
            return false;
        }

        Inventory inv = Bukkit.createInventory(player, 45, ChatColor.GREEN + "Help");
        ItemFactory itemFactory = Bukkit.getItemFactory();

        for (int i = 0; i < 10; i++) { frames.add(i); }
        frames.addAll(Arrays.asList(17, 18, 26, 27));
        for (int i = 35; i < 45; i ++) { frames.add(i); }

        ItemStack frame = itemFactory.createItemStack("minecraft:black_stained_glass_pane");
        ItemMeta frameMeta = frame.getItemMeta();
        assert frameMeta != null;
        frameMeta.setDisplayName(" ");
        frameMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        frame.setItemMeta(frameMeta);

        for (Integer i : frames) { inv.setItem(i, frame); }

        ItemStack discord = itemFactory.createItemStack("minecraft:ender_chest");
        ItemMeta discordMeta = discord.getItemMeta();
        assert discordMeta != null;
        discordMeta.setDisplayName(ChatColor.GREEN + "Discord");
        discordMeta.addEnchant(Enchantment.DURABILITY, 1, true);
        discordMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        discord.setItemMeta(discordMeta);
        inv.setItem(20, discord);

        ItemStack store = itemFactory.createItemStack("minecraft:gold_block");
        ItemMeta storeMeta = store.getItemMeta();
        assert storeMeta != null;
        storeMeta.setDisplayName(ChatColor.GREEN + "Server Store");
        storeMeta.addEnchant(Enchantment.DURABILITY, 1, true);
        storeMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        store.setItemMeta(storeMeta);
        inv.setItem(22, store);

        ItemStack dynmap = itemFactory.createItemStack("minecraft:gray_wool");
        ItemMeta dynmapMeta = dynmap.getItemMeta();
        assert dynmapMeta != null;
        dynmapMeta.setDisplayName(ChatColor.GREEN + "Dynmap");
        dynmapMeta.addEnchant(Enchantment.DURABILITY, 1, true);
        dynmapMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        dynmap.setItemMeta(dynmapMeta);
        inv.setItem(24, dynmap);

        player.openInventory(inv);

        return false;

    }
}
