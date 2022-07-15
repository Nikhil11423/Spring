package com.xworkz.springfw.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springfw.Activa;
import com.xworkz.springfw.Apache;
import com.xworkz.springfw.AvengerStreet;
import com.xworkz.springfw.Chetak;
import com.xworkz.springfw.Classic350;
import com.xworkz.springfw.Dominar;
import com.xworkz.springfw.Platina;
import com.xworkz.springfw.Pulsar;
import com.xworkz.springfw.configuration.SpringConfiguration;

public class SpringBoot {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);

		Pulsar pulsar = container.getBean(Pulsar.class);
		System.out.println(pulsar);
		pulsar.getBrakeShoe().carryTheBrakeLining();

		Apache apache = container.getBean(Apache.class);
		System.out.println(apache);

		Activa activa = container.getBean(Activa.class);
		System.out.println(activa);

		AvengerStreet avengerStreet = container.getBean(AvengerStreet.class);
		System.out.println(avengerStreet);

		Chetak chetak = container.getBean(Chetak.class);
		System.out.println(chetak);

		Classic350 classic350 = container.getBean(Classic350.class);
		System.out.println(classic350);

		Dominar dominar = container.getBean(Dominar.class);
		System.out.println(dominar);

		Platina platina = container.getBean(Platina.class);
		System.out.println(platina);
		
				

	}

}
