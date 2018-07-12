package edu.idel.val.interfaces;

public class Cuadrado implements IGeometrica{
	
	private float lado;

	
	
	public Cuadrado(float lado) {
		super();
		this.lado = lado;
	}

	public float getLado() {
		return this.lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	@Override
	public float calcularArea() {
		float area = 0;
			
			area = this.lado*this.lado;
			
		return area;
	}
	
	
	

}
