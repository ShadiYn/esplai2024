package altaYbajas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
	public static Scanner sc = new Scanner (System.in);
public static ArrayList<Alumno>alumno = new ArrayList<Alumno>();


	public static void main(String[] args) {

		int opcion;
		String Nombre = null;
		int edad = 0;
		do {
			System.out.println("Introduce la operacion que quieras realizas");
			System.out.println("1. añadir alumno");
			System.out.println("2. eliminar alumno");
			System.out.println("3. modificar alumno");
			System.out.println("4. consultar alumnos");
			System.out.println("5. salir");

			opcion = sc.nextInt();
			switch(opcion) {
			case 1:
				AñadirAlumno(Nombre, edad);
				break;
				
			case 2:
				EliminarAlumno(Nombre,edad);
				break;
				
			case 3:
				ModificarAlumno(Nombre, edad);
				break;
				
			case 4:
				ConsultarAlumnos(Nombre, edad);
				break;
				
			default:
			
			}

		}while(opcion!=5);
			System.out.println("No has escogido ninguna opcion");
		
	
	}
	public static void ConsultarAlumnos(String nombre, int edad) {
		//recorremos con un bucle los alunos
		for(Alumno a :alumno) {
			System.out.println("Nombre: "+a.getNombre()
			+" Edad: "+a.getEdad());
		}
	
	}

	public static void ModificarAlumno(String nombre, int edad) {
		System.out.println("Introduce el nombre del alumno que quieras modificar");
		nombre=sc.next();
		System.out.println("Nuevo nombre: ");
		String nombre2=sc.next();
		System.out.println("Introduce la edad: ");
		int edad2= sc.nextInt();
		Iterator <Alumno> iterar = alumno.iterator();
		//ahora recorremos el iterador de los alumnos
		//mientras el bucle tenga algo que recorrer cogera al 
		//alumno que itera y si el nombre es igual al introducido entonce slo eliminará
		while(iterar.hasNext()) {
			Alumno a = iterar.next();
			
			if(a.getNombre().equals(nombre)) {
				a.setNombre(nombre2);
				a.setEdad(edad2);
			}
		}
		
		
	}

	public static void EliminarAlumno(String nombre, int edad) {
		System.out.println("Introduce el nombre del alumno que quieras eliminar");
		nombre=sc.next();
		
		Iterator <Alumno> iterar = alumno.iterator();
		//ahora recorremos el iterador de los alumnos
		//mientras el bucle tenga algo que recorrer cogera al 
		//alumno que itera y si el nombre es igual al introducido entonce slo eliminará
		while(iterar.hasNext()) {
			Alumno a = iterar.next();
			
			if(a.getNombre().equals(nombre)) {
				iterar.remove();
			}
		}
		
	}

	public static void AñadirAlumno(String nombre, int edad) {
		System.out.println("Introduce el nombre del alumno");
			nombre = sc.next();			
		System.out.println("Introduce la edad del alumno");
			edad = sc.nextInt();
			
			//ahora llamamos a alumno
			
			Alumno a = new Alumno();
			a.setNombre(nombre);
			a.setEdad(edad);
			//ahora lo tendremos que pasar al listado
			alumno.add(a);
			
			
		
	}
	
}

	
