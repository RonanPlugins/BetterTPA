package me.ronanplugins.player.commands.types;

import me.ronanplugins.player.commands.TPACommand;
import me.ronanplugins.resources.PermissionNode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import java.util.List;

public class CmdTPAToggle implements TPACommand {

    @Override
    public String getName() {
        return "tpatoggle";
    }

    @Override public boolean onCommand(CommandSender sendi, Command command, String label, String[] args) {
        return false;
    }

    @Override
    public boolean permission(CommandSender sendi) {
        return PermissionNode.ADMIN.check(sendi);
    }

    @Override
    public boolean isDebugOnly() {
        return true;
    }
}
