package com.joepritzel.pubsubrsc;

import com.joepritzel.feather.PSBroker;
import com.joepritzel.feather.PSBrokerBuilder;
import com.joepritzel.pubsubrsc.module.ConsoleCommandModule;
import com.joepritzel.pubsubrsc.module.NetworkingModule;
import com.joepritzel.pubsubrsc.service.client.NetworkingService;
import com.joepritzel.pubsubrsc.service.console.CommandInputReaderService;

public class Server {
	
	public static void main(String[] args) {
		final PSBroker broker = new PSBrokerBuilder().build();
		
		new ConsoleCommandModule().bind(broker);
		new NetworkingModule().bind(broker);
		
		new NetworkingService(broker).start();
		new CommandInputReaderService(broker).start();
	}

}
