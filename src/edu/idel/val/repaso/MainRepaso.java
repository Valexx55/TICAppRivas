package edu.idel.val.repaso;

import java.util.Scanner;

/**
 * Esta es una clase que contiene ejercicios básicos de repaso en JAVA
 * @author formacion
 * 
 * LISTA DE EJERCICIOS DE REPASO A LA PARTE DE INICIACIÓN EN JAVA:

1) HACER UN MÉTODO QUE RECIBA UNA CADENA Y UN CARACTER Y DIGA SI ESE CARACTER PERTENECE A LA CADENA O NO
2) HACER UN MÉTODO QUE RECIBA UNA CADENA Y UN CARACTER Y DIGA CÚANTAS VECES APARECE ESE CARACTER EN LA CADENA
3) HACER UN MÉTODO QUE DADO UN NÚMERO, DIGA SI ES PAR O NO
4) HACER UN MÉTODO QUE LE PIDA AL USUARIO SU EDAD Y LE DIGA SI ES MAYOR DE EDAD O NO
5) HACER UN MÉTODO QUE RECIBA UNA NOTA DE 0 A 10 Y DIGA SI EQUIVALE A SUSPENSO, APROBADO, BIEN, NOTABLE, O SOBRESALIENTE
6) HACER UN MÉTODO QUE RECIBA UNA CADENA Y LA DEVUELVA ALREVÉS
7) HACER UN MÉTODO QUE MUESTRE LA SECUENCIA 3, 6, 9, 12, 15 ...99
 *
 */
public class MainRepaso {
	
	
	public static int nVecesLetraEnCadena (String cadena, char letra)
	{
		int nveces = 0;
		
		for (int indice = 0; indice < cadena.length(); indice++)
		{
			char letra_actual = cadena.charAt(indice);
			if (letra_actual==letra)
			{
				System.out.println("Encontrada!");
				nveces++;//nveces = neveces + 1;
			} else {
				System.out.println("No coincide");
			}
		}
		
		return nveces;
		
	}
	
	/**
	 * EJERICIO 1
	 * @param cadena
	 * @param letra
	 * @return
	 */
	public static boolean perteneceCaracterACadena (String cadena, char letra_buscada)
	{
		boolean encontrado = false;//inicio variable
		int posicion = 0;//empiezo a recorrer por la posición 0 (1ª letra)
		char letra_actual = ' ';//de momento vacía

		do {
			letra_actual = cadena.charAt(posicion);//obtengo la letra
			if (letra_actual==letra_buscada)//la comparo
			{//si son iguales (la que busco y la actual), la he encontrado
				encontrado=true;
			} else {
				//si no, voy a la siguiente letra
				posicion=posicion+1;
			}
		}while (!encontrado && (posicion<cadena.length()));
		//así, repito hasta que aparezca o haya recorrido toda
		//la palabra
		return encontrado;
	}
	
	
	
	/**
	 * EJERCICIO 7
	 */
	public static void mostrarSecuenciaDe3 ()
	{
		//bucle doWhile
		int n = 3;
		do {
			System.out.println(n);
			n = n +3;
		} while (n<=99);
		//bucle for
		/*for (int n=3;n<100;n=n+3)//n+=3;
		{
			System.out.println(n);
		}*/
		
		//bucle while
		/*int n = 3;
		while (n<=99)
		{
			System.out.println(n);
			n = n+3; //n+=3;//forma alternativa
		}*/
	}
	
	/**
	 * EJERCICIO 3
	 * @param numero el número que queremos saber si es par o no
	 * @return false si es impar, true si es par
	 */
	public static boolean esNumeroPar (int numero)
	{
		boolean espar = false;
		
			if (numero%2==0) //si el resto de dividir entre 2 es cero
			{
				espar = true;
			}
			//espar = (numero%2==0);//otra forma más económica de hacer lo mismo
		
		return espar;
	}
	
	/**
	 * EJERCICIO 4
	 */
	public static void pedirEdadYDecirSiEsMayor () {
		
		Scanner scanner = new Scanner(System.in);//para leer de teclado
		System.out.println("Dime tu edad");
		int edad = scanner.nextInt();
		if (edad < 18)
		{
			System.out.println("Eres menor de edad");
		} else 
			{
				System.out.println("Eres mayor de edad");
			}
		
	}
	/**
	 * EJERCICIO 5
	 * Recibimos la nota numérica e informamos la nota nominal
	 * @param nota 
	 */
	public static void decirNota (int nota)
	{
		if (nota <5)
		{
			System.out.println("SUSPENSO");
		} else if (nota <6)
		{
			System.out.println("APROBADO");
		} else if (nota <7)
		{
			System.out.println("BIEN");
		}else if (nota <9)
		{
			System.out.println("NOTABLE");
		}else if (nota <=10)
		{
			System.out.println("SOBRESALIENTE");
		} else 
		{
			System.out.println("NOTA INCORRECTA");
		}
	}
	
	public static void main(String[] args) {
		//TEST EJERCICIO 1
		
		int nveces = nVecesLetraEnCadena("AURORA", 'A');
		System.out.println("resultado = " + nveces);
		//TEST EJERCICIO 2
		if (perteneceCaracterACadena("Rivas", 'a'))
		{
			System.out.println("Pertenece");
		} else {
			System.out.println("No pertenece");
		}
		//TEST EJERCICIO 3
		boolean resultado = esNumeroPar(6);
		System.out.println(resultado);
		resultado = esNumeroPar(7);
		System.out.println(resultado);
		//TEST EJERCICIO 4
		pedirEdadYDecirSiEsMayor();
		//TEST EJERICIO 5
		decirNota(3);
		decirNota(5);
		decirNota(6);
		decirNota(7);
		decirNota(8);
		decirNota(9);
		decirNota(10);
		decirNota(11);
		//TEST EJERCICIO 7
		mostrarSecuenciaDe3();
	}

}
