package Hilos.Juego;

import javax.swing.*;
import java.awt.*;

public class VentanaCarga extends JPanel {


    private ProcesoCarga p1;
    private ProcesoCarga p2;
    private ProcesoCarga p3;

    public VentanaCarga() {

        p1 = new ProcesoCarga(() -> repaint());
        p2 = new ProcesoCarga(() -> repaint());
        p3 = new ProcesoCarga(() -> repaint());

        new Thread(p1).start();
        new Thread(p2).start();
        new Thread(p3).start();

    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        //Dibujar las barras de carga según los datos que ya tenemos
        g.setColor(Color.RED);
        g.fillRect(50, 50, p1.getProgreso() * 2, 30);

        //Barra 2
        g.setColor(Color.YELLOW);
        g.fillRect(50, 80, p2.getProgreso() * 2, 50);

        //Barra 3
        g.setColor(Color.RED);
        g.fillRect(50, 130, p3.getProgreso() * 2, 30);

        g.drawString("Progreso: " + (p1.getProgreso() - 1) + "%", 300, 70);
        g.drawString("Progreso: " + (p2.getProgreso() - 1) + "%", 300, 100);
        g.drawString("Progreso: " + (p3.getProgreso() - 1) + "%", 300, 150);
    }

    public static void main(String[] args) {

        JFrame ventana = new JFrame("Barras de carga");
        ventana.add(new VentanaCarga());

        ventana.setSize(500, 500);

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ventana.setVisible(true);

        ventana.getContentPane().setBackground(Color.BLACK);

        new VentanaCarga();

    }

}


