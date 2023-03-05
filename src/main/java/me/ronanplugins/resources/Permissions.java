package me.ronanplugins.resources;

import org.bukkit.command.CommandSender;

public class Permissions {
    private final DepPerms depPerms = new DepPerms();

    public void register() {
        depPerms.register();
    }

    public boolean checkPerm(String str, CommandSender sendi) {
        return depPerms.hasPerm(str, sendi);
    }
}
