package edu.idel.val.model;

public class MainHerencia {
	public static void imprimirInfo 
	(Object object) {
		if (object instanceof Persona)
		{
			Persona p = (Persona)object;
			System.out.println("Nombre " + p.getNombre());
		} 
		if (object instanceof Alumno)
		{
			Alumno a = (Alumno)object;
			System.out.println("Nota " +a.getNota());
		}
	}
	public static void main(String[] args) {
		Persona p = new Persona("Pepe", 32);
		Alumno a = new Alumno("Juanito", 13);
		
		imprimirInfo(a);
		
//		
//		Persona p = new Persona("Pepe", 32);
//		Alumno a = new Alumno("Juanito", 13);
//		
//		Alumno a5 = (Alumno)p;
//		
//		Persona p1 = (Persona)a;
//		Alumno a1 = (Alumno)p1;
//		a1.getNota();
//		Object objeto = (Object)a1;
//		Persona p3 = (Persona)objeto;
//		
//		if (a instanceof Alumno)
//		{
//			System.out.println("a es un Alumno");
//			if (a instanceof Persona)
//			{
//				System.out.println("a es Persona");
//			}
//		}
//		if (p instanceof Alumno)
//		{
//			System.out.println("p es Alumno");
//		}
//		else {
//			System.out.println("p NO es Alumno");
//		}
//		
		
		
		
	}

}
