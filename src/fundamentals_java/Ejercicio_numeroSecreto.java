package fundamentals_java;
import java.util.Scanner;

public class Ejercicio_numeroSecreto {
	public 	static	Scanner sc = new Scanner (System.in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		NumeroSecreto();
		
		

	}
	
	public static void NumeroSecreto() {
		//variable de tipo entero para el numero aleatorio
		int NumeroRandom = (int) (Math.floor(Math.random()*(5-1+1))+1);
		int Numero;
		
		for(int i =3; i<=3;i--) {
			
			System.out.println("Introduce el numero");
			Numero=sc.nextInt();
			
			if(Numero == NumeroRandom) {
				System.out.println("correcto!");
				break;
			}else if(Numero != NumeroRandom) {
				System.out.println("Incorrecto");
				System.out.println("Te quedan "+i+ " Oportunidades");
			}
			if(i <=0) {
				System.out.println("Te has quedado sin oportunidades");
				break;
				
			}
			
		}
		
	}
	
	
	
	
	
	
	public static void NumeroSecretoOportunidades() {
		int NumeroRandom = (int) (Math.floor(Math.random()*(5-1+1))+1);
		int Numero;
		int oportunidades =3;
		do {
		System.out.println("Adivina el numero entre 1 y 5");
		Numero = sc.nextInt();
		
		
		}while(Numero !=NumeroRandom);
		
		System.out.println("Correcto");
	}
		
		

		
	}
	
	

