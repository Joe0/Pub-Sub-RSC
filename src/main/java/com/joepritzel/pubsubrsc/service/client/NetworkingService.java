package com.joepritzel.pubsubrsc.service.client;

import com.joepritzel.feather.PSBroker;
import com.joepritzel.pubsubrsc.service.Service;

public class NetworkingService implements Service {
	
	private final PSBroker broker;

	public NetworkingService(PSBroker broker) {
		this.broker = broker;
	}

	@Override
	public void start() {
		// Listen on a port for data, convert to Packet, and push to broker.
	}

}
