package edu.idel.val.model;

public class MainAlumno {

	
	//TODO
	/*
	 * HACED UN MÉTODO, QUE RECIBA UN ARRAY DE ALUMNOS
	 * Y DEVUELA LA NOTA MEDIA DE TODOS ELLOS
	 */
	
	public static double calcularNotaMedia (Alumno[] array_alumnos)
	{
		double nota_media = 0d;
		double total = 0;
		
		for (Alumno a : array_alumnos)
		{
			total = total + a.getNota();
		}
		
		nota_media = total/(array_alumnos.length);
		
		return nota_media;
	}
	
	public static void main(String[] args) {

		Alumno alumno = new Alumno("Borja", 22);
		Alumno alumno1 = new Alumno("Alicia", 22);
		Alumno alumno2 = new Alumno("Daniel", 22);
		
		Alumno[] array_alumnos = new Alumno[3];
		array_alumnos[0] = alumno;
		array_alumnos[1] = alumno1;
		array_alumnos[2] = alumno2;
		alumno2.setNota(5);
		
		double nota_media = calcularNotaMedia(array_alumnos);
		System.out.println(nota_media);
		
	}

}
