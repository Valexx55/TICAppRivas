package edu.idel.val.model;

public class Alumno extends Persona {
	
	private int nota;

	public Alumno(String nombre, int edad) {
		super(nombre, edad);
		this.nota = 10;
		// TODO Auto-generated constructor stub
	}

	public int getNota() {
		return this.nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
	

}
