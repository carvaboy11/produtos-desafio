package com.gabriel.pedidos.util;

public class Logger {
    private static Logger instancia;

    private Logger() {}

    public static Logger getInstancia() {
        if (instancia == null) {
            instancia = new Logger();
        }
        return instancia;
    }

    public void log(String msg) {
        System.out.println("[LOG]: " + msg);
    }
}