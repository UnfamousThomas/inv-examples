package com.unfamousthomas.exampleinvs.commands;

import com.unfamousthomas.exampleinvs.impl.SomeOtherMenu;
import com.unfamousthomas.exampleinvs.impl.SomeRandomMenu;
import java.util.List;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class RandomOtherMenuCommand implements TabExecutor {

  @Override
  public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command,
      @NotNull String s, @NotNull String[] strings) {
    if(!(commandSender instanceof Player player)) {
      return false;
    }

    new SomeOtherMenu().open(player);
    return true;
  }

  @Override
  public @Nullable List<String> onTabComplete(@NotNull CommandSender commandSender,
      @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
    return List.of();
  }
}
