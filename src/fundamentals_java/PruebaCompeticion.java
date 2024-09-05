package fundamentals_java;

import java.util.Scanner;

public class PruebaCompeticion {
	
	public static Scanner entrada = new Scanner (System.in);

	public static void main(String[] args) {
		String nombre = "Shadin";
		
		System.out.println("Hola mundo!");
		System.out.println(nombre);
		
		System.out.println("Hola"+nombre);
		
		/*System.out.println("Introduce tu nombre");
		Scanner entrada = new Scanner (System.in);
		String Nombre = entrada.next();
		System.out.println(Nombre);*/
		doce();
		
		
		
		
	
		
	}
	
	
	public static void Suma(int n1, int n2) {
		
		System.out.println("introduce el numero 1");
		n1 = entrada.nextInt();
		
		System.out.println("introduce el numero 2");
		n2 = entrada.nextInt();
		
		int suma = n1+n2;
		System.out.println(suma);
		
	}
	
	public static void siete(int lado1, int lado2) {
		System.out.println("Introduce lado1");
		lado1=entrada.nextInt();
		System.out.println("lado 2: ");
		lado2 = entrada.nextInt();
		
		System.out.println(lado1*lado2);
	}
		
	public static int ocho(int lado1, int lado2, int lado3) {
		System.out.println("Introduce lado1");
		lado1=entrada.nextInt();
		System.out.println("lado 2: ");
		lado2 = entrada.nextInt();
		System.out.println("introduce lado 3");
		lado3= entrada.nextInt();
		
		return lado1*lado2*lado3;
		
	}
	
	public static void diez() {
		
		for(int i =0; i<10;i++) {
			System.out.println("puxe asturies");
		}
		
	}
	
	public static void once() {
		int n1;
		int n2;
		
		
	}
	public static void doce() {
		for(int i=0; i>0 && i<10;i++) {
			System.out.println(i);
			
		}
		
	}
	
	public static void trece() {
		
	}
	
	
	
	
	
	

}
