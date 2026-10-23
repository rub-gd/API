package com.ejercicio.funcionalidadcrm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Punto de entrada de la aplicación Spring Boot.
 */
@SpringBootApplication
public class FuncionalidadcrmApplication {

	/**
	 * Crea la instancia de la aplicación.
	 */
	public FuncionalidadcrmApplication() {
	}

	/**
	 * Inicia la aplicación Spring Boot.
	 *
	 * @param args argumentos recibidos al iniciar la aplicación
	 */
	public static void main(String[] args) {
		SpringApplication.run(FuncionalidadcrmApplication.class, args);
	}

}