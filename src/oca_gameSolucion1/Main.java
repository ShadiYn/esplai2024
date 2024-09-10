package oca_gameSolucion1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	//hashMap para almacenar las casillas con sucesos
	static HashMap<Integer,Integer> ocas;
	static HashMap<Integer,Integer> puentes;
	static HashMap<Integer,Integer> dados;
	static Scanner e = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce el numero de jugadores");
		int nJugadores = e.nextInt();
		boolean juegoActivo = true;
		
		ocas = getOcas();
		puentes = getPuentes();
		dados = getDados();
		
		ArrayList<Jugador>jugadores = new ArrayList<Jugador>();
		for(int i =0; i<nJugadores;i++) {
			Jugador j = new Jugador();
			System.out.println("Introduce el nombre del jugador: "+i+1);
			String nombre = e.nextLine();
			j.setNombre(nombre);
			jugadores.add(j);
			
		}
		
		do {
			for(Jugador j : jugadores) {
				if(j.isActivo()) {
					System.out.println("Juega"+j.getNombre());
					if(j.getTurnosRestantes()==0) {
						int n = tirarDado();
						
						int nuevaPosicion = n+j.getCasilla();
						int casilla = calcularCasillaSiguiente(nuevaPosicion, j);
						
						if(casilla ==-1) {
							juegoActivo=false;
						}else {
							j.getCasilla();
						}
					}else {
						System.out.println(j.getNombre()+" tiene que esperar"+j.getTurnosRestantes());
						j.setTurnosRestantes(j.getTurnosRestantes()-1);
					}
				}
				
			}
			
		}while(juegoActivo);
		
	}
	
	

	
	static int calcularCasillaSiguiente(int nuevaPosicion,Jugador j) {
		Integer casillaDestino = ocas.get(nuevaPosicion);
		Integer casillaDestino2 = puentes.get(nuevaPosicion);
		Integer casillaDestino3 = dados.get(nuevaPosicion);
		
		if(casillaDestino !=null) {
			System.out.println("De oca a ocay tiro porque me toca");
			int n = tirarDado();
			return calcularCasillaSiguiente(casillaDestino+n,j);
		}else if(nuevaPosicion == 19){
			j.setTurnosRestantes(2);
			
			
		}else if(nuevaPosicion == 3) {
			j.setTurnosRestantes(1);
		}else if(nuevaPosicion == 52) {
			j.setTurnosRestantes(3);
		}else if(casillaDestino2 != null) {
			System.out.println("De puento a puente y tiro porque me lleva la corriente");
			int n = tirarDado();
			return calcularCasillaSiguiente(casillaDestino2 + n,j);
		}else if(casillaDestino3 != null) {
			System.out.println("De dado a dado y tiro porque me ha tocado");
			int n = tirarDado();
			return calcularCasillaSiguiente(casillaDestino3 + n,j);

		}else if(nuevaPosicion == 58) {
			System.out.println("El jugador: "+j.getNombre()+" nos ha dejado");
			j.setActivo(false);
		}else if(nuevaPosicion ==63) {
			System.out.println("El jugador: "+j.getNombre()+" ha ganado");
			return-1;
		}else if(nuevaPosicion >63) {
			int diff = nuevaPosicion -63;
			return calcularCasillaSiguiente(63-diff,j);
		}
		return nuevaPosicion;
		
	}

	private static HashMap<Integer, Integer> getDados() {
	    HashMap<Integer, Integer> dados = new HashMap<>();
		dados.put(26, 53);
		return dados;
	}

	private static HashMap<Integer, Integer> getPuentes() {
	    HashMap<Integer, Integer> puentes = new HashMap<>();
		puentes.put(6, 12);
		return puentes;
	}

	static HashMap<Integer, Integer> getOcas() {
	    HashMap<Integer, Integer> ocas = new HashMap<>();
	    ocas.put(5, 9);
	    ocas.put(9, 14);
	    ocas.put(14, 18);
	    ocas.put(18, 23);
	    ocas.put(23, 27);
	    ocas.put(27, 32);
	    ocas.put(32, 36);
	    ocas.put(36, 41);
	    ocas.put(41, 45);
	    ocas.put(45, 50);
	    ocas.put(50, 54);
	    ocas.put(54, 59);
	    return ocas;
	}

	
	static int tirarDado() {
		Random r = new Random();
		return r.nextInt(6)+1;
	}

}
