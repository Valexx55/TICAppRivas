package edu.idel.val.repaso;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class MainProperties {

	public static void main(String[] args) {
		
		Properties properties = new Properties();
		try {
			properties.load(new FileReader("practica.properties"));
			String valor1 = properties.getProperty("grada");
			String valor2 = properties.getProperty("saludo");
			String valor3 = properties.getProperty("asientos");
			System.out.println("V1 " +valor1);
			System.out.println("V2 " +valor2);
			System.out.println("V3 " +valor3);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
