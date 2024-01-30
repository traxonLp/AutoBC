package de.traxonlp.autobc.commands;

import de.traxonlp.autobc.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class defineLink implements CommandExecutor {
    private final Main plugin;

    public defineLink(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        //grab the config value message
        if (sender.isOp()){
            if (args.length > 0) {

                StringBuilder str = new StringBuilder();
                for(int i = 0; i < args.length; i++) {
                    str.append(args[i] + " ");
                    String link = str.toString();

                }

                String link = args[0];

                this.plugin.getConfig().set("link", link.trim());
                this.plugin.saveConfig();
                sender.sendMessage("Link set!");
            }
            else {
                sender.sendMessage("You must provide a new Link");
            }

        }
        else {
            sender.sendMessage("You dont have the permission to perform is command!");
        }
        return true;
    }
}