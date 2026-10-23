/**
*Es la clase encargada de gestionar las peticiones que lleguen a nuestra API relacionadas con los alumnos.
*/
package com.ejercicio.funcionalidadcrm.controller;

import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping; //Permite utilizar la anotación @GetMapping.
import org.springframework.web.bind.annotation.PathVariable; //Permite utilizar la anotación @PathVariable.
import org.springframework.web.bind.annotation.RequestMapping; //Permite utilizar la anotación @RequestMapping.
import org.springframework.web.bind.annotation.RestController; //Permite utilizar la anotación @RestController.
import com.ejercicio.funcionalidadcrm.model.Alumno; //Permite usar la clase Alumno.
import com.ejercicio.funcionalidadcrm.repository.AlumnoRepository; //Permite usar la clase AlumnoRepository.

/**
 * @RestController: Indica que esta clase gestionará peticiones de nuestra API REST.
 * @RequestMapping("/api/alumnos"): Establece la ruta general que se utiliza para las operaciones relacionadas con alumnos.
 */
@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {
	private final AlumnoRepository alumnoRepository; //Es la variable que se usará para acceder a las operaciones del repositorio.
	
	public AlumnoController(AlumnoRepository alumnoRepository) {
		this.alumnoRepository = alumnoRepository; //Es la forma que se usa para enlazar la variable establecida como private final con la clase AlumnoRepository.
	}
	
	@GetMapping("/{id}") //Crea una ruta que responde a peticiones HTTP de tipo GET. Al añadir /{id}, se puede consultar un alumno utilizando su identificador, como por ejemplo poner su "id" en la URL para.
	public Optional<Alumno> obtenerAlumno(@PathVariable Integer id) { //@ParthVarible: Esta anotación permite recoger el identificador que aparece en la dirección web.
	    return alumnoRepository.findById(id); //@findById: Busca en la base de datos el alumno cuyo identificador coincide con el recibido.
	}
}