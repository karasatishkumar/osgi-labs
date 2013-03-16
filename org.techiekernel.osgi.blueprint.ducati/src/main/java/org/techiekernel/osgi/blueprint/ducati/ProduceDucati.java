package org.techiekernel.osgi.blueprint.ducati;

import org.techiekernel.osgi.blueprint.car.ProduceCar;

public class ProduceDucati implements ProduceCar{
	@Override
	public String produceCar(String carName) {
		// TODO Auto-generated method stub
		return "## " + carName + " has been produced by Ducati";
	}
}
