package com.joepritzel.pubsubrsc.model.command;

public class ConsoleCommand {
	private final String command;
	private final String[] args;
	
	public ConsoleCommand(String command, String[] args) {
		this.command = command;
		this.args = args;
	}
	
	public String command() {
		return command;
	}

	public String[] args() {
		return args;
	}

}
