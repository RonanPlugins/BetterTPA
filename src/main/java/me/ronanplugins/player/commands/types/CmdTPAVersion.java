package me.ronanplugins.player.commands.types;

import me.ronanplugins.player.commands.TPACommand;
import me.ronanplugins.resources.PermissionNode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class CmdTPAVersion implements TPACommand {

    @Override
    public String getName() {
        return "tpaversion";
    }

    @Override public boolean onCommand(CommandSender sendi, Command command, String label, String[] args) {
        //Message_TPA.sms(sender, "&aVersion #&e" + BetterTPA.getInstance().getDescription().getVersion());
        return true;
    }

    @Override
    public boolean permission(CommandSender sendi) {
        return PermissionNode.VERSION.check(sendi);
    }
}
