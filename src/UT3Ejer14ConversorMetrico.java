package edu.masanz.da.ut3;

import java.util.Scanner;

public class UT3Ejer14ConversorMetrico {
    public static void main(String[] args) {
        double cm;
        double m;
        double km;

        String unidad = "";
        String unidadConversion = "";

        Scanner teclado = new Scanner(System.in);
    
        System.out.println("¿Qué unidad quieres introducir?:");
        unidad = teclado.nextLine();

        System.out.println("¿A qué unidad quieres convertir?:");
        unidadConversion = teclado.nextLine();

        if (unidad.equalsIgnoreCase("m") || unidad.equalsIgnoreCase("metros")) {
            if (unidadConversion.equalsIgnoreCase("m") || unidadConversion.equalsIgnoreCase("metros")) {
                System.out.println("La conversión no es necesaria");
            } else if (unidadConversion.equalsIgnoreCase("cm") || unidadConversion.equalsIgnoreCase("centimetros")) {
                System.out.println("Introduce la unidad inicial (metros) para convertir a cms:");
                m = Double.parseDouble(teclado.nextLine() + 0.0);
                cm = (m*100.0);
                System.out.println(m + " metros son " + cm + " centímetros");
            } else if (unidadConversion.equalsIgnoreCase("km") || unidadConversion.equalsIgnoreCase("kilometros")) {
                System.out.println("Introduce la unidad inicial (metros) para convertir a kms:");
                m = Double.parseDouble(teclado.nextLine() + 0.0);
                km = (m/1000.0);
                System.out.println(m + " metros son " + km + " kilómetros");
            }
        } else if (unidad.equalsIgnoreCase("cm") || unidad.equalsIgnoreCase("centimetros")) {
            if (unidadConversion.equalsIgnoreCase("cm") || unidadConversion.equalsIgnoreCase("centimetros")) {
                System.out.println("La conversión no es necesaria");
            } else if (unidadConversion.equalsIgnoreCase("m") || unidadConversion.equalsIgnoreCase("metros")) {
                System.out.println("Introduce la unidad inicial (centímetros) para convertir a metros");
                cm = Double.parseDouble(teclado.nextLine() + 0.0);
                m = (cm /100.0);
                System.out.println(cm + " centímetros son " + m + " metros");
            } else if (unidadConversion.equalsIgnoreCase("km") || unidadConversion.equalsIgnoreCase("kilometros")) {
                System.out.println("Introduce la unidad inicial (centímetros) para convertir a kilómetros");
                cm = Double.parseDouble(teclado.nextLine() + 0.0);
                km = ((cm/100.0)/1000.0);
                System.out.println(cm + " centímetros son " + km + " kilometros");
            }
        } else if (unidad.equalsIgnoreCase("km") || unidad.equalsIgnoreCase("kilometros")) {
            if (unidadConversion.equalsIgnoreCase("km") || unidadConversion.equalsIgnoreCase("kilometros")) {
                System.out.println("La conversión no es necesaria");
            } else if (unidadConversion.equalsIgnoreCase("cm") || unidadConversion.equalsIgnoreCase("centimetros")) {
                System.out.println("Introduce la unidad inicial (kilometros) para convertir a centímetros");
                km = Double.parseDouble(teclado.nextLine() + 0.0);
                cm = ((km*1000.0)*100.0);
                System.out.println(km + " kilómetros son " + cm + " centímetros");
            } else if (unidadConversion.equalsIgnoreCase("m") || unidadConversion.equalsIgnoreCase("metros"))  {
                System.out.println("Introduce la unidad inicial (kilometros) para convertir a metros");
                km = Double.parseDouble(teclado.nextLine() + 0.0);
                m = (km*1000.0);
                System.out.println(km + " kilómetros son " + m + " metros");
            }
        } else {
            System.out.println("La unidad no es correcta.");
        }
    }
}
