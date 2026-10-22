package edu.masanz.da.ut3;

import org.junit.Test;

import java.util.Scanner;

public class UT3Ejer3PositivoNegativo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numero = Integer.parseInt(teclado.nextLine());

        if (numero > 0) {
            System.out.println("El numero es positivo");
        } else if (numero < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es 0");
        }
    }

}
