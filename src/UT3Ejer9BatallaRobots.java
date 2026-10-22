package edu.masanz.da.ut3;

import java.util.Scanner;

public class UT3Ejer9BatallaRobots {
    public static void main(String[] args) {
        
        String nombreRobot1 = "Robot 1";
        int vidaRobot1 = 100;
        int atqRobot1;
        int defRobot1;

        String nombreRobot2 = "Robot 2";
        int vidaRobot2 = 100;
        int atqRobot2;
        int defRobot2;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el ataque del robot 1");
        atqRobot1 = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce la defensa del robot 1");
        defRobot1 = Integer.parseInt(teclado.nextLine());

        System.out.println("Introduce el ataque del robot 2");
        atqRobot2 = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce la defensa del robot 2");
        defRobot2 = Integer.parseInt(teclado.nextLine());

        if (atqRobot1 > defRobot2) {
            int danioCausado = atqRobot1-defRobot2;
            vidaRobot2 = vidaRobot2 - danioCausado;
            System.out.println("El robot 1 ataca al robot 2, daño causado: " + (danioCausado) + ", vida restante: " + vidaRobot2);
            if (vidaRobot2 <= 0) {
                System.out.println("El robot 2 ha sido derrotado");
            } else if (atqRobot2 > defRobot1) {
                int danioCausado2 = atqRobot2-defRobot1;
                vidaRobot1 = vidaRobot2 - danioCausado2;
                System.out.println("El robot 2 ataca al robot 1, daño causado: " + (danioCausado2) + ", vida restante: " + vidaRobot1);
                if (vidaRobot1 <= 0) {
                    System.out.println("El robot 1 ha sido derrotado");
                }
            }
        }

        System.out.println("Estado final:");
        System.out.println("Vida robot 1: " + vidaRobot1);
        System.out.println("Vida robot 2: " + vidaRobot2);

        //Parte avanzada

        int contadorRondas = 0;

        vidaRobot1 = 100;
        vidaRobot2 = 100;

        do { 
            if (atqRobot1 > defRobot2) {
                int danioCausado = atqRobot1-defRobot2;
                vidaRobot2 = vidaRobot2 - danioCausado;
                System.out.println("El robot 1 ataca al robot 2, daño causado: " + (danioCausado) + ", vida restante: " + vidaRobot2);
                if (vidaRobot2 <= 0) {
                    System.out.println("El robot 2 ha sido derrotado");
                } else if (atqRobot2 > defRobot1) {
                    int danioCausado2 = atqRobot2-defRobot1;
                    vidaRobot1 = vidaRobot2 - danioCausado2;
                    System.out.println("El robot 2 ataca al robot 1, daño causado: " + (danioCausado2) + ", vida restante: " + vidaRobot1);
                    if (vidaRobot1 <= 0) {
                        System.out.println("El robot 1 ha sido derrotado");
                    }
                }
            }
            contadorRondas ++;
        } while ((vidaRobot1 > 0 || vidaRobot2 > 0) || contadorRondas < 21);
    }
}
