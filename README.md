## OSGi Labs
This project is just to give a tour in to OSGi usage. We have used Apache Karaf
as the OSGi container and Apache Aries as blueprint. As we explore more in OSGi,
we will be contributing those. As of now we have contributed the following areas:
* OSGi service registration with bundle activator
* OSGi service registration with blueprint context
* Reference list example for multiple services
* OSGi web application  with servlet and filter using blueprint
* OSGi Bundle - Apache CXF JAX-RS example
	karaf@root> features:addurl mvn:org.apache.cxf.karaf/apache-cxf/2.4.2/xml/features
	karaf@root> features:install cxf

## Prerequisites
You need the following packages to be installed:
* Java 7
* Apache Karaf 2.3.1
* Maven 3.0.5
* Git

## Building from source
After completing the prerequisites, you can follow the instructions to build the project.

### check out sources

	git clone https://github.com/karasatishkumar/osgi-labs.git

### compile and test, build all jars

	mvn clean install

Once you have successfully installed the project, you need some apache karaf knowledge to install the bundles to OSGi container (Apache Karaf).

## Contributing
Pull requests are welcome.

## Staying in touch

## License
