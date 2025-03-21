package com.miempresa.app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("Introduce el primer número:");
        int a = scan.nextInt();
        System.out.println("Introduce el segundo número:");
        int b = scan.nextInt();

        Integer resultado = calc.dividir(a, b);

        if (resultado != null) {
            System.out.println("Resultado = " + resultado);
        } else {
            System.out.println("No se pudo realizar la división.");
        }

    }
}
