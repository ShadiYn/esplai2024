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
		for(int i=0; i>0 && i<10;i*=2) {
			System.out.println(i);
			
		}
	}
	
	public static void catorce() {
		for(int i=0; i>0 && i<10;i*=2) {
			
			if(i/2 == 0) {
				System.out.println("par"+i);
				

			}else {
				System.out.println("impar"+i);
			}
			
		}
	}
	
	public static void quince() {
for(int i=0; i>0 && i<10;i*=2) {
			
			if(i/3 == 0) {
				System.out.println(i);
				

			}
			
		}
	}
	
	public void dieciseis() {
		System.out.println("introduce un numero: ");
		int n = entrada.nextInt();
		
		for(int i =0; i<n;i--) {
			
			System.out.println(i);
		}
	}
	
	public void diecisiete() {
		
		System.out.println("introduce un numero: ");
		int n = entrada.nextInt();
		
		for(int i =0; i<n;i++) {
			while(i<n) {
				System.out.println(i);
			
			System.out.println(i);
		}
	}
	}
	
	public void dieciocho() {
		int numero = entrada.nextInt();
		for(int i=0; i<numero;i++) {
			
			if(i/i==0) {
				System.out.println(i);
			}
		}
	}
	
	public void diecinueve() {
		int numero = entrada.nextInt();
		for(int i=0; i<numero;i++) {
			
			
			if(i/i==0) {
				System.out.println(i);
			}
		}
	}
	
	
	
	

}
