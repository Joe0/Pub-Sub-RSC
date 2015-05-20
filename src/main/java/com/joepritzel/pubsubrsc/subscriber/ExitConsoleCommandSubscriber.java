package com.joepritzel.pubsubrsc.subscriber;

import com.joepritzel.feather.PredicatedSubscriber;
import com.joepritzel.pubsubrsc.model.command.ConsoleCommand;

public class ExitConsoleCommandSubscriber extends PredicatedSubscriber<ConsoleCommand> {
	
	@Override
	public void receive(ConsoleCommand message) {
		System.exit(0);
	}

	@Override
	public boolean applies(ConsoleCommand message) {
		return message.command().equalsIgnoreCase("exit");
	}

}
