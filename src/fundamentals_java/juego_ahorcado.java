
package fundamentals_java;

import java.util.Random;
import java.util.Scanner;

public class juego_ahorcado {

	public static void main(String[] args) {

		String palabraSecreta = getPalabraSecreta();
		char [] palabraGuiones = getpalabraGuiones(palabraSecreta);
		Scanner entrada = new Scanner (System.in);
		boolean juegoTerminado=false;
		int intentos =3;
		
		do {
			System.out.println("te quedan "+intentos+" intentos");
			System.out.println(palabraGuiones);
			System.out.println("Introduce una palabra: ");
			char letra = entrada.next().charAt(0);
			boolean letraAcertada = false;
			
			for(int i =0; i<palabraSecreta.length();i++) {
				if(palabraSecreta.charAt(i)==letra) {
					palabraGuiones[i]=letra;
					letraAcertada =true;
				}
			}
			if(!letraAcertada) {
				System.out.println("Ninguna letra acertada");
				intentos--;
				
				if(intentos ==0) {
					System.out.println("Has perdido no te quedan intentos");
					juegoTerminado = true;
				}else {
					boolean juegoGanado = !HayGuiones(palabraGuiones);
					if(juegoGanado) {
						System.out.println("Has ganado");
						juegoTerminado = true;

					}

					
				}
				
					
				
				
			}
			
		}while(!juegoTerminado);
		
		
		
	}
	private static boolean HayGuiones(char[] arr) {

		for(char l:arr) {
			
			if(l =='_')
				return true;
			
		}
		return false;
		
	}
	static String getPalabraSecreta() {
		
		String [] palabras = {"casa","perro","ventilador","raton"};

		Random r1 = new Random();
		int n = r1.nextInt(palabras.length); // numero random entre 0 y la longitud del array palabras
		
		String palabraSecreta = palabras[n];
		
			return palabras[n];
	
	}
	
	
	static char[] getpalabraGuiones(String palabra) {
		
		int nLetrasPalabraSecreta = palabra.length();
		
		char [] palabraGuion = new char [nLetrasPalabraSecreta];
		
		for(int i =0; i<palabraGuion.length;i++) {
			palabraGuion[i]='_';
		}
		
		return palabraGuion;
	}


}
