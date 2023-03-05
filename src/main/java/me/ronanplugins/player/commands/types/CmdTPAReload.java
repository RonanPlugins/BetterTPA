package me.ronanplugins.player.commands.types;

import me.ronanplugins.BetterTPA;
import me.ronanplugins.player.commands.TPACommand;
import me.ronanplugins.resources.PermissionNode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import java.util.List;

public class CmdTPAReload implements TPACommand {

    @Override
    public String getName() {
        return "tpareload";
    }

    @Override public boolean onCommand(CommandSender sendi, Command command, String label, String[] args) {
        return false;
    }

    @Override
    public boolean permission(CommandSender sendi) {
        return PermissionNode.RELOAD.check(sendi);
    }

}
