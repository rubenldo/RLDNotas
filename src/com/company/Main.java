package com.company;

public class Main {

    public static void main(String[] args) {

        String valor1;
        String valor2;

        valor1 = args[1];
        valor2 = args[2];

        System.out.println("La calificación de " + args[0] + " : " + args[1] + " , nota deseada " + args[2] + "  "+Main.veredicto(valor1, valor2)+"");
    }

    public static String veredicto(String valor1, String valor2) {
        if (valor1.equals(valor2)) {
            return "El resultado esperado, muy bien.";
        }
        if (Integer.valueOf(valor1) < Integer.valueOf(valor2)) {
            return "Has mejorado tus expectativas, excelente.";
        } else
            return "Te has confiado. Esfuérzate más la próxima vez.";
    }
}