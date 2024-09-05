package fundamentals_java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class a_metodosConCadenas {
	
	public static Scanner sc = new Scanner(System.in);
	public static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

	public static void main (String[] args) {
		String Nombre = null;
		int numero=0;
		ejercicio_5();
	}
	//1
	public static void longitud(String nombre) {
		System.out.println("Introduce el nombre o palabra");
		nombre = sc.next();
		
		System.out.println("el nombre tiene "+nombre.length()+" Letras"); //para contar las letras de la cadena
		System.out.println("la ultima letra del nombre es: "+nombre.charAt(nombre.length()-1)); //Te devuelve la ultima letra del nombre
	}
	//2
	public static void DevuelvePrimeraLetra(String nombre) {
		System.out.println("Introduce nombre o palabra");
		nombre = sc.next();
		
		System.out.println("La primera letra del nombre/palabra es: "+nombre.charAt(0));//el cero siempre indicar ala primera palabra SIEMPRE porque es la primera osea es 0
		
	}
	//4
	public static void devuelveEnesimaLetra(String palabra, int Numero) {
		System.out.println("Introduce nombre/palabra");
		palabra = sc.next();
		System.out.println("Introduce el numero");
		Numero = sc.nextInt();
		
		System.out.println("EL numero que corresponde a la palabra es: "+palabra.charAt(Numero-1));
		
		
		
		
		
	}
	//5
	public static void ejercicio_5() {
		String palabra = "wonderfull day";
		
		System.out.println(palabra.substring(3, 7));
	}
	//6
	public static void devuelveMasLarga(String p1, String p2) {
		System.out.println("Introduce la primera palabra");
		p1 = sc.next();
		System.out.println("Introduce la segunda palabra");
		p2 = sc.next();
		
		
	}
	
	//7
	//8
	//9
	//10
	//3
	//3
	//3
	//3
	//3
	//3
	//3
	//3
	//3
	//3
	//3
	//3
	//3
	//3
	
	
	
	
	

}
