package graphics;

import javax.swing.*;
import java.awt.*;

public class Contador extends JPanel {
    private int segundos;

    public Contador() {
        segundos = 0;
        setBackground(Color.BLACK);

        Timer reloj = new Timer(1000, evento -> {
            segundos++;
            repaint();
        });
        reloj.start();
    }

    @Override
    protected void paintComponent(Graphics gr) {
        super.paintComponent(gr);

        gr.setColor(Color.BLACK);
        gr.fillRect(0, 0, getWidth(), getHeight());

        gr.setColor(Color.GREEN);
        gr.setFont(new Font("Monospaced", Font.BOLD, 36));
        gr.drawString("Tiempo", 50, 120);
        gr.setFont(new Font("Monospaced", Font.BOLD, 64));
        gr.drawString(segundos + " s", 50, 220);
    }
}
