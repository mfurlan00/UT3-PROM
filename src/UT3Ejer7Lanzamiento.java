package edu.masanz.da.ut3;

import java.util.Scanner;

public class UT3Ejer7Lanzamiento {
    public static void main(String[] args) {
        
        final int COMBUSTIBLE_MINIMO = 500;
        final int PESO_MAXIMO = 2000;
        final int VELOCIDAD_MINIMA = 100;

        boolean puedeDespegar;

        int combustible;
        int peso;
        int velocidad;

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("¿Cuánto combustible lleva el cohete?");
        combustible = Integer.parseInt(teclado.nextLine());

        System.out.println("¿Cuánto pesa el cohete?");
        peso = Integer.parseInt(teclado.nextLine());

        System.out.println("¿Que velocidad lleva el cohete?");
        velocidad = Integer.parseInt(teclado.nextLine());

        if (combustible > COMBUSTIBLE_MINIMO && 
            peso <= PESO_MAXIMO &&
            velocidad >= VELOCIDAD_MINIMA) {
            System.out.println("El cohete puede despegar");
            puedeDespegar = true;
        } else {
            System.out.println("El cohete no puede despegar");
            puedeDespegar = false;
        }
    }
}
