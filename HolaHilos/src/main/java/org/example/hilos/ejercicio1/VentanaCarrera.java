package org.example.hilos.ejercicio1;

import javax.swing.*;
import java.awt.*;

public class VentanaCarrera extends JPanel {
    Bola b1 = new Bola(50,Color.red,this);
    Bola b2 = new Bola(100,Color.blue,this);

    public void iniciar(){
        new Thread(b1).start();
        new Thread(b2).start();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        b1.dibujar(g);
        b2.dibujar(g);
    }

}
