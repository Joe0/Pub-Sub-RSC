package com.joepritzel.pubsubrsc.module;

import com.joepritzel.feather.PSBroker;

public class NetworkingModule implements Module {

	@Override
	public void bind(PSBroker broker) {
		// Add predicated subscribers that listen for packets with particular ids and then transform them to correct usable.
	}

}
