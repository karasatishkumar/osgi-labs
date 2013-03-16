package org.techiekernel.osgi.blueprint.bmw;

import org.techiekernel.osgi.blueprint.car.ProduceCar;

public class ProduceBMW implements ProduceCar{
	@Override
	public String produceCar(String carName) {
		// TODO Auto-generated method stub
		return "## " + carName + " has been produced by BMW";
	}
}
