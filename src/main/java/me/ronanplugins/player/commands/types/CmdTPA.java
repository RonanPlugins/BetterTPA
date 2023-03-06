package me.ronanplugins.player.commands.types;

import me.ronanplugins.player.commands.TPACommand;
import me.ronanplugins.player.commands.TPACommand_TabCompletable;
import me.ronanplugins.player.request.TPARequest;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class CmdTPA implements TPACommand, TPACommand_TabCompletable {


    @Override public boolean onCommand(CommandSender sendi, Command command, String label, String[] args) {
        TPARequest.create((Player) sendi, (Player) sendi, 100000);
        return false;
    }

    @Override public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        List<String> list = new ArrayList<>();
        if (args.length == 1)
        for (Player p : Bukkit.getOnlinePlayers()) {
            if (p.getName().toLowerCase().startsWith(args[0].toLowerCase()))
                list.add(p.getName());
        }
        return list;
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
