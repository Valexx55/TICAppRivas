package edu.idel.val.repaso;

public class MainArrays {
	
	//TODO HACER UN MÉTODO QUE RECIBA UN ARRAY DE ENTEROS Y DEVUELVA EL MAYOR
	
	public static void main(String[] args) {
		
		int[] array_numeros = new int[5];
		
		for (int indice=0;indice<array_numeros.length;indice++)
		{
			System.out.println(array_numeros[indice]);
		}
		
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
		
	}

}
