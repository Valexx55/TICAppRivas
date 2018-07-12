package edu.idel.val.colecciones;

import java.util.Comparator;

//ORDEN TOTAL
public class ComparadorPerros implements Comparator<Perro> {

	@Override
	public int compare(Perro perro1, Perro perro2) {
		int mayor = 0;
		
		if (perro1.getEdad()>perro2.getEdad())
		{
			mayor = 1;
		} 
		else if (perro2.getEdad()>perro1.getEdad())
		{
			mayor= -1;
		}
		return mayor;
	}

}
