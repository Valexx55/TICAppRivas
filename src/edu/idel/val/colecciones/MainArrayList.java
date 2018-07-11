package edu.idel.val.colecciones;

import java.util.ArrayList;

public class MainArrayList {
	
	public MainArrayList() {
		// TODO Auto-generated constructor stub
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
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Laura");
		lista.add("Andrés");
		lista.add("Metro");
		
		String palabra_buscada = "Laura";
		
		boolean esta =palabraEnLista(lista, palabra_buscada);
		if (esta)//esta == true
		{
			System.out.println("La palabra está en la lista");
		} else
		{
			System.out.println("La palabra No está");
		}
		
		
		
	}

}
