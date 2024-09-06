package fundamentals_java;

import java.util.Scanner;

public class enesima_PotenciaEjercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		System.out.println("introduce la base");
		int base = entrada.nextInt();
		System.out.println("introduce la potencia");
		int potencia = entrada.nextInt();
		int resultado = base;
		
		for(int i =1; i<potencia;i++) {
			
			resultado = resultado*base;
		
		}
		System.out.println(resultado);
		
	}

}
