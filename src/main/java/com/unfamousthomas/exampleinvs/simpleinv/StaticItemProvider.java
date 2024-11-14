package com.unfamousthomas.exampleinvs.simpleinv;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class StaticItemProvider implements ItemProvider {

  private final ItemStack itemStack;

  public StaticItemProvider(ItemStack itemStack) {
    this.itemStack = itemStack;
  }

  @Override
  public ItemStack getItem(Player player) {
    return itemStack;
  }
}
