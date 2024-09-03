package fundamentals_java;

import java.util.Scanner;

public class a_lecturaDatos {
	
public static	Scanner entrada = new Scanner(System.in);
public static int opciones =entrada.nextInt();


	public static void main(String[] args) {
		
		do {
			System.out.println("Introduce el numero que quieras realizar (Numero de ejercicio) ");
			int i=0;
			opciones= entrada.nextInt();			
			
		}while(opciones >=1 && opciones <=7) {
			switch(opciones) {
			
			case 1:
				Dolares();
				break;
			case 2:
				Iva();
				break;
				
			case 3:
				Doble_y_Triple();
				break;
				
			case 4:
				break;
				
			case 5:
				break;
				
			case 6:
				break;
			
			
		}
		
		
			
		
		
	
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
	
	public static void CalcularArea() {
		
		System.out.println("Introduce el ancho del cuadrado");
		int ancho = entrada.nextInt();
		
	}
	

}
