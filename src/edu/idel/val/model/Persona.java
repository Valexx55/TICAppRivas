package edu.idel.val.model;

public class Persona {
	
	private String nombre;
	private int edad;
	
	/**
	 * BEAN o JAVA BEAN o POJO Plain Old Java Object
	 * Bean de la Clase Persona
	 * @param nombre
	 * @param edad
	 */
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return this.edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	

}
