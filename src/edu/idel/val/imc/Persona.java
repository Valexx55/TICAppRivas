package edu.idel.val.imc;

public class Persona {
	
	private double peso;
	private double altura;
	
	//CONSTRUCTOR POR DEFECTO new Persona ();
	public Persona ()
	{
		
	}
	public Persona(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	

}
