package juegoDeLaOca;

import java.util.Scanner;

public class Main {

		public static Scanner entrada = new Scanner(System.in);
	
		//funcion para al tirar los dados te den numeros random
		static int[] tirar_Dados() {
			int dados[] = new int[2];
			dados[0]= (int) (Math.random()*6)+1;
			dados[1] = (int) (Math.random()*6)+1;
			return dados;
					
		}
		public static void main(String[] args) {
		//saber en que casilla se encuentra cada jugador
		int [] casilla_ActualJugador;
		//para saber el orden de cada jugador
		int [] orden_jugadores;
		//nombre del jugador
		String [] nombreJugadores;
		//restriccion de tiros
		int [] restriccion_Tiros;
		int[]dados = new int[2];
		//para saber de quien es el turno de cada jugador para tirar
		int turnos =0;
		//para saber si los jugadores han tirado por primera vez o no
		boolean[] primeraTirada;
		//restriccion de tiros por casillas
		int pozo =-1;
		int [] casillas_Oca = {5,9,14,18,23,27,32,36,41,45,50,54,59};
	
		//pregunta por la cantidad de jugadores que van a participar
		System.out.println("Indica el numero de personas que jugarán: ");
		int personas = entrada.nextInt();
		
		casilla_ActualJugador = new int [personas];
		orden_jugadores = new int [personas];
		nombreJugadores = new String [personas];
		primeraTirada = new boolean[personas];
		restriccion_Tiros = new int[personas];
		
		//inicializar el array de primeras tiradas en false
		
		for(int i =0; i<personas;i++) {
			primeraTirada[i]=false;
		}
		
		
		//preguntar nombre de los jugadores
		for(int i =0; i<personas;i++) {
			System.out.println("cual es el nombre del jugador: "+(i+1)+"?");
			nombreJugadores[i]=entrada.next();
			nombreJugadores[i] = nombreJugadores[i].substring(0,1).toUpperCase()+
						nombreJugadores[i].substring(1).toLowerCase();
		}
		
		//orden random para los jugadores
		int index =0;
		while(true) {
			int random = (int)(Math.random()*personas);
			random +=1;
			boolean encontrado = false;
				for(int i =0;i <personas;i++) {
					if(orden_jugadores[i] == random && !encontrado) {
						encontrado =true;
					}
				}
				
				
				if(!encontrado) {
					orden_jugadores[index] = random;
					index++;
				}
				
				if(index == personas) {
					break;
				}
		}
		
		
		//iniciamos el juego
		while(true) {
			if(restriccion_Tiros[orden_jugadores[turnos]-1]>0) {
				restriccion_Tiros[orden_jugadores[turnos]-1]--;
				
				if(restriccion_Tiros[orden_jugadores[turnos]-1] > 0 && pozo == (orden_jugadores[turnos]-1)) {
					pozo = -1;
				}
				
				
				//mostraremos que el jugador no puede tirar
				System.out.println("========================================================================");
				System.out.println(nombreJugadores[orden_jugadores[turnos]-1]+"No puedes tirar, te quedan"+restriccion_Tiros[orden_jugadores[turnos]-1]+"turnos de restriccion");
				System.out.println("========================================================================");

				turnos++;
				
				if(turnos == orden_jugadores.length) {
					turnos=0;
				}
				
				
			}else {
				String respuesta_persona = "";
				//indicaremos la palabra que tiene que escribir el jugador
				//para poder jugar
				boolean volver_a_Tirar=false;
				boolean regla_Aplicada = false;
				
				
				while(!respuesta_persona.equals("tiro")) {
					System.out.println("El turno de "+nombreJugadores[orden_jugadores[turnos]-1]);
					System.out.println("Para tirar escribe: tiro");
					respuesta_persona = entrada.next().toLowerCase();//aunque lo escriba en mayus se convertira en minusculas automaticamente
				}
				System.out.println("_________________________________________________________");
				dados = tirar_Dados();
				System.out.println("Has sacado un "+ dados[0]+ " y un: "+dados[1]+" en total: "+(dados[0]+dados[1]));
				System.out.println("Estabas en la casilla "+casilla_ActualJugador[orden_jugadores[turnos]-1]);
				//le sumamos los valores de los dados a la casilla actual
				casilla_ActualJugador[orden_jugadores[turnos]-1]+= (dados[0]+dados[1]);
				
				//evaluamos si ha pasado de la en la casilla 63 si es asi se retrocede a la 63
				if(casilla_ActualJugador[orden_jugadores[turnos]-1] > 63) {
					casilla_ActualJugador[orden_jugadores[turnos]-1]=63-(casilla_ActualJugador[orden_jugadores[turnos]-1]-63);
					
				}
				
				System.out.println("Ahora estas en la casilla: "+casilla_ActualJugador[orden_jugadores[turnos]-1]);
				
				
				
			}
		}
		
		
		
		}

}
