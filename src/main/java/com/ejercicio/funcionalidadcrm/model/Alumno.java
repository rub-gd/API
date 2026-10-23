//Se crea una clase que va a ser una entidad que represente a una tabla de MySQL.
package com.ejercicio.funcionalidadcrm.model;

import jakarta.persistence.Column;//Permite utilizar la anotación @Column.
import jakarta.persistence.Entity;//Permite utilizar la anotación @Entity.
import jakarta.persistence.Id;//Permite utilizar la anotación @Id.
import jakarta.persistence.Table;//Permite utilizar la anotación @Table.

/**
 * Representa un alumno y su correspondencia con una fila de la base de datos.
 * <p>{@code @Entity} indica que la clase es una entidad persistente.
 * {@code @Table(name = "Datos_alumno")} indica que corresponde a la tabla
 * {@code Datos_alumno}.</p>
 */
@Entity
@Table(name = "Datos_alumno")
public class Alumno {
	@Id//Esto se pone encima del atributo que es la primary key.
	@Column(name = "id", nullable = false) private Integer id;
	@Column(name = "nombre", length = 30) private String nombre;
	@Column(name = "apellido1", length = 30) private String apellido1;
	@Column(name = "apellido2", length = 30) private String apellido2;
	@Column(name = "dia_nacimiento") private Integer dia_nacimiento;
	@Column(name = "mes_nacimiento") private Integer mes_nacimiento;
	@Column(name = "anio_nacimiento") private Integer anio_nacimiento;
	@Column(name = "direccion", length = 50) private String direccion;
	@Column(name = "nombre_grado", length = 80) private String nombre_grado;
	@Column(name = "curso", length = 50) private String curso;
	@Column(name = "telefono") private Integer telefono;
	@Column(name = "nombre_madre", length = 30) private String nombre_madre;
	@Column(name = "apellido1_madre", length = 30) private String apellido1_madre;
	@Column(name = "apellido2_madre", length = 30) private String apellido2_madre;
	@Column(name = "nombre_padre", length = 30) private String nombre_padre;
	@Column(name = "apellido1_padre", length = 30) private String apellido1_padre;
	@Column(name = "apellido2_padre", length = 30) private String apellido2_padre;
	@Column(name = "localidad", length = 30) private String localidad;
	@Column(name = "foto", length = 255) private String foto;
	
	/**
	 * Crea una instancia vacía de un alumno.
	 */
	public Alumno() {
		//Esto es simplemente un constructor vacío.
	}
	
	//Se generan los getter y setters, ya que como los atributos son private, las otras clases no podrían acceder a ellos sin los getters y setters.
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public Integer getDia_nacimiento() {
		return dia_nacimiento;
	}
	public void setDia_nacimiento(Integer dia_nacimiento) {
		this.dia_nacimiento = dia_nacimiento;
	}
	public Integer getMes_nacimiento() {
		return mes_nacimiento;
	}
	public void setMes_nacimiento(Integer mes_nacimiento) {
		this.mes_nacimiento = mes_nacimiento;
	}
	public Integer getAnio_nacimiento() {
		return anio_nacimiento;
	}
	public void setAnio_nacimiento(Integer anio_nacimiento) {
		this.anio_nacimiento = anio_nacimiento;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getNombre_grado() {
		return nombre_grado;
	}
	public void setNombre_grado(String nombre_grado) {
		this.nombre_grado = nombre_grado;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public Integer getTelefono() {
		return telefono;
	}
	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
	public String getNombre_madre() {
		return nombre_madre;
	}
	public void setNombre_madre(String nombre_madre) {
		this.nombre_madre = nombre_madre;
	}
	public String getApellido1_madre() {
		return apellido1_madre;
	}
	public void setApellido1_madre(String apellido1_madre) {
		this.apellido1_madre = apellido1_madre;
	}
	public String getApellido2_madre() {
		return apellido2_madre;
	}
	public void setApellido2_madre(String apellido2_madre) {
		this.apellido2_madre = apellido2_madre;
	}
	public String getNombre_padre() {
		return nombre_padre;
	}
	public void setNombre_padre(String nombre_padre) {
		this.nombre_padre = nombre_padre;
	}
	public String getApellido1_padre() {
		return apellido1_padre;
	}
	public void setApellido1_padre(String apellido1_padre) {
		this.apellido1_padre = apellido1_padre;
	}
	public String getApellido2_padre() {
		return apellido2_padre;
	}
	public void setApellido2_padre(String apellido2_padre) {
		this.apellido2_padre = apellido2_padre;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
}