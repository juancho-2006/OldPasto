package Hilos;

import javax.swing.*;
import java.awt.*;

public class VentnCarrera extends JPanel {

    Pelota p1 = new Pelota(50, Color.RED, this);
    Pelota p2 = new Pelota(50, Color.BLUE, this);


    public void iniciar() {

        new Thread(p1).start();

        new Thread(p2).start();

    }

    @Override
    public void paintComponents(Graphics g) {

        super.paintComponents(g);

        p1.dibujar(g);
        p2.dibujar(g);

    }

}
