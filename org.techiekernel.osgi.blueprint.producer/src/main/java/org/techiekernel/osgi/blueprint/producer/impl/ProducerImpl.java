package org.techiekernel.osgi.blueprint.producer.impl;

import org.techiekernel.osgi.blueprint.producer.Producer;

public class ProducerImpl implements Producer {

	@Override
	public String produce(String input) {
		return "||" + input + "has been Produced. ||";
	}

}
