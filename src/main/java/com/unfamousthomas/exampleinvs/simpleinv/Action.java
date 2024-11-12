package com.unfamousthomas.exampleinvs.simpleinv;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface Action {
  //Represents what is done when an item is clicked

  void onClick(Player player, ItemStack itemStack);

}
