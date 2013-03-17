package org.techiekernel.osgi.http.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.techiekernel.osgi.blueprint.car.ProduceCar;

public class ProducerServlet extends HttpServlet {
	
	private List<ProduceCar> carProducers;
	
	public void setCarProducers(List<ProduceCar> carProducers) {
		this.carProducers = carProducers;
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse res) {
		try {
			res.getOutputStream().println("<html><body>");
			
			for (ProduceCar carProducer : carProducers) {
				res.getOutputStream().println(carProducer.produceCar("180 HP"));
			}
			res.getOutputStream().println("</body></html>");
		} catch (IOException e) {
		}
	}
}
