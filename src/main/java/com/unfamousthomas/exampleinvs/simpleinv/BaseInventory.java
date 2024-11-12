package com.unfamousthomas.exampleinvs.simpleinv;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class BaseInventory {
  //Store opened inventories, accross menus
  private static Map<UUID, BaseInventory> openInventories = new HashMap<>();

  //Items map, integer being slot. Storesi tems already in inventory.
  private Map<Integer, InventoryItem> items = new HashMap<>();
  private Inventory inventory;

  public BaseInventory(Component title, int slots) {
    this.inventory = Bukkit.createInventory(null, slots, title);
  }
  //Opens inventory
  public void open(Player player) {
    player.openInventory(inventory);
    openInventories.put(player.getUniqueId(), this);
  }

  //Method for setting items
  protected void setItem(int slot, ItemStack stack, Action action) {
    items.put(slot, new InventoryItem(stack, action));
    inventory.setItem(slot, stack);
  }

  public Map<Integer, InventoryItem> getItems() {
    return items;
  }

  //Static methods for handling open inventories
  public static void setClosed(UUID uuid) {
    openInventories.remove(uuid);
  }

  public static BaseInventory getInventory(Player player) {
    return openInventories.get(player.getUniqueId());
  }
}
