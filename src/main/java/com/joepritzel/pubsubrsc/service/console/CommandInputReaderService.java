package com.joepritzel.pubsubrsc.service.console;

import java.util.Scanner;

import com.joepritzel.feather.PSBroker;
import com.joepritzel.pubsubrsc.model.command.RawConsoleCommand;
import com.joepritzel.pubsubrsc.service.Service;
import com.joepritzel.pubsubrsc.subscriber.ConsoleCommandParser;

public class CommandInputReaderService implements Service {

	private final PSBroker broker;

	public CommandInputReaderService(PSBroker broker) {
		this.broker = broker;
		broker.subscribe(new ConsoleCommandParser(broker));
	}

	@Override
	public void start() {
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				broker.publish(new RawConsoleCommand(scanner.nextLine()));
			}
		}
	}
}
