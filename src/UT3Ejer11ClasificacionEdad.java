package edu.masanz.da.ut3;

import java.util.Scanner;

public class UT3Ejer11ClasificacionEdad {
    public static void main(String[] args) {
        
        int edadIntroducida;
        String clasificacion = "Vacio";

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la edad que deseas clasificar: ");
        edadIntroducida = Integer.parseInt(teclado.nextLine());

        if (edadIntroducida >= 0 && edadIntroducida <= 10) {
            clasificacion =  "Infancia";
            System.out.println("La clasificación es: " + clasificacion);
        } else if (edadIntroducida >= 11 && edadIntroducida <= 19) {
            clasificacion = "Adolescencia";
            System.out.println("La clasificación es: " + clasificacion);
        } else if (edadIntroducida >= 20 && edadIntroducida <= 65) {
            clasificacion = "Edad adulta";
            System.out.println("La clasificación es: " + clasificacion);
        } else if (edadIntroducida >= 66) {
            clasificacion = "Persona mayor";
            System.out.println("La clasificación es: " + clasificacion);
        } else {
            System.out.println("El valor no es válido");
        }

    }
}
