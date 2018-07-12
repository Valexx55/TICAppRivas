package edu.idel.val.interfaces;

public class MainGeo {
	
	public static void llamaACalcular (IGeometrica i)
	{
		float area = i.calcularArea();
		System.out.println("Area = " + area);
	}
	
	public static void main(String[] args) {
		
		llamaACalcular(new Circulo(2));
		llamaACalcular(new Cuadrado(3));
		
//		IGeometrica circulo = new Circulo(3);
//		float area_circulo = circulo.calcularArea();
//		System.out.println("Areac = " + area_circulo);
//		
//		IGeometrica cuadrado = new Cuadrado(4);
//		float area_cuadrado = cuadrado.calcularArea();
//		System.out.println("Area cd = " + area_cuadrado);
//		
	}

}
