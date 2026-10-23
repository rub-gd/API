//Es la clase encargada de gestionar las peticiones que lleguen a nuestra API relacionadas con los alumnos.
package com.ejercicio.funcionalidadcrm.controller;

import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping; //Permite utilizar la anotación @GetMapping.
import org.springframework.web.bind.annotation.PathVariable; //Permite utilizar la anotación @PathVariable.
import org.springframework.web.bind.annotation.RequestMapping; //Permite utilizar la anotación @RequestMapping.
import org.springframework.web.bind.annotation.RestController; //Permite utilizar la anotación @RestController.
import com.ejercicio.funcionalidadcrm.model.Alumno; //Permite usar la clase Alumno.
import com.ejercicio.funcionalidadcrm.repository.AlumnoRepository; //Permite usar la clase AlumnoRepository.

//Esta clase recibe las peticiones para buscar alumnos.
//<p>{@code @RestController} permite que esta clase responda a peticiones web.
// {@code @RequestMapping("/api/alumnos")} indica la dirección inicial para
// buscar alumnos.</p>
@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {
	private final AlumnoRepository alumnoRepository; //Es la variable que se usará para acceder a las operaciones del repositorio.
	
	/**
	 * Prepara el controlador para que pueda usar el repositorio de alumnos.
	 * @param alumnoRepository sirve para buscar alumnos
	 */
	public AlumnoController(AlumnoRepository alumnoRepository) {
		this.alumnoRepository = alumnoRepository; //Es la forma que se usa para enlazar la variable establecida como private final con la clase AlumnoRepository.
	}
	
	/**
	 * Busca un alumno usando su número identificador.
	 * @param id número identificador del alumno que queremos buscar
	 * @return el alumno encontrado, o un resultado vacío si no existe
	 */
	@GetMapping("/{id}") //Crea una ruta que responde a peticiones HTTP de tipo GET. Al añadir /{id}, se puede consultar un alumno utilizando su identificador, como por ejemplo poner su "id" en la URL para.
	public Optional<Alumno> obtenerAlumno(@PathVariable Integer id) { //@ParthVarible: Esta anotación permite recoger el identificador que aparece en la dirección web.
	    return alumnoRepository.findById(id); //@findById: Busca en la base de datos el alumno cuyo identificador coincide con el recibido.
	}
}