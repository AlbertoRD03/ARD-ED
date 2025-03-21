package com.miempresa.app;

public class Utils {
    public static void imprimirMensaje(String mensaje) {
        if (mensaje != null) {
            for (int i = 0; i < mensaje.length(); i++) {
                System.out.println(mensaje.charAt(i));
            }
        } else {
            System.out.println("El mensaje es nulo.");
        }
    }
}
