package edu.idel.val.repaso;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class MainCuento {

	private static String seleccionarNombreFichero (String idioma)
	{
		String nombre_fichero = null; 
			
			if (idioma.equals("IT"))
			{
				nombre_fichero="story_it.properties";
			} else if (idioma.equals("ES"))
			{
				nombre_fichero="story_es.properties";
			}else {
				nombre_fichero="story_en.properties";
			}
			
		return nombre_fichero;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String idioma = "IT";//args[0];//esto puede ser IT, ES o EN
		System.out.println("IDIOMA = " + idioma);
		//1 Seleccionar el fichero elegido por el usuario
		String nombre_fichero = seleccionarNombreFichero(idioma);
		//2 Leer sus claves (start body y el end) 	
		Properties properties = new Properties();
		try {
			properties.load(new FileReader(nombre_fichero));
			String body = properties.getProperty("body");
			String start = properties.getProperty("start");
			String end = properties.getProperty("end");
			String outfile = properties.getProperty("outfile");
			//TODO ESCRIBIR EL FICHERO DE SALIDA FILEWRITER
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//3 Leer la clave "outfile" que contiene el nombre
		//del fichero de salida
		//4Escribir en ese fichero, el cuento en orden:
		//start body end
		
		
		
	}

}
