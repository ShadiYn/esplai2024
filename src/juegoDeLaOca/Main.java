package juegoDeLaOca;

import java.util.Scanner;

import java.util.Scanner;

public class Main {

    // Función que retorna un array con los valores de los dados aleatorios
    static int[] tirarDaus() {
        int[] daus = new int[2];
        daus[0] = (int) (Math.random() * 6) + 1;
        daus[1] = (int) (Math.random() * 6) + 1;
        return daus;
    }

    public static void main(String[] args) {
        // Inicializamos el Scanner
        Scanner sc = new Scanner(System.in);

        // Pedimos cuántos jugadores van a jugar
        System.out.print("¿Cuántas personas jugarán?: ");
        int numJugadores = sc.nextInt();
        while (numJugadores < 2 || numJugadores > 4) {
            System.out.println("El número de jugadores debe ser entre 2 y 4.");
            System.out.print("¿Cuántas personas jugarán?: ");
            numJugadores = sc.nextInt();
        }

        // Creamos el array de jugadores
        Jugador[] jugadores = new Jugador[numJugadores];
        for (int i = 0; i < numJugadores; i++) {
            System.out.print("¿Cuál es el nombre del jugador " + (i + 1) + "?: ");
            String nombre = sc.next();
            jugadores[i] = new Jugador(nombre.substring(0, 1).toUpperCase() + nombre.substring(1).toLowerCase());
        }

        // Orden aleatorio de jugadores
        int[] ordenJugadores = new int[numJugadores];
        int index = 0;
        while (index < numJugadores) {
            int random = (int) (Math.random() * numJugadores);
            boolean encontrado = false;
            for (int i = 0; i < index; i++) {
                if (ordenJugadores[i] == random) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                ordenJugadores[index++] = random;
            }
        }

        int[] casillasOca = {5, 9, 14, 18, 23, 27, 32, 36, 41, 45, 50, 54, 59};
        int turno = 0;
        boolean juegoTerminado = false;

        // Inicia el juego
        while (!juegoTerminado) {
            Jugador jugadorActual = jugadores[ordenJugadores[turno]];

            // Si tiene restricción de tiro, no tira
            if (jugadorActual.getRestriccionTiros() > 0) {
                jugadorActual.setRestriccionTiros(jugadorActual.getRestriccionTiros() - 1);
                System.out.println(jugadorActual.getNombre() + " no puede tirar. Le quedan "
                        + jugadorActual.getRestriccionTiros() + " turnos de restricción.");
            } else {
                // Esperar a que el jugador tire
                System.out.println("Es el turno de " + jugadorActual.getNombre() + ". Escribe 'tiro' para tirar los dados.");
                String accion = sc.next().toLowerCase();
                while (!accion.equals("tiro")) {
                    System.out.println("Acción inválida. Escribe 'tiro'.");
                    accion = sc.next().toLowerCase();
                }

                // Tirar los dados
                int[] daus = tirarDaus();
                int totalDaus = daus[0] + daus[1];
                System.out.println("Has sacado un " + daus[0] + " y un " + daus[1] + ". Total: " + totalDaus);

                // Actualizar casilla
                int nuevaCasilla = jugadorActual.getCasillaActual() + totalDaus;
                if (nuevaCasilla > 63) {
                    nuevaCasilla = 63 - (nuevaCasilla - 63);
                }
                jugadorActual.setCasillaActual(nuevaCasilla);
                System.out.println(jugadorActual.getNombre() + " ahora está en la casilla " + nuevaCasilla);

                // Comprobar reglas especiales y final del juego
                if (nuevaCasilla == 63) {
                    System.out.println(jugadorActual.getNombre() + " ha ganado!");
                    juegoTerminado = true;
                }
                // Aquí puedes seguir agregando las otras reglas especiales como el puente, la oca, etc.
            }

            // Cambiar turno
            turno = (turno + 1) % numJugadores;
        }

        sc.close();
    }
}
