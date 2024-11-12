package com.unfamousthomas.exampleinvs;

import com.unfamousthomas.exampleinvs.commands.RandomMenuCommand;
import com.unfamousthomas.exampleinvs.commands.RandomOtherMenuCommand;
import com.unfamousthomas.exampleinvs.simpleinv.InventoryListeners;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

  @Override
  public void onEnable() {
    getServer().getPluginManager().registerEvents(new InventoryListeners(), this);

    getCommand("randommenu").setExecutor(new RandomMenuCommand());
    getCommand("randomothermenu").setExecutor(new RandomOtherMenuCommand());

  }
}
