package de.traxonlp.autobc;

import de.traxonlp.autobc.runnables.linkSchedule;
import de.traxonlp.autobc.commands.defineInterval;
import de.traxonlp.autobc.commands.defineLink;
import de.traxonlp.autobc.commands.defineMessage;
import de.traxonlp.autobc.commands.linkCommand;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;


public final class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        // Plugin startup logic
        commandRegistration();
        saveDefaultConfig();

        BukkitTask linktask = new linkSchedule()
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


    public void commandRegistration() {
        getCommand("link").setExecutor(new linkCommand(this));
        getCommand("definelink").setExecutor(new defineLink(this));
        getCommand("definemessage").setExecutor(new defineMessage(this));
        getCommand("defineinterval").setExecutor(new defineInterval(this));

    }
}