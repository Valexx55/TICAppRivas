package edu.idel.val.colecciones;

import java.util.ArrayList;

/*
 * 
 * PROPUESTA DE EJERCICIO 1
 * 
 * En un fichero de texto, tengo la siguiente informaci�n:
 * 
 * Cuco,8,Pastor belga
 * Rufo,2,Pekines
 * Alba,5,Mast�n
 * 
 * 
 * En cada l�nea, aparece la informaci�n de un perro.
 * Se pide, hacer un programa (Clase Main), que lea el fichero
 * y creer a partir de �l, un arrayList de perros
 * 
 * pista: usad el m�todo split de la clase String para leer el contenido del Fichero
 * 
 * 
 * --------------------
 * 
 * PROPUESTA DE EJERCICIO 2
 * 
 * Se quiere hacer un m�todo para determinar
 * la fortaleza de una contrase�a. Se recibe
 * un String que representa la contrase�a y se
 * devuelve un n�mero que indica c�mo de fuerte
 * es la contrase�a:
 * 
 * 0 ) Si es d�bil
 * 1 ) Si es normal
 * 2 ) Si es fuerte
 * 
 * Una contrase�a se considera d�bil sin no tiene 
 * ning�n n�mero
 * Una contrase�a se considera normal si tiene alg�n n�mero
 * Una contrase�a se considera fuerte si tiene alg�n n�mero, alguna may�scula
 * y alg�na min�scula
 * 
 * Una vez hecho el m�todo, haced una clase Main
 * para que lo pruebe
 * 
 */


public class MainArrayList {
	
	public MainArrayList() {
		// TODO Auto-generated constructor stub
	}
	
	public static int perroEnListaN 
	(ArrayList<Perro> lista_perros, 
			Perro perro_buscado)
	{
		int pos = -1;
		boolean encontrado = false;
		int indice = 0; //para recorrer
		Perro perro_actual = null;
		while ((!encontrado)&&(indice<lista_perros.size()))
		{
			perro_actual = lista_perros.get(indice);
			if (perro_actual.equals(perro_buscado))
			{
				encontrado = true;
				pos = indice;
			} else 
			{ //voy a la siguiente
				indice++;
			}
		}
		
		return pos;
		
	
		
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
	 * Haced un m�todo que reciba 2 par�metros
	 * 1 --> Un ArrayList de String
	 * 2 --> Un String
	 * El m�todo devuelve un boolean
	 * true --> Si el String (2� param) est� en 
	 * el ArrayList
	 * false --> Si el String NO est� en la lista
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
		Perro perro_aurora = new Perro("Pastor Alem�n", 0, "Simba");
		Perro perro_nacho = new Perro("Cruce", 4, "Roko");
		lista_perros.add(perro_aurora);
		lista_perros.add(perro_nacho);
		lista_perros.add(perro_aran);
		
		Perro perro_buscado = new Perro("Galgo", 3, "Isi");
		boolean esta = perroEnLista(lista_perros, perro_buscado);
		int posicion = perroEnListaN(lista_perros, perro_buscado);
		if (esta)
		{
			System.out.println("El can est�n");
			System.out.println("POS = " + posicion);
		} 
		else 
		{
			System.out.println("El can NO est�");
			System.out.println("POS = " + posicion);
		}
		
//		ArrayList<String> lista = new ArrayList<String>();
//		lista.add("Laura");
//		lista.add("Andr�s");
//		lista.add("Metro");
//		
//		String palabra_buscada = "Laura";
//		
//		boolean esta =palabraEnLista(lista, palabra_buscada);
//		if (esta)//esta == true
//		{
//			System.out.println("La palabra est� en la lista");
//		} else
//		{
//			System.out.println("La palabra No est�");
//		}
		
		
		
	}

}
