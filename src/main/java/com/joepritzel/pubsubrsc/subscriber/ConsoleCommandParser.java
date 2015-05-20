package com.joepritzel.pubsubrsc.subscriber;

import java.util.Arrays;

import com.joepritzel.feather.PSBroker;
import com.joepritzel.feather.Subscriber;
import com.joepritzel.pubsubrsc.model.command.ConsoleCommand;
import com.joepritzel.pubsubrsc.model.command.RawConsoleCommand;

public class ConsoleCommandParser extends Subscriber<RawConsoleCommand> {

	private final PSBroker broker;

	public ConsoleCommandParser(PSBroker broker) {
		this.broker = broker;
	}

	@Override
	public void receive(RawConsoleCommand message) {
		String[] split = message.command().split(" ");
		String[] args = parseArgs(split);

		broker.publish(new ConsoleCommand(split[0], args));
	}

	private String[] parseArgs(String[] split) {
		String[] args;
		try {
			args = Arrays.copyOfRange(split, 1, split.length);
		} catch (ArrayIndexOutOfBoundsException e) {
			args = new String[0];
		}
		return args;
	}

}
