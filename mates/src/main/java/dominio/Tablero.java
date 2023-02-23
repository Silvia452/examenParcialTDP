//1. Las reglas son las habituales:
//a) Si una célula está viva y dos o tres de sus vecinas también lo están, entonces continúa viva en el estado siguiente.
//b) Si una célula está muerta y tres de sus vecinas están vivas, entonces pasa a estar viva en el estado siguiente.
//c) El resto de células pasan a estar muertas en el estado siguiente

//2. Asuma un tablero con 30 celdas (células)

//3. El estado inicial del tablero estará almacenado en un fichero (llamado matriz) con 30 filas y 30 columnas en que cada celda será un uno o un cero. Por ejemplo,
package dominio;

import java.util.Random;

public class Tablero {
    private static int DIMENSION = 30; // Dimensiones del tablero
    private int[][] estadoActual;
    private int[][] estadoSiguiente = new int[DIMENSION][DIMENSION];

    private int[][] matriz = new int [DIMENSION][DIMENSION];

    public void leerEstadoActual() {
        Random rnd = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = rnd.nextInt(2); //genera un numero aleatorio entre 0 y 1
            }
            System.out.println();
        }





        // La secuencia de ceros y unos del fichero es guardada
        // en ‘estadoActual‘ y, utilizando las reglas del juego
        // de la vida, se insertan los ceros y unos
        // correspondientes en ‘estadoSiguiente‘




    }


    public void generarEstadoActualPorMontecarlo() {

    }


    public void transitarAlEstadoSiguiente() {

    }

    @Override
    public String toString() {
        return ""; // Esta línea hay que modificarla. }

    }


}

