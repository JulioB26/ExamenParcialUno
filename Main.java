package Package1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) {
		
		Scanner entradas = new Scanner(System.in);
		
		while(true) {
			
		System.out.println("¿Qué operación desea realizar:");
		System.out.println("1.-Primera Mayúscula");
		System.out.println("2.-Invertir una cadena");
		System.out.println("3.-Vocales en mayúscula");
		System.out.println("4.-FizzBuzz");
		System.out.println("5.-Palíndromo");
		System.out.println("6.-Salir del menu");
		
		int operacion = Integer.parseInt(entradas.nextLine());
		
		switch(operacion) {
		
		case 1 : 
			
			System.out.println("Ingrese su cadena a convertir:");
			String cadena1 = entradas.nextLine();
			MetodosParaPalabras cadenaM = new MetodosParaPalabras(cadena1);
			
			System.out.println(cadenaM.PrimeraMayuscula(cadena1));
			
			break;
			
		case 2 : 
			
			System.out.println("Ingrese su cadena a convertir:");
			String cadena2 = entradas.nextLine();
			MetodosParaPalabras cadenaI = new MetodosParaPalabras(cadena2);
			
			System.out.println(cadenaI.invertirCadena(cadena2));
			
			break;
			
		case 3 : 
			
			System.out.println("Ingrese su cadena a convertir:");
			String cadena3 = entradas.nextLine();
			MetodosParaPalabras cadenaV = new MetodosParaPalabras(cadena3);
			
			System.out.println(cadenaV.VocalesMayuscula(cadena3));
			
			break;
			
		case 4 : 
			
			String Buzz = null;
			MetodosParaPalabras fizzbuzz = new MetodosParaPalabras(Buzz);
			
			fizzbuzz.fizzBuzz();
			
			break;

		case 5 : 
			
			System.out.println("Ingrese su cadena a analizar:");
			String cadena5 = entradas.nextLine();
			MetodosParaPalabras cadenaP = new MetodosParaPalabras(cadena5);
			
			cadenaP.palindromo(cadena5);
			
			break;
		
		case 6 :
			
			System.out.println("Saliendo del menu...");
			System.exit(0);
			break;
			
		}
		
		}
	}
}
