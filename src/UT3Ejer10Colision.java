package edu.masanz.da.ut3;

import java.util.Scanner;

public class UT3Ejer10Colision {
    public static void main(String[] args) {
        int x1;
        int y1;
        int anchura1;
        int altura1;

        int x2;
        int y2;
        int anchura2;
        int altura2;

        boolean hayColision;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la coordenada x del primer rectángulo: ");
        x1 = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce la coordenada Y del primer rectángulo: ");
        y1 = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce la anchura del primer rectángulo");
        anchura1 = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce la altura del primer rectángulo");
        altura1 = Integer.parseInt(teclado.nextLine());

        System.out.println("Introduce la coordenada x del segundo rectángulo: ");
        x2 = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce la coordenada y del segundo rectángulo: ");
        y2 = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce la anchura del segundo rectángulo");
        anchura2 = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce la altura del segundo rectángulo");
        altura2 = Integer.parseInt(teclado.nextLine());

        if (anchura1 < 0 || altura1 < 0 || anchura2 < 0 || altura2 < 0) {
            System.out.println("Debes introducir alturas y anchuras positivas");
        } else if ((x1 + anchura1) == (x2 + anchura2) || (y1 + altura1) == (y2 + altura2)) {
            hayColision = true; 
            System.out.println("Hay colisión en los dos rectángulos");
        } else {
            hayColision = false;
            System.out.println("No hay colisión entre los dos rectángulos");
        }

    }
}
