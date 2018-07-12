package edu.idel.val.colecciones;

import java.util.ArrayList;

public class Perro implements Comparable<Perro>{
	
	private String raza;
	private int edad;
	private String nombre;
		
	
	public static void mostrarListaPerros 
	(ArrayList<Perro> alp)
	{
		for (Perro p : alp)
		{
			System.out.println
			("Nombre  " + p.nombre + " Edad " 
			+ p.edad);
		}
	}
	/**
	 * ORDEN NATURAL
	 * TODO comparar perro con this
	 * si this es mayor que perro devuelo nº +
	 * si this es menor que perro devuelvo nº -
	 * si son iguales a 0
	 */
	@Override
	public int compareTo(Perro perro) {
		int mayor = 0;
		
			//mayor = this.edad-perro.edad;
			mayor = this.nombre.compareTo(perro.nombre);
		
		return mayor;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		boolean son_iguales = false;
	//this es un perro
		//y obj es el otro
		Perro p = (Perro)obj;//hago el casting
		
		if (this.nombre.equals(p.nombre)
			&&(this.raza.equals(p.raza))
			&&(this.edad==p.edad))
		{
			son_iguales = true;
		}
		
		return son_iguales;
	}
	
	public Perro(String raza, int edad, String nombre) {
		super();
		this.raza = raza;
		this.edad = edad;
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	

}
