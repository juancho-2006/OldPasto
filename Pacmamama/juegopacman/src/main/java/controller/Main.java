package main.java.controller;

import main.java.view.GamePannel;
import main.java.view.MainFrame;
import javax.swing.SwingUtilities;

/**
 * Punto de entrada del juego Pacman MVC.
 * Toda la creación de la interfaz se hace dentro del Event Dispatch Thread (EDT)
 * usando SwingUtilities.invokeLater, que es la forma correcta de iniciar Swing.
 */
public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GamePannel panel            = new GamePannel();
                new MainFrame(panel);

                final GameController controlador = new GameController(panel);
                controlador.iniciar();

                // Detener el hilo limpiamente al cerrar la ventana
                Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
                    public void run() { controlador.detener(); }
                }));

                panel.requestFocusInWindow();
            }
        });
    }
}
