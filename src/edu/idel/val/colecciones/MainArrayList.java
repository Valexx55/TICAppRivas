package edu.idel.val.colecciones;

import java.util.ArrayList;

public class MainArrayList {
	
	public MainArrayList() {
		// TODO Auto-generated constructor stub
	}
	
	public static boolean perroEnLista 
	(ArrayList<Perro> lista_perros, 
			Perro perro_buscado)
	{
		boolean encontrado = false;
		int indice = 0; //para recorrer
		Perro perro_actual = null;
		while ((!encontrado)&&(indice<lista_perros.size()))
		{
			perro_actual = lista_perros.get(indice);
			if (perro_actual.equals(perro_buscado))
			{
				encontrado = true;
			} else 
			{ //voy a la siguiente
				indice++;
			}
		}
		
		return encontrado;
		
	
		
	}
	
	/**
	 * Haced un método que reciba 2 parámetros
	 * 1 --> Un ArrayList de String
	 * 2 --> Un String
	 * El método devuelve un boolean
	 * true --> Si el String (2º param) está en 
	 * el ArrayList
	 * false --> Si el String NO está en la lista
	 */
	
	public static boolean palabraEnLista
	(ArrayList<String> lista_palabras,
			String palabra)
	{
		boolean encontrada = false;
		int indice = 0; //para recorrer
		String palabra_actual = null;
		while ((!encontrada)&&(indice<lista_palabras.size()))
		{
			palabra_actual = lista_palabras.get(indice);
			if (palabra_actual.equals(palabra))
			{
				encontrada = true;
			} else 
			{ //voy a la siguiente
				indice++;
			}
		}
		
		return encontrada;
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		ArrayList<Perro> lista_perros = new ArrayList<Perro>();
		Perro perro_aran = new Perro("Galgo", 3, "Isi");
		Perro perro_aurora = new Perro("Pastor Alemán", 0, "Simba");
		Perro perro_nacho = new Perro("Cruce", 4, "Roko");
		lista_perros.add(perro_aurora);
		lista_perros.add(perro_nacho);
		lista_perros.add(perro_aran);
		
		Perro perro_buscado = new Perro("Galgo", 3, "Isi");
		boolean esta = perroEnLista(lista_perros, perro_buscado);
		if (esta)
		{
			System.out.println("El can están");
		} 
		else 
		{
			System.out.println("El can NO está");
		}
		
//		ArrayList<String> lista = new ArrayList<String>();
//		lista.add("Laura");
//		lista.add("Andrés");
//		lista.add("Metro");
//		
//		String palabra_buscada = "Laura";
//		
//		boolean esta =palabraEnLista(lista, palabra_buscada);
//		if (esta)//esta == true
//		{
//			System.out.println("La palabra está en la lista");
//		} else
//		{
//			System.out.println("La palabra No está");
//		}
		
		
		
	}

}
