package com.unfamousthomas.exampleinvs.impl;

import com.unfamousthomas.exampleinvs.simpleinv.BaseInventory;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class SomeOtherMenu extends BaseInventory {

  public SomeOtherMenu() {
    super(Component.text("Some other menu"), 18);

    setItem(9, new ItemStack(Material.ACACIA_LEAVES), (player, itemstack) -> {
      player.sendMessage("You clicked item in other menu");
    });
  }
}
