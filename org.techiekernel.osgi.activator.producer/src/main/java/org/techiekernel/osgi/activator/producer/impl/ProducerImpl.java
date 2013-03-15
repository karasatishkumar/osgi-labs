package org.techiekernel.osgi.activator.producer.impl;

import org.techiekernel.osgi.activator.producer.Producer;

public class ProducerImpl implements Producer {

	@Override
	public String produce(String input) {
		return "||" + input + "has been Produced. ||";
	}

}
