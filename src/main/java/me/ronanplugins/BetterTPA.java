package me.ronanplugins;

import lombok.Getter;
import me.ronanplugins.player.commands.Commands;
import me.ronanplugins.resources.Permissions;
import org.bukkit.plugin.java.JavaPlugin;


public class BetterTPA extends JavaPlugin {
    @Getter private static BetterTPA instance;
    @Getter private final Permissions perms = new Permissions();

    @Override public void onEnable() {
        instance = this;
        for (Commands cmd : Commands.values()) {
            cmd.load();
        }
    }
}