package org.canghai.danyaoxitong.commands;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.canghai.danyaoxitong.AlchemyCraft;
import org.canghai.danyaoxitong.items.pills.Pills;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class AlchemyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        // 检查参数数量
        if (args.length < 3) {
            sender.sendMessage("§c用法: /alchemy <give> <random> <id/level>");
            return true;
        }
        String mode = args[1];
        String level = args[2];
        Pills[] pills = Pills.values();
        for(Pills pill : pills) {
            if(pill.getQuality() == Integer.parseInt(level)){
                ItemStack item = new ItemStack(Material.POTATO);
                ItemMeta meta = item.getItemMeta();
                meta.displayName(pill.getDisplayName());
                meta.lore(Collections.singletonList(pill.getDescription()));
                item.setItemMeta(meta);
                ((Player) sender).getInventory().addItem(item);
            }
        }

        return true;
    }
}
