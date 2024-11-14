package com.unfamousthomas.exampleinvs.simpleinv;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface ItemProvider {

  ItemStack getItem(Player player);
}
