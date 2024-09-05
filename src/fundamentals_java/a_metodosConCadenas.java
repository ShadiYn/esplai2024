package fundamentals_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class a_metodosConCadenas {
	
	public static Scanner sc = new Scanner(System.in);
	public static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

	public static void main (String[] args) {
		String Nombre = null;
		int numero=0;
		String n1 = null;
		String n2=null;
		String n3=null;
		generarNombre2(n1,n2,n3);
		
		
		
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
		
		
		System.out.println("La primera palabra tiene: "+p1.length()+"letras");
		System.out.println("la segunda palabra tiene: "+p2.length()+"letras");
		
int resultado = p1.compareTo(p2);		
		
		if(resultado > 0) {
			System.out.println("la palabra "+p1+"es mas grande que la segunda"+p2);
		}else if(resultado <0) {
			System.out.println("la palabra 2 "+p2+"es mas grande que la palabra 1"+p1);
		}else {
			System.out.println("las cadenas son iguales");
		}
		
	}
	
	//7
	public static void devuelveMasLarga2(String p1, String p2, String p3) {
		System.out.println("Introduce la primera palabra");
		p1 = sc.next();
		System.out.println("Introduce la segunda palabra");
		p2 = sc.next();
		System.out.println("introduce la tercera palabra");
		p3 = sc.next();
		
		System.out.println("La primera palabra tiene: "+p1.length()+" letras");
		System.out.println("la segunda palabra tiene: "+p2.length()+" letras");
		System.out.println("la tercera palabra tiene: "+p3.length()+" letras");

		int cadena1 = p1.length();
		int cadena2 = p2.length();
		int cadena3 = p3.length();
		
		if(cadena1 > cadena2 && cadena1> cadena3) {
			System.out.println("La cadena mas grande es la: "+p1);
		} if(cadena2 >cadena1 && cadena2 >cadena3) {
			System.out.println("la cadena mas grande es la: "+p2);
		} if(cadena3 >cadena1 && cadena3>cadena2) {
			System.out.println("La cadena mas grande es la: "+p3);
		}
		
		
		
	
	
	
	
	
	
	}
	
	//8
	public static void generarNombre(String n1, String n2, String n3) {
		
		
		//introducir las tres plabras
		System.out.println("Introduce la primera palabra: ");
		n1 = sc.next();
		System.out.println("Introduce la segunda palabra");
		n2 = sc.next();
		
		System.out.println("introduce la tercera palabra");
		n3 = sc.next();
		
		int p1 = n1.length()+1;
		int p2 = n2.length()+1;
		int p3 = n3.length()+1;
		
		//comprobar que las tres sean mayores que 5
		if(p1 > 5 && p2 >5 && p3 >5) {
			System.out.println( "Tu nombre será: "+n1+" "+n2+" "+n3);
		}else {
			System.out.println("error");
		}
				
		
	}
	
	//9
	
	public static void generarNombre2(String n1, String n2,String n3) {
		
		
		//introducir las tres plabras
				System.out.println("Introduce la primera palabra: ");
				n1 = sc.next();
				System.out.println("Introduce la segunda palabra");
				n2 = sc.next();
				
				System.out.println("introduce la tercera palabra");
				n3 = sc.next();
				
				int p1 = n1.length()+1;
				int p2 = n2.length()+1;
				int p3 = n3.length()+1;
				
				//comprobar que las tres sean mayores que 5 y substraer la ultima letra de cada
				if(p1 > 5 && p2 >5 && p3 >5) {
					System.out.println( "Tu nombre será: "+n1.charAt(n1.length()-1)+n2.charAt(n2.length()-1)+n3.charAt(n3.length()-1));
				}else {
					System.out.println("error");
				}
						
				
			}
		
		
		
	}
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
	
	
	
	
	


