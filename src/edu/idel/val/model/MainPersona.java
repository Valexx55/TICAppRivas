package edu.idel.val.model;

public class MainPersona {
	
	
	public static void mostrarArrayPersonas (Persona[] ap)
	{
		for (int j=0; j <ap.length;j++)
		{
			System.out.println(ap[j].getNombre() 
					+ " " +ap[j].getEdad());
		}
		
		//for each
		System.out.println("AHORA CON FOR EACH");
		for (Persona p : ap)
		{
			System.out.println(p.getNombre());
			System.out.println(p.getEdad());
		}
	}
	
	public static String decirMayorPersona (Persona p1, Persona p2)
	{
		String nombre_mayor = null;
		
			if (p1.getEdad()>p2.getEdad())
			{//p1 es mayor
				nombre_mayor = p1.getNombre();
			} else { //p2 es mayor
				nombre_mayor = p2.getNombre();
			}
		
		return nombre_mayor;
	}
 	
	public static void main(String[] args) {
		//vamos a crear una persona
		Persona persona1 = null;//los objetos los inicializamos a null
		persona1 = new Persona("Carmen", 12);
		Persona persona2 = new Persona("Juan", 32);
		System.out.println(persona1.getNombre());
		System.out.println(persona2.getNombre());
		String nombre1 = persona1.getNombre();
		String nombre2 = persona2.getNombre();
		int l1 = nombre1.length();
		int l2 = nombre2.length();
		System.out.println("L1 = " + l1);
		System.out.println("L2 = " + l2);
		String nombre = decirMayorPersona(persona1, persona2);
		System.out.println("El mayor es " +nombre);
		
		//////ARRAY DE PERSONAS
		Persona[] array_personas = new Persona[3];
		Persona p3 = new Persona("P3", 13);
		Persona p4 = new Persona("P4", 14);
		Persona p5 = new Persona("P5", 15);
		array_personas[0]=p3;
		array_personas[1]=p4;
		array_personas[2]=p5;
		mostrarArrayPersonas(array_personas);
		
	}

}
