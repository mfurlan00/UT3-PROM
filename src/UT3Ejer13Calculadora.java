package edu.masanz.da.ut3;

import java.util.Scanner;

public class UT3Ejer13Calculadora {
    public static void main(String[] args) {
        
        double num1;
        double num2;

        String operacion = "";

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número double");
        num1 = Double.parseDouble(teclado.nextLine());

        System.out.println("Introduce otro número double");
        num2 = Double.parseDouble(teclado.nextLine());

        System.out.println("Introduce una operacion");
        operacion = teclado.nextLine();

        if (operacion.equals("+")) {
            System.out.println("El resultado es: " + (num1 + num2));
        } else if (operacion.equals("-")) {
            System.out.println("El resultado es: " + (num1 - num2));
        } else if (operacion.equals("*")) {
            System.out.println("El resultado es: " + (num1 * num2));
        } else if (operacion.equals("/")) {
            System.out.println("El resultado es: " + (num1 / num2));
        } else {
            System.out.println("No has introducido una operación válida");
        }

    }
}
