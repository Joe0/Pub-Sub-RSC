package com.joepritzel.pubsubrsc;

import com.joepritzel.feather.PSBroker;
import com.joepritzel.feather.PSBrokerBuilder;
import com.joepritzel.pubsubrsc.service.console.CommandInputReaderService;
import com.joepritzel.pubsubrsc.subscriber.ExitConsoleCommandSubscriber;

public class Server {
	
	public static void main(String[] args) {
		final PSBroker broker = new PSBrokerBuilder().build();
		
		broker.subscribe(new ExitConsoleCommandSubscriber());
		
		new CommandInputReaderService(broker).start();
	}

}
