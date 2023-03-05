package me.ronanplugins.player.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.List;

public interface TPACommand_TabCompletable extends TabCompleter {

    List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args);
}
