package com.unfamousthomas.exampleinvs.simpleinv;

import org.bukkit.inventory.ItemStack;

//Represents some inventory item
public class InventoryItem {

  public InventoryItem(ItemStack itemStack, Action action) {
    this.itemStack = itemStack;
    this.action = action;
  }

  public InventoryItem(ItemStack itemStack, Action action, String permission) {
    this.itemStack = itemStack;
    this.action = action;
    this.permission = permission;
  }

  private final ItemStack itemStack;
  private final Action action;
  private String permission;

  public ItemStack getItemStack() {
    return itemStack;
  }

  public Action getAction() {
    return action;
  }

  public String getPermission() {
    return permission;
  }
}
