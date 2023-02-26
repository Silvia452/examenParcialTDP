package mates;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Escribe puntos totales: ");

        double puntos = sn.nextInt();
        System.out.println("El número PI es " + Matematicas.generarNumeroPi(puntos));



    }
}
