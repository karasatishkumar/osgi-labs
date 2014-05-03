## OSGi Labs
This project is just to give a tour in to OSGi usage. We have used Apache Karaf
as the OSGi container and Apache Aries as blueprint. As we explore more in OSGi,
we will be contributing those. As of now we have contributed the following areas:
* OSGi service registration with bundle activator
* OSGi service registration with blueprint context
* Reference list example for multiple services
* OSGi web application  with servlet and filter using blueprint
* OSGi Bundle - Apache CXF JAX-RS example

#### Prerequisites for Apache CXF bundle dependency
	karf@root>features:addurl mvn:org.apache.cxf.karaf/apache-cxf/2.6.2/xml/features
	karf@root>features:install cxf
	karf@root>install -s mvn:org.codehaus.jackson/jackson-core-asl/1.9.9
	karf@root>install -s mvn:org.codehaus.jackson/jackson-mapper-asl/1.9.9
	karf@root>install -s mvn:org.codehaus.jackson/jackson-jaxrs/1.9.9

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

May be for new users I'm just specifing the basic steps to install the bundles.

Bundle installation works with maven configuration. You need to have "M2_HOME" in user user/system variable list. Karaf uses the "M2_HOME" attribute to locate the bundle in maven repository.

Start the karaf

	$KARAF_HOME/bin/karaf.sh

Command for installing a bundle

	install -s mvn:com.techiekernel.user/com.techiekernel/1.9.9

In the above command the first atribute after mvn is the atrifact id, second is the group id and the third one is version.

## Contributing
Pull requests are welcome.

## Staying in touch

## License
