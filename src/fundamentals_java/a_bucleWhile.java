package fundamentals_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a_bucleWhile {
	public static BufferedReader br = new BufferedReader( new InputStreamReader(System.in));


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		ejercicio_1();
	
	}
	
	public static void ejercicio_1() {
		boolean correcto = false;
		
		while(correcto == false) {
			
			System.out.println("Introduce tu nombre");
			String Nombre = br.readLine();
			
			if(!Nombre.equals("")) { //si no pones nada te volvera  apreguntar el nombre
				//entonces aqui te pide si el nombre es diferente de espacio en blanco entonces, procederá con el codigo
				System.out.println("datos correctos?");
				String respuesta = br.readLine();
				
				if(respuesta.equals("si")) {
					System.out.println("Puedes continuar con el examen");
					correcto=true;
				}else {
					System.out.println("Error");
				}
			}
			
		}
	}

}
