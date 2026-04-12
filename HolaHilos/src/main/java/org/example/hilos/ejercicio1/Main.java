package org.example.hilos.ejercicio1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Carrera de hilos");
        VentanaCarrera panel = new VentanaCarrera();
        frame.add(panel);
        frame.setSize(500, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        panel.iniciar();

    }
}