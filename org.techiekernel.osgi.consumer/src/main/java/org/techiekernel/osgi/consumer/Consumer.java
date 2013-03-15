package org.techiekernel.osgi.consumer;



public class Consumer {
	private org.techiekernel.osgi.activator.producer.Producer activatorProducer;
	private org.techiekernel.osgi.blueprint.producer.Producer blueprintProducer;

	public void setActivatorProducer(
			org.techiekernel.osgi.activator.producer.Producer activatorProducer) {
		this.activatorProducer = activatorProducer;
	}

	public void setBlueprintProducer(
			org.techiekernel.osgi.blueprint.producer.Producer blueprintProducer) {
		this.blueprintProducer = blueprintProducer;
	}

	public void	init() {
		System.out.println("---------------- Activator Producer Example with Reference---------------- ");
		System.out.println(activatorProducer.produce("Activator Producer Example with Reference"));
		System.out.println("---------------- Activator Producer Example with Reference---------------- ");
		
		System.out.println("---------------- Blueprint Producer Example with Reference---------------- ");
		System.out.println(blueprintProducer.produce("Blueprint Producer Example with Reference"));
		System.out.println("---------------- Blueprint Producer Example with Reference---------------- ");
	}
	
}
