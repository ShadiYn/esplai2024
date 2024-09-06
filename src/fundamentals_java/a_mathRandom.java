package fundamentals_java;

import java.util.Scanner;
import java.util.random.*;

public class a_mathRandom {
	
	
	public static Scanner entrada = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. obtener numero aleatorio entre 5 y 7
		Ejercicio_1();
		//2. obtener letra aleatoria de tu nombre
		Ejercicio_2();
		
		
	}
	
	
	public static void Ejercicio_1() {
		
		int aleatorio= (int) (Math.floor(Math.random()*(7-5+1))+5);
		
		System.out.println(aleatorio);
		
	}
	
	public static void Ejercicio_2() {
		System.out.println("Introduce tu nombre");
		String Nombre = entrada.next();
		
		int LargoNombre= Nombre.length(); //recibe un numero
		int NumeroRandom1=0;
		
		int NumeroRandom = (int) (Math.floor(Math.random()*(LargoNombre-NumeroRandom1+1))+NumeroRandom1);
		
		System.out.println(Nombre.charAt(NumeroRandom));
		
	}
	

}
