package de.traxonlp.autobc.commands;

import de.traxonlp.autobc.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


public class linkCommand implements CommandExecutor {
    private final Main plugin;

    public linkCommand(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        //grab the config value message
            sender.sendMessage(this.plugin.getConfig().getString("message"));
            sender.sendMessage(this.plugin.getConfig().getString("link"));
        return true;
    }
}