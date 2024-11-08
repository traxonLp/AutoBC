package de.traxonlp.autobc.runnables;

import de.traxonlp.autobc.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;



public class testRunnable implements Runnable{


    public void run() {

            Bukkit.broadcastMessage(Main.getInstance().getConfig().getString("message") + (Main.getInstance().getConfig().getString("link")));

    }

    public void tellConsole(String message){
        Bukkit.getConsoleSender().sendMessage(message);
    }
    public void tellPlayer(String message) {
    }
}
