package me.ronanplugins.player.commands.types;

import me.ronanplugins.player.commands.TPACommand;
import me.ronanplugins.player.commands.TPACommand_TabCompletable;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import java.util.List;

public class CmdTPA implements TPACommand, TPACommand_TabCompletable {


    @Override public boolean onCommand(CommandSender sendi, Command command, String label, String[] args) {
        sendi.sendMessage("tpa cmd");
        return false;
    }

    @Override public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        return null;
    }

    @Override
    public boolean permission(CommandSender sendi) {
        return true;
    }

    @Override
    public String getName() {
        return "tpa";
    }

}
