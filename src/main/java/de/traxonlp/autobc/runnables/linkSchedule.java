package de.traxonlp.autobc.runnables;

import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;


public class linkSchedule extends BukkitRunnable {
    Player p;
    public linkSchedule(Player player) {
        p = player;
    }
    @Override
    public void run() {
        p.sendMessage("Hi");
    }
}

