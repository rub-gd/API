/**
 * 
 */
package com.ejercicio.funcionalidadcrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ejercicio.funcionalidadcrm.model.Alumno;

/*
 *interface: Declara una interfaz.
 *extends JpaRepository: Hereda las operaciones que proporciona Spring Data JPA.
 *Alumno: Indica que se trabaja con la entidad Alumno.
 *Integer: Indica el tipo de dato de la clave primaria, que en este caso es Integer porque se ha declarado private Integer id. 
 */
public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {

}