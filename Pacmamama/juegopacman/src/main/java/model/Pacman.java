package main.java.model;

import java.awt.image.BufferedImage;

/**
 * Clase pacman
 * Personaje principal del juego
 * Gestiona su posición
 */
public class Pacman extends Entity{

    //Ctes para darle posicion inicial a pacman
    private static final int X_INITIAL = 240;
    private static final int Y_INITIAL = 432;
    private static final int SPEED = 1;
    private static final int INITIAL_LIVES = 3;
    private static final String SPRITE = "";

    //Coordenadas túneles laterales (FILA X PIXELES)
    //Ejemplo = fila 9 x 24 px

    //Coordenadas del alto del tablero
    private static final int Y_TUNNEL= 216;

    //Coordenadas del ancho del tablero
    private static final int X_TUNNEL= 504;

    private int score = 0;

    private int lives;

    private boolean openMouth;

    //Para pausar
    private boolean isPaused;

    //Enter
    private boolean enter;

    public Pacman(int x, int y, BufferedImage sprite) {
        super(x, y, sprite);
    }

    public Pacman() {
        super(X_INITIAL, Y_INITIAL, uploadImage("pacman_left.png"));
        this.score = 0;
        this.lives = INITIAL_LIVES;
        this.openMouth = true;
        this.isPaused = false;
        this.enter = false;
        setDirection(DIR_LEFT);
    }

    /**
     * Metodo para reiniciar la posición y la dirección cuando pierde una vida
     */
    public void resetPosition(){
        setX(X_INITIAL);
        setY(Y_INITIAL);
        setSprite(uploadImage("pacman_left.png"));
        setActive(true);
    }

    /**
     * Morir
     */
    public void resetAll(){
        resetPosition();
        this.lives = INITIAL_LIVES;
        this.score = 0;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public boolean isOpenMouth() {
        return openMouth;
    }

    public void setOpenMouth(boolean openMouth) {
        this.openMouth = openMouth;
    }

    public boolean isPaused() {
        return isPaused;
    }

    public void setPaused(boolean paused) {
        isPaused = paused;
    }

    public boolean isEnter() {
        return enter;
    }

    public void setEnter(boolean enter) {
        this.enter = enter;
    }

    /**
     * Mueve a Pacman según su dirección actual y gestiona el túnel lateral.
     */
    @Override
    public void update() {
        // Túnel: sale por la derecha → entra por la izquierda
        if (getX() > X_TUNNEL && getY() == Y_TUNNEL) {
            setX(0);
        }
        // Túnel: sale por la izquierda → entra por la derecha
        if (getX() < 0 && getY() == Y_TUNNEL) {
            setX(X_TUNNEL);
        }

        setX(getX() + calculateDx() * SPEED);
        setY(getY() + calculateDy() * SPEED);
    }

    /**
     * Suma puntos a la puntuación acumulada.
     */
    public void addPoints(int points) {
        this.score += points;
    }

    /**
     * Descuenta una vida.
     */
    public void loseLife() {
        if (lives > 0) lives--;
    }

    /**
     * Actualiza el sprite según la dirección y alterna la animación de boca.
     * Se llama cada ciertos frames para que la boca "masque".
     */
    public void updateSprite(int d) {
        String file;
        if (openMouth) {
            file = "pacman_closed.png";
        } else {
            if (d == DIR_LEFT) file = "pacman_left.png";
            else if (d == DIR_RIGHT) file = "pacman_right.png";
            else if (d == DIR_UP) file = "pacman_up.png";
            else if (d == DIR_DOWN) file = "pacman_down.png";
            else file = "pacman_left.png";
        }
        setSprite(uploadImage(file));
        openMouth = !openMouth;
    }

    /**
     * Activa o desactiva la pausa.
     */
    public void togglePause() {
        isPaused = !isPaused;
    }
}
