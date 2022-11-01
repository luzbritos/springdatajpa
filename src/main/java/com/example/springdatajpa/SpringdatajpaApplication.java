package com.example.springdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringdatajpaApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringdatajpaApplication.class, args);
		CocheRepository repository = context.getBean(CocheRepository.class);

		System.out.println("find");
		//select count(*) as col_0_0_ from coche coche0_
		System.out.println(repository.count());

		//Crear y almacenar un coche en base de datos
		Coche toyota = new Coche(null, "Toyota", "Prius",2010);
		repository.save(toyota);
		System.out.println("El numero de coches en base de datos es: " + repository.count());
		//Recuperar todos
		System.out.println(repository.findAll());//Devuelve una lista


	}

}
