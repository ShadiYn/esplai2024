package fundamentals_java;

import java.util.Scanner;

public class a_EjercicioDni {
	
	public static Scanner sc = new Scanner (System.in);
	public static String Dni;
	public static int Longitud = Dni.length();//devolverá 8 digitos

	public static void main(String[] args) {

		System.out.println("Introduce tu dni, sin la letra porfavor");
		Dni=sc.next();
		
		System.out.println("El dni introducido es: "+Dni);
		
		
		
		
	}
	
	public static void VerificarDigitos() {
		
		if(Longitud!=8) {
			System.out.println("El dni tiene que tener 8 digitos");
		}else {
			System.out.println("El numero es: "+Dni);
		}
		
	}
	
	public static void calcularLetra() {
		
		
	}
	
	

}
