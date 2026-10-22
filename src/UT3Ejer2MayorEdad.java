package edu.masanz.da.ut3;

import java.util.Scanner;

public class UT3Ejer2MayorEdad {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu edad");
        int edad = Integer.parseInt(teclado.nextLine());

        System.out.println("Introduce tu nombre");
        String nombre = teclado.nextLine();

        if (edad < 0) {
            System.out.println("El dato no es valido");
        } else if (edad >= 18) {
            System.out.println(nombre + " eres mayor de edad");
        } else {
            System.out.println(nombre + " eres menor de edad");
        }

    }

}
