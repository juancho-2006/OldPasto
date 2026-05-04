package main.java.model;

import java.awt.image.BufferedImage;

/**
 * Clase abstracta, va a ser la clase padre de los fantasmas
 * Define el movimiento básico y el estado comestible
 * Cada hijo implementa su propia logica y podemos manipular EL TIEMPO del estado en el que se puede comer el fantasma
 */

public abstract class Ghost extends Entity {
    // Constante del tiempo en el que estará en estado comestible
    // 9 segundos por 60 fps
    private static final int DURATION_EATABLE = 540;
    private int speed; // velocidad
    private boolean stateEatable; // estado comestible
    private int countEatable;
    private BufferedImage spriteOriginal;



    protected Ghost(int x, int y, String nameSprite, int dirInitial, int velocidad) {
        super(x, y, uploadImage(nameSprite));
        this.speed = velocidad;
        this.stateEatable = false;
        this.countEatable = 0;
        this.spriteOriginal = uploadImage(nameSprite);
        setDirection(dirInitial);
    }

    /**
     * Cada subclase decide como cambiar de dirección al chocar con un muro
     * Blinky: persigue.
     * Pinky: persigue. (polimorfismo)
     */
    public abstract void changeDirection(int posPacX, int posPacY);

    /**
     * Reinicia el fantasma a su estado y posicion inicial
     */
    public abstract void restart();

    /**
     * Método encargado de invertir la dir del fantasma
     */
    public void reverseDirection(){
        int direction = getDirection();
        if (direction == DIR_LEFT){
            setDirection(DIR_RIGHT);
        }
        else if (direction == DIR_RIGHT) {
            setDirection(DIR_LEFT);
        }
        else if (direction == DIR_UP) {
            setDirection(DIR_DOWN);
        }
        else if (direction == DIR_DOWN) {
            setDirection(DIR_UP);
        }
    }

    /**
     * Activa o desactiva el estado comestible
     * Al cativerse cambie el sprite el fantasma y empieza la cuenta atras
     */

    public void setStateEatable(boolean active){
        if (active){
            stateEatable = true;
            countEatable = DURATION_EATABLE;
            setSprite(uploadImage("ghost_teal.png"));
        } else{
            stateEatable = false;
            countEatable = 0;
            setSprite(spriteOriginal);
        }
    }

    /**
     * Se sobreescribe el metodo actualizar para que mueva los fantasmas y descuente el contador comestible si el fantasma está activo
     */

    @Override
    public void update(){
        setX(getX() * calculateDx()* speed);
        setY(getY() * calculateDy()* speed);

        if (stateEatable) {
            countEatable--;
            if (countEatable <= 0){
                stateEatable = false;
                setSprite(spriteOriginal);
            }
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isStateEatable() {
        return stateEatable;
    }

    public int getCountEatable() {
        return countEatable;
    }

    public void setCountEatable(int countEatable) {
        this.countEatable = countEatable;
    }

    public BufferedImage getSpriteOriginal() {
        return spriteOriginal;
    }

    public void setSpriteOriginal(BufferedImage spriteOriginal) {
        this.spriteOriginal = spriteOriginal;
    }
}
