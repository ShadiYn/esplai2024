package fundamentals_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class a_lecturaDatos {
	
	
public static	Scanner entrada = new Scanner(System.in);
public static int opciones =entrada.nextInt();
public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



	public static void main(String[] args) throws IOException {
		CalcularArea();
			
		
		
	
	}
	
	public static  void Dolares() {
		//1. Hacer un conversor de euros a dólares. El usuario introduce una cantidad de euros y obtiene su valor en dólares. Supondremos que un euro son dos dólares

				System.out.println("Introduce el valor que quieras convertir a dolares: ");
				
				int valorEuros = entrada.nextInt();
				
				int dolares = valorEuros*2;
				
				System.out.println("El precio en dolares sera el siguiente: "+ dolares);
				
			
			
		
	}
	
	public static void Iva() {
		//2. El IVA para ciertos artículos es del 21%. Realiza un programa que pida un precio y calcule su precio con IVA.
		System.out.println("Introduce el precio que le quieres calcular el iva");
		double precioSinIva = entrada.nextInt();
		
		double AñadirIva = precioSinIva*0.21;
		
		System.out.println("El precio con iva: "+AñadirIva);

		
		
	}
	
	public static void Doble_y_Triple() {
		
		//3. Leer un número entero por teclado y mostrar por pantalla el doble y el triple.
		System.out.println("Introduce el numero entero que quieras duplicar o triplicar");
		int numeroEntero = entrada.nextInt();
		
		int ElDoble = numeroEntero*2;
		int elTriple = numeroEntero*3;
		System.out.println("El doble de "+ numeroEntero+" es: "+ElDoble);
		System.out.println("El triple de "+ numeroEntero+" es: "+elTriple);

		
	}
	
	public static void CalcularArea() throws IOException {
		
		System.out.println("Introduce el ancho del cuadrado");
		String ancho = br.readLine();
		int achura = Integer.parseInt(ancho);
		
		System.out.println("introduce la altura del cuadrado");
		String altura = br.readLine();
		int alto = Integer.parseInt(altura);
		
		
		int area = achura*alto;
		System.out.println("el area del cuadrado indicado: "+area);
		
	}
	

}
