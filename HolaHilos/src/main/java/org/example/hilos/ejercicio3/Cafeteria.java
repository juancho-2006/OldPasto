package org.example.hilos.ejercicio3;

public class Cafeteria {

    public static void main(String[] args) {
        Runnable pedido1 = new TareaPrepararCafe("Americano");
        Runnable pedido2 = new TareaPrepararCafe("Latte");
        Runnable pedido3 = new TareaPrepararCafe("Espresso");
        Runnable pedido4 = new TareaPrepararPan("Pan de maíz");

        Thread barista1 = new Thread(pedido1);
        Thread barista2 = new Thread(pedido2);
        Thread barista3 = new Thread(pedido3);
        Thread barista4 = new Thread(pedido4);

        barista1.start();
        barista2.start();
        barista3.start();
        barista4.start();
    }
}
