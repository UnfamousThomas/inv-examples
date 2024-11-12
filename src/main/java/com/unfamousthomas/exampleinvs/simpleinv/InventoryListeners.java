package com.unfamousthomas.exampleinvs.simpleinv;

import java.util.UUID;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;

public class InventoryListeners implements Listener {
  //Handles clicks, basically just calls onClick

  @EventHandler
  public void onClick(InventoryClickEvent e) {
    if (!(e.getWhoClicked() instanceof Player player)){
      return;
    }
    if(e.getClickedInventory() == null) return;
    BaseInventory inventory = BaseInventory.getInventory(player);
    if(inventory == null) return;
    InventoryItem item = inventory.getItems().get(e.getSlot());

    e.setCancelled(true);

    if(item == null) return;
    if(item.getAction() == null) return;

    item.getAction().onClick(player, item.getItemStack());

  }

  //Removes user from open inventories
  @EventHandler
  public void closeInventory(InventoryCloseEvent e) {
    if(!(e.getInventory() instanceof BaseInventory)) return;

    BaseInventory.setClosed(e.getPlayer().getUniqueId());
  }



}
