package fundamentals_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class a_metodos {
	
	public static 	BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	public static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

		Boolean valor=true;
		String ancho = null;
		String alto=null;
		String Greta = "Greta";
		String Nombre = null;
		int n1=0;
		int n2=0;
		
		//Valor_1(valor);
		//Ejercicio_2();
		//Ejercicio_3();
		//Ejercicio_4(ancho,alto);
		//echo("Greta");
		//saludar(Nombre);
		//InterfazCalculadora(n1,n2);
	
	}
	
	public static void Valor_1(Boolean Valor) {
				
		if(Valor == false) {
			System.out.println("No eso es falso");
		}else if(Valor ==true) {
			System.out.println("si, eso es cierto");
		}
		
	}
	
	
	public static void Ejercicio_2() throws IOException {
		System.out.println("Introduce el numero a calcular");
		 String Numero = br.readLine();
		int Valor = Integer.parseInt(Numero);
		
		int calculo = Valor*Valor*Valor;
		System.out.println("El cubo de "+Numero+" = "+calculo);
	}
	
	public static void Ejercicio_3() throws IOException {
		System.out.println("Introduce los kilometros/hora");
		String velocidad = br.readLine();
		Double kilometros = Double.parseDouble(velocidad);
		
		Double calculo = kilometros*0.2777;
		System.out.println(kilometros+"Equivalen a "+calculo);
	}
	
	public static void Ejercicio_4(String alto,String ancho) {
		
		System.out.println("Introduce el ancho del rectangulo");
		try {
			
			alto = br.readLine();
			int altura = Integer.parseInt(alto);
			System.out.println("Introduce el ancho del rectangulo");
			ancho = br.readLine();
			int anchura = Integer.parseInt(ancho);
			
			int perimetro = 2*anchura+2*altura; 
			
			System.out.println("el perimetro del rectangulo es: "+perimetro);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void ejercicio_5(String Base, String Altura) {
		try {
			System.out.println("Introduce la base del triangulo");
			Base= br.readLine();
			int base = Integer.parseInt(Base);
			
			System.out.println("Introduce la altura del triangulo");
			Altura = br.readLine();
			int altura = Integer.parseInt(Altura);
			
			int area = base*altura;
			
			System.out.println("El area del triangulo es: "+area/2);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
	
	
	
	//EJERCICIOS RETURN
	
	//1. ¿Qué valor de x se mostrará en la consola?
	
		//R: tiene que devolver "hi"

	//2. ¿Qué valor de x se mostrará en la consola?
		
		//R: Devolveria el mismo mensaje: "how do you do"

	//3. ¿Qué valor de x se mostrará en la consola?
		//R: mostraría: "dónde esta jacky"
	
	//4. Escribe una función echo que devuelva el valor que recibe como parámetro.

	public static void echo(String Greta) {
		System.out.println(Greta);
	}
	public static void echo2(String co2) {
		System.out.println(co2);
	}
	
	//5. Escribe una función saludar que reciba una parámetro y devuelva el texto «Hola <parametro>!»

	public static void saludar (String Nombre) {
		try {
			System.out.println("Introduce tu nombre");
			Nombre = br.readLine();
			
			System.out.println("Hola "+Nombre);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//6. Añade los operadores booleanos correctos para que la siguiente función tenga sentido.

	public static String testGreaterThan(int val) {
		  if (val >100) {  // Cambia esta línea
		    return "Por encima de 100";
		  }

		  if (val>10) {  // Cambia esta línea
		    return "Por encima de 10";
		  }

		  return "10 o menos";
		}
	
	
	//BLOQUE EJERCICIOS
	
	//5. Repetir el ejercicio de la calculadora utilizando funciones para las operaciones aritméticas. Debemos declarar 4 funciones con dos parámetros de entrada cada una: suma(int a, int b), resta(int a, int b,), multiplicacion(int a, int b), division(int a, int b).

	public static void InterfazCalculadora(int n1, int n2) {
		int opciones;
		
		
		do {
			System.out.println("Introduce el primer numero: ");
			n1 = sc.nextInt();
			
			System.out.println("Introduce el segundo numero: ");
			n2 = sc.nextInt();
			
			System.out.println("¿Que operacion quieres realizar?");
			System.out.println("1. sumar");
			System.out.println("2. restar");
			System.out.println("3. multiplicar");
			System.out.println("4. dividir");
			opciones = sc.nextInt();

			switch(opciones) {
			case 1:
				suma(n1,n2);
				break;
				
			case 2:
				resta(n1,n2);
				break;
				
			case 3:
				multiplicacion(n1,n2);
				break;
				
			case 4:
				division(n1,n2);
				break;
			
			
			}
			
		}while(opciones!=0);
			
		
	
		
	}
	
	public static void suma(int n1, int n2) {
		int sumar = n1+n2;
		System.out.println("Suma es: "+sumar);
	}
	public static void resta(int n1, int n2) {
		int restar = n1-n2;
		System.out.println("Resta es: "+restar);
	}

	public static void multiplicacion(int n1, int n2) {
		int multiplicar = n1*n2;
		System.out.println("Multiplicar es: "+multiplicar);
		
	}
	public static void division(int n1, int n2) {
		int dividir = n1/n2;
		System.out.println("dividir es: "+dividir);
	
	}
	
	
	//Metodos con cadenas

	
	
	

}
