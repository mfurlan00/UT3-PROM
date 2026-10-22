package edu.masanz.da.ut3;

import java.util.Scanner;

public class UT3Ejer5EstadoAgua {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double temperatura;

        System.out.println("¿A que temperatura está el agua?:");
        temperatura = Double.parseDouble(teclado.nextLine());

        if (temperatura <= 0.0){
            System.out.println("El agua está en estado sólido");
        } else if (temperatura > 0.0 && temperatura < 100.0) {
            System.out.println("El estado del agua es líquido");
        } else {
            System.out.println("El estado del agua es gaseoso");
        }
    }

}
