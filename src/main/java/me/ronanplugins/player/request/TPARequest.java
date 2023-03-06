package me.ronanplugins.player.request;

import lombok.Getter;
import org.bukkit.entity.Player;

public class TPARequest {

    @Getter Player from;
    @Getter long expires;

    private TPARequest(Player from, Player to, long keepAlive) {
        this.from = from;
        this.expires = System.currentTimeMillis() + keepAlive;
        to.sendMessage("TPA request from " + from.getDisplayName());
    }

    public static TPARequest create(Player from, Player to, long keepAlive) {
        return new TPARequest(from, to, keepAlive);
    }

}
