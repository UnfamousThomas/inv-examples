package com.unfamousthomas.exampleinvs.impl;

import com.unfamousthomas.exampleinvs.simpleinv.Action;
import com.unfamousthomas.exampleinvs.simpleinv.BaseInventory;
import com.unfamousthomas.exampleinvs.simpleinv.ItemProvider;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class SomeOtherMenu extends BaseInventory {

  public SomeOtherMenu() {
    super(Component.text("Some other menu"), 18);

    setItem(9, new ItemStack(Material.ACACIA_LEAVES), (player, itemstack) -> {
      player.sendMessage("You clicked item in other menu");
    });

    setItem(7, new ItemProvider() {
      @Override
      public ItemStack getItem(Player player) {
        ItemStack itemStack = ItemStack.of(Material.ACACIA_LEAVES);

        itemStack.editMeta((meta) -> {
          meta.displayName(Component.text("some item"));
        });
        return itemStack;
      }
    }, new Action() {
      @Override
      public void onClick(Player player, ItemStack itemStack) {
        player.sendMessage(player.getUniqueId() + "clicked special item");
      }
    });
  }
}
