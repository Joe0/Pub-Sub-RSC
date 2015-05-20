package com.joepritzel.pubsubrsc.module;

import com.joepritzel.feather.PSBroker;
import com.joepritzel.pubsubrsc.subscriber.ExitConsoleCommandSubscriber;

public class ConsoleCommandModule implements Module {

	@Override
	public void bind(PSBroker broker) {
		broker.subscribe(new ExitConsoleCommandSubscriber());
	}

}
