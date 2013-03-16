package org.techiekernel.osgi.consumer;

import java.util.List;

import org.techiekernel.osgi.blueprint.car.ProduceCar;



public class Consumer {
	private org.techiekernel.osgi.activator.producer.Producer activatorProducer;
	private org.techiekernel.osgi.blueprint.producer.Producer blueprintProducer;
	private List<ProduceCar> carProducers;

	public void setActivatorProducer(
			org.techiekernel.osgi.activator.producer.Producer activatorProducer) {
		this.activatorProducer = activatorProducer;
	}

	public void setBlueprintProducer(
			org.techiekernel.osgi.blueprint.producer.Producer blueprintProducer) {
		this.blueprintProducer = blueprintProducer;
	}
	
	public void setCarProducers(List<ProduceCar> carProducers) {
		this.carProducers = carProducers;
	}

	public void	init() {
		System.out.println("---------------- Activator Producer Example with Reference---------------- ");
		System.out.println(activatorProducer.produce("Activator Producer Example with Reference"));
		System.out.println("---------------- Activator Producer Example with Reference---------------- ");
		
		System.out.println("---------------- Blueprint Producer Example with Reference---------------- ");
		System.out.println(blueprintProducer.produce("Blueprint Producer Example with Reference"));
		System.out.println("---------------- Blueprint Producer Example with Reference---------------- ");
		
		System.out.println("---------------- Reference List Producer Example with Reference---------------- ");
		for (ProduceCar carProducer : carProducers) {
			System.out.println(carProducer.produceCar("180 HP"));
		}
		System.out.println("---------------- Reference List Producer Example with Reference---------------- ");
	}
	
}
