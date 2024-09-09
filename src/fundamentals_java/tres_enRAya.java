package fundamentals_java;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class tres_enRAya {
	


	public static void main(String[] args) {

		String[] tablero = { "_", "_", "_", "_", "_", "_", "_", "_", "_" };
		int tirada = 0;
		boolean alguienGano = false;
		do {
			showBoard(tablero);
			String ficha = tirada%2==0? "X":"O";
			Jugador(tablero, ficha);
			
			
			alguienGano = evaluarGanador(tablero);
			if(alguienGano)System.out.println("Enhorabuena, player " + ficha);
			tirada++;
		} while (!alguienGano);

	
	}
	
	/*
	 * String[] tablero = { "_", "_", "_", "_", "_", "_", "_", "_", "_" };
		int tirada = 0;
		boolean alguienGano = false;
		do {
			showTablero(tablero);
			String ficha = tirada%2==0? "X":"O";
			juegaPlayer(ficha, tablero);
			
			
			alguienGano = evaluateWin(tablero);
			if(alguienGano)System.out.println("Enhorabuena, player " + ficha);
			tirada++;
		} while (!alguienGano);

	}
*/
	
	public static  void showBoard(String [] tablero) {
		
		System.out.println(tablero[0]+ " | "+tablero[1]+ " | "+tablero[2]);
		System.out.println(tablero[3]+ " | "+tablero[4]+ " | "+tablero[5]);
		System.out.println(tablero[6]+ " | "+tablero[7]+ " | "+tablero[8]);
 
		
		
		
	}
	
	 public static void Jugador(String [] tablero, String ficha) {
		Scanner sc = new Scanner (System.in);

		if(ficha.equals("X")) {
			System.out.println("Que posicion quieres moverte Jugador:  "+ficha);
			int posicion = sc.nextInt();
			
			tablero[posicion] = ficha;
			
		}else {
			System.out.println("Ordenador ha movido a la posicion: ");
			int posicion = getComputerMove(tablero);
			tablero[posicion]=ficha;
		}
		
			
	}
	
	
	static boolean evaluarGanador(String [] tablero ) {
		if(tablero[0].equals(tablero[1]) && tablero[0].equals(tablero[2]) && !tablero[0].equals("_")) {
			return true;
		}
		
		else if(tablero[3].equals(tablero[4]) && tablero[3].equals(tablero[5]) && !tablero[3].equals("_")) {
			return true;
		}
		else if(tablero[6].equals(tablero[7]) && tablero[6].equals(tablero[8]) && !tablero[6].equals("_")) {
			return true;
		}
		else if(tablero[0].equals(tablero[3]) && tablero[0].equals(tablero[6]) && !tablero[0].equals("_")) {
			return true;
		}
		
		else if(tablero[1].equals(tablero[4]) && tablero[1].equals(tablero[7]) && !tablero[1].equals("_")) {
			return true;
		}
		else if(tablero[2].equals(tablero[5]) && tablero[2].equals(tablero[8]) && !tablero[2].equals("_")) {
			return true;
		}
		
		return false;

	}
	
	static   int getComputerMove(String [] tablero) {
		//comprobar si la maquina puede hacer un movimiento y ganar la partida:
			for(int i =0; i<tablero.length;i++) {
				String [] tablero2 = tablero.clone();
				if(tablero2[i].equals("_")) {
					tablero2[i]="X";
					
					if(evaluarGanador(tablero2)) {
						return i;
					}
				}
			}
			
			
		//comprobar si tras mover el humano puede ganar
			
			String [] tablero2 = tablero.clone();
			for(int i =0; i<tablero2.length;i++) {
				
				if(tablero2[i].equals("_")) {
					tablero2[i]="X";

					if(evaluarGanador(tablero2)) {
						return i;
					}
				}
				
			}
			
			
			return -1;
		
	}

}
