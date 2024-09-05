package fundamentals_java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class a_metodosConCadenas {
	
	public static Scanner sc = new Scanner(System.in);
	public static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

	public static void main (String[] args) {
		String Nombre = null;
		DevuelvePrimeraLetra(Nombre);

	}
	
	public static void longitud(String nombre) {
		System.out.println("Introduce el nombre o palabra");
		nombre = sc.next();
		
		System.out.println("el nombre tiene "+nombre.length()+" Letras"); //para contar las letras de la cadena
		System.out.println("la ultima letra del nombre es: "+nombre.charAt(nombre.length()-1)); //Te devuelve la ultima letra del nombre
	}
	
	public static void DevuelvePrimeraLetra(String nombre) {
		System.out.println("Introduce nombre o palabra");
		nombre = sc.next();
		
		System.out.println("La primera letra del nombre/palabra es: "+nombre.charAt(0));
		
	}
	
	
	
	
	

}
