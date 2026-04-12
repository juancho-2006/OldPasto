package org.example.hilos.Fifth;

import javax.swing.*;
import java.awt.*;

public class VentanaDeCarga extends JPanel {

    private ProcesoCarga barraCarga1;
    private ProcesoCarga barraCarga2;

    public VentanaDeCarga(){
        barraCarga1 = new ProcesoCarga(()-> repaint());
        barraCarga2= new ProcesoCarga(()-> repaint());

        new Thread (barraCarga1).start();
        new Thread (barraCarga2).start();
    }

    @Override

    protected void paintComponent(Graphics graficador){
        super.paintComponent(graficador);

        graficador.setColor(Color.red);
        graficador.fillRect(50,50, barraCarga1.getProgreso(), 50);

        graficador.setColor(Color.blue);
        graficador.fillRect(50,200, barraCarga2.getProgreso(), 50);


        graficador.setColor(Color.BLACK);
        graficador.setFont(new Font("Arial", Font.BOLD, 50));
        graficador.drawString("ff", 2,3);
    }
}
