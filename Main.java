package Hilos;

import javax.swing.*;

public class Main extends JPanel {

    public static void main(String[] args) {

        JFrame jFrame = new JFrame("Carrera");

        Main panel = new Main();

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.setVisible(true);

        jFrame.setSize(800, 600);

    }

}
