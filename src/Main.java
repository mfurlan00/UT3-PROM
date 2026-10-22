package edu.masanz.da.ut3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero1 = Integer.parseInt(teclado.nextLine());

        System.out.print("Introduce otro número entero: ");
        int numero2 = Integer.parseInt(teclado.nextLine());

        if (numero1 > numero2) {
            System.out.println("El primer numero es mayor");
        } else if (numero1 < numero2) {
            System.out.println("El segundo numero es mayor");
        } else if (numero1 == numero2) {
            System.out.println("Los dos numeros son iguales");
        }

        //Switch

        String diaSemana = "lunes";

        switch (diaSemana) {
            case "lunes":
                System.out.println("Laboral");
                break;
            case "martes":
                System.out.println("Laboral");
                break;
            case "miercoles":
                System.out.println("Laboral");
                break;
            case "jueves":
                System.out.println("Laboral");
                break;
            case "viernes":
                System.out.println("Laboral");
                break;
            case "sabado":
                System.out.println("Festivo");
                break;
            case "domingo":
                System.out.println("Festivo");
                break; 
            default:
                throw new AssertionError();
        }

        int dia = 3;
        String tipoDia;

        switch (dia) {
            case 1, 2, 3, 4, 5 -> tipoDia = "Laboral";
            case 6, 7 -> tipoDia = "Festivo";
            default -> tipoDia = "Día no váido";
        }

    }
}