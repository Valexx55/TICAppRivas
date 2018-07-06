package edu.idel.val.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;

public class MainFicheros {
	
	private static final int CLAVE_CIFRADO = 3;
	
	/**
	 * 
	 * TODO: HACED UN MÉTODO QUE RX EL NOMBRE DEL FICHERO Y UN ARRAY DE STRINGS Y
	 * ESCRIBA EL ARRAY DE STRINGS EN ESE FICHERO
	 */
	public static String descifradoCesar (String mensaje_cifrado, int clave)
	{
		String mensaje_original = "";
		
			for (int i=0; i<mensaje_cifrado.length();i++)
			{
				char letra = mensaje_cifrado.charAt(i);//obtengo caracter
				int n_letra = (int)letra;//casteo a número
				n_letra = n_letra-clave;//resto clave / codifico
				char nueva_letra = (char)n_letra;//casteo a letra
				mensaje_original = mensaje_original + nueva_letra;//concateno
			}
		
		return mensaje_original;
	}
	
	
	public static String cifradoCesar (String mensaje, int clave)
	{
		String mensaje_cifrado = "";
		
			for (int i=0; i<mensaje.length();i++)
			{
				char letra = mensaje.charAt(i);//obtengo caracter
				int n_letra = (int)letra;//casteo a número
				n_letra = n_letra+clave;//sumo clave / codifico
				char nueva_letra = (char)n_letra;//casteo a letra
				mensaje_cifrado = mensaje_cifrado + nueva_letra;//concateno
			}
		
		return mensaje_cifrado;
	}
	
	public static void escribeEnFichero(String nombre, String[] array_strings) {

		try {
			FileWriter fw = new FileWriter(nombre);
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i = 0; i < array_strings.length; i++) {
				bw.write(array_strings[i] + "\n");
				bw.newLine();
			}
			bw.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR escrbiendo");
			e.printStackTrace();
		}
	}

	public static void escibirMensajeFichero(String nf, String mensaje) {
		try {
			FileWriter fw = new FileWriter(nf);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(mensaje);
			bw.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR escrbiendo");
			e.printStackTrace();
		}

	}

	public static void escribirFicheroXPantalla(String nombre_fichero) {
		try {
			FileReader fileReader = new FileReader(nombre_fichero);
			BufferedReader br = new BufferedReader(fileReader);
			String linea_leida = br.readLine();// leo 1ª línea
			while (linea_leida != null) {
				System.out.println(linea_leida);
				linea_leida = br.readLine();// leo siguientes
			}
			br.close();// cierro fichero
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
		
		String mcifrado = cifradoCesar("HOLA", MainFicheros.CLAVE_CIFRADO);
		System.out.println(mcifrado);
		String mensaje_o = descifradoCesar(mcifrado, MainFicheros.CLAVE_CIFRADO);
		System.out.println(mensaje_o);
		if (mensaje_o.equals("HOLA"))
		{
			System.out.println("Ha ido bien :)");
		} else 
		{
			System.out.println("DesCifrado mal resuleto");
		}
		// imprimirOcultos(".");// directorio actual
		// escribirFicheroXPantalla ("jamon.txt");
	//	escibirMensajeFichero("salida.txt", "YO K SÉ");
//		String [] array_string = new String[7];
//		array_string [0] = "Hola";
//		array_string [1] = "Hola";
//		array_string [2] = "Hola";
//		array_string [3] = "Hola";
//		array_string [4] = "Hola";
//		array_string [5] = "Hola";
//		array_string [6] = "Hola";
//		
//		escribeEnFichero("Hola", array_string);
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
