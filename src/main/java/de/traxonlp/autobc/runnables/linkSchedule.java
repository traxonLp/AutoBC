package de.traxonlp.autobc.runnables;

import de.traxonlp.autobc.Main;
import org.bukkit.scheduler.BukkitRunnable;

public class linkSchedule {
    private final Main plugin;
    public linkSchedule(Main plugin) {
        this.plugin = plugin;
    }

    public void runnable(){
    new BukkitRunnable() {

        @Override
        public void run() {

        }
    }.runTaskTimerAsynchronously(this, 0, plugin.getConfig().getInt("interval"));
}

}
