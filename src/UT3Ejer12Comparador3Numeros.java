package edu.masanz.da.ut3;

import java.util.Scanner;

public class UT3Ejer12Comparador3Numeros {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        num1 = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce el segundo número:");
        num2 = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce el tercer número:");
        num3 = Integer.parseInt(teclado.nextLine());

        if (num1 == num2 && num1 == num3) {
            System.out.println("Los tres números son iguales [" + num1 + "]");
        } else if (num1 == num2) {
            System.out.println("El número 1 y el número 2 son iguales [" + num1 + "]");
        } else if (num1 == num3) {
            System.out.println("El número 1 y número 3 son iguales [" + num1 + "]");
        } else if (num2 == num3) {
            System.out.println("El número 2 y el número 3 son iguales [" + num2 + "]");
        } else {
            if (num1 > num2 && num1 > num3) {
                System.out.println("El número 1 es el mayor [" + num1 + "]");
            } else if (num2 > num1 && num2 > num3) {
                System.out.println("El número 2 es el mayor [" + num2 + "]");
            } else if (num3 > num1 && num3 > num2) {
                System.out.println("El número 3 es el mayor [" + num3 + "]");
            }
        }
    }
}
