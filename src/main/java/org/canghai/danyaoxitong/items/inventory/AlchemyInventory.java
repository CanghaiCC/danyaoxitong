package org.canghai.danyaoxitong.items.inventory;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.Furnace;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.plugin.java.JavaPlugin;
import org.canghai.danyaoxitong.Danyaoxitong;
import org.jetbrains.annotations.NotNull;

public class AlchemyInventory implements InventoryHolder {
    private final Inventory inventory;
    private final NamespacedKey key_block = new NamespacedKey(JavaPlugin.getPlugin(Danyaoxitong.class), "AlchemyBlock");
    private final NamespacedKey key_item = new NamespacedKey(JavaPlugin.getPlugin(Danyaoxitong.class), "AlchemyItem");

    public AlchemyInventory(JavaPlugin plugin) {
        this.inventory = plugin.getServer().createInventory(this, 54, "AlchemyInventory");
    }

    @Override
    public Inventory getInventory() {
        return this.inventory;
    }

    public NamespacedKey getKey_block() { return key_block; }

    public NamespacedKey getKey_item() { return key_item; }

    public ItemStack createAlchemyItem(){
        ItemStack alchemyItem = new ItemStack(Material.FURNACE);
        ItemMeta meta = alchemyItem.getItemMeta();
        meta.getPersistentDataContainer().set(key_item, PersistentDataType.STRING, "alchemy_item");
        meta.displayName(Component.text("炼丹炉"));
        alchemyItem.setItemMeta(meta);

        return alchemyItem;
    }

    public void markBlockByPersistentData(Block block) {
        BlockState state = block.getState();
        if (state instanceof Furnace furnace) {
            //  persistentDataContainer接口类似Map，用来存储自定义标签
            PersistentDataContainer dataContainer = furnace.getPersistentDataContainer();
            dataContainer.set(key_block, PersistentDataType.STRING, "alchemy_block");
            furnace.update();  //  更新方块状态
        }
    }
}
