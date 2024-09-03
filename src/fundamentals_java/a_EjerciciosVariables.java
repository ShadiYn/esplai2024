package fundamentals_java;

public class a_EjerciciosVariables {

	public static void main(String[] args) {

//1. Declara una variable de tipo entero y asígnale un valor.
		
		int a=90;
//2. Declara una variable de tipo texto y asígnale un valor.
		String nombre="shadin";

//3. Declara una variable de tipo decimal y asígnale un valor.
		double b2=5.69;

//4. Asigna el valor de la variable a a la variable b.
		
		int b1=50;
		
		System.out.println("el valor de A= "+a);
		System.out.println("el valor de B= "+b1);
		
		a=b1;

		
		System.out.println("el valor de la variable a ahora es: "+ b1);

//5. Modifica las siguientes declaraciones de variables para que sean camelCase.
	/*
	 * 
	 *	 String TituloDeLaPelicula;
		 String  camelCaseBienPuesto;
		 int EDaddelMonstruo;

	 * 
	 * 
	 * 
	 * */	
		
		String tituloDelaPelicula;
		String camelCasebienPuesto;
		int edadDelMonstruo;
		
		

//6. ¿Cuanto valor tendrá i después de ejecutar el siguiente código?

int i =7;
i=3;
i=4;
System.out.println(i); //coge el ultimo valor que le has asignado osea en esta caso será 3


//7. Declarar una variable ‘i’ de tipo int, una variable ‘d’ de tipo double y una variable ‘c’ de tipo char. Asignar un valor a cada una. Mostrar por pantalla el valor de cada variable utilizando tres llamadas a System.out.println(). Tener en cuenta que:

int i1 = 100;
double d = 4.99;
char c =' ';

System.out.println(i1);
System.out.println(d);
System.out.println(c);
		
	
//8. Intercambiar el contenido de dos variables

int a1 = 5;
int b = 7;

int valor_a=a1;
int valor_b=b;
a1=b;

b=valor_a;

System.out.println(a1); //Debería mostrar 7
System.out.println(b); //Debería mostrar 5
		
	}

}
