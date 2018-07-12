package edu.idel.val.interfaces;

public class Circulo implements IGeometrica {
	
	private float radio;
	
	public static final float NUMERO_PI = 3.1415f;

	public Circulo(float radio) {
		super();
		this.radio = radio;
	}

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

	@Override
	public float calcularArea() {
		float area = 0;
		
			area = Circulo.NUMERO_PI * this.radio * this.radio;
		
		return area;
	}
	
	

}
