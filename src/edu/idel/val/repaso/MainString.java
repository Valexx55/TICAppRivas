package edu.idel.val.repaso;

/**
 * Esto es una clase para practicar programación 1
 * 
 * @see String class
 * @version 2.2.1
 * @since 29-06-2018
 * @author formacion
 *
 */
public class MainString {
	
	/**
	 * Este método  dice si una palabra tiene longitud par o no
	 * @param palabra la palabra que quiero evaluar
	 * @return false si no es de longitud par, true si lo es
	 */
	public static boolean esPalabraLongitudPar (String palabra)
	{
		boolean longipar = false;
		
			int longi = palabra.length();
			if (longi%2==0)
			{
				longipar = true;
			}
		
		return longipar;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < args.length;i++)
		{
			String palabra_en_curso = args [i];
			if (!esPalabraLongitudPar(palabra_en_curso))
			{
				System.out.println(palabra_en_curso);
			}
			
		}
	}

}
