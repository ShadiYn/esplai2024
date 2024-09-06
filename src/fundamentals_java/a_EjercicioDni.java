package fundamentals_java;

import java.util.Scanner;




public class a_EjercicioDni {
	
	public static Scanner sc = new Scanner (System.in);
	public static String Dni;
	public static int Longitud;


	
	
	public static void main(String[] args) {
		

		
		System.out.println("Introduce el dni, sin la letra");
		Dni = sc.next();
		
		Longitud = Dni.length();
		VerificarDigitos();
		
		
		
		
		
	}
	
	  void VerificarDigitos(String dniNumber) {
		 
		 
		 
		if(Longitud==8) {
			System.out.println("el numero tiene que tener 8 digitos");
			
		
		}
		return;
	}
	
	public static void calcularLetra() {
		
		
	}
	
	

}
