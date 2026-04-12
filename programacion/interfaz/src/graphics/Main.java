package graphics;

import javax.swing.*;

//1. paso Hacer un constructor de main
// vamos a configurar la vetana
public class Main extends JFrame {
    public Main() {
        setTitle("Contador");
        setSize(600, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new Contador());
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
