package graphics;

import javax.swing.*;
import java.awt.*;

// paso 3 Convertir la clase de un panel
public class Panel extends JPanel {
    @Override
    protected void paintComponent(Graphics grafica) {
        super.paintComponent(grafica);
        grafica.setColor(Color.GREEN);

        grafica.draw3DRect(300, 200, 200, 200, true);

        grafica.draw3DRect(300, 200, 200, 200, true);
        grafica.fill3DRect(0, 200, 200, 200, true);

        grafica.drawOval(200, 0, 200, 100);
        grafica.fillOval(200, 100, 200, 100);
        grafica.drawArc(340, 300, 300, 400, 40, 30);
        //Fuente
        Font fuente = new Font("Arial", Font.ITALIC, 23);
        grafica.setFont(fuente);
        //color
        grafica.setColor(Color.RED);
        grafica.drawString("gerio perio", 300, 400);

        Color micolor = new Color(229, 151, 8);
        grafica.setColor(micolor);
        grafica.drawRect(0, 600, 150, 100);
        grafica.drawString("<------ mr aura ", 2, 650);
        fuente = new Font("Arial", Font.BOLD, 23);
        grafica.drawString("0,0", 10, 17);
        grafica.drawString("800,800 ", 740, 755);

    }


}
