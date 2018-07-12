package edu.idel.val.colecciones;

public class Perro {
	
	private String raza;
	private int edad;
	private String nombre;
		
	
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
