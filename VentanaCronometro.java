package Hilos;

import javax.swing.*;
import java.awt.*;

public class VentanaCronometro extends JFrame {

    private ContadorLogico logica;

    private JLabel etiquetaTime;

    public VentanaCronometro() {

        setTitle("Cronómetro");

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(300, 200);

        setLayout(new FlowLayout());

        etiquetaTime = new JLabel("0");

        etiquetaTime.setFont(new Font("Arial", Font.BOLD, 50));

        add(etiquetaTime);

        logica = new ContadorLogico(() -> {

            etiquetaTime.setText(String.valueOf(logica.getSegundos()));

        });

        new Thread(logica).start();
    }

    public static void main(String[] args) {

        new VentanaCronometro().setVisible(true);
    }
}
