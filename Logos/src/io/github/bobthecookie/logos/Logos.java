package io.github.bobthecookie.logos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Logos extends JavaPlugin {
	
	@Override
	public void onEnable(){
		this.getLogger().info("onEnable invoked");
	}
	
	@Override
	public void onDisable(){
		this.getLogger().info("onDisable invoked");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		// sender: /cmd args0 args1...
		// sender: /label args0 args1...
		boolean isPlayer = sender instanceof Player;
		String command = cmd.getName();
		if(command.equalsIgnoreCase("help")){
			getServer().broadcastMessage("Help broadcast");
		}
		return true;
	}
	
}
