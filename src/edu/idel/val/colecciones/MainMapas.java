package edu.idel.val.colecciones;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import edu.idel.val.model.Persona;

public class MainMapas {
	
	
	//recorremos el mapa
	private static void mostrarMapa (
			Map<String, Persona> mapa)
	{
		String clave_actual = null;
		Persona p_actual = null;
		//obtener las claves
		Set<String> cjto_claves = mapa.keySet();
		Iterator<String> it = cjto_claves.iterator();
		while (it.hasNext())
		{
			clave_actual = it.next();
			System.out.println(clave_actual);
			p_actual = mapa.get(clave_actual);
			System.out.println("Nombre = "+ p_actual.getNombre());
			System.out.println("Edad = "+ p_actual.getEdad());
		}
	}

	private static String pedirNombre() {
		String nombre_introducido = null;
		Scanner scanner = null;

		System.out.println("Intro nombre:");
		scanner = new Scanner(System.in);
		nombre_introducido = scanner.next();

		return nombre_introducido;
	}

	public static void main(String[] args) {

		// creo el mapa vacío
		Map<String, Persona> mapa = new TreeMap<String, Persona>();//para ordenar por la CLAVE
		//Map<String, Persona> mapa = new HashMap<String, Persona>();

		// creamos 3 personas
		Persona p1 = new Persona("Jonas", 56);
		Persona p2 = new Persona("Ana", 66);
		Persona p3 = new Persona("Julia", 55);

		// add personas al mapa
		mapa.put(p1.getNombre(), p1);
		mapa.put(p2.getNombre(), p2);
		mapa.put(p3.getNombre(), p3);

		//mostrarMapa
		mostrarMapa(mapa);
		// pedir nombre

		String nombre = pedirNombre();
		// busco
		Persona p = mapa.get(nombre);
		if (p != null) {
			System.out.println(p.getEdad());
		} else
			System.out.println("No existe nadie " + "con ese nombre en el mapa");

	}

}
