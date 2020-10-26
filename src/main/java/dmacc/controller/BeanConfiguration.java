package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Address;
import dmacc.beans.Contact;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Contact contact()
	{
		//constructor injection
		Contact bean = new Contact("Monte Carle");
		//setter injection
		//bean.setName("Dr. Who");
		bean.setPhone("555-867-5309");
		bean.setRelationship("friend");
		
		return bean;
	}
	@Bean
	public Address address() {
		Address bean = new Address("123 Main Street", "Ankeny", "IA");
		return bean;
	}
}
