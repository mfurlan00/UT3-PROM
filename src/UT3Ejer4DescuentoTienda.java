package edu.masanz.da.ut3;

import java.util.Scanner;

public class UT3Ejer4DescuentoTienda {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el precio original");
        double precioOriginal = Double.parseDouble(teclado.nextLine());

        double descuento;
        double precioFinal;
        
        if(precioOriginal > 100) {
            descuento = 10;
            precioFinal =  precioOriginal * (1 - (descuento / 100.0));

            System.out.println("El precio final es de " + precioFinal);
            System.out.println("Se han descontado " + (precioFinal-precioOriginal) + " euros");
        } else if (precioOriginal >= 0 && precioOriginal <= 100) {
            System.out.println("El precio final es de " + precioOriginal);
        } else if (precioOriginal < 0) {
            System.out.println("No puede ser un precio negativo");
        } else {
            System.out.println("Tipo de dato no valido");
        }
    }
}
