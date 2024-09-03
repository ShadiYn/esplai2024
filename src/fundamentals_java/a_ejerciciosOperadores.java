package fundamentals_java;

public class a_ejerciciosOperadores {

	public static void main(String[] args) {

		//1.Que se muestre un mensaje que diga: “Buenas tardes Jose”, dónde Jose será el valor de una variable.


		String Nombre= "Jose";
		
		System.out.println("Buenas tardes "+ Nombre);
		
	//1. Construye una nueva cadena de texto concatenando las cadenas «Este es el principio» y «Este es el final». Concatena un espacio en blanco en medio de ambas cadenas.

	System.out.println("este es el principio"+ " "+ "este es el final");
		
	
	//2.Hacer un conversor de euros a dólares. Tendremos una variable de tipo float llamada euros en la que el valor estará inicializado con valor 7. Debemos calcular ese valor en dólares. Supondremos que un euro son dos dólares.

	float euros=7;

	float dolares = euros*2;
		
	System.out.println(dolares);	
	
	
	
	//3.El IVA para ciertos artículos es del 21%. Realiza un programa que a partir de una variable de tipo entero precio inicializada con valor 100, calcule el precio con IVA.
	int precio = 100;
	double Iva = 0.21;
	double precioConIva = precio*Iva;
	
	System.out.println(precioConIva);
	
	
	//4. Realiza un programa que a partir de dos variables de tipo entero, ancho=4 y alto=7, calcule el área de un rectángulo.
int ancho =4;
int alto =7;

int areaCalculada = ancho*alto;

System.out.println(areaCalculada);


//5.Copy Hacer un conversor de grados centígrados a grados Fahrenheit. Para ello deberé multiplicar los grados centígrados por 9/5 y sumar 32. Para comprobar que hemos hecho los cálculos correctamente, partiremos de una variable de tipo entero llamada centigrados que valdrá 20. En este caso, los grados fahrenheit deberían ser 68.

int centigrados = 20;

int fahrenheit = (centigrados*9/5)+32;

System.out.println(fahrenheit);

//7. Vamos a mandar al usuario la caja de sus sueños. Para ello, partiremos de los siguientes valores:
String nombre = "Juan";
String material = "madera";
String dimensiones = "diminutas";
String comentario = "Que sea bonita, pero de una belleza estraña, indómita";

System.out.println(nombre+"ha pedido una caja de "+ material+" con unas dimensiones "+dimensiones+"."+comentario);



//sugarRush?

//1. Haz un código equivalente al siguiente utilizando el operador unario de suma (++).

int myVar = 87;
myVar++;
System.out.println(myVar);

//2. Haz un código equivalente al siguiente utilizando el operador unario de resta (–);

int myVar2 = 87;
myVar2--;
System.out.println(myVar2);

//3. ¿Qué valor tendrá x después de la ejecución del siguiente código?

int x = 3;
x++; //x=4
x = x * 2; //x=8
x--;//x=7
System.out.println(x);


	}

}
