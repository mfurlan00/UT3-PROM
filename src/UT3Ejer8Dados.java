package edu.masanz.da.ut3;

import java.util.Random;

public class UT3Ejer8Dados {
    public static void main(String[] args) {
        
        String participante1 = "Luis";
        int dado1Participante1;
        int dado2Participante1;
        int dado3Participante1;
        String participante2 = "Marcos";
        int dado1Participante2;
        int dado2Participante2;
        int dado3Participante2;

        Random generador = new Random();

        dado1Participante1 = generador.nextInt(6) + 1;
        dado2Participante1 = generador.nextInt(6) + 1;
        dado3Participante1 = generador.nextInt(6) + 1;

        dado1Participante2 = generador.nextInt(6) + 1;
        dado2Participante2 = generador.nextInt(6) + 1;
        dado3Participante2 = generador.nextInt(6) + 1;

        if (dado1Participante1 == dado2Participante1 &&
            dado2Participante1 == dado3Participante1) {
            if (dado1Participante2 == dado2Participante2 &&
            dado2Participante2 == dado3Participante2) {
                if (dado1Participante1 > dado1Participante2) {
                    System.out.println("Gana por trío de " + dado1Participante1 + " el participaante " + participante1);
                } else if (dado1Participante2 > dado1Participante1) {
                    System.out.println("Gana por trío de " + dado1Participante2 + " el participaante " + participante2);
                } else {
                    System.out.println("Empate por dos tríos de " + dado1Participante1);
                }
            }
        } else if (dado1Participante2 == dado2Participante2 &&
            dado2Participante2 == dado3Participante2) {
            System.out.println("Gana por trío de " + dado1Participante2 + " el participaante " + participante2);
        } else {
            int puntuacionTotalParticipante1 = dado1Participante1 + dado2Participante1 + dado3Participante1;
            int puntuacionTotalParticipante2 = dado1Participante2 + dado2Participante2 + dado3Participante2;

            if (puntuacionTotalParticipante1 > puntuacionTotalParticipante2) {
                System.out.println("Gana por puntuación ("+ puntuacionTotalParticipante1 +") el participante " + participante1);
            } else if (puntuacionTotalParticipante1 < puntuacionTotalParticipante2) {
                System.out.println("Gana por puntuación ("+ puntuacionTotalParticipante2 +") el participante " + participante2);
            } else {
                System.out.println("Empate por puntuación de " + puntuacionTotalParticipante1);
            }

        }

    }
}
