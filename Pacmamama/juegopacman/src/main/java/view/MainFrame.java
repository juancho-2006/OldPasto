package main.java.view;

import javax.swing.JFrame;

/**
 * Ventana principal del juego. Hereda de {@link JFrame} y aloja al
 * {@link GamePannel}. Su única responsabilidad es la presentación de la
 * ventana del sistema operativo.
 *
 * @author  Refactor MVC
 * @version 1.0
 */
public class MainFrame extends JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Construye la ventana, le añade el GamePanel y la hace visible.
     *
     * @param panel el panel de juego que se mostrará en su interior.
     */
    public MainFrame(GamePannel panel) {
        setTitle("----- PACMAN MVC v1.0 -----");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        add(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
