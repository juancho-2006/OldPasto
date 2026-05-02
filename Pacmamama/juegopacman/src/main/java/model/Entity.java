package main.java.model;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Clase abstracta para todas las entidades del juego.
 * Define posicion, sprite, dirección y posición.
 * Las subclases deben implementar el metodo actualizar().
 */
public abstract class Entity {

    //Constantes van siempre al inicio de la clase en may, constantes manejo direccion entidad
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

    public Entity(int x, int y, BufferedImage sprite) {
        this.x = x;
        this.y = y;
        this.sprite = sprite;

        if(sprite != null){
            this.width = sprite.getWidth();
            this.height = sprite.getHeight();
        }

        this.active = true;
        this.direction = DIR_NONE;
    }

    /**
     * Cada clase define su propia clase de actualización de entidad
     */

    public abstract void update();

    /**
     * Método para verificar colisión
     */
    public Rectangle getHitBox(){
        return new Rectangle (x, y, width, height);
    }

    /**
     * Clase para predecir una colisión futura
     * @param px
     * @param py
     * @return
     */
    public Rectangle getHitbox(int px, int py){
        return new Rectangle(px, py, width, height);
    }

    /**
     * Calcular dirección de X (si avanza o retrocede)
     * @return
     */
    public int calculateDx(){
        
    }

    /**
     * Getters y setters
     */

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
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

        if(sprite != null){
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

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }
}
