package com.joepritzel.pubsubrsc.model.command;

public class RawConsoleCommand {
	private final String command;
	
	public RawConsoleCommand(String command) {
		this.command = command;
	}

	public String command() {
		return command;
	}
}
