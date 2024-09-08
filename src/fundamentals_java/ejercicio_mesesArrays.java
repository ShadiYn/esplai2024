package fundamentals_java;

import java.util.Scanner;

public class ejercicio_mesesArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce el numero de mes del 1 al 12");
		int numero = sc.nextInt();
		
		String [] mes = {"Enero","Febrero","Marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviuembre","diciembre"};
		
		if(numero <1 || numero >12) {
			System.out.println("El mes tiene que estar entre 1 y 12");
		}else {
			System.out.println(mes[numero-1]);
		}
		
		
	}
	
	

}
