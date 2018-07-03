package edu.idel.val.repaso;

public class MainArrays {
	
	//TODO HACER UN MÉTODO QUE RECIBA UN ARRAY DE ENTEROS 
	//Y DEVUELVA EL MAYOR
	
	public static int devolverMayorArray (int[] array_enteros)
	{
		int mayor = 0;
			for (int i=0; i<array_enteros.length;i++)
			{
				if (array_enteros[i]>mayor)
				{
					mayor = array_enteros[i];
				}
			}
		return mayor;
	}
	
	public static void main(String[] args) {
		
		int[] array_numeros = new int[5];
		
		//relleno con números aleatorios el array
		for (int indice=0;indice<array_numeros.length;indice++)
		{
			double d = Math.random()*100;
			System.out.println(" d = " +d);
			array_numeros[indice]=(int)d;//CASTING conversió de tipos
		}
		
		int resultado = devolverMayorArray(array_numeros);
		System.out.println(resultado);
		/*
		//recorro el array de String args
		for (int indice=0;indice<args.length;indice++)
		{
			System.out.println(args[indice]);
		}
		//FOR EACH
		for (String argumento : args)
		{
			System.out.println(argumento);
		}
		*/
	}

}
