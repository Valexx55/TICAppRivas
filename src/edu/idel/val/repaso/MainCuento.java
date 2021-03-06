package edu.idel.val.repaso;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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
	
	//var_args ...
	private static void escribirCuento (String ... params)
	{
		try {
			FileWriter fw = new FileWriter(params[3]);//nombre_fichero de salida
			fw.write(params[0]+ "\n");//start
			fw.write(params[1]+ "\n");//body
			fw.write(params[2]);//end
			fw.close();//cierro
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error al escribir el cuento");
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String idioma = "IT";//args[0];//esto puede ser IT, ES o EN
		System.out.println("IDIOMA = " + idioma);
		//1 Seleccionar el fichero elegido por el usuario
		String nombre_fichero = seleccionarNombreFichero(idioma);
		//2 Leer sus claves (start body y el end) 
		//3 Leer la clave "outfile" que contiene el nombre
		//del fichero de salida
		Properties properties = new Properties();
		try {
			properties.load(new FileReader(nombre_fichero));
			String body = properties.getProperty("body");
			String start = properties.getProperty("start");
			String end = properties.getProperty("end");
			String outfile = properties.getProperty("outfile");
			//TODO ESCRIBIR EL FICHERO DE SALA FILEWRITER
			//4Escribir en ese fichero, el cuento en orden:
			//start body end
			escribirCuento (start,body,end, outfile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("por aqu� pasa tanto");
			System.out.println("si ha fallado como si no");
			
		}
		
	
		
		
		
	}

}
