package me.ronanplugins.player.commands;

import lombok.Getter;
import me.ronanplugins.player.commands.types.CmdTPA;
import me.ronanplugins.player.commands.types.CmdTPAReload;
import me.ronanplugins.player.commands.types.CmdTPAToggle;

public enum Commands {

    TPA(new CmdTPA()),
    RELOAD(new CmdTPAReload()),
    TOGGLE(new CmdTPAToggle()),
    VERSION(new CmdTPAReload())
    ;

    @Getter final TPACommand cmd;

    Commands(TPACommand cmd) {
        this.cmd = cmd;
    }

    public void load() {
        cmd.load();
    }

}
