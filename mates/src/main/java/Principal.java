import dominio.Tablero;
import java.util.concurrent.TimeUnit;
import java.lang.InterruptedException;
import mates.Matematicas;


public class Principal {

    public static void main(String[] args) {
        System.out.println("El número PI es " + Matematicas.generarNumeroPi(Integer.parseInt(args[0])));
        try {
            Tablero tablero = new Tablero();
            System.out.println("SIMULACIÓN CON TABLERO LEÍDO ");
            tablero.leerEstadoActual();
            System.out.println(tablero);
            for(int i = 0; i <= 5; i++) {
                TimeUnit.SECONDS.sleep(1);
                tablero.transitarAlEstadoSiguiente();
                System.out.println(tablero);
            }
            System.out.println("SIMULACIÓN CON TABLERO GENERADO MEDIANTE MONTECARLO");
            tablero.generarEstadoActualPorMontecarlo();
            System.out.println(tablero);
            for(int i = 0; i <= 15; i++) {
                TimeUnit.SECONDS.sleep(1);
                tablero.transitarAlEstadoSiguiente();
                System.out.println(tablero);
            }
        } catch(InterruptedException e) {
            System.out.println(e);
        }
    }
}


