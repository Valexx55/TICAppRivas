package edu.idel.val.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MainFicheros {

	/**
	 * 
	 * TODO: HACED UN MÉTODO QUE RX UN NOMBRE DE UN DIRECTORIO E IMPRIMA SÓLO LOS
	 * ARCHIVOS OCULTOS
	 */

	public static void escribirFicheroXPantalla(String nombre_fichero) 
	{
		try 
		{
			FileReader fileReader = new FileReader(nombre_fichero);
			int letra_leido = 0;
			char letra;
			while (letra_leido!=-1)
			{
				letra_leido = fileReader.read();
				letra = (char)letra_leido;
				System.out.println(letra_leido + " = " + letra );
			}
			fileReader.close();//cierro fichero
			
		} catch (Exception e) {
			System.out.println("Ha habido un error");
			e.printStackTrace();
		}
	}

	public static void imprimirOcultos(String nombre_directorio) {
		File directorio = new File(nombre_directorio);
		String[] contenido = directorio.list();
		for (String fichero : contenido) {
			// char primerchar = fichero.charAt(0);
			// if (primerchar == '.')
			// {
			System.out.println(fichero);
			// }
		}
	}

	public static void main(String[] args) {
		//imprimirOcultos(".");// directorio actual
		escribirFicheroXPantalla ("descanso.txt");

		/*
		 * Crear una carpeta en la raíz de nuestro proyecto Java dentro de Eclipse e
		 * introducir algunos ficheros. Hacer después un programa, para que liste el
		 * directorio y los ficheros
		 */

		// File carpeta = null;
		// carpeta = new File(".");
		// if (carpeta.exists())
		// {
		// System.out.println("La carpeta existe");
		// if (carpeta.isDirectory())//==true
		// {
		// System.out.println("Es un directorio");
		// String[] contenido = carpeta.list();
		// for (String cadena : contenido)
		// {
		// System.out.println(cadena);
		// }
		// } else
		// {
		// System.out.println("No es un directorio");
		// }
		// } else {
		// System.out.println("No existe");
		// }

	}

}
