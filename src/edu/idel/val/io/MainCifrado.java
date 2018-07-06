package edu.idel.val.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class MainCifrado {
	
	private static final int CLAVE_CIFRADO = 3;
	private static final String NOMBRE_FICHERO_SALIDA = "cifrado.txt";
	
	private static String cifradoCesar (String mensaje, int clave)
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
	
	public static void main(String[] args) {
		
		String nombre_fichero_original = "fichero_original.txt";
		
		String linea_leida = null;
		String linea_cifrada = null;
		FileReader fr = null;

		try
		{
			fr = new FileReader(nombre_fichero_original);
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(NOMBRE_FICHERO_SALIDA);
			BufferedWriter bw = new BufferedWriter(fw);
			while ((linea_leida = br.readLine())!= null)
			{
				linea_cifrada = cifradoCesar(linea_leida, CLAVE_CIFRADO);
				bw.write(linea_cifrada);
				bw.newLine();
			}
			br.close();
			bw.close();
			
		}catch (Exception e) {
			System.out.println("Ha ocurrido un fallo" );
			e.printStackTrace();
		}
		
		
	}

}
