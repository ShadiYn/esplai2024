package fundamentals_java;

import java.util.Scanner;

public class Ejercicio_CostesViaje {

	public static void main(String[] args) {
		
		 Scanner br = new Scanner(System.in);


		System.out.println("Introduzca el numero de noches: ");
		int numNoches= br.nextInt();
		System.out.println("Introduzca el destino: ");
		String destino = br.next();
			
	
		int resultado1 = costeHotel(numNoches);
		
		//int resultado2;
		//resultado2=costeAvion(destino);
		
		//int resultado2 = costeAvion(destino);
		//int resultado3 = costeAlquilerCoche(numNoches);

		//int sumaCostes = resultado1 + resultado2 + resultado3;
		System.out.println("Coste total: " + resultado1+" la noche"+"");
		
	}
	
	
	
	public static int  costeHotel(int nNoches) {
		//cada noche cuesta 140€
		int Suma = 140*nNoches;
		
		System.out.println(Suma);
		
	}
	
	public static  costeAvion() {
		String destino;
		int costes;
		if(destino.equals("Oviedo")) {
			costes=15;
		}else if(destino.equals("Tokyo")) {
			
			costes=700;
		}else if(destino.equals("Madrid")) {
			costes=90;
			
		}else if(destino.equals("Barcelona")) {
			costes=90;

		}
		
		System.out.println("Costes de avion = "+costes);
		
	}

	public static void CosteAlquilerCoche() {
		
	}
}
