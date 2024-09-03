package fundamentals_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class buckeWhileee {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

		boolean correcto = false;
		while(correcto == false) {
			
			System.out.println("Introduce tu nombre");
			String Nombre = br.readLine();
			
			if(Nombre.equals("")) {
				System.out.println("datos correctos?");
				String respuesta = br.readLine();
				
				if(respuesta.equals("si")) {
					System.out.println("Puedes continuar con el examen");
				}else {
					System.out.println("Error");
				}
			}
			
		}
		
		
	}

}
