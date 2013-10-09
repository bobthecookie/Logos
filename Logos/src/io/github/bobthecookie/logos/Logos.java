package io.github.bobthecookie.logos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Logos extends JavaPlugin {
	
	@Override
	public void onEnable(){
		this.getLogger().info("onEnable invoked");
		System.out.println("Success!");
//		this.getCommand("test").setExecutor(new LogosCommandExecutor(this));
	}
	
	@Override
	public void onDisable(){
		this.getLogger().info("onDisable invoked");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		// sender: /cmd args0 args1...
		// sender: /label args0 args1...
		if(cmd.getName().equalsIgnoreCase("test")){
			if(sender instanceof Player){
				Player player = (Player)sender;
				sender.sendMessage("You're a player");
			} else {
				sender.sendMessage("You're the console");
			}
		}
		return true;
	}
	
}
