package edu.idel.val.repaso;

/**
 * * * * @author Val * *
 * El código de esta clase, es un poco misterioso. Algún
 * programador Clase "C", no ha usado *nombres descriptivos y
 *  ahora, nos toca  * pegarnos y descubrir qué narices hace 
 *  este código, *para poder usarlo en  
 *  nuestro proyecto. 
 *  
 *  * * *Se pide: * 
 *  *1) Adivinar la funcionalidad del método adivinaQueHace 
 *   2) Una vez descubierto, aplicar un nombre apropiado al método
 *   y a la clase 
 *   3) Idear un método equivalente, pero distinto. Es decir, crear
 * 	 un método *que haga lo mismo que adivinaQueHace, pero de otra manera. *4)
 *  EXTRA: Sólo si resolviste los puntos anteriores, implementa una versión
 *  recursiva 
 *  
 */

public class Palabra {
	
	private static boolean esPalabraCapicua2(String cad)
	{
		boolean capicua = false;
		//SI cad al reves es igual a cadena --> true
		//SI no, false
		String cad_reves = MainRepaso.daLaVuelta(cad);
		if (cad.equals(cad_reves))
		{
			capicua=true;
		}
		
		return capicua;
	}

	private static boolean esPalabraCapicua(String cad) {
		boolean bd = true;
		int i = 0;
		int j = cad.length() - 1;
		while ((i <= j) && (bd)) {
			bd = cad.charAt(i) == cad.charAt(j);
			i++;
			j--;
		}
		return bd;
	}

	/**
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		if (esPalabraCapicua2("ANNA"))
		{
			System.out.println("CAPICUA");
		} else {
			System.out.println("NO CAPICUA");
		}
	}

}
