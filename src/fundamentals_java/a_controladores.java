package fundamentals_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a_controladores {
	
	public static 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		//Dada una variable que contiene la nota de un examen que va de 0 a 10…

//Si es mayor que cinco mostrar el texto «Aprobado».
/*
 * Si es igual a cinco, mostrar el texto «Aprobado por los pelos»
 * Si es menor que cinco, mostrar el texto «Suspenso»
 * Ver código fuent
 * Ver explicación
2. Declara una variable ‘i’ de tipo entero y asígnale un valor. Mostrar un mensaje indicando si el valor de ‘i’ es positivo o negativo, si es par o impar, si es múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que 100. Consideraremos el 0 como positivo.
*/		
	
		
		//1
		
		
		calculadoraConSwitch();	
		
		
		
		
		
		
	
		
	}
	
	public static void ejercicio1() throws IOException {
		
		System.out.println("introduce la nota del examen del 1 al 10");
		String nota	= br.readLine();
		
		int Nota = Integer.parseInt(nota);
		
		if(Nota ==5) {
			System.out.println("aprovado por los pelos");
		}else if(Nota >10 || Nota<0) {
			System.out.println("tiene que estar entre 0 y 10");
		}else if(Nota <5){
			System.out.println("suspenso");
		}else if(Nota >5) {
			System.out.println("aprovado");
		}
	}
	
	/*public static void EjerciciosTernario() throws IOException {
		
		System.out.println("Introduce un valor");
		String valor = br.readLine();
		double b = Double.parseDouble(valor);
		
		String resultado = (b>0)?"el valor es mayor  que 0": "el valor es menor que 0";
		System.out.println(resultado);
		
		
	}*/
	
	
	/*public static void calculadora() throws IOException {
		System.out.println("CALCULADORA");
		System.out.println("Introduce el primer valor: ");
		String valor1 = br.readLine();
		int a = Integer.parseInt(valor1);
		System.out.println("Introduce El segundo Valor: ");
		String valor2 = br.readLine();
		int b = Integer.parseInt(valor2);
	
		System.out.println("Que operacion deseas realizar: ");
		System.out.println("Sumar, restar,multiplicar o dividir");
		String operacion = br.readLine();
		
		if(operacion.equals("sumar")) {
			int sumar = a+b;
			System.out.println("El resultado es: "+sumar);
		}else if(operacion.equals("restar")) {
			int restar = a-b;
			System.out.println("El resultado es:"+restar);
			
		}else if(operacion.equals("multiplicar")) {
			int multiplicar = a*b;
			System.out.println("El resultado es: "+multiplicar);
			
		}else if(operacion.equals("dividir")) {
			int dividir = a/b;
			System.out.println("el resultado es: "+dividir);
		}
		
		
		
	}
	*/
	
	public static void calculadoraConSwitch() throws IOException {
		
		System.out.println("Calculadora Con Switch");
		System.out.println("Introduce el primer valor: ");
		String valor1 = br.readLine();
		int a = Integer.parseInt(valor1);
		System.out.println("Introduce El segundo Valor: ");
		String valor2 = br.readLine();
		int b = Integer.parseInt(valor2);
		int sumar = a+b;
		int restar = a-b;	
		int multiplicar = a*b;
		int dividir = a/b;


		
		System.out.println("Opciones: ");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. multiplicar");
		System.out.println("4. dividir");
		
		String opcion = br.readLine();
		int opciones = Integer.parseInt(opcion);
		
		switch(opciones) {
		case 1:
			System.out.println("El resultado es: "+sumar);
			break;
			
		case 2:
			System.out.println("El resultado es:"+restar);
			
			break;
			
		case 3:
			System.out.println("El resultado es: "+multiplicar);
			
			break;
			
		case 4:
			System.out.println("el resultado es: "+dividir);
		
			break;
		}

		
		
	}
	
	
	
	

}
