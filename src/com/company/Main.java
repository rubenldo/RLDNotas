package com.company;

public class Main {
    /**
     * valor1 es args1 y valor2 es args2
     * @param args [0] nombre y apellidos
     * @param args [1] Nota sacada
     * @param args [2] Nota deseada
     * @return el metodo devuelve la frase junto con el nombre la nota sacada la nota deseada y la frase segun la comparacion de la nota.
     */
    public static void main(String[] args) {

        String valor1;
        String valor2;

        valor1 = args[1];
        valor2 = args[2];

        System.out.println("La calificación de " + args[0] + " : " + args[1] + " , nota deseada " + args[2] + "  "+Main.veredicto(valor1, valor2)+"");
    }

    private static String veredicto(String valor1, String valor2) {
        if (valor1.equals(valor2)) {
            return "El resultado esperado, muy bien.";
        }
        if (Integer.valueOf(valor1) < Integer.valueOf(valor2)) {
            return "Has mejorado tus expectativas, excelente.";
        } else
            return "Te has confiado. Esfuérzate más la próxima vez.";
    }
}