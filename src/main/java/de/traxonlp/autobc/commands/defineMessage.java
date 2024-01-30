package de.traxonlp.autobc.commands;

import de.traxonlp.autobc.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class defineMessage implements CommandExecutor {
    private final Main plugin;

    public defineMessage(Main plugin) {
        this.plugin = plugin;
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        //grab the config value message
        if (sender.isOp()){
            if (args.length > 0) {
                String message = args[0];

                this.plugin.getConfig().set("message", message);
                this.plugin.saveConfig();
                sender.sendMessage("Message set!");
            }
            else {
                sender.sendMessage("You must provide a new message");
            }

        }
        else {
            sender.sendMessage("You dont have the permission to perform is command!");
        }
        return true;
    }
}