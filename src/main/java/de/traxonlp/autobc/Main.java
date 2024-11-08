package de.traxonlp.autobc;


import de.traxonlp.autobc.commands.defineInterval;
import de.traxonlp.autobc.commands.defineLink;
import de.traxonlp.autobc.commands.defineMessage;
import de.traxonlp.autobc.commands.linkCommand;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;
import de.traxonlp.autobc.runnables.testRunnable;


public final class Main extends JavaPlugin {

    private static Main instance;

    @Override

    public void onEnable() {
        // Plugin startup logic
        instance = this;
        commandRegistration();
        saveDefaultConfig();

        //Get Scheduler
        BukkitScheduler scheduler = this.getServer().getScheduler();
        //Register Runnable
        testRunnable testRunnable = new testRunnable();
        scheduler.scheduleSyncRepeatingTask(this, testRunnable, 0, ((+this.getConfig().getInt("interval")*20*60))); //0 Ticks delayed, interval in minutes from config
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

    public static Main getInstance() {
        return instance;
    }
}