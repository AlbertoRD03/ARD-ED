package com.miempresa.app;

public class Calculadora {

    public Integer dividir(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
            return null;
        }
    }
}
