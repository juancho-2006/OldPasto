package main.java.model;

/**
 * El punto es estático
 * En la matriz está representado por el num 2
 * Sie el pacman se come este punto le da 10 puntos
 */
public class Point extends ObjectGame{
    public static final int VALUE = 10;

    public Point(int x, int y){
        super(x, y, uploadImage("pill.png"), POINT);
    }


}
