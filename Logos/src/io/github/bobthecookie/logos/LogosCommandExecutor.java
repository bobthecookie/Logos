package io.github.bobthecookie.logos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class LogosCommandExecutor implements CommandExecutor {
	private Logos plugin;
	
	public LogosCommandExecutor(Logos plugin){
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		return false;
	}

}
