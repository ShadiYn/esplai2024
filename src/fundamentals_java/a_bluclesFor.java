package fundamentals_java;

public class a_bluclesFor {

	public static void main(String[] args) {

		// Imprimir los números pares que hay dentro de los 100 primeros números enteros.
		
		
		ejercicio_5();	/*
		 * 
		 * bucle for sabe las veces que vas a iterar
		 * 
		 * 
		 * 
		 * 
		 * */
		
		
		
		
	}
	
	public static void ejercicio_1() {
		for(int i =0; i<100; i+=2) { //imprime numeros del 0 al 99 el 100 nunca se incluye (el ultimo numero)
			//los numeros son pares, divisibles por 2
			System.out.println(i);
		}
	}
	
	
	public static void ejercicio_2() {
		for(int i =0; i<100;i++) {
			if(i%2 ==0) {
				System.out.println(i);
			}
		}
	}
	
	public static void ejercicio_3() {
		for(int i =1; i<21;i++) {
			
			if(i%3 ==0) {
				System.out.println("fizz");
				continue;
			}else if(i%3 ==0 && i%5 ==0) {
				System.out.println("fizzBuzz");
				continue;
			}else if(i%5 ==0) {
				System.out.println("buzz");
				continue;
			}
			System.out.println(i);

		}
	}
	
public static void ejercicio_4() {
	for(int i =0; i<10;i++) {
		
		System.out.println(i*7);
	}
}

public static void ejercicio_5() {
		for(int i=1; i<10; i++) {
			for(int j=0; j<11;j++) {
				System.out.println(i+"*"+j+"= "+i*j);
			}
		}
}
	
	
	
	

}
