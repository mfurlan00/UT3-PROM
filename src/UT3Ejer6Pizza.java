package edu.masanz.da.ut3;

public class UT3Ejer6Pizza {
    public static void main(String[] args) {
        String tamano = "mediana";
        String tipoMasa  = "gruesa";
        String ingredientes = "tomate, queso, pepperoni, aceitunas";

        boolean esMedianaGrande = tamano.equals("mediana") || tamano.equals("grande");
        boolean esMasaOk = tipoMasa.equalsIgnoreCase("Gruesa");
        boolean ingredientesOk = ingredientes.equalsIgnoreCase("tomate, queso, pepperoni, aceitunas");

        //TODO
        boolean pedidoValido;

        if (esMedianaGrande == true && esMasaOk == true && ingredientesOk == true) {
            System.out.println("El pedido es válido");
            pedidoValido = true;
        } else {
            System.out.println("El pedido no es válido");
            pedidoValido = false;
        }
        
    }
}
