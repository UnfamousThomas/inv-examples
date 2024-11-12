package com.unfamousthomas.exampleinvs.impl;

import com.unfamousthomas.exampleinvs.simpleinv.Action;
import com.unfamousthomas.exampleinvs.simpleinv.BaseInventory;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class SomeRandomMenu extends BaseInventory {

  public SomeRandomMenu() {
    super(Component.text("Some component title"), 9);

    setItem(0, new ItemStack(Material.STRING), new Action() {
      @Override
      public void onClick(Player player, ItemStack itemStack) {
        player.sendMessage(Component.text("CLICKED"));
        System.out.println("CLICKED");
      }
    });
  }
}
