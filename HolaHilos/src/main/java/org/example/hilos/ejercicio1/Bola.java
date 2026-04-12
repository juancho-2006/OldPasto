package org.example.hilos.ejercicio1;

import javax.swing.*;
import java.awt.*;

public class Bola implements Runnable {

    private int x = 0;
    private int y;
    private Color color;
    private JPanel panel;

    public Bola(int y, Color color, JPanel panel) {
        this.y = y;
        this.color = color;
        this.panel = panel;
    }

    @Override
    public void run() {
        while (x< panel.getWidth()){
            x = x + (int) (Math.random()*10);
            panel.repaint();
            try {
                Thread.sleep(50);
            }catch(InterruptedException e){
                e.printStackTrace();

            }
        }


    }

    public void dibujar(Graphics g){
        g.setColor(color);
        g.fillOval(x, y,30,30);
    }

}
