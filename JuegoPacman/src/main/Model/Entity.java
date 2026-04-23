package main.Model;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.InputStream;

/**
 * Clases abstracta base para todas las entidades del juego.
 * Define posicion, sprite, direccion, y posición.
 * Las subclases deben implementar el metodo actulizar().
 */

public abstract class Entity {

    //Constantes manejo direccion entidad
    protected static final int DIR_NONE = 0;
    protected static final int DIR_LEFT = 1;
    protected static final int DIR_UP = 2;
    protected static final int DIR_RIGHT = 3;
    protected static final int DIR_DOWN = 4;

    private int x;
    private int y;
    private int width;
    private int height;
    private BufferedImage sprite;
    private boolean active;
    private int direction;

    public Entity(BufferedImage sprite, int y, int x) {
        this.sprite = sprite;
        this.y = y;
        this.x = x;
        if (sprite != null) {
            this.width = sprite.getWidth();
            this.height = sprite.getHeight();
        }
        this.active = true;
        this.direction = DIR_NONE;
    }

    /**
     * Cada clase define su propia clase de actualizacion de entidad
     */
    public abstract void update();

    /**
     * metodo para verificar colison
     */

    public Rectangle getHitBox() {
        return new Rectangle(x, y, width, height);
    }

    /**
     * Clase para predecir una colison futura
     *
     * @param px
     * @param py
     * @return
     */

    public Rectangle getHitBox(int px, int py) {
        return new Rectangle(px, py, width, height);
    }

    /**
     * calcular direccion de x (si avanza o retrocede)
     * @return
     */
    /**
     * Calcula el desplazamiento horizontal según la dirección actual.
     * Devuelve -1, 0 o +1.
     */
    public int calculateDx() {
        if (direction == DIR_LEFT) {
            return -1;
        }
        if (direction == DIR_RIGHT) {
            return 1;
        }
        return 0;
    }

    /**
     * Calcula el desplazamiento vertical según la dirección actual.
     * Devuelve -1, 0 o +1.
     */
    public int calculateDy() {
        if (direction == DIR_UP)
            return -1;
        if (direction == DIR_DOWN)
            return 1;
        return 0;
    }

    /**
     * Carga una imagen desde la carpeta de recursos.
     * Uso: Entidad.cargarImagen("pacman_left.png")
     */
    public static BufferedImage uploadImage(String nombre) {
        try {
            InputStream is = Entity.class.getResourceAsStream("/resources/images/" + nombre);
            if (is == null) {
                System.err.println("Imagen no encontrada: " + nombre);
                return null;
            }
            return ImageIO.read(is);
        } catch (Exception e) {
            System.err.println("Error cargando imagen: " + nombre);
            return null;
        }
    }

    // get & set
    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public BufferedImage getSprite() {
        return sprite;
    }

    public void setSprite(BufferedImage sprite) {
        this.sprite = sprite;
        if (sprite != null) {
            this.width = sprite.getWidth();
            this.height = sprite.getHeight();
        }
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
