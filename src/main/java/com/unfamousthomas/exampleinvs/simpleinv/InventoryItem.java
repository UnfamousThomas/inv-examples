package com.unfamousthomas.exampleinvs.simpleinv;

import org.bukkit.inventory.ItemStack;

//Represents some inventory item
public class InventoryItem {

  public InventoryItem(ItemProvider itemProvider, Action action) {
    this.itemProvider = itemProvider;
    this.action = action;
  }

  private final ItemProvider itemProvider;
  private final Action action;


  public Action getAction() {
    return action;
  }


  public ItemProvider getItemProvider() {
    return itemProvider;
  }
}
