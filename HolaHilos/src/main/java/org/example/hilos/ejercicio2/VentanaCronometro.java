package org.example.hilos.ejercicio2;

import javax.swing.*;
import java.awt.*;

public class VentanaCronometro extends JFrame {
    private ContadorLogica logica;
    private JLabel etiquetaTime;

    public VentanaCronometro(){
        setTitle("Cronometro Independiente");
        setSize(200,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        etiquetaTime = new JLabel("0");
        etiquetaTime.setFont(new Font("Arial", Font.BOLD, 50));
        add(etiquetaTime);

        //Inicializamos la logica pasando una funcion lambda para actualizar la interfaz
        logica = new ContadorLogica(()->{
            etiquetaTime.setText(String.valueOf(logica.getSegundos()));
        });

        //lanzar el hilo
        new Thread(logica).start();
    }
}
