package org.techiekernel.osgi.activator.producer.impl;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.techiekernel.osgi.activator.producer.Producer;

public class ProducerActivator implements BundleActivator {

    Producer producer = new ProducerImpl();
    ServiceRegistration registration;

    public void start(BundleContext bundleContext) throws Exception {
        //Register the service with the container.
        //Register the Interface, implementation and possible properties
        registration = bundleContext.registerService(Producer.class.getName(), producer, null);
    }

    public void stop(BundleContext bundleContext) throws Exception {
        //When we stop, clean up the references.
        registration.unregister();
    }
}