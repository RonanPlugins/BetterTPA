package me.ronanplugins.player.commands;

import me.ronanplugins.BetterTPA;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.List;

public interface TPACommand extends CommandExecutor {

    boolean onCommand(CommandSender sendi, Command command, String label, String[] args);

    boolean permission(CommandSender sendi);

    String getName();

    default boolean isDebugOnly() {
        return false;
    }

    default void load() {
        BetterTPA.getInstance().getCommand(getName()).setExecutor(this);
        if (this instanceof TabCompleter)
            BetterTPA.getInstance().getCommand(getName()).setTabCompleter((TabCompleter) this);
    }
}
